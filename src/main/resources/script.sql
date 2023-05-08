-- criar o banco de dados
CREATE DATABASE 20231_usjt_psc_sistema_academico;

USE 20231_usjt_psc_sistema_academico;

-- criar tabela
CREATE TABLE tb_usuario(
	cod_aluno INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(200),
    senha VARCHAR(200)
);

INSERT INTO tb_usuario (nome, senha) VALUES ('admin', 'admin');