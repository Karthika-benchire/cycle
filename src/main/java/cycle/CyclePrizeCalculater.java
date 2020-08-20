package cycle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;

/**
 * CyclePrizeCalculater is used to calculate the prize for different set of cycle model as thread
 * by implementing the runnable interface.
 * 
 * @author maheshkumar.a.s
 *
 */
public class CyclePrizeCalculater implements Runnable {

	private final CycleParts cycleParts;

	private BlockingQueue<CyclePrize> queue;

	public CyclePrizeCalculater(CycleParts cycleParts, BlockingQueue<CyclePrize> queue) {
		this.cycleParts=cycleParts;
		this.queue=queue;
	}
	public void run() {
		calculatePrize(cycleParts,queue);
	}
	public static void calculatePrize(CycleParts parts, BlockingQueue<CyclePrize> queue) {
		CyclePrize cyclePrize=new CyclePrize();
		int prize=0;
		int companyStartedYear=2000;
		int tyreIncrementAmountByYear=30;
		if(parts.getFrameParts().isDerailuerHanger()) {
			prize+=200;
			cyclePrize.setDerailuerHanger(200);
		}
		if(parts.getFrameParts().isFrames()) {
			prize+=100;
			cyclePrize.setFrames(100);
		}
		if(parts.getHandleBarAndBrakes().isHandleBar()) {
			prize+=50;
			cyclePrize.setHandleBar(50);
		}
		if(parts.getHandleBarAndBrakes().isHandleBarGrips()) {
			prize+=100;
			cyclePrize.setHandleBarGrips(100);
		}if(parts.getHandleBarAndBrakes().isFrontBrake()) {
			prize+=100;
			cyclePrize.setFrontBrake(100);
		}if(parts.getHandleBarAndBrakes().isBrakePad()) {
			prize+=60;
			cyclePrize.setBrakePad(60);
		}if(parts.getHandleBarAndBrakes().isShifters()) {
			prize+=50;
			cyclePrize.setShifters(50);
		}if(parts.getSaddleParts().isSaddle()) {
			prize+=90;
			cyclePrize.setSaddle(90);
		}if(parts.getSaddleParts().isSeatPost()) {
			prize+=70;
			cyclePrize.setSeatPost(70);
		}if(parts.getWheelParts().isSpokes()) {
			prize+=50;
			cyclePrize.setSpokes(50);
		}if(parts.getWheelParts().isHub()) {
			prize+=80;
			cyclePrize.setHub(80);
		}if(parts.getWheelParts().isRim()) {
			prize+=70;
			cyclePrize.setRim(70);
		}if(parts.getWheelParts().isRearBrake()) {
			prize+=60;
			cyclePrize.setRearBrake(60);
		}if(parts.getChainAssembly().isChain()) {
			prize+=40;
			cyclePrize.setChain(40);
		}if(parts.getChainAssembly().isChainRing()) {
			prize+=150;
			cyclePrize.setChainRing(150);
		}if(parts.getChainAssembly().isPedal()) {
			prize+=100;
			cyclePrize.setPedal(100);
		}if(parts.getChainAssembly().isCassatte()) {
			prize+=100;
			cyclePrize.setCassatte(100);
		}if(parts.getChainAssembly().isCrank()) {
			prize+=160;
			cyclePrize.setCrank(160);
		}if(parts.getChainAssembly().getGear()>0) {
			int gearPrize=100*parts.getChainAssembly().getGear();
			prize+=gearPrize;
			cyclePrize.setGear(gearPrize);
		}
		if(parts.getWheelParts().isTyre()) {
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
			int yearOfPrizing=LocalDate.parse(parts.getDateOfPrizing(), formatter).getYear();
			int tyrePrize=0;
			if(yearOfPrizing==companyStartedYear) {
				tyrePrize=200;
			}else if(yearOfPrizing>companyStartedYear) {
				tyrePrize=200+(tyreIncrementAmountByYear*(yearOfPrizing-companyStartedYear));
			}
			prize+=tyrePrize;
			cyclePrize.setTyre(tyrePrize);
		}
		cyclePrize.setTotalAmount(prize);
		cyclePrize.setNoOfCycles(parts.getNoOfCycle());
		if(parts.getNoOfCycle()>1) {
			prize=prize*parts.getNoOfCycle();
			cyclePrize=CyclePrize.MultiplyPrize(parts.getNoOfCycle(), cyclePrize);
		}
		try {
			CyclePrize newCyclePrize=new CyclePrize();
			CyclePrize queueCyclePrize = queue.take();
			newCyclePrize=CyclePrize.AddPrize(cyclePrize, queueCyclePrize);
			queue.put(newCyclePrize);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
