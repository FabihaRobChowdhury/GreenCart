package dynamicCoding_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class greenKart_Page {
	WebDriver driver;

	public greenKart_Page(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement Brocolli() {
		for (int i = 1; i < 4; i++) {
			WebElement brocolli = driver.findElement(By.xpath("//a[@class='increment']"));
			brocolli.click();
		}
		WebElement brocolli = driver.findElement(By.xpath("(//div[@class='products'])/div[1]/div[3]/button"));
		brocolli.click();
		return brocolli;
	}

	public WebElement Cauliflower() {
		for (int i = 1; i < 5; i++) {
			WebElement cauliflower = driver.findElement(By.xpath("(//a[@class='increment'])[2]"));
			cauliflower.click();
		}
		WebElement cauliflower = driver.findElement(By.xpath("(//div[@class='products'])/div[2]/div[3]/button"));
		cauliflower.click();
		return cauliflower;
	}

	public WebElement Cucumber() {
		for (int i = 1; i < 3; i++) {
			WebElement cucumber = driver.findElement(By.xpath("(//a[@class='increment'])[3]"));
			cucumber.click();
		}
		WebElement cucumber = driver.findElement(By.xpath("(//div[@class='products'])/div[3]/div[3]/button"));
		cucumber.click();
		return cucumber;
	}

	public WebElement Beetroot() {
		for (int i = 1; i < 2; i++) {
			WebElement beetroot = driver.findElement(By.xpath("(//a[@class='increment'])[4]"));
			beetroot.click();
		}
		WebElement beetroot = driver.findElement(By.xpath("(//div[@class='products'])/div[4]/div[3]/button"));
		beetroot.click();
		return beetroot;
	}

	/*
	 * public void cartIcon() {
	 * driver.findElement(By.xpath("(//div[@class='cart'])/a[4]/img")).click(); }
	 */

	public WebElement cartIcon() {
		WebElement cart = driver.findElement(By.xpath("(//div[@class='cart'])/a[4]/img"));
		cart.click();
		return cart;
	}

	public WebElement checkOut() {
		WebElement check = driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']"));
		check.click();
		return check;
	}

	public WebElement promoCode(String enterPromoCode) {
		WebElement promo = driver.findElement(By.xpath("//input[@class='promoCode']"));
		promo.sendKeys(enterPromoCode);
		return promo;
	}

	public WebElement onClickPromo() {
		WebElement click = driver.findElement(By.xpath("//button[@class='promoBtn']"));
		click.click();
		return click;
	}

	// doesn't show data on console

	public WebElement getText() throws InterruptedException {
		WebElement text = driver.findElement(By.xpath("//span[@class='promoInfo']"));
		Thread.sleep(5000);
		System.out.println("this is get text: " + text.getText());
		return text;
	}

	public WebElement placeOrder() throws InterruptedException {
		WebElement order = driver.findElement(By.xpath("//*[text()='Place Order']"));
		Thread.sleep(5000);
		order.click();
		return order;
	}

	public WebElement getCountry(String enterCountry) {
		WebElement country = driver.findElement(By.cssSelector("select[style='width: 200px;']"));
		Select select = new Select(country);
		select.selectByValue(enterCountry);
		return country;
	}

	public WebElement checkBox() {
		WebElement box = driver.findElement(By.xpath("//input[@class='chkAgree']"));
		box.click();
		return box;
	}

	public WebElement getProceed() {
		WebElement proceed = driver.findElement(By.xpath("//*[text()='Proceed']"));
		proceed.click();
		return proceed;
	}

}
