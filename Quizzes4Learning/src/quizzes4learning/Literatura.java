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
public class Literatura extends Estudiante{
    private int puntosLiteratura;
    private String[][] preguntasLiteratura = {{"Sinónimo de perro", "Sinónimo de computadora", "Sinónimo de trofeo", "Sinónimo de grama", "Sinónimo de pared" , "Sinónimo de carro", "Sinónimo de chumpa", "Sinónimo de silencio", "Sinónimo de pelota", "Sinónimo de entrada"},
                                    {"Antónimo de salir", "Antónimo de limpio", "Antónimo de amor", "Antónimo de divertido", "Antónimo de pobre", "Antónimo de eliminar", "Antónimo de higiénico", "Antónimo de valiente", "Antónimo de día", "Antónimo de amigo"},
                                    {"pasado de correr", "futuro de comer", "pasado de escribir", "futuro de ver", "pasado de sentar", "futuro de escuchar", "pasado de dormir", "futuro de pintar", "pasado de bañarse", "futuro de caminar"},
                                    {"¿Dónde se tilda sensacion?", "¿Dónde se tilda musica?", "¿Dónde se tilda abremelo?", "¿Dónde se tilda agito?", "¿Dónde se tilda sofa?", "¿Dónde se tilda jugaras?", "¿Dónde se tilda comunion?", "¿Dónde se tilda azucar?", "¿Dónde se tilda triangulacion?", "¿Dónde se tilda Dominguez?"}};
    private String[][] respuestasLiteratura = {{"Can","Felino","Pez"},{"Portador","Ordenador","Ordenado"},{"Victoria","Trunfo","Copa"},{"Césped","Verde","Pradera"},{"Cerca","Muro","Tope"},{"Avión","Auto","Moto"},{"Cazadora","Camisa","Pantalón"},{"Ruido","Sigilo","Solitario"},{"Balón","Triangulo","Cuadrado"},{"Ingreso","Salida","Cielo"},
                                     {"entrar","gatear","sufrir"}, {"ordenado","sucio","estilizado"},{"amado","odio","cariño"},{"tareas","aburrido","entretenido"},{"delicioso","pobre","adinerado"},{"añadir","quitar","cortar"},{"insalubre","limpio","negro"},{"triste","animado","cobarde"},{"noche","tarde","mañana"},{"enemigo","aliado","confianza"},
                                     {"corrió","corre","correrá"},{"comer","comerá","comió"},{"escribió","escribirá","escribe"},{"verá","vio","ve"},{"sentará","sienta","sentó"},{"escuchará","escuchó","escucha"},{"durmió","dormirá","duerme"},{"pintó","pintará","pinta"},{"bañó","bañará","baña"},{"caminó","caminará","camina"},
                                     {"sénsacion","sensación","sensácion"},{"musicá","musíca","música"},{"ábremelo","abrémelo","abremélo"},{"ágito","agíto","agitó"},{"sofá","sófa","no se tilda"},{"júgaras","jugarás","jugáras"},{"comunión","cómunion","comúnion"},{"ázucar","azúcar","azucár"},{"triangulación","triángulacion","tríangulacion"},{"Domínguez","Dóminguez","Domnguéz"}};
    private String[][] respuestasCorrectasLiteratura = {{"Can","Ordenador","Copa","Césped","Muro","Auto","Cazadora","Sigilo","Balón","Ingreso"},
                                              {"entrar","sucio","odio","aburrido","pobre","añadir","insalubre","cobarde","noche","enemigo"},
                                              {"corrió","comerá","escribió","verá","sentó","escuchará","durmió","pintará","bañó","caminará"},
                                              {"senscación","música","ábremelo","agitó","sofá","jugarás","comunión","azúcar","triangulación","Domínguez"}};

    public Literatura(){
        super();
        puntosLiteratura = 0;
        //preguntasLiteratura = new String[4][10];
        //respuestasLiteratura = new String[40][3];
        //respuestasCorrectasLiteratura = new String[4][10];
    }

