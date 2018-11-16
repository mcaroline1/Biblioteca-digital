create database Biblioteca;
use Biblioteca;

create table alunos (
cod_alunos int auto_increment,
nome varchar(255),
matricula char(11),
primary key (cod_alunos)
);

insert into alunos (nome,matricula)
values ('Maria',20181111111111),
('Joao', 2012222222222),
('Luana',201333333333),
('Laura',201444444444),
('Fernanda',201555555555);

select * from alunos;

drop database Biblioteca;