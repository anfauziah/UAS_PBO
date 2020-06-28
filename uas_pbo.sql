create database uas_pbo;
use uas_pbo;
create table dataBuku(
id_buku int primary key not null AUTO_INCREMENT,
judul varchar(15),
penulis varchar(30));

insert into  dataBuku (judul, penulis) values 
('Winter Song', 'S. Jae'), 
('Resign', 'Almira');