Create table AUTHOR(
Author_ID varchar(5) primary key, Lastname varchar(15) not null, Firstname varchar(15) not null, Email varchar(50),
City varchar(15), Country varchar(15)
 
);


INSERT ALL
INTO AUTHOR (Author_ID, Lastname, Firstname, Email, City, Country) VALUES ('A0001', 'Smith', 'John', 'jsmith@example.com', 'New York',
'USA')
INTO AUTHOR (Author_ID, Lastname, Firstname, Email, City, Country) VALUES ('A0002', 'Johnson', 'Emma', 'emma.j@example.com', 'London',
'UK')
INTO AUTHOR (Author_ID, Lastname, Firstname, Email, City, Country) VALUES ('A0003', 'Garcia', 'Maria', 'maria.g@example.com', 'Madrid',
'Spain')
INTO AUTHOR (Author_ID, Lastname, Firstname, Email, City, Country) VALUES ('A0004', 'Kim', 'Sung', 'sung.kim@example.com', 'Seoul', 'South
Korea')
SELECT * FROM dual;