    public Literatura(String nombreUsuario, String contraseña, String colegio, int grado, int puntaje){
        super(nombreUsuario, contraseña, colegio, grado, puntaje);
        this.puntosLiteratura = 0;
        preguntasLiteratura = new String[4][10];
        respuestasLiteratura = new String[40][3];
        respuestasCorrectasLiteratura = new String[4][10];
    }

    public int getpuntosLiteratura() {
        return this.puntosLiteratura;
    }

    public void setpuntosLiteratura(int puntosLiteratura) {
        this.puntosLiteratura = puntosLiteratura;
    }

    public String[][] getpreguntasLiteratura() {
        return this.preguntasLiteratura;
    }

    public void setpreguntasLiteratura(String[][] preguntasLiteratura) {
        this.preguntasLiteratura = preguntasLiteratura;
    }

    public String[][] getrespuestasLiteratura() {
        return this.respuestasLiteratura;
    }

    public void setrespuestasLiteratura(String[][] respuestasLiteratura) {
        this.respuestasLiteratura = respuestasLiteratura;
    }

    public String[][] getrespuestasCorrectasLiteratura() {
        return this.respuestasCorrectasLiteratura;
    }

    public void setrespuestasCorrectasLiteratura(String[][] respuestasCorrectasLiteratura) {
        this.respuestasCorrectasLiteratura = respuestasCorrectasLiteratura;
    }

    @Override
    public String toString() {
        return "{" +
            " puntosLiteratura='" + getpuntosLiteratura() + "'" +
            ", preguntasLiteratura='" + getpreguntasLiteratura() + "'" +
            ", respuestasLiteratura='" + getrespuestasLiteratura() + "'" +
            ", respuestasCorrectasLiteratura='" + getrespuestasCorrectasLiteratura() + "'" +
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
                ventana.preguntona.setText(j + ". " + preguntasLiteratura[grado - 1][random]);
                ventana.r1.setText("-1. " + respuestasLiteratura[random + ((grado - 1) * (10))][0]);
                ventana.r2.setText("-2. " + respuestasLiteratura[random + ((grado - 1) * (10))][1]);
                ventana.r3.setText("-3. " + respuestasLiteratura[random + ((grado - 1) * (10))][2]);
                ventana.show();
                int x=JOptionPane.showOptionDialog(null, "Escoja la respuesta correcta",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if(x==0){
                    respuestaCorrecta = respuestasLiteratura[random + ((grado - 1) * (10))][0];
                }else if(x == 1){
                    respuestaCorrecta = respuestasLiteratura[random + ((grado - 1) * (10))][1]; 
                }else if(x == 2){
                    respuestaCorrecta = respuestasLiteratura[random + ((grado - 1) * (10))][2];
                }
                for(int i = 0; i<10 ; i++){
                    if(respuestaCorrecta == respuestasCorrectasLiteratura[grado - 1][i]){
                        bandera2 = true;
                    }
                }
                if(bandera2 == true){
                    puntosLiteratura = puntosLiteratura + 1;
                    int puntosTotal = super.getPuntaje();
                    puntosTotal = puntosTotal + puntosLiteratura;
                    super.setPuntaje(puntosTotal);
                }
                
            }
        }
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/quizzes4learning","root","");
            String query=("UPDATE materias SET literatura=? WHERE usuario=?");
            PreparedStatement ps=con.prepareStatement(query);
            login2 valu= new login2();

            ps.setInt(1,puntosLiteratura);
            ps.setString(2,valu.username);
            int res=ps.executeUpdate();
                if(res>0)
                {
                 JOptionPane.showMessageDialog(null, "Si se cambio");
                }
                else
                {     JOptionPane.showMessageDialog(null, "No se cambio");
                 }
            JOptionPane.showMessageDialog(null, "tu puntuación fue de: " + puntosLiteratura + "/5");

        }catch(Exception e)
            {
              JOptionPane.showMessageDialog(null, "No se cambio");
            }
        System.out.println("tu puntuación fue de: " + puntosLiteratura + "/5");
    }    
}

