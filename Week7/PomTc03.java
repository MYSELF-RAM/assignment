package Week7;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PomTc03 extends PomBase {
	@DataProvider(name="getdata")
	public String[][] fetchdata() throws IOException {
	String[][] datas = PomExcelEdit.exceldata();
	return datas;
		
	}
	@Test(dataProvider="getdata")
	public void tc03(String phno,String UpCname) throws InterruptedException  {
		PomLogin lp=new PomLogin(driver);
		lp.uname().pass().clicklogin().clickcrmsfa().clickleads().editlead().edit(phno, UpCname);
	}

}
