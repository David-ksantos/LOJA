create table produto(
    id varchar(255) not null primary key,
    nome varchar(40) not null,
    preco numeric(17, 2) not null,
    estoque numeric(10) not null
);