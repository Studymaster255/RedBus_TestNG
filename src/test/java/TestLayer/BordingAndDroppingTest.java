package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.BordingAndDroppingpage;

public class BordingAndDroppingTest extends BaseClass {
	
	public static BordingAndDroppingpage bdp=new BordingAndDroppingpage();
	
	@Test(priority=1)
	public void BordingDroping() throws InterruptedException
	{
		bdp.bordingPoint();
	}
	
	public void DroppingDroping() throws InterruptedException
	{
		bdp.droppingPoint();
	}

}
