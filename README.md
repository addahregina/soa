# soa
Projeto Final Sistemas Distribuidos e SOA

Projeto Final: Sistemas Distribuídos

O objetivo deste projeto é desenvolver um sistema distribuído formado por 4 outros sistemas. Estes interoperam por meio de web services REST utilizando a especificação JAX-RS. Nenhum destes sistemas precisa ter front-end, apenas o back-end com acesso a banco de dados e disponibilização dos endpoints REST (as URLs por meio das quais podemos acessar os serviços).

Você deve escolher um dos sistemas abaixo para desenvolver utilizando JavaEE com JPA, DataSource, DAOs genéricos, CDI e JAX-RS, conforme indicado neste tutorial.

Todos os sistemas que possuem tabelas de cidades e estados devem utilizar os códigos do IBGE para permitir que eles funcionem em conjunto. Se em um sistema uma cidade tiver um código e em outro sistema tiver outro código, obteremos dados errados ao integrar estes sistemas.

Uma lista de cidades e estados com os códigos do IBGE pode ser obtida no script cidades-brasil-ibge.sql. Tal script é pra MySQL. Se for utilizar outro banco, adapte o script.


2. Sistema de Busca de Hotéis

O sistema deve possuir tabelas para cadastro de cidades, estados, bairros e hotéis. Deve existir uma tabela para cadastrar os quartos de um hotel, indicando o número do quarto, andar, total de camas e preço.

Não é preciso implementar classes DAO para cadastro de todas essas tabelas, mas apenas para aquelas exibidas na lista a seguir.

Devem ser disponibilizados os seguintes endpoints REST:

    consultar hotéis por cidade

    consultar hotéis por bairro de uma cidade

    consultar hotéis por cidade, faixa de preço e total de camas

    cadastrar reserva de quarto

    alterar reserva de quarto

    excluir reserva de quarto

