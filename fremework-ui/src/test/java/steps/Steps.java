package steps;

import java.io.IOException;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Elementos;
import metodos.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	Elementos elemento = new Elementos();

	@Dado("que esteja no site")
	public void que_esteja_no_site() {
		metodos.abrirNavegador("http://advantageonlineshopping.com/#/");
	}

	@Quando("cadastrar um conta")
	public void cadastrar_um_conta() throws InterruptedException {

		metodos.clicar(elemento.getUser());
		metodos.pausa(3000);
		metodos.clicar(elemento.getCreateAccount());
		metodos.escrever(elemento.getNome(), "Cloe");
		metodos.escrever(elemento.getEmail(), "ma.m@m.com.br");
		metodos.escrever(elemento.getSenha(), "Mmm@123456!");
		metodos.escrever(elemento.getCsenha(), "Mmm@123456!");
		metodos.escrever(elemento.getFirstname(), "Mauricio");
		metodos.escrever(elemento.getSobrenome(), "Avila");
		metodos.escrever(elemento.getNumero(), "(11)9999-9999");
		metodos.escrever(elemento.getPais(), "Brasil");
		metodos.escrever(elemento.getCidade(), "Osasco");
		metodos.escrever(elemento.getRua(), "(Rua:xxxxxxxxxxx");
		metodos.escrever(elemento.getAleatorio(), "São Paulo");
		metodos.escrever(elemento.getPostalcode(), "0000-000");
		metodos.clicar(elemento.getAperte());
		metodos.pausa(2000);
		metodos.clicar(elemento.getRegistrar());

	}

	@Entao("valido as informacoes")
	public void valido_as_informacoes() throws InterruptedException, IOException {
		metodos.pausa(3000);
		metodos.validacao("Cloe", elemento.getValidacao());
		metodos.ScreenShot("evidencia");
		metodos.fecharNavegador();

	}

	@Dado("que eu esteja no site")
	public void que_eu_esteja_no_site() {
		metodos.abrirNavegador("http://advantageonlineshopping.com/#/");	

	}

	@Quando("fazer login")
	public void fazer_login() throws InterruptedException {
		metodos.clicar(elemento.getUser());
		metodos.escrever(elemento.getNomelgin(), "Diogo");
		metodos.escrever(elemento.getNovaSenha(), "Mmm@123456!");
		metodos.pausa(2000);
		metodos.clicar(elemento.getEntrar());
	}

	@Entao("valida as informacoes")
	public void valida_as_informacoes() throws InterruptedException, IOException {
		metodos.pausa(2000);
		metodos.validacao("Diogo", elemento.getValidacao());
		metodos.ScreenShot("evidencia1");
		metodos.fecharNavegador();
		
	}

}
