create database usuario;

use usuario;

create table infousu(
nome varchar(20) primary key,
email varchar(10),
login varchar(10),
senha varchar(10)
);

select * from infousu;

create database consultaProduto;

use consultaProduto;

create table infoConsultaProduto(
codigo int,
nomeProduto varchar(30),
Descricao varchar(30)
);

select * from infoConsultaproduto;

create database ConsultaVenda;
use consultavenda;

create table infoConsultaVenda(
codigo int,
nomeVendedor varchar(30),
nomeProduto varchar(30)
);