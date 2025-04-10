EXAMEN PROGRAMACIÓ SEGONA AVALUACIÓ


Es poden consultar apunts, exercicis, e internet, però no es poden usar IA’s. 
No es pot comunicar amb ningú de la classe o de fora d’ella.
Arribar mes tard de les 15:40 impedeix aprobar l’examen.
Sortir al bany durant l’examen repercuteix negativament en les competències personales.

El Govern de les Illes Balears, nos ha pedido que implementemos un sistema para adjudicar las plazas de los interinos que forman parte, tanto los docentes como los sanitarios, por tanto, nuestro sistema informático quiere tratar principalmente con información de docentes y sanitarios:

Tanto docentes y sanitarios tienen atributos comunes, así que hemos decidido crear una clase Persona (1 punto) que tendrá los siguientes datos: Id (único y auto incrementable), Nombre, primer apellido, segundo apellido y contador que nos informará del número de personas dadas de alta (este atributo estará compartido por todas las instancias y lo utilizaremos para aprovechar y dar de alta las distintas personas). Por tanto, los docentes y sanitarios son una especialidad de persona.
Los Docentes se caracterizan por tener una titulación y un número de puntos (que pueden ser decimales), que se utilizarán para adjudicar las plazas 1 punto).
Los Sanitarios se caracterizan por tener una Especialidad y un número de días trabajado (serán números enteros), que se utilizarán para adjudicar las plazas (1 punto).
Las Plazas se caracterizan por tener un id de la plaza, tipo de plaza (“D” es una plaza para docentes, “S” es una plaza para sanitarios), adjudicada (un booleano que nos informa a true, cuando esté adjudicada y false en caso contrario) y finalmente una Persona (inicialmente cuando se crean las plazas no tienen adjudicados ningún interino)(1 punto).
Para las clases anteriores, crea los getters/setters y constructores que necesites de manera adecuada(1 punto).

El programa no tendrá ningún menú, lo único que hace es llamar a un método llamado adjudicarPlazas (3 puntos), que recibe como parámetro una lista de Plazas (que puede haber plazas para sanitarios y para docentes), y una única lista no ordenada tanto de docentes como de sanitarios disponibles. El método de adjudicación será el siguiente: por orden de plaza, se seleccionará el especialista correspondiente (que esté en la lista con mayor puntuación o días trabajados, según corresponda). Obviamente, una persona solo puede trabajar en un sitio (no se le pueden adjudicar varias plazas, y podrían quedar plazas sin adjudicar), por tanto, si se adjudica una plaza, sale de la lista.

Finalmente, cuando termine el método mostrarAdjudicaciones mostrará la lista de plazas por pantalla, primero los sanitarios y luego los docentes (1 punto).

Implementa el método simularAdjudicacion (1 punto), o métodos que  consideres oportunos para realizar una simulación de adjudicación, es decir, crea una lista automática de plazas y personas.

Se adjunta una simulación en la que hay más plazas que interinos, por tanto,  algunas de ellas no se pueden adjudicar:
============================================
La última adjudicación de plazas ha producido
los siguientes resultados para DOCENTES
============================================
ID Plaza 0
Tipo: D
Adjudicada: ADJUDICADA
ID: 4
Nombre:nombre2
Apellido1: apellido2
Apellido2: apellido2
Titulación: titulacion2
Puntos: 4.0
____________________________________________
ID Plaza 2
Tipo: D
Adjudicada: ADJUDICADA
ID: 2
Nombre:nombre1
Apellido1: apellido1
Apellido2: apellido1
Titulación: titulacion1
Puntos: 3.0
____________________________________________
ID Plaza 4
Tipo: D
Adjudicada: ADJUDICADA
ID: 0
Nombre:nombre0
Apellido1: apellido0
Apellido2: apellido0
Titulación: titulacion0
Puntos: 2.0
____________________________________________
ID Plaza 6
Tipo: D
Adjudicada: NO_ADJUDICADA
____________________________________________
ID Plaza 8
Tipo: D
Adjudicada: NO_ADJUDICADA
=============================================
La última adjudicación de plazas ha producido
los siguientes resultados para SANITARIOS
=============================================
ID Plaza 1
Tipo: S
Adjudicada: ADJUDICADA
ID: 5
Nombre:nombre290
Apellido1: apellido221
Apellido2: apellido2290
Especialidad: especialidad2
Dias experiencia: 42
____________________________________________
ID Plaza 3
Tipo: S
Adjudicada: ADJUDICADA
ID: 3
Nombre:nombre190
Apellido1: apellido121

Apellido2: apellido2190
Especialidad: especialidad1
Dias experiencia: 41
____________________________________________
ID Plaza 5
Tipo: S
Adjudicada: ADJUDICADA
ID: 1
Nombre:nombre090
Apellido1: apellido021
Apellido2: apellido2090
Especialidad: especialidad0
Dias experiencia: 40
____________________________________________
ID Plaza 7
Tipo: S
Adjudicada: NO_ADJUDICADA
____________________________________________
ID Plaza 9
Tipo: S
Adjudicada: NO_ADJUDICADA
____________________________________________
