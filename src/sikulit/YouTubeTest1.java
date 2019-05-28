package sikulit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YouTubeTest1 {

	public static void main(String[] args) throws FindFailed, InterruptedException {


		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com/watch?v=oRdxUFDoQe0");

		Screen s = new Screen();
		
//		Pattern skipVideo = new Pattern("SkipVideo.JPG");
//		s.wait(skipVideo,2000);
//		s.click();
		
		Thread.sleep(10000);
		Pattern muteSound = new Pattern("MuteSound.JPG");
		s.wait(muteSound,2000);
		s.click();
		
		Pattern unmute = new Pattern("UnmuteSound.JPG");
		s.wait(unmute,2000);
		s.click();
		
		Pattern pausePlay = new Pattern("PausePlay.JPG");
		s.wait(pausePlay,2000);
		s.click();
		
		Pattern playVideo = new Pattern("PlayVideo.JPG");
		s.wait(playVideo,2000);
		s.click();
		
		Pattern fullScren = new Pattern("FullScreen.JPG");
		s.wait(fullScren,2000);
		s.click();
		
		Pattern dView = new Pattern("DefaultView.JPG");
		s.wait(dView,2000);
		s.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
