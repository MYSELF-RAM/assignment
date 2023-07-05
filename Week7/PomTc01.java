package Week7;

import org.testng.annotations.Test;

public class PomTc01 extends PomBase{
	@Test
	public void tc01() {
		
	PomLogin lp=new PomLogin(driver);
	lp.uname().pass().clicklogin();

}}
