package pages;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidacaoPreco {
	private WebDriver navegador;

	// Construct
	public ValidacaoPreco(WebDriver navegador) {
		this.navegador = navegador;
	}

	public void validoSeOPrecoFoiDado() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(navegador, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class,'Result__value')])[1]")));

		String str1 = navegador.findElement(By.xpath("(//span[contains(@class,'Result__value')])[1]")).getText();
		String str2 = navegador.findElement(By.xpath("(//span[contains(@class,'Result__value')])[2]")).getText();

		String str10 = str1.replace("R$ ", "");
		str10 = str10.replace(",", ".");
		str10 = str10.replaceFirst("[.]", "");
		double valor1 = Double.parseDouble(str10);

		String str20 = str2.replace("R$ ", "");
		str20 = str20.replace(",", ".");
		str20 = str20.replaceFirst("[.]", "");
		double valor2 = Double.parseDouble(str20);

		Thread.sleep(1000);
		System.out.println("_____________________________________________");
		if (valor1 < valor2) {
			// JOptionPane.showMessageDialog(null, "O menor valor é o da FIPE: "+str1);
			System.out.println("\nO menor valor é o da FIPE: " + str1);
		} else if (valor2 < valor1) {
			// JOptionPane.showMessageDialog(null, "O menor valor é o da WebMotors: "+str2);
			System.out.println("\nO menor valor é o da WebMotors: " + str2);
		} else {
			// JOptionPane.showMessageDialog(null, "Os dois valores são iguais\nFIPE:
			// "+valor2+ "\nWebMotors: "+valor1);
			System.out.println("\nOs dois valores são iguais\nFIPE: " + valor2 + "\nWebMotors: " + valor1);
		}
		System.out.println("_____________________________________________");
		navegador.quit();
	}

}