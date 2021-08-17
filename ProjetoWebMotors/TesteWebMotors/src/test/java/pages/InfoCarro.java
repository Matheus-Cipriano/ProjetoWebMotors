package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class InfoCarro {
private WebDriver navegador;
	
	//Construct
	public InfoCarro(WebDriver navegador) {
		this.navegador = navegador;
	}
	public void estouNaFerramentaTabelaFipe() throws InterruptedException {
		navegador.findElement(By.xpath("//*[@id=\"root\"]/header/nav/div/ul/li[3]")).click();
		navegador.findElement(By.xpath("//*[@id=\"navigationFipe\"]")).click();

		String winHandleBefore = navegador.getWindowHandle();
		for (String winHandle : navegador.getWindowHandles()) {
			navegador.switchTo().window(winHandle);
		}

		navegador.findElement(By.id("IdBtnHomeCar")).click();
		Thread.sleep(2000);
		navegador.findElement(By.id("IdListBrandCarMitsubishi")).click();
		((RemoteWebDriver) navegador).executeScript("scrollBy(0,550)", "");
		Thread.sleep(2000);
		navegador.findElement(By.id("IdListModelCarLancer")).click();
		((RemoteWebDriver) navegador).executeScript("scrollBy(0,350)", "");
		Thread.sleep(2000);
		navegador.findElement(By.id("IdListYearCar2017")).click();
		((RemoteWebDriver) navegador).executeScript("scrollBy(0,350)", "");
		Thread.sleep(2000);
		navegador.findElement(By.id("IdListVersionCar20-16v-gasolina-4p-manual")).click();
		((RemoteWebDriver) navegador).executeScript("scrollBy(0,350)", "");
		Thread.sleep(2000);
		navegador.findElement(By.id("IdListLocationCarSp")).click();
		Thread.sleep(2000);
		navegador.findElement(By.id("IdBtnDetailOffers")).click();
}
}