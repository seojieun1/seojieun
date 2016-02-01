package jieun;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Browser {
	
		public static void main(String[] args)
		{
			System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.get("http://news.naver.com");
}
