CREATE TABLE usuario (
  id_usuario           SERIAL      NOT NULL,
  nome_usuario         VARCHAR(50) NOT NULL,
  email_usuario        VARCHAR(50) NOT NULL,
  senha_usuario        VARCHAR(50) NOT NULL,
  CONSTRAINT pk_id_usuario
    PRIMARY KEY (id_usuario)
 );

INSERT INTO usuario(nome_usuario,email_usuario,senha_usuario) VALUES ('Admin', 'admin', md5('admin'));
/*------------------------------------------------------------------------------------------------------*/

CREATE TABLE uf (
  sigla_uf             CHAR(2)     NOT NULL,
  nome_uf              VARCHAR(30) NOT NULL,
  CONSTRAINT pk_uf
    PRIMARY KEY (sigla_uf)
); 

 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('AC','Acre');  
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('AL','Alagoas');  
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('AM','Amazonas');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('AP','Amapá');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('BA','Bahia');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('CE','Ceará');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('DF','Distrito Federal');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('ES','Espírito Santo');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('GO','Goiás');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('MA','Maranhão');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('MG','Minas Gerais');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('MS','Mato Grosso do Sul');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('MT','Mato Grosso');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('PA','Pará');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('PB','Paraíba');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('PE','Pernambuco');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('PI','Piauí');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('PR','Paraná');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('RJ','Rio de Janeiro');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('RN','Rio Grande do Norte');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('RO','Rondônia');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('RR','Roraima');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('RS','Rio Grande do Sul');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('SC','Santa Catarina');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('SE','Sergipe');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('SP','São Paulo');
 INSERT INTO uf (sigla_uf,nome_uf) VALUES ('TO','Tocantins');
 
 /*------------------------------------------------------------------------------------------------------*/
CREATE TABLE cidade (
  id_cidade           INTEGER       NOT NULL,
  nome_cidade         VARCHAR(120) NOT NULL,
  sigla_uf            CHAR(2)      NOT NULL,
  CONSTRAINT pk_id_cidade
    PRIMARY KEY (id_cidade),
  CONSTRAINT fk_cidade_uf 
    FOREIGN KEY (sigla_uf)
    REFERENCES uf(sigla_uf)
);
 /*------------------------------------------------------------------------------------------------------*/
 
CREATE TABLE cliente (
  cod_cliente		SERIAL		NOT NULL,
  nome_cliente		VARCHAR(100)	NOT NULL,
  cidade_cliente	INTEGER		NOT NULL,
  bairro_cliente	VARCHAR(100)	NOT NULL,
  rua_cliente    	VARCHAR(100)	NOT NULL,
  numero_cliente	INTEGER		NOT NULL,
  cpf_cliente		CHAR(14)	NOT NULL,
  tel_cliente		CHAR(14)	NOT NULL,
  dt_cliente 		CHAR(10)	NOT NULL,
  CONSTRAINT pk_cod_cliente
    PRIMARY KEY (cod_cliente),
  CONSTRAINT fk_cidade
    FOREIGN KEY (cidade_cliente)
    REFERENCES cidade(id_cidade)
);

/*------------------------------------------------------------------------------------------------------*/
CREATE TABLE fornecedor (
  cod_fornecedor     SERIAL       NOT NULL,
  nome_fornecedor    VARCHAR(100) NOT NULL,
  cidade_fornecedor  INTEGER      NOT NULL,
  bairro_fornecedor  VARCHAR(100) NOT NULL,
  rua_fornecedor     VARCHAR(100) NOT NULL,
  numero_fornecedor  INTEGER      NOT NULL,
  cnpj_fornecedor    CHAR(18)     NOT NULL,
  tel_fornecedor     CHAR(14)     NOT NULL,
CONSTRAINT pk_fornecedor
    PRIMARY KEY (cod_fornecedor),
  CONSTRAINT fk_cidade_fornecedor
    FOREIGN KEY (cidade_fornecedor)
    REFERENCES cidade(id_cidade)
);
/*------------------------------------------------------------------------------------------------------*/

CREATE TABLE produto (
  cod_produto     SERIAL       NOT NULL,
  nome_produto    VARCHAR(20)  NOT NULL,
  quant_produto   INTEGER      NOT NULL,
  valor_compra    NUMERIC(5,2) NOT NULL,
  cod_fornecedor  INTEGER      NOT NULL,
  CONSTRAINT pk_produto
    PRIMARY KEY (cod_produto),
  CONSTRAINT fk_produto_fornecedor
    FOREIGN KEY (cod_fornecedor)
    REFERENCES fornecedor(cod_fornecedor)
);
/*------------------------------------------------------------------------------------------------------*/

CREATE TABLE venda (
  cod_venda    SERIAL       NOT NULL,
  cod_cliente  INTEGER	    NOT NULL,
  total_venda  NUMERIC(7,2) NOT NULL,
  desconto     NUMERIC(7,2) NOT NULL,
  pagamento    CHAR(1)      NOT NULL,
  cod_produto  INTEGER	    NOT NULL,
  CONSTRAINT pk_venda
    PRIMARY KEY (cod_venda),
  CONSTRAINT fk_venda_cliente
    FOREIGN KEY (cod_cliente)
    REFERENCES cliente(cod_cliente),
  CONSTRAINT fk_venda_produto
    FOREIGN KEY (cod_produto)
    REFERENCES produto(cod_produto)
);




