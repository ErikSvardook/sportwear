create database Sportswear;


create table producto(codigo varchar(10) primary key, 
	     nombre varchar(20), descripcion varchar(50),
	     precio float, fechaCreacion date, fechaActualizacion date,
	     fechaEliminacion date);
					 
create table usuario(codigo serial primary key, nombreUsuario varchar(20), contraseña varchar(50), sexo varchar(20),edad integer);				

