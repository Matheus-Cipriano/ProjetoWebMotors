package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FerramentaFIPE {
	WebDriver navegador;
	
	//Construct
	public FerramentaFIPE(WebDriver navegador) {
		this.navegador = navegador;
	}
	public void entroNaFerramentaTabelaFipe() throws InterruptedException {
		Thread.sleep(3000);
		navegador.findElement(By.xpath("//*[@id=\"root\"]/header/nav/div/ul/li[3]")).click();
		navegador.findElement(By.xpath("//*[@id=\"navigationFipe\"]")).click();

		for (String winHandle : navegador.getWindowHandles()) {
			navegador.switchTo().window(winHandle);
		}
}
}