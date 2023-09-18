package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.manager.Driver;

public class BasePage extends Driver {
	public void mouseEnterFlex(By element, By element0) {
	 WebElement link = getDriver().findElement(element);
	 new Actions(getDriver()).moveToElement(link).perform();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	 wait.until(ExpectedConditions.elementToBeClickable(element0));
	 getDriver().findElement(element0).click();
	
	}
	public void escolherProdutoNalistagem(By element ) {
		WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromViewport(100, 100);
        new Actions(driver).scrollFromOrigin(scrollOrigin, 0, 400).perform();
        getDriver().findElement(element).click();
        
        
		
		
		
		
	}
}
