package Grouid.Framework1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.seleniumhq.jetty9.util.IO;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;



public class Screenshot {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RaminduK\\eclipse-workspace\\Framework1\\drivers\\chromedriver.exe");
		
		
		
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.setHeadless(true);
		WebDriver driver = new ChromeDriver(chromeoption);
		
		driver.get("https://erp.dpg.lk//");
		System.out.println("executing headless browser");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"strUserName\"]")).sendKeys("RaminduK");
		//System.out.println("element found");
		driver.findElement(By.xpath("//*[@id=\"strPassword\"]")).sendKeys(arg0);
		
		
		//*[@id="strPassword"]

			// convert web driver object to TakeScreenshot
		/*	TakesScreenshot srcShot = ((TakesScreenshot) driver);

			// Call getScreenshotAs method to create image file
			File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
			
			File DesFile = new File("C:\\Users\\RaminduK\\Desktop\\Aotomation\\scrnshot\\image.png");
			
			//copy files
			FileUtils.copyFile(srcFile, DesFile); */
			//Screenshot scrnshot = new AShot().shootingStrategy(strategy)
		   // WebElement logoElement = driver.findElement(By.xpath("//*[@id=\"gb_70\"]"));
		    //Screenshot scrnshot = new Screenshot();
		    
			//ru.yandex.qatools.ashot.Screenshot screenshot =  new AShot().coordsProvider(new WebDriverCoordsProvider()).shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,logoElement);
			//ImageIO.write(screenshot.getImage(), â€œjpgâ€�, new File(â€œC:\\Users\\RaminduK\\Desktop\\Aotomation\\scrnshot\\image.pngâ€�));
			//ImageIO.write(screenshot.getImage(), "png", new File("C:\\Users\\RaminduK\\Desktop\\Aotomation\\scrnshot\\image.png"));
		
			/*BufferedImage expectedImage =null; 
			
			try { 
				expectedImage = ImageIO.read(new File("C:\\Users\\RaminduK\\Desktop\\Aotomation\\scrnshot\\image.png"));
				
			} catch (IOException e) {
				e.printStackTrace();
				
			}
			BufferedImage actualImage = screenshot.getImage();
			ImageDiffer imgDiff = new ImageDiffer();
			assert expectedImage != null;
			ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);
			if(diff.hasDiff()) {
				System.out.println("Images are same");
			} else {
				System.out.println("Images are different");
			} */
		
		/*String baseUrl ="https://chromedriver.storage.googleapis.com/index.html?path=86.0.4240.22/";
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement downloadbutton = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]/a"));
		String sourceLocation = downloadbutton.getAttribute("href"); 
		String wget_command = "cmd /c C:\\Users\\RaminduK\\Desktop\\Aotomation\\wget.exe â€“P D: --no-check-certificate" + sourceLocation;
		try {
			
			Process exec = Runtime.getRuntime().exec(wget_command); 
			int exitVal = exec.waitFor();
			System.out.println("Exit Value" +exitVal);
		} 
		catch(InterruptedException ex) {
			System.out.println(ex.toString());
			
			
		} catch(IOException ex) {
			System.out.println(ex.toString());
			
		} */
		driver.close();
	}
	
}
