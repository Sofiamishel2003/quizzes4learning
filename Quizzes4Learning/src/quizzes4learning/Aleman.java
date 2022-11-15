/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizzes4learning;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Random;
import java.util.Scanner;
import java.util.Random.*;
import javax.swing.JOptionPane;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import static quizzes4learning.login2.username;



/**
 *
 * @author 50250
 */
import java.util.Random;
import java.util.Scanner;
import java.util.Random.*;
public class Aleman extends Estudiante{
    private int puntosAleman;
    private String[][] preguntasAleman = {{"Wie sagt man Hund auf Spanisch?", "Wie sagt man Katze auf Spanisch?", "Wie sagt man Handy auf Spanisch?", "Wie sagt man Taschenrechner auf Spanisch?", "Wie sagt man Bäckerei auf Spanisch?" , "Wie sagt man Radiergummi auf Spanisch?", "Wie sagt man Bleistift auf Spanisch?", "Wie sagt man Tasten auf Spanisch?", "Wie sagt man Lampe auf Spanisch?", "Wie sagt man Ball auf Spanisch?"},
                                    {"Welche ist der perfekt von schwimmen?", "Welche ist der perfekt von spielen?", "Welche ist der perfekt von essen?", "Welche ist der perfekt von schreiben?", "Welche ist der perfekt von hören?", "Welche ist der perfekt von sagen?", "Welche ist der perfekt von kochen?", "Welche ist der perfekt von springen?", "Welche ist der perfekt von öffnen?", "Welche ist der perfekt von berechnen?"},
                                    {"Welche ist der präteritum von machen?", "Welche ist der präteritum von ziehen?", "Welche ist der präteritum von beginnen", "Welche ist der präteritum von nehmen?", "Welche ist der präteritum von vergessen?", "Welche ist der präteritum von bringen?", "Welche ist der präteritum von denken?", "Welche ist der präteritum von gehen?", "Welche ist der präteritum von bieten?", "Welche ist der präteritum von fangen"},
                                    {"_____ hast du zum schwimmbad gegangen?", "Was _____ du?", "Du musst das ________!", "Ich ___ musik hören", "Mein _____ ist fussball zu spielen", "Ich ____ einen Hund!", "Ich ____ David, und du?", "Diese _____ ist sehr lecker!", "Das ist eine sehr gute ______!", "Welches ________ benutzt du?"}};
    private String[][] respuestasAleman = {{"Perro","Caballo","Avestruz"},{"Pájaro","Pez","Gato"},{"Mano","Télefono","Ratón"},{"Calculadora","Monitor","Mochila"},{"Tortillería","Panadería","Ferretería"},{"Cable","Chicle","Borrador"},{"Lápiz","Lápicero","Marcador"},{"Teclado","Control","Tostador"},{"Luz","Foco","Lámpara"},{"Cuadrado","Pelota","Cubo"},
                                     {"geschwimmen","geschwommen","geschwammen"}, {"gespulen","gespielen","gespielt"},{"gegessen","gegossen","gegiessen"},{"geschruben","geschrieben","geschroben"},{"gehört","gehören","gehieren"},{"gesagen","gesagt","gesogen"},{"gekachen","gekochen","gekocht"},{"gespringt","gesprungen","gespringen"},{"geöffnet","geöffnen","geöfnieren"},{"berechnet","berechnieren","beruchnen"},
                                     {"machte","michte","mochte"},{"zuh","zog","ziehete"},{"begann","begonn","begunn"},{"nihm","nohm","nahm"},{"vergoss","vergass","verguss"},{"brochte","brachte","bruchte"},{"dichte","dachtete","dachte"},{"gong","ging","gang"},{"bietet","batet","botet"},{"fingt","fängt","fongt"},
                                     {"Wenn","Wie","Wo"},{"spielen","spielst","gespielst"},{"Aufräumen","ifräumen","geräumt"},{"mag","mig","mogte"},{"Hobby","Habit","Party"},{"Habe","Hobe","Hibe"},{"Heisse","Husse","Hisse"},{"Apfel","Auto","Laptop"},{"Frage","Fortbildung","Frige"},{"Bar","Programm","Banane"}};
    private String[][] respuestasCorrectasAleman = {{"Perro","Gato","Télefono","Calculadora","Panadería","Borrador","Lápiz","Teclado","Lámpara","Pelota"},
                                              {"geschwommen","gespielt","gegessen","geschrieben","gehört","gesagt","gekocht","gesprungen","geöffnet","berechnet"},
                                              {"machte","zog","begann","nahm","vergass","brachte","dachte","ging","bietet","fängt"},
                                              {"Wenn","spielst","Aufräumen","mag","Hobby","Habe","Heisse","Apfel","Frage","Programm"}};

