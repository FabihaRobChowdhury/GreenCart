package dynamicCoding_Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dynamicCoding_Page.greenKart_Page;

public class greenKart_Test {
	WebDriver driver;
	
	
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void validTest() throws InterruptedException {
		greenKart_Page gr = new greenKart_Page(driver);
		
		gr.Brocolli();
		gr.Cauliflower();
		gr.Cucumber();
		gr.Beetroot();
		gr.cartIcon();
		gr.checkOut();
		gr.promoCode("rahulshettyacademy");
		gr.onClickPromo();
		gr.getText();
		gr.placeOrder();
		gr.getCountry("Belgium");
		gr.checkBox();
		gr.getProceed();
		

		
		
	}
}
