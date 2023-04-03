package teste;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos met = new Metodos();
	Elementos el = new Elementos();

	@Given("dado que eu esteja no site {string}")
	public void dado_que_eu_esteja_no_site(String site) {
		met.abrirNavegador(site);
	}

	@When("preencho o formulario")
	public void preencho_o_formulario() {
		met.escrever(el.getFirstname(), "Adriana");
		met.escrever(el.getLastname(), ("Teste"));
		met.escrever(el.getAddress(), ("Rua:Anturios n:338 Cajamar Sp"));
		met.escrever(el.getEmail(), ("adrianadepauladare@gmail.com"));
		met.escrever(el.getPhone(), ("1128761264"));
		met.clicar(el.getGender());
		met.clicar(el.getHobbies());
		met.clicar(el.getLanguages());
		met.clicar(el.getIngles());
		met.clicar(el.getSkills());
		met.clicar(el.getCountry());
		met.clicar(el.getSelectcoutry());
		met.clicar(el.getAustralia());
		met.clicar(el.getYear());
		met.clicar(el.getMonth());
		met.clicar(el.getDay());
		met.escrever(el.getPassword(), ("pipoca"));
		met.escrever(el.getConfirme(), ("pipoca"));
		met.clicar(el.getPhoto());

	}

	@When("clico em submit")
	public void clico_em_submit() {
		met.clicar(el.getSubmit());

	}

	@Then("deveria concluir o registro")
	public void deveria_concluir_o_registro() {

	}

	@Given("clico em switch to")
	public void clico_em_switch_to() {
		met.clicar(el.getSuwitchto());

	}

	@When("clico em Frame")
	public void clico_em_frame() {
		met.clicar(el.getSuwitchto());
		met.clicar(el.getFrames());

		met.clicar(el.getButtonPopUp());
		met.clicar(el.getButtonPopUp());
		met.clicar(el.getDemoifraime());

	}

	@Then("escrevo texto dentro do campo")
	public void escrevo_texto_dentro_do_campo() {
		met.clicar(el.getButtonPopUp());
		met.clicar(el.getButtonPopUp());
		met.escrever(el.getDemoifraime(), ("Adriana voce passou no teste!!!"));
		
		
	}

	@Given("clico em widgets")
	public void clico_em_widgets() {
		met.clicar(el.getWidgets());
		met.clicar(el.getDatepicker());
		met.clicar(el.getDatepicker());
		met.pausa(5000);

	}

	@Given("clico em DatePicker")
	public void clico_em_date_picker() {
		met.clicar(el.getDatepicker());
		met.pausa(5000);

	}

	@When("preencho o campo DatePicker Disabled")
	public void preencho_o_campo_date_picker_disabled() {
		met.clicar(el.getDisabledmonth());
		met.clicar(el.getDisabledday());
		met.clicar(el.getDisabledyear());

	}

	@Then("preencho o campo DatePicker Enabled")
	public void preencho_o_campo_date_picker_enabled() {
		met.clicar(el.getEnabledmonth());
		met.clicar(el.getEnabledday());
		met.clicar(el.getEnablendyear());

		
	}

	@When("clico em Slider")
	public void clico_em_slider() {
		met.clicar(el.getWidgets());
		met.clicar(el.getSlider());
		
	}

	@Then("movo a o cursor da barra ate a metade")
	public void movo_a_o_cursor_da_barra_ate_a_metade() {
		met.clicar(el.getCursorslider());

	}
}