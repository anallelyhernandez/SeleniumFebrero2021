package selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import comun.LeerProperties;

public class SeleniumTest {
	public static Logger log = Logger.getLogger(SeleniumTest.class);
	static LeerProperties prop = new LeerProperties();


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rutaChrome = System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", rutaChrome);

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--star-maxi");
		option.addArguments("--star-maxi");

		WebDriver driver = new ChromeDriver(option);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		prop.getSystemProperties();

		String url= System.getProperty("URL");
		driver.get(url);

		WebElement txt_UsernameById = driver.findElement(By.id("txtUsername"));
		WebElement txt_password = driver.findElement(By.name("txtPassword"));
		txt_UsernameById.sendKeys("Admin");
		txt_password.sendKeys("admin123");

		WebElement btn_login = driver.findElement(By.id("btnLogin"));
		btn_login.click();
		log.info("Uso Log");

		try {
			WebElement linkWelcome = driver.findElement(By.xpath("//a[@id='wlcome']"));

			if (linkWelcome.getSize() != null) {
				System.out.println("El login fue exitoso");
			}
		} catch (NoSuchElementException e) {
			System.out.println("El login NO fue exitoso");
		}

	}
}
