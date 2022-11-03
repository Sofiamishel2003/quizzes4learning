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




public class Matematica extends Estudiante{
    private int puntosMate;
    private String[][] preguntasMate = {{"¿Cuánto es 2+2?", "¿Cuánto es 5+10?", "¿Cuánto es 4+3?", "¿Cuánto es 40+5?", "¿Cuánto es 53+48?" , "¿Cuánto es 3-2?", "¿Cuánto es 9-4?", "¿Cuánto es 13-2?", "¿Cuánto es 27-9?", "¿Cuánto es 58-23?"},
                                    {"¿Cuánto es 3*2?", "¿Cuánto es 5*3?", "¿Cuánto es 4*4?", "¿Cuánto es 8*5?", "¿Cuánto es 9*10?", "¿Cuánto es 8/2?", "¿Cuánto es 12/3?", "¿Cuánto es 15/5?", "¿Cuánto es 18/2?", "¿Cuánto es 36/3?"},
                                    {"¿Cuánto es 7*7?", "¿Cuánto es 5*6?", "¿Cuánto es 9*8?", "¿Cuánto es 4*6?", "¿Cuánto es 14*8?", "¿Cuánto es 81/9?", "¿Cuánto es 65/13?", "¿Cuánto es 86/2?", "¿Cuánto es 56/7?", "¿Cuánto es 57/3?"},
                                    {"¿Cuánto es (6*13)+3?", "¿Cuánto es (39*1/2)+6?", "¿Cuánto es 30/4?", "¿Cuánto es (4*2) + (4+2)?", "¿Cuánto es 5*1/2?", "¿Cuánto es (5+4+2)*(3*(4+3))?", "¿Cuánto es (10-6)/2?", "¿Cuánto es (57/3)+3?", "¿Cuánto es (3*2*5)+(5*1/2)?", "¿Cuánto es (36/4 + 111/3) * (4+2*3)?"}};
    private String[][] respuestasMate = {{"4","3","2"},{"14","16","15"},{"6","7","9"},{"44","55","45"},{"202","102","101"},{"1","0","2"},{"3","20","5"},{"21","10","11"},{"20","36","18"},{"40","42","35"},
                                     {"7","8","6"}, {"17","20","15"},{"16","26","20"},{"20","30","40"},{"90","91","92"},{"4","2","5"},{"1","4","5"},{"1","2","3"},{"11","9","18"},{"12","13","14"},
                                     {"14","49","21"},{"11","31","30"},{"17","72","82"},{"10","24","14"},{"22","112","82"},{"73","10","9"},{"15","20","5"},{"44","43","45"},{"10","4","8"},{"10","29","19"},
                                     {"25","81","54"},{"45.5","292.5","25.5"},{"7.5","120","7"},{"12","14","16"},{"5.5","2","2.5"},{"111","110","231"},{"2","1","6"},{"21","22","23"},{"32","32.5","31"},{"330","460","230"}};
    private String[][] respuestasCorrectasMate = {{"4","15","7","45","101","1","5","11","18","35"},
                                              {"6","15","16","40","90","4","4","3","9","12"},
                                              {"49","30","72","24","112","9","5","43","8","19"},
                                              {"81","25.5","7.5","14","2.5","231","2","22","32.5","460"}};

    public Matematica(){
        super();
        puntosMate = 0;
        //preguntasMate = new String[4][10];
        //respuestasMate = new String[40][3];
        //respuestasCorrectasMate = new String[4][10];
    }

    public Matematica(String nombreUsuario, String contraseña, String colegio, int grado, int puntaje){
        super(nombreUsuario, contraseña, colegio, grado, puntaje);
        this.puntosMate = 0;
        
        preguntasMate = new String[4][10];
        respuestasMate = new String[40][3];
        respuestasCorrectasMate = new String[4][10];
    }

    public int getPuntosMate() {
        return this.puntosMate;
        
    }

    public void setPuntosMate(int puntosMate) {
        PreparedStatement ps=null;
        this.puntosMate = puntosMate;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/quizzes4learning","root","");
            ps=con.prepareStatement("UPDATE materias SET matematica=? WHERE usuario=?");
            ps.setInt(1,puntosMate);
            ps.setString(2,nombreUsuario);
            int res=ps.executeUpdate();
                if(res>0)
                {
                 JOptionPane.showMessageDialog(null, "Si se cambio");
                }
        }catch(Exception e)
            {
              JOptionPane.showMessageDialog(null, "No se cambio");
            }
    }

    public String[][] getPreguntasMate() {
        return this.preguntasMate;
    }

    public void setPreguntasMate(String[][] preguntasMate) {
        this.preguntasMate = preguntasMate;
    }

    public String[][] getRespuestasMate() {
        return this.respuestasMate;
    }

    public void setRespuestasMate(String[][] respuestasMate) {
        this.respuestasMate = respuestasMate;
    }

    public String[][] getRespuestasCorrectasMate() {
        return this.respuestasCorrectasMate;
    }

    public void setRespuestasCorrectasMate(String[][] respuestasCorrectasMate) {
        this.respuestasCorrectasMate = respuestasCorrectasMate;
    }

//    @Override
   // public String toString() {
   //     return "{" +
   //         " puntosMate='" + getPuntosMate() + "'" +
   //         ", preguntasMate='" + getPreguntasMate() + "'" +
    //        ", respuestasMate='" + getRespuestasMate() + "'" +
    //        ", respuestasCorrectasMate='" + getRespuestasCorrectasMate() + "'" +
    //        "}";
  //  }
    public void preguntas(int grado){
      //  
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
                ventana.preguntona.setText(j+ ". " + preguntasMate[grado - 1][random]);
                ventana.r1.setText("A. " + respuestasMate[random + ((grado - 1) * (10))][0]);
                ventana.r2.setText("B. " + respuestasMate[random + ((grado - 1) * (10))][1]);
                ventana.r3.setText("C. " + respuestasMate[random + ((grado - 1) * (10))][2]);
                ventana.show();
                int x=JOptionPane.showOptionDialog(null, "Escoja la respuesta correcta",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if(x==0){
                            respuestaCorrecta = respuestasMate[random + ((grado - 1) * (10))][0];
                }else if(x==1){
                            respuestaCorrecta = respuestasMate[random + ((grado - 1) * (10))][1]; 

                }else if(x==2){
                            respuestaCorrecta = respuestasMate[random + ((grado - 1) * (10))][2];
                }
                for(int i = 0; i<10 ; i++){
                    if(respuestaCorrecta == respuestasCorrectasMate[grado - 1][i]){
                        bandera2 = true;
                        }
                     }
                if(bandera2 == true){
                        puntosMate = puntosMate + 1;
                        super.setPuntaje(puntosMate);
                       }
                    
                
            }
        }
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/quizzes4learning","root","");
            String query=("UPDATE materias SET matematica=? WHERE usuario=?");
            PreparedStatement ps=con.prepareStatement(query);
            login2 valu= new login2();

            ps.setInt(1,puntosMate);
            ps.setString(2,valu.username);
            int res=ps.executeUpdate();
                if(res>0)
                {
                 JOptionPane.showMessageDialog(null, "Si se cambio");
                }
                else
                {     JOptionPane.showMessageDialog(null, "No se cambio");
                 }
            JOptionPane.showMessageDialog(null, "tu puntuación fue de: " + puntosMate + "/5");

        }catch(Exception e)
            {
              JOptionPane.showMessageDialog(null, "No se cambio");
            }
    }    
}
