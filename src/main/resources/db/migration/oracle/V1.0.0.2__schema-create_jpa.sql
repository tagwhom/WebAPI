--Needed for JPA/hibernate
CREATE SEQUENCE ${ohdsiSchema}.HIBERNATE_SEQUENCE START WITH 0 MINVALUE 0 MAXVALUE 9223372036854775807 NOCYCLE;

--Example
CREATE TABLE ${ohdsiSchema}.EXAMPLEAPP_WIDGET  (
	ID NUMBER(19,0)  NOT NULL PRIMARY KEY ,
	NAME VARCHAR2(50)
);
