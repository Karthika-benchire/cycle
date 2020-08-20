package cycle;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * CycleExecutor class used to execute cyclePrizeCalculator with
 * the help of Multithreading and Blocking Queue.
 * 
 * @author Karthika
 *
 */
public class CycleExecutor {

	private static final int MY_THREADS=10;
	private static final String FILE_LOCATION="C:\\Users\\maheshkumar.a.s\\eclipse-workspace\\TestDemo\\src\\main\\resources\\CycleInput.txt";

	public static void main(String args[]) throws JsonParseException, JsonMappingException, IOException, InterruptedException {
		ObjectMapper mapper=new ObjectMapper();
		final ExecutorService executor=Executors.newFixedThreadPool(MY_THREADS);
		BlockingQueue<CyclePrize> queue=new ArrayBlockingQueue<CyclePrize>(100);

		List<CycleParts> partsList=Arrays.asList(mapper.readValue(new File(FILE_LOCATION), CycleParts[].class));
		Iterator<CycleParts> cycleIterator = partsList.iterator();
		queue.put(new CyclePrize());

		while(cycleIterator.hasNext()) {
			Runnable calculate=new CyclePrizeCalculater(cycleIterator.next(),queue);
			executor.execute(calculate);
			Thread.sleep(100);
		}
		executor.shutdown();

		showResult(queue);

	}

	private static void showResult(BlockingQueue<CyclePrize> queue) throws InterruptedException  {
		CyclePrize cyclePrize=new CyclePrize();
		cyclePrize=queue.take();
		CyclePrize.showResult(cyclePrize);
	}
} 
