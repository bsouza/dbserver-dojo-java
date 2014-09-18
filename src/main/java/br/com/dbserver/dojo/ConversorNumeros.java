package br.com.dbserver.dojo;

public class ConversorNumeros {

  String[] numeros = { "zero", "um", "dois", "tres", "quatro", 
      "cinco", "seis", "sete", "oito", "nove","dez","onze","doze","treze","quatorze","quinze","dezesseis","dezesete","dezoito","dezenove","vinte"};

  public String converte(Integer numeroParaConverter) {
    return numeros[numeroParaConverter];
  }

}
