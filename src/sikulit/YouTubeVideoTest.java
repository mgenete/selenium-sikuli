package sikulit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeVideoTest {

	public static void main(String[] args) throws FindFailed {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=WuuhqpRmb_o");
		
		//create the object of Screen class - sikuli
		Screen s = new Screen();
	
		
		Pattern pauseImg = new Pattern("MuteSound.JPG");
		s.wait(pauseImg,2000);
		s.click();
		
		Pattern pauseImg2 = new Pattern("PausePlay.JPG");
		s.wait(pauseImg2,2000);
		s.click();
		
		

	}

}
