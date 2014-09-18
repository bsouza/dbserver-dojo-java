package br.com.dbserver.dojo;

import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import static org.junit.Assert.*;

public class ConversorNumerosTest {

	private ConversorNumeros conversor;
	private Integer numeroParaConverter;
	private String resultado;
	private String erroRecebido;
	
	@Before
	public void prepararTestes() {
		conversor = new ConversorNumeros();
	}
	
	@Dado("^que tenho o número (\\d+)$")
	public void que_tenho_o_número(int numeroParaConverter) throws Throwable {
		this.numeroParaConverter = numeroParaConverter;
	}

	@Quando("^realizo a conversão$")
	public void realizo_a_conversão() throws Throwable {
	  try {
	    resultado = conversor.converte(numeroParaConverter);
    } catch (Exception e) {
      erroRecebido = e.getMessage();
    }
		resultado = conversor.converte(numeroParaConverter);
	}

	@Entao("^meu resultado deve ser \"(.*?)\"$")
	public void meu_resultado_deve_ser(String resultadoEsperado) throws Throwable {
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Entao("^devo receber a mensagem \"(.*?)\"$")
	public void devo_receber_a_mensagem(String erroEsperado) throws Throwable {
	  assertEquals(erroEsperado, erroRecebido);
	}
}
