# language: pt
# encoding: utf-8
Funcionalidade: 
  Realizar conversão de números para o seu respectivo valor por extenso.

  Esquema do Cenario: Converter o números de 1 a 20
    Dado que tenho o número <numero>
    Quando realizo a conversão
    Entao meu resultado deve ser <numero_por_extenso>

    Exemplos: 
      | numero | numero_por_extenso |
      | 1      | "um"               |
      | 2      | "dois"             |
      | 3      | "tres"             |
      | 4      | "quatro"           |
      | 5      | "cinco"            |
      | 6      | "seis"             |
      | 7      | "sete"             |
      | 8      | "oito"             |
      | 9      | "nove"             |
      | 10     | "dez"              |
      | 11     | "onze"             |
      | 12     | "doze"             |
      | 13     | "treze"            |
      | 14     | "quatorze"         |
      | 15     | "quinze"           |
      | 16     | "dezesseis"        |
      | 17     | "dezesete"         |
      | 18     | "dezoito"          |
      | 19     | "dezenove"         |
      | 20     | "vinte"            |

  Cenario: Deve validar número inválido
    Dado que tenho o número 100
    Quando realizo a conversão
    Entao devo receber a mensagem "Número Inválido."
