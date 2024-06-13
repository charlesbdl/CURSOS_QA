# language: pt
Funcionalidade: Aprender Cucumber
	Como um aluno
	Eu quero aprender a utilizar o Cucumber
	Para que eu possa automatizar critérios de aceitação
	
	Cenário: Deve executar especificação
  		Dado que eu criei o arquivo de feature corretamente
  		Quando eu o executo
  		Então a execução deve ser finalizada com sucesso
  		
	Cenário: Deve Incrementar contador
		Dado que o valor do contator é 15
		Quando eu incrementar em 5
		Então o valor do contados será 18
		