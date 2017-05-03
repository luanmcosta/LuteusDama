create database luteusdama;
use luteusdama;
create table usuarios(
  id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  nome VARCHAR(128) NULL,
  email VARCHAR(128) NOT NULL,
  senha VARCHAR(64) NOT NULL,
  vitorias INT NULL DEFAULT 0,
  derrotas INT NULL DEFAULT 0);
