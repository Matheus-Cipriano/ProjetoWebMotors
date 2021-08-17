package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MarcaEModelo {
	private WebDriver navegador;
	
	//Construct
	public MarcaEModelo(WebDriver navegador) {
		this.navegador = navegador;
	}
	public void escolhoUmaMarcaEUmModelo() throws InterruptedException {
		Thread.sleep(2000);
		navegador.findElement(By.id("IdBtnHomeCar")).click();
		Thread.sleep(2000);
		navegador.findElement(By.id("IdListBrandCarMitsubishi")).click();
		((RemoteWebDriver) navegador).executeScript("scrollBy(0,550)", "");
		Thread.sleep(2250);
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
}
}