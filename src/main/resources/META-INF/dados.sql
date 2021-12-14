/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  addah
 * Created: Dec 13, 2021
 */

--consulta hotel por nome
select * from hotel h
inner join cidade c on c.nome = h.hotel
and c.nome = '%%';

-- consultar hotéis por bairro de uma cidade
select * from hotel h
inner join cidade c on c.nome = h.hotel
and c.nome = '%%' and c.bairro = '%%';

-- consultar hotéis por cidade, faixa de preço e total de camas
select * from hotel h
inner join cidade c on c.nome = h.hotel
inner join quarto q on q.hotel = h.hotel
and c.nome = '%%' and q.valor and q.cama = '%%' between '%min%' and '%max%' ;

-- cadastrar reserva de quarto
insert into reserva(usuario, quarto, data) values ('%usuario%', '%quarto%', '%data%');

-- alterar reserva de quarto
update reserva (usuario, quarto, data) set values ('%usuario%', '%quarto%', '%data%');

-- excluir reserva de quarto
delete from reserve where id = '%id%';