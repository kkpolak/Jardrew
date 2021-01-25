mysql -u root -p
password: password

CREATE DATABASE jardrew;
use jardrew;


drop table FRONT;
drop table GORA;
drop table LISTWA;
drop table NOGA;
drop table POPRZECZKA;

create table front 
(
id INT AUTO_INCREMENT PRIMARY KEY,
material VARCHAR(255) NOT NULL,
length INT,
width INT,
size INT
);

create table gora 
(
id INT AUTO_INCREMENT PRIMARY KEY,
material VARCHAR(255) NOT NULL,
length INT,
width INT,
size INT
);

create table listwa 
(
id INT AUTO_INCREMENT PRIMARY KEY,
material VARCHAR(255) NOT NULL,
length INT,
width INT,
size INT
);
create table noga 
(
id INT AUTO_INCREMENT PRIMARY KEY,
material VARCHAR(255) NOT NULL,
length INT,
width INT,
size INT
);

create table poprzeczka 
(
id INT AUTO_INCREMENT PRIMARY KEY,
material VARCHAR(255) NOT NULL,
length INT,
width INT,
size INT
);



insert into front (material, length, width, size) values('sosna',665,323,3);
insert into front (material, length, width, size)  values('sklejka3',665,357,3);
insert into front (material, length, width, size)  values('hdf-sur-3',665,357,3);

insert into gora (material, length, width, size)  values('sosna', 820, 75, 25);
insert into gora (material, length, width, size)  values('sklejka3',780 ,57, 25);
insert into gora (material, length, width, size)  values('sosna',780 ,57, 25);

insert into listwa (material, length, width, size)  values('sklejka3',687,52,0);
insert into listwa (material, length, width, size)  values('sklejka8',687,52,0);
insert into listwa (material, length, width, size)  values('sklejka18',687,52,0);

insert into noga (material, length, width, size)  values('sosna',950,57,25);
insert into noga (material, length, width, size)  values('sklejka3',950,75,25);
insert into noga (material, length, width, size)  values('hdf-sur-3',951,357,25);

insert into poprzeczka (material, length, width, size)  values('sklejka18',680,57,32);
insert into poprzeczka (material, length, width, size)  values('mdf12',681,57,31);
insert into poprzeczka (material, length, width, size)  values('hdf-sur-3',692,75,33);

