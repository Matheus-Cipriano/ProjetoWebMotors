#language: pt

Funcionalidade: Consultar a tabela FIPE de um veículo, e ver um anúnico e falar com o vendedor.
	Eu como um comprador
	Desejo verificar o valor da FIPE e enviar uma mensagem ao vendedor de um anuncio
	

	Cenario: entrar no site e fazer as consultas
		Dado que estou no site 
		Quando entro na ferramenta Tabela FIPE
		E escolho uma marca e um modelo
		Entao valido se o preco foi dado

	Cenario: consultar um anuncio e falar com o vendedor
		Dado que estou no site
		E estou na ferramenta tabela FIPE
		Quando seleciono um anuncio
		E envio uma mensagem
		Entao valido se o botao e clicavel