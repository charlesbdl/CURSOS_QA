import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
public class AprenderCucumber {
	@Dado("que eu criei o arquivo de feature corretamente")
	public void que_eu_criei_o_arquivo_de_feature_corretamente() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("passou aqui!");
	   // throw new io.cucumber.java.PendingException();
	}

	@When("eu o executo")
	public void eu_o_executo() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("a execução deve ser finalizada com sucesso")
	public void a_execução_deve_ser_finalizada_com_sucesso() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}
	private int contador = 0 ;
	@Dado("que o valor do contator é {int}")
	
	public void que_o_valor_do_contator_é(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		 contador = contador +  int1 ;
	}
	
	@Quando("eu incrementar em {int}")
	public void eu_incrementar_em(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		contador = contador +  int1 ;
	}

	@Então("o valor do contados será {int}")
	public void o_valor_do_contados_será(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.print(contador);
	}
	

}
