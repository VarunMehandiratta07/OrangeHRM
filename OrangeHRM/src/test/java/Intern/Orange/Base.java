package Intern.Orange;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	protected WebDriver driver;
	protected Properties prop;

	@BeforeMethod
	public void setUp() {

		try {
			prop = new Properties();
			File file = new File(System.getProperty("user.dir") + "\\src\\test\\java\\data.properties");
			FileReader fr = new FileReader(file);
			prop.load(fr);
		} catch (IOException e) {
			e.getStackTrace();
		}
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
