package org.utility;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.auto.common.Visibility;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {
	public static WebDriver driver;

	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir") + "\\Config\\config.properties"));
		Object object = properties.get(key);
		String value = (String) object;
		return value;
	}
	public void elementSendkeys(WebElement element,String data) {
		elementVisibility(element);
		element.sendKeys(data);
	}
	public static void implicitlyWaits(int value) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(value));

	}
	public void selectByVisibleText(WebElement element,String text) {
		Select s = new Select(element);
		 s.selectByVisibleText(text);
	}
	public byte[] screenShots(Scenario screenShot) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
		return screenshotAs;
	}
	public void action(WebElement element)  {
		Actions action = new Actions(driver);
		elementVisibility(element);
		action.moveToElement(element).click().perform();;
		action.keyDown(Keys.DOWN);action.keyUp(Keys.DOWN);
		action.keyDown(Keys.DOWN);action.keyUp(Keys.DOWN);
		action.keyDown(Keys.DOWN);action.keyUp(Keys.DOWN);
		action.keyDown(Keys.ENTER);action.keyUp(Keys.ENTER).perform();;
		action.keyDown(Keys.TAB);action.keyUp(Keys.TAB).perform();;
		
	}
	public String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	public void elementClick(WebElement element) {
		
		element.click();
	}

	public  void elementVisibility(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void clickUsingJs(WebElement element) {
		elementVisibility(element);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void enterURL(String url) {
		driver.get(url);
	}

	public String getText(WebElement element) {//7
		elementVisibility(element);
		String text = element.getText();
		return text;
	}
	public String elementGetAttributeValue(WebElement element) {//15
		elementVisibility(element);
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public static void getDriver(String browserType) {
		switch (browserType) {
		case "CHROME":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "FIREFOX":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			break;
		case "EDGE":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;

		default:
			break;
		}
	}
}
