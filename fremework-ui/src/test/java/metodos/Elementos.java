package metodos;

import org.openqa.selenium.By;

public class Elementos {

	private By user = By.id("menuUser");
	private By createAccount = By.xpath("//a[contains(text(),\"CREATE NEW ACCOUNT\")]");
	private By nome = By.name("usernameRegisterPage");
	private By email = By.name("emailRegisterPage");
	private By senha = By.name("passwordRegisterPage");
	private By csenha = By.name("confirm_passwordRegisterPage");
	private By firstname = By.name("first_nameRegisterPage");
	private By sobrenome = By.name("last_nameRegisterPage");
	private By numero = By.name("phone_numberRegisterPage");
	private By pais = By.name("countryListboxRegisterPage");
	private By cidade = By.name("cityRegisterPage");
	private By rua = By.name("addressRegisterPage");
	private By aleatorio = By.name("state_/_province_/_regionRegisterPage");
	private By postalcode = By.name("postal_codeRegisterPage");
	private By aperte = By.name("i_agree");
	private By registrar = By.id("register_btnundefined");
	private By validacao = By.cssSelector("#menuUserLink > span"); 
	private By nomelgin = By.name("username");
	private By novaSenha = By.name("password");
	private By entrar = By.id("sign_in_btnundefined");
	
	
	public By getUser() {
		return user;
	}

	public By getCreateAccount() {
		return createAccount;
	}

	public By getNome() {
		return nome;
	}

	public By getEmail() {
		return email;
	}

	public By getSenha() {
		return senha;
	}

	public By getCsenha() {
		return csenha;
	}

	public By getFirstname() {
		return firstname;
	}

	public By getSobrenome() {
		return sobrenome;
	}

	public By getNumero() {
		return numero;
	}

	public By getPais() {
		return pais;
	}

	public By getCidade() {
		return cidade;
	}

	public By getRua() {
		return rua;
	}

	public By getAleatorio() {
		return aleatorio;
	}

	public By getPostalcode() {
		return postalcode;
	}

	public By getAperte() {
		return aperte;
	}

	public By getRegistrar() {
		return registrar;
	}

	public By getValidacao() {
		return validacao;
	}

	public By getNomelgin() {
		return nomelgin;
	}

	public By getNovaSenha() {
		return novaSenha;
	}

	public By getEntrar() {
		return entrar;
	}

}
