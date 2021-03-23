INSERT INTO colegio(nombre) VALUES('El colegio del Olimpo');

INSERT INTO curso(grado, salon, colegio_id) VALUES(10,'A',1);
INSERT INTO curso(grado, salon, colegio_id) VALUES(10,'B',1);
INSERT INTO curso(grado, salon, colegio_id) VALUES(11,'A',1);
INSERT INTO curso(grado, salon, colegio_id) VALUES(11,'B',1);

INSERT INTO profesor(nombre) VALUES('Némesis');
INSERT INTO profesor(nombre) VALUES('Príapo');
INSERT INTO profesor(nombre) VALUES('Iris');

INSERT INTO asignatura(nombre, profesor_id, curso_id) VALUES('Matemáticas',1,1);
INSERT INTO asignatura(nombre, profesor_id, curso_id) VALUES('Español',2,1);
INSERT INTO asignatura(nombre, profesor_id, curso_id) VALUES('Ingles básico',3,1);
INSERT INTO asignatura(nombre, profesor_id, curso_id) VALUES('Matemáticas',1,2);
INSERT INTO asignatura(nombre, profesor_id, curso_id) VALUES('Español',2,2);
INSERT INTO asignatura(nombre, profesor_id, curso_id) VALUES('Ingles avanzado',3,2);
INSERT INTO asignatura(nombre, profesor_id, curso_id) VALUES('Matemáticas',1,3);
INSERT INTO asignatura(nombre, profesor_id, curso_id) VALUES('Pre Icfes',1,3);
INSERT INTO asignatura(nombre, profesor_id, curso_id) VALUES('Matemáticas',1,4);
INSERT INTO asignatura(nombre, profesor_id, curso_id) VALUES('Pre Icfes',1,4);

INSERT INTO estudiante(nombre) VALUES('Afrodita');
INSERT INTO estudiante(nombre) VALUES('Apolo');
INSERT INTO estudiante(nombre) VALUES('Ares');
INSERT INTO estudiante(nombre) VALUES('Artemisa');
INSERT INTO estudiante(nombre) VALUES('Atenea');
INSERT INTO estudiante(nombre) VALUES('Dionisio');
INSERT INTO estudiante(nombre) VALUES('Hefesto');
INSERT INTO estudiante(nombre) VALUES('Hera');
INSERT INTO estudiante(nombre) VALUES('Hermes');
INSERT INTO estudiante(nombre) VALUES('Hades');
INSERT INTO estudiante(nombre) VALUES('Poseidón');
INSERT INTO estudiante(nombre) VALUES('Zeus');

INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(1,1);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(2,1);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(3,1);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(1,2);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(2,2);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(3,2);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(1,3);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(2,3);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(3,3);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(4,4);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(5,4);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(6,4);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(4,5);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(5,5);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(6,5);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(4,6);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(5,6);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(6,6);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(7,7);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(8,7);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(7,8);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(8,8);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(9,9);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(10,9);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(9,10);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(10,10);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(9,11);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(10,11);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(9,12);
INSERT INTO asignatura_estudiante(asignatura_id,estudiante_id) VALUES(10,12);



