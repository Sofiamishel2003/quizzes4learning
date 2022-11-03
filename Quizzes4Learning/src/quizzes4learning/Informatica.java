/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizzes4learning;

/**
 *
 * @author 50250
 */
import java.util.Random;
import java.util.Scanner;
import java.util.Random.*;
public class Informatica extends Estudiante{
    private int puntosInformatica;
    private String[][] preguntasInformatica = {{"¿Cual de las siguientes opciones corresponden a tipos de Sistemas Operativos Existentes en el mercado.?", "¿Que programa de ofimática utilizamos para escribir cartas?", "Cuando realizamos dibujos y hacemos edicion de imagenes en la computadora lo podemos hacer con algunos de estos programas, ¿cuales son?", "¿Los elementos de un computador son Ratón y Teclado?", "Menciona que son los elementos de entrada a un computador." , "¿Qué función cree usted que cumplan los dispositivos que están conectados a la computadora?", "¿El teclado permite la entrada de datos al computador?", "¿Cuál cree que permiten la salida de Informaticamación?", "Menciona ¿que son Dispositivos de Almacenamiento?", "¿Que son Dispositivos de Comunicaciones?"},
                                    {"Barra de tareas", "La barra de desplazamiento permite?", "Indique ¿cuál es la combinación de teclas que sirve para cerrar una ventana?", "Un Hipervínculo es: ", "El sistema operativo de Windows pertenece al tipo de Software secundario", "La barra de título muestra el nombre del programa y el nombre de la presentación actual", "La barra de herramientas es la barra que contiene los menús con todas las acciones que podemos aplicar a una presentación.", "Para crear una presentación nueva puedo desplegar el menú Archivo y seleccionar la opción nueva presentación o bien hacerlo desde el Panel de Tareas.", "Podemos utilizar una plantilla para que todas nuestras diapositivas tengan el mismo fondo. ", "Si utilizamos la opción 'Guardar como' estaremos cambiando el nombre de la presentación."},
                                    {"Si utilizamos la opción Guardar como estaremos cambiando el nombre de la presentación.", "Se puede crear una página Web a partir de una presentación PowerPoint.", "El menú Ventana de la barra de menús sirve para ver en miniatura las presentaciones que tenemos en el disco duro.", "El zoom sirve para ver el área seleccionada desde más cerca o desde más lejos.", "Para copiar un objeto tenemos que seleccionarlo primero.", "Toda formula de Excel debe comenzar con el símbolo de ( = )?", "Formula que permite sumar los valores desde la celda A1 hasta la celda A33.", "Cuál de las estas maneras podemos Abrir Word", "A qué se le denominó la 'Crisis del Software'?", "Los requerimientos iniciales no se plasmaban en el producto final\", es una ventaja del software artesanal"},
                                    {"Creación de un producto final de calidad en términos de software, todo ello mediante el uso de técnicas que garanticen un resultado esperado, a un costo y tiempo razonables\", es la definición de:", "Los programas eran basados en líneas de código con saltos de un lado a otro, todo en un único bloque seguido, sin posibilidad de segmentación.\" Es la definición de:", "Una de las reglas a cumplir en la programación estructurada es: \"Estructura jerárquica Top-Down, se desarrolla de lo general a lo específico\"", "¿Visual Fox Pro, es uno de los lenguajes de programación No Estructurada?", "Past Participle of: 'fly'", "ADA y C son ejemplos de lenguajes de programación estructurada", "Lenguajes como Java, SIMULA y C# son algunos ejemplos de:", "Están conformados por datos o propiedades, por un comportamiento y poseen una identidad o identificación única respecto a otros objetos", "Dos Ventajas del uso de la Orientación a Objetos son", "Se presenta cuando una clase toma características y/o comportamientos de otra clase"}};
    private String[][] respuestasInformatica = {{"Mother Board, Mouse, Teclado","Office, Word, Excel","Windows, Mac Os, Linux"},{"Excel","Paint","Word"},{"Paint","Notas","Word"},{"Verdadero","Falso","Otro"},{"Google, Yahoo, Gmail","Son los que permiten dar entrada al cpu","Son programas en espera al ser ejecutados"},{"Adornar al computador","Permiten la entrada como la salida de proceos","Permitir el libre acceso al cpu"},{"Falso","Otro","Verdadero"},{"Monitor","Teclado","Ratón"},{"Windows Live Messenger","Permiten la comunicación entre los usuarios y la computadora.","Proporcionan almacenamiento no volátil de datos y memoria."},{"Permiten conectar a la computadora con otras a través de una interfaz","Permiten la comunicación entre los usuarios y la computadora.","Windows Live Messenger"},
                                     {"Es la barra situada en la inferior de la pantalla","Es la barra situada en la parte superior de la ventana","Es la barra situada en la parte central de la ventana"}, {"Ver los nombres de los menús","Mostrar cual es nombre de la ventana","Desplazarnos dentro de la ventana"},{"ALT+F4","CTL+ALT+Z","ENTER"},{"Otro nombre para el URL","Otra página para encontrar Informaticamación","Un punto de navegación para ir a otra página"},{"Falso","Verdadero","Ninguno"},{"Ninguno","Verdadero","Falso"},{"Falso","Verdadero","Ninguno"},{"Otro","Verdadero","Falso"},{"Verdadero","Falso","Otro"},{"Otro","Falso","Verdadero"},
                                     {"Verdadero","Falso","Otro"},{"Verdadero","Falso","Ninguno"},{"Verdadero","Ninguno","Falso"},{"Verdadero","Ninguno","Falso"},{"Falso","Verdadero","Ninguno"},{"Ninguno","Verdadero","Falso"},{"SUMA(A1:A33)","=(A1:A33)","=SUMA(A1:A33)"},{"Ventana + R (ejecutar) c:archivos","Ninguna","Ventana + R (ejecutar) WINWORD"},{"A que el hardware era más evolucionado que el Software","A que no existía ningun lenguaje para desarrollar software","A que el harware se incrementó pero el software seguía siendo \"artesanal\""},{"Otro","Verdadero","Falso"},
                                     {"Desarrollo de software","Ingeniería del Software","Ciclo de Vida"},{"Programación No Estructurada","Programación Estructurada","Programación Procedimental"},{"Verdadero","Otro","Falso"},{"Falso","Verdadero","Ninguno"},{"Otro","Verdadero","Falso"},{"Lenguajes Prodecimientales","TAD\'s","Lenguajes Orientados a Objetos"},{"Objetos","Clases","Polimorfismo"},{"Facilidad y Realismo","Confiabilidad y Calidad","Todos los anteriores"},{"Herencia","Polimorfismo","Ocultamiento"},{"Las operaciones de una clase","Ninguna de las anteriores","Los atributos de una clase"}};
    private String[][] respuestasCorrectasInformatica = {{"Windows, Mac Os, Linux","Word","Paint","Verdadero","Son los que permiten dar entrada al cpu","Permiten la entrada como la salida de proceos","Verdadero","Monitor","Proporcionan almacenamiento no volátil de datos y memoria.","Permiten conectar a la computadora con otras a través de una interfaz"},
                                              {"Es la barra situada en la inferior de la pantalla","Desplazarnos dentro de la ventana","ALT+F4","Un punto de navegación para ir a otra página","Falso","Verdadero","Falso","Verdadero","Verdadero","Verdadero"},
                                              {"Verdadero","Verdadero","Falso","Verdadero","Verdadero","Verdadero","=SUMA(A1:A33)","Ventana + R (ejecutar) WINWORD","A que el harware se incrementó pero el software seguía siendo \"artesanal\"","Falso"},
                                              {"Ingeniería del Software","Programación No Estructurada","Verdadero","Falso","Verdadero","Lenguajes Orientados a Objetos","Objetos","Todos los anteriores","Herencia","Los atributos de una clase"}};

    public Informatica(){
        super();
        puntosInformatica = 0;
        //preguntasInformatica = new String[4][10];
        //respuestasInformatica = new String[40][3];
        //respuestasCorrectasInformatica = new String[4][10];
    }

    public Informatica(String nombreUsuario, String contraseña, String colegio, int grado, int puntaje){
        super(nombreUsuario, contraseña, colegio, grado, puntaje);
        this.puntosInformatica = 0;
        preguntasInformatica = new String[4][10];
        respuestasInformatica = new String[40][3];
        respuestasCorrectasInformatica = new String[4][10];
    }

    public int getPuntosInformatica() {
        return this.puntosInformatica;
    }

    public void setPuntosInformatica(int puntosInformatica) {
        this.puntosInformatica = puntosInformatica;
    }

    public String[][] getPreguntasInformatica() {
        return this.preguntasInformatica;
    }

    public void setPreguntasInformatica(String[][] preguntasInformatica) {
        this.preguntasInformatica = preguntasInformatica;
    }

    public String[][] getRespuestasInformatica() {
        return this.respuestasInformatica;
    }

    public void setRespuestasInformatica(String[][] respuestasInformatica) {
        this.respuestasInformatica = respuestasInformatica;
    }

    public String[][] getRespuestasCorrectasInformatica() {
        return this.respuestasCorrectasInformatica;
    }

