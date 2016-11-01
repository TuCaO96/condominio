CREATE TABLE morador(
  id number(10),
  usuario_id number(10),
  apartamento number(10),
  nome varchar2(255),
  tipo varchar2(255)
);

CREATE TABLE usuario(
  id number(10),
  login varchar2(255),
  senha varchar2(255)
);

CREATE TABLE tipo_despesa(
  id number(10),
  descricao varchar2(255)
);

CREATE TABLE despesa(
  id number(10),
  tipo_despesa_id number(10),
  valor number(10),
  mes number(2),
  ano number(4)
);

CREATE TABLE condominio(
  id number(10),
  morador_id number(10),
  mes number(2),
  ano number(4),
  valor number(10),
  status number(1)
);

CREATE SEQUENCE seq_morador INCREMENT BY 1;

CREATE SEQUENCE seq_usuario INCREMENT BY 1;