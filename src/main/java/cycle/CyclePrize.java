package cycle;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class CyclePrize {

	private int frames;
	private int derailuerHanger;
	private int handleBar;
	private int handleBarGrips;
	private int frontBrake;
	private int brakePad;
	private int shifters;
	private int saddle;
	private int seatPost;
	private int spokes;
	private int hub;
	private int rim;
	private int tyre;
	private int rearBrake;
	private int chain;
	private int chainRing;
	private int crank;
	private int pedal;
	private int cassatte;
	private int gear;
	private int noOfCycles;
	private int totalAmount;
	
	public static CyclePrize MultiplyPrize(int NoOfCycles,CyclePrize prize) {
		CyclePrize cyclePrize=new CyclePrize();
		cyclePrize.setFrames(NoOfCycles*prize.getFrames());
		cyclePrize.setDerailuerHanger(NoOfCycles*prize.getDerailuerHanger());
		cyclePrize.setHandleBar(NoOfCycles*prize.getHandleBar());
		cyclePrize.setHandleBarGrips(NoOfCycles*prize.getHandleBarGrips());
		cyclePrize.setFrontBrake(NoOfCycles*prize.getFrontBrake());
		cyclePrize.setBrakePad(NoOfCycles*prize.getBrakePad());
		cyclePrize.setShifters(NoOfCycles*prize.getShifters());
		cyclePrize.setSaddle(NoOfCycles*prize.getSaddle());
		cyclePrize.setSeatPost(NoOfCycles*prize.getSeatPost());
		cyclePrize.setSpokes(NoOfCycles*prize.getSpokes());
		cyclePrize.setHub(NoOfCycles*prize.getHub());
		cyclePrize.setRim(NoOfCycles*prize.getRim());
		cyclePrize.setTyre(NoOfCycles*prize.getTyre());
		cyclePrize.setRearBrake(NoOfCycles*prize.getRearBrake());
		cyclePrize.setChain(NoOfCycles*prize.getChain());
		cyclePrize.setChainRing(NoOfCycles*prize.getChainRing());
		cyclePrize.setCrank(NoOfCycles*prize.getCrank());
		cyclePrize.setPedal(NoOfCycles*prize.getPedal());
		cyclePrize.setCassatte(NoOfCycles*prize.getCassatte());
		cyclePrize.setGear(NoOfCycles*prize.getGear());
		cyclePrize.setNoOfCycles(NoOfCycles);
		cyclePrize.setTotalAmount(NoOfCycles*prize.getTotalAmount());
		return cyclePrize;
		
	}
	public static CyclePrize AddPrize(CyclePrize cyclePrize,CyclePrize QueuePrize) {
		CyclePrize newCyclePrize=new CyclePrize();
		newCyclePrize.setFrames(cyclePrize.getFrames()+QueuePrize.getFrames());
		newCyclePrize.setDerailuerHanger(cyclePrize.getDerailuerHanger()+QueuePrize.getDerailuerHanger());
		newCyclePrize.setHandleBar(cyclePrize.getHandleBar()+QueuePrize.getHandleBar());
		newCyclePrize.setHandleBarGrips(cyclePrize.getHandleBarGrips()+QueuePrize.getHandleBarGrips());
		newCyclePrize.setFrontBrake(cyclePrize.getFrontBrake()+QueuePrize.getFrontBrake());
		newCyclePrize.setBrakePad(cyclePrize.getBrakePad()+QueuePrize.getBrakePad());
		newCyclePrize.setShifters(cyclePrize.getShifters()+QueuePrize.getShifters());
		newCyclePrize.setSaddle(cyclePrize.getSaddle()+QueuePrize.getSaddle());
		newCyclePrize.setSeatPost(cyclePrize.getSeatPost()+QueuePrize.getSeatPost());
		newCyclePrize.setSpokes(cyclePrize.getSpokes()+QueuePrize.getSpokes());
		newCyclePrize.setHub(cyclePrize.getHub()+QueuePrize.getHub());
		newCyclePrize.setRim(cyclePrize.getRim()+QueuePrize.getRim());
		newCyclePrize.setTyre(cyclePrize.getTyre()+QueuePrize.getTyre());
		newCyclePrize.setRearBrake(cyclePrize.getRearBrake()+QueuePrize.getRearBrake());
		newCyclePrize.setChain(cyclePrize.getChain()+QueuePrize.getChain());
		newCyclePrize.setChainRing(cyclePrize.getChainRing()+QueuePrize.getChainRing());
		newCyclePrize.setCrank(cyclePrize.getCrank()+QueuePrize.getCrank());
		newCyclePrize.setPedal(cyclePrize.getPedal()+QueuePrize.getPedal());
		newCyclePrize.setCassatte(cyclePrize.getCassatte()+QueuePrize.getCassatte());
		newCyclePrize.setGear(cyclePrize.getGear()+QueuePrize.getGear());
		newCyclePrize.setNoOfCycles(cyclePrize.getNoOfCycles()+QueuePrize.getNoOfCycles());
		newCyclePrize.setTotalAmount(cyclePrize.getTotalAmount()+QueuePrize.getTotalAmount());
		return newCyclePrize;
		
	}
	public static void showResult(CyclePrize cyclePrize) {
		if(cyclePrize.getFrames()!=0) {
			System.out.println("Frames : "+cyclePrize.getFrames());
		}if(cyclePrize.getDerailuerHanger()!=0) {
			System.out.println("DerailuerHanger : "+cyclePrize.getDerailuerHanger());
		}if(cyclePrize.getHandleBar()!=0) {
			System.out.println("HandleBar : "+cyclePrize.getHandleBar());
		}if(cyclePrize.getHandleBarGrips()!=0) {
			System.out.println("HandleBarGrips : "+cyclePrize.getHandleBarGrips());
		}if(cyclePrize.getFrontBrake()!=0) {
			System.out.println("FrontBrake : "+cyclePrize.getFrontBrake());
		}if(cyclePrize.getBrakePad()!=0) {
			System.out.println("Brakepad : "+cyclePrize.getBrakePad());
		}if(cyclePrize.getShifters()!=0) {
			System.out.println("Shifters : "+cyclePrize.getShifters());
		}if(cyclePrize.getSaddle()!=0) {
			System.out.println("Saddle : "+cyclePrize.getSaddle());
		}if(cyclePrize.getSeatPost()!=0) {
			System.out.println("SeatPost : "+cyclePrize.getSeatPost());
		}if(cyclePrize.getSpokes()!=0) {
			System.out.println("Spokes : "+cyclePrize.getSpokes());
		}if(cyclePrize.getHub()!=0) {
			System.out.println("Hub : "+cyclePrize.getHub());
		}if(cyclePrize.getRim()!=0) {
			System.out.println("Rim : "+cyclePrize.getRim());
		}if(cyclePrize.getTyre()!=0) {
			System.out.println("Tyre : "+cyclePrize.getTyre());
		}if(cyclePrize.getRearBrake()!=0) {
			System.out.println("RearBrake : "+cyclePrize.getRearBrake());
		}if(cyclePrize.getChain()!=0) {
			System.out.println("Chain : "+cyclePrize.getChain());
		}if(cyclePrize.getChainRing()!=0) {
			System.out.println("ChainRing : "+cyclePrize.getChainRing());
		}if(cyclePrize.getPedal()!=0) {
			System.out.println("Pedal : "+cyclePrize.getPedal());
		}if(cyclePrize.getCassatte()!=0) {
			System.out.println("Cassatte : "+cyclePrize.getCassatte());
		}if(cyclePrize.getCrank()!=0) {
			System.out.println("Crank : "+cyclePrize.getCrank());
		}if(cyclePrize.getGear()!=0) {
			System.out.println("Gear : "+cyclePrize.getGear());
		}if(cyclePrize.getNoOfCycles()!=0) {
			System.out.println("No of Cycles : "+cyclePrize.getNoOfCycles());
		}if(cyclePrize.getTotalAmount()!=0) {
			System.out.println("TotalAmount : "+cyclePrize.getTotalAmount());
		}if(cyclePrize.getNoOfCycles()!=0) {
			System.out.println("No of Cycles : "+cyclePrize.getNoOfCycles());
		}
		
				
	}

	

}