    public void setRespuestasCorrectasInformatica(String[][] respuestasCorrectasInformatica) {
        this.respuestasCorrectasInformatica = respuestasCorrectasInformatica;
    }

    @Override
    public String toString() {
        return "{" +
            " puntosInformatica='" + getPuntosInformatica() + "'" +
            ", preguntasInformatica='" + getPreguntasInformatica() + "'" +
            ", respuestasInformatica='" + getRespuestasInformatica() + "'" +
            ", respuestasCorrectasInformatica='" + getRespuestasCorrectasInformatica() + "'" +
            "}";
    }
    public void preguntas(int grado){
        int j = 0;
        int randoms[] = new int[5];
        while(j != 5){
            boolean bandera = false;
            Random rand = new Random();
            int random = rand.nextInt(9) + 1;
            int respuesta;
            Scanner keyboard = new Scanner(System.in);
            String respuestaCorrecta = "";
            boolean bandera2 = false;
            for(int i = 0; i < 5; i++){
                if(randoms[i] == random && bandera == false){
                    bandera = true;
                }
            }
            if(bandera == false){
                randoms[j] = random;
                j = j + 1;
                System.out.println(j + ". " + preguntasInformatica[grado - 1][random]);
                System.out.println("-1. " + respuestasInformatica[random + ((grado - 1) * (10))][0]);
                System.out.println("-2. " + respuestasInformatica[random + ((grado - 1) * (10))][1]);
                System.out.println("-3. " + respuestasInformatica[random + ((grado - 1) * (10))][2]);
                respuesta = keyboard.nextInt();
                if(respuesta == 1){
                    respuestaCorrecta = respuestasInformatica[random + ((grado - 1) * (10))][0];
                }else if(respuesta == 2){
                    respuestaCorrecta = respuestasInformatica[random + ((grado - 1) * (10))][1]; 
                }else if(respuesta == 3){
                    respuestaCorrecta = respuestasInformatica[random + ((grado - 1) * (10))][2];
                }
                for(int i = 0; i<10 ; i++){
                    if(respuestaCorrecta == respuestasCorrectasInformatica[grado - 1][i]){
                        bandera2 = true;
                    }
                }
                if(bandera2 == true){
                    puntosInformatica = puntosInformatica + 1;
                    super.setPuntaje(puntosInformatica);
                }
                
            }
        }
        System.out.println("tu puntuación fue de: " + puntosInformatica + "/5");
    }    
}
