package jieun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LineTV {
	public static WebDriver driver;
	
	public LineTV(){
		driver = new FirefoxDriver();
//		driver = new ();
		driver.manage().window().maximize();
		driver.get("http://tv.ilne.me/");
		
		버튼을_클릭한다();
	}
	
	public void 버튼을_클릭한다() {
//		this.findElement(By.xpath(Constant.버튼)).click(); // 버튼 위에 마우스 올려놓고  F3
//		this.findElement(By.xpath(Constant.뮤직)).click();
//		this.findElement(By.xpath(Constant.ENTERTAINMENT)).click();
		this.findElement(By.xpath(Constant.test)).click();
	}
	
	public WebElement findElement(By path){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(path));
 
		WebElement element = driver.findElement(path);
 
		return element;		
	}
	
	public static void main(String[] args) {
		new LineTV();		
	}
}