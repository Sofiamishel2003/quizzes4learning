/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizzes4learning;

/**
 *
 * @author 50250
 */

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
public class Ingles extends Estudiante{
    private int puntosIngles;
    private String[][] preguntasIngles = {{"¿Cómo se dice 'cubeta' en inglés?", "¿Cómo se dice 'lapiz' en inglés?", "¿Cómo se dice 'fuego' en inglés?", "¿Cómo se dice 'aire' en inglés?", "¿Cómo se dice 'agua' en inglés?" , "¿Cómo se dice 'luna' en inglés?", "¿Cómo se dice 'rojo' en inglés?", "¿Cómo se dice 'azul' en inglés?", "¿Cómo se dice 'serpiente' en inglés?", "¿Cómo se dice 'borrador' en inglés?"},
                                    {"¿Cómo se dice 'correr' en inglés?", "¿Cómo se dice 'comer' en inglés?", "¿Cómo se dice 'jugar' en inglés?", "¿Cómo se dice 'escuchar' en inglés?", "¿Cómo se dice 'enseñar' en inglés?", "¿Cómo se dice 'escribir' en inglés?", "¿Cómo se dice 'mirar' en inglés?", "¿Cómo se dice 'tocar' en inglés?", "¿Cómo se dice 'oler' en inglés?", "¿Cómo se dice 'viajar' en inglés?"},
                                    {"Past simple of: 'bite'", "Past simple of: 'choose'", "Past simple of: 'catch'", "Past simple of: 'swim'", "Past simple of: 'break'", "Past simple of: 'wake'", "Past simple of: 'stand'", "Past simple of: 'slide'", "Past simple of: 'fall'", "Past simple of: 'tell'"},
                                    {"Past Participle of: 'ride'", "Past Participle of: 'know'", "Past Participle of: 'hide'", "Past Participle of: 'forget'", "Past Participle of: 'fly'", "Past Participle of: 'drive'", "Past Participle of: 'do'", "Past Participle of: 'choose'", "Past Participle of: 'arise'", "Past Participle of: 'be'"}};
    private String[][] respuestasIngles = {{"car","bucket","basket"},{"pencil","pen","stapler"},{"fire","sun","ashes"},{"day","sir","air"},{"rock","water","milk"},{"comet","moon","dark"},{"orange","purple","red"},{"blue","yellow","light green"},{"gecko","snake","ant"},{"eraser","ruler","sharpener"},
                                     {"have","say","run"}, {"do","eat","get"},{"make","play","go"},{"know","accept","listen"},{"teach","ask","be"},{"leave","write","live"},{"look","whisper","stare"},{"touch","bite","cry"},{"hear","achieve","smell"},{"travel","add","admire"},
                                     {"bit","blew","cut"},{"was","chose","bound"},{"came","dug","caught"},{"swam","cost","dealt"},{"broke","ate","forgot"},{"froze","forgave","woke"},{"went","stood","had"},{"hurt","hit","slid"},{"laid","fell","lent"},{"told","tore","thought"},
                                     {"written","won","ridden"},{"known","wolves","withdrew"},{"hidden","hurt","held"},{"forbidden","forgotten","forgiven"},{"felt","flown","found"},{"driven","drunk","done"},{"don't","don","done"},{"chosen","caught","came"},{"arisen","admire","admin"},{"blonde","been","born"}};
    private String[][] respuestasCorrectasIngles = {{"bucket","pencil","fire","air","water","moon","red","blue","snake","eraser"},
                                              {"run","eat","play","listen","teach","write","look","touch","smell","travel"},
                                              {"bit","chose","caught","swam","broke","woke","stood","slid","fell","told"},
                                              {"ridden","known","hidden","forgotten","flown","driven","done","chosen","arisen","been"}};

    public Ingles(){
        super();
        puntosIngles = 0;
        //preguntasIngles = new String[4][10];
        //respuestasIngles = new String[40][3];
        //respuestasCorrectasIngles = new String[4][10];
    }

    public Ingles(String nombreUsuario, String contraseña, String colegio, int grado, int puntaje){
        super(nombreUsuario, contraseña, colegio, grado, puntaje);
        this.puntosIngles = 0;
        preguntasIngles = new String[4][10];
        respuestasIngles = new String[40][3];
        respuestasCorrectasIngles = new String[4][10];
    }

    public int getPuntosIngles() {
        return this.puntosIngles;
    }

    public void setPuntosIngles(int puntosIngles) {
        this.puntosIngles = puntosIngles;
    }

    public String[][] getPreguntasIngles() {
        return this.preguntasIngles;
    }

    public void setPreguntasIngles(String[][] preguntasIngles) {
        this.preguntasIngles = preguntasIngles;
    }

    public String[][] getRespuestasIngles() {
        return this.respuestasIngles;
    }

    public void setRespuestasIngles(String[][] respuestasIngles) {
        this.respuestasIngles = respuestasIngles;
    }

    public String[][] getRespuestasCorrectasIngles() {
        return this.respuestasCorrectasIngles;
    }

    public void setRespuestasCorrectasIngles(String[][] respuestasCorrectasIngles) {
        this.respuestasCorrectasIngles = respuestasCorrectasIngles;
    }

    @Override
    public String toString() {
        return "{" +
            " puntosIngles='" + getPuntosIngles() + "'" +
            ", preguntasIngles='" + getPreguntasIngles() + "'" +
            ", respuestasIngles='" + getRespuestasIngles() + "'" +
            ", respuestasCorrectasIngles='" + getRespuestasCorrectasIngles() + "'" +
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
                ventana.preguntona.setText(j + ". " + preguntasIngles[grado - 1][random]);
                ventana.r1.setText("-1. " + respuestasIngles[random + ((grado - 1) * (10))][0]);
                ventana.r2.setText("-2. " + respuestasIngles[random + ((grado - 1) * (10))][1]);
                ventana.r3.setText("-3. " + respuestasIngles[random + ((grado - 1) * (10))][2]);
                ventana.show();
                int x=JOptionPane.showOptionDialog(null, "Escoja la respuesta correcta",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if(x==0){
                    respuestaCorrecta = respuestasIngles[random + ((grado - 1) * (10))][0];
                }else if(x == 1){
                    respuestaCorrecta = respuestasIngles[random + ((grado - 1) * (10))][1]; 
                }else if(x == 2){
                    respuestaCorrecta = respuestasIngles[random + ((grado - 1) * (10))][2];
                }
                for(int i = 0; i<10 ; i++){
                    if(respuestaCorrecta == respuestasCorrectasIngles[grado - 1][i]){
                        bandera2 = true;
                    }
                }
                if(bandera2 == true){
                    puntosIngles = puntosIngles + 1;
                    super.setPuntaje(puntosIngles);
                }
                
            }
        }
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/quizzes4learning","root","");
            String query=("UPDATE materias SET ingles=? WHERE usuario=?");
            PreparedStatement ps=con.prepareStatement(query);
            login2 valu= new login2();

            ps.setInt(1,puntosIngles);
            ps.setString(2,valu.username);
            int res=ps.executeUpdate();
                if(res>0)
                {
                 JOptionPane.showMessageDialog(null, "Si se cambio");
                }
                else
                {     JOptionPane.showMessageDialog(null, "No se cambio");
                 }
            JOptionPane.showMessageDialog(null, "tu puntuación fue de: " + puntosIngles + "/5");

        }catch(Exception e)
            {
              JOptionPane.showMessageDialog(null, "No se cambio");
            }
    }    
}

