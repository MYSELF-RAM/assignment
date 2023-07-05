package Week7;

import org.testng.annotations.Test;

public class PomTc02 extends PomBase{

	@Test
	public void tc02() {
		
	PomLogin lp=new PomLogin(driver);
	lp.uname().pass().clicklogin().clickcrmsfa().clickleads().createlead().inputdetails().verify();
	}
}
