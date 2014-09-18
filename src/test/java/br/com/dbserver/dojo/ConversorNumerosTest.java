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
		resultado = conversor.converte(numeroParaConverter);
	}

	@Entao("^meu resultado deve ser \"(.*?)\"$")
	public void meu_resultado_deve_ser(String resultadoEsperado) throws Throwable {
		assertEquals(resultadoEsperado, resultado);
	}
	
}
