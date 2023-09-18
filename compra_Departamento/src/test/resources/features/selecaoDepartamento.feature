# language: pt

Funcionalidade: Pesquisa por departamento

Cenario: Adicionar compra ao carrinho Magazine Luiza

	Dado esteja  no site da Magazine luiza
	E seleciono o terceiro departamento dentro da listagem de departamento
	Quando adiciono terceiro produto do da listagem do departamento ao carrinho
	Então valido que informações do carrinho estão iguais a da listagem 
