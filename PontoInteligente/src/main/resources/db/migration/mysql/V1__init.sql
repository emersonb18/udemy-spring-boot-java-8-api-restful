CREATE TABLE empresa (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  cnpj varchar(255) NOT NULL,
  data_atualizacao datetime NOT NULL,
  data_criacao datetime NOT NULL,
  razao_social varchar(255) NOT NULL
);

CREATE TABLE funcionario (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  cpf varchar(255) NOT NULL,
  data_atualizacao datetime NOT NULL,
  data_criacao datetime NOT NULL,
  email varchar(255) NOT NULL,
  nome varchar(255) NOT NULL,
  perfil varchar(255) NOT NULL,
  qtd_horas_almoco float NULL,
  qtd_horas_trabalho_dia float NULL,
  senha varchar(255) NOT NULL,
  valor_hora decimal(19,2) NULL,
  empresa_id bigint(20) NULL
);

CREATE TABLE lancamento (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  data datetime NOT NULL,
  data_atualizacao datetime NOT NULL,
  data_criacao datetime NOT NULL,
  descricao varchar(255) NULL,
  localizacao varchar(255) NULL,
  tipo varchar(255) NOT NULL,
  funcionario_id bigint(20) NULL
);
