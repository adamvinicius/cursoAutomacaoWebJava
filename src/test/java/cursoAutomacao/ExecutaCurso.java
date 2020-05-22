package cursoAutomacao;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Driver;
import page.RegisterPage;

public class ExecutaCurso {
	RegisterPage registerPage = new RegisterPage();
	public void test1(){
		System.out.println("teste 1");
	}
	
	
	public void validoSoma() {
		int _soma = soma(10, 5);
		Assert.assertEquals(15, _soma);
	}
		
	@Test
	public void preencheFormulario() {
		registerPage.validaTitulo("Register");
		registerPage.setFirstName("Adam");
		registerPage.setLastName("Luchini");
		registerPage.setEndereco("Rua Mauro");
		registerPage.setEmail("adamvinicius@gmail.com");
		registerPage.setTelefone("1145215421");
		registerPage.validaTelefone("1145215421");
		registerPage.clickGenero("Male");
		registerPage.clickHobbie("Movies");
		registerPage.clickHobbie("Hockey");
		String caminhoArquivo = System.getProperty("user.dir")+"\\files\\teste.jpg";
		registerPage.setFile(caminhoArquivo);
		registerPage.validaLogo("original.png");
		//registerPage.selecionaSkill("Java");
		registerPage.selecionaSkills("Java");
		aguardaTempo(3000);
	}
		
	
	public void aguardaTempo(long tempo) {
		Thread.currentThread();
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Before
	public void abreNavegador() {
		Driver.setDriver("http://demo.automationtesting.in/Register.html");
	}
	
	@After
	public void fechaNavegador() {
		Driver.getDriver().quit();
	}
	
	public int soma(int a, int b) {
		int soma = a + b;
		return soma;
	}
}
