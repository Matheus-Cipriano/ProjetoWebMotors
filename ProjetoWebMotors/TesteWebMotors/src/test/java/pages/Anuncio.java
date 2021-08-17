package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Anuncio {
private WebDriver navegador;
	
	//Construct
	public Anuncio(WebDriver navegador) {
		this.navegador = navegador;
	}
	public void selecionoUmAnuncio() throws InterruptedException {
		((RemoteWebDriver) navegador).executeScript("scrollBy(0,250)", "");
		//navegador.findElement(By.id("IdBtnDetailOffers")).click();
		Thread.sleep(3000);
		navegador.findElement(By.xpath("//*[@id='root']/main/div[1]/div[3]/div[2]/div/div[1]/div/div[2]")).click();
		Thread.sleep(2000);

		}

}