    public Aleman(){
        super();
        puntosAleman = 0;
        //preguntasAleman = new String[4][10];
        //respuestasAleman = new String[40][3];
        //respuestasCorrectasAleman = new String[4][10];
    }

    public Aleman(String nombreUsuario, String contraseña, String colegio, int grado, int puntaje){
        super(nombreUsuario, contraseña, colegio, grado, puntaje);
        this.puntosAleman = 0;
        preguntasAleman = new String[4][10];
        respuestasAleman = new String[40][3];
        respuestasCorrectasAleman = new String[4][10];
    }

    public int getpuntosAleman() {
        return this.puntosAleman;
    }

    public void setpuntosAleman(int puntosAleman) {
        this.puntosAleman = puntosAleman;
    }

    public String[][] getpreguntasAleman() {
        return this.preguntasAleman;
    }

    public void setpreguntasAleman(String[][] preguntasAleman) {
        this.preguntasAleman = preguntasAleman;
    }

    public String[][] getrespuestasAleman() {
        return this.respuestasAleman;
    }

    public void setrespuestasAleman(String[][] respuestasAleman) {
        this.respuestasAleman = respuestasAleman;
    }

    public String[][] getrespuestasCorrectasAleman() {
        return this.respuestasCorrectasAleman;
    }

    public void setrespuestasCorrectasAleman(String[][] respuestasCorrectasAleman) {
        this.respuestasCorrectasAleman = respuestasCorrectasAleman;
    }

    @Override
    public String toString() {
        return "{" +
            " puntosAleman='" + getpuntosAleman() + "'" +
            ", preguntasAleman='" + getpreguntasAleman() + "'" +
            ", respuestasAleman='" + getrespuestasAleman() + "'" +
            ", respuestasCorrectasAleman='" + getrespuestasCorrectasAleman() + "'" +
            "}";
    }
    public void preguntas(int grado){
        int j = 0;
        int randoms[] = new int[5];
        while(j != 5){
            pregunta ventana= new pregunta();
            boolean bandera = false;
            Random rand = new Random();
            int random = rand.nextInt(9) + 1;
            int respuesta;
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
                String[] options = {"A", "B", "C"};
                ventana.preguntona.setText(j + ". " + preguntasAleman[grado - 1][random]);
                ventana.r1.setText("-1. " + respuestasAleman[random + ((grado - 1) * (10))][0]);
                ventana.r2.setText("-2. " + respuestasAleman[random + ((grado - 1) * (10))][1]);
                ventana.r3.setText("-3. " + respuestasAleman[random + ((grado - 1) * (10))][2]);
                ventana.show();
                int x=JOptionPane.showOptionDialog(null, "Escoja la respuesta correcta",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if(x==0){
                    respuestaCorrecta = respuestasAleman[random + ((grado - 1) * (10))][0];
                }else if(x==1){
                    respuestaCorrecta = respuestasAleman[random + ((grado - 1) * (10))][1]; 
                }else if(x==2){
                    respuestaCorrecta = respuestasAleman[random + ((grado - 1) * (10))][2];
                }
                for(int i = 0; i<10 ; i++){
                    if(respuestaCorrecta == respuestasCorrectasAleman[grado - 1][i]){
                        bandera2 = true;
                    }
                }
                if(bandera2 == true){
                    puntosAleman = puntosAleman + 1;
                    int puntosTotal = super.getPuntaje();
                    puntosTotal = puntosTotal + puntosAleman;
                    super.setPuntaje(puntosTotal);
                }
                
            }
        }
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/quizzes4learning","root","");
            String query=("UPDATE materias SET aleman=? WHERE usuario=?");
            PreparedStatement ps=con.prepareStatement(query);
            login2 valu= new login2();

            ps.setInt(1,puntosAleman);
            ps.setString(2,valu.username);
            int res=ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "tu puntuación fue de: " + puntosAleman + "/5");

        }catch(Exception e)
            {
              JOptionPane.showMessageDialog(null, "No se cambio");
            }
    }    
}
