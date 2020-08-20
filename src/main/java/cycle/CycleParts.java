package cycle;

import cycle.pojo.ChainAssemblyParts;
import cycle.pojo.FrameParts;
import cycle.pojo.HandleBarAndBrakes;
import cycle.pojo.SaddleParts;
import cycle.pojo.WheelParts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class CycleParts {

	private FrameParts frameParts;
	private HandleBarAndBrakes handleBarAndBrakes;
	private SaddleParts saddleParts;
	private WheelParts wheelParts;
	private ChainAssemblyParts ChainAssembly;
	
	private int noOfCycle=1;
	private String dateOfPrizing;
	
	
	
	
}
