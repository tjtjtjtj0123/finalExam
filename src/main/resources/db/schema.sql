drop table ARTIST;
drop table COMPANY;
drop sequence artistId;
drop sequence companyId;

create table COMPANY (
  	id NUMBER(3),
    name VARCHAR2(10) NOT NULL UNIQUE,
    ceo VARCHAR2(10),
    address VARCHAR2(80),
    est_date VARCHAR2(20),
    website VARCHAR2(80),
    CONSTRAINT pk_company PRIMARY KEY (id)
);

create table ARTIST (
  	id NUMBER(3),
    name VARCHAR2(30) NOT NULL,
    debut_year CHAR(4),
    agent_id int,
    genre VARCHAR2(30),
    members VARCHAR2(80),
    CONSTRAINT pk_artist PRIMARY KEY (id),
    CONSTRAINT fk_artist FOREIGN KEY (agent_id) REFERENCES COMPANY (id)
);

create sequence artistId start with 101;
create sequence companyId start with 501;
