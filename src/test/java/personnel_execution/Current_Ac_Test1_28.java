package personnel_execution;

import org.testng.annotations.Test;

public class Current_Ac_Test1_28  extends Current_Ac_Test2_28 {
	
	@Test
	public void Test1 () {
		System.out.println("These is test First");
	}
	
	@Test (enabled=false)
	public void Test2 () {
		System.out.println("These is test Second");
	}
	
	@Test (enabled=false)
	public void Test3 () {
		System.out.println("These is test Third");
	}
	
	

}
