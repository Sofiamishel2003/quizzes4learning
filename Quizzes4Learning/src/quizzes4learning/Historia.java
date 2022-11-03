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
public class Historia extends Estudiante{
    private int puntosHistoria;
    private String[][] preguntasHistoria = {{"¿Cuándo empezó la segunda guerra mundial?", "¿Qué tratado puso fin a la primera guerra mundial?", "¿En qué año fue la caída del muro de Berlín?", "¿En qué año comenzó la revolución industrial?", "¿Quién descubrió América?" , "¿En qué año termina la revolución francesa?", "¿En dónde se originó los juegos olímpicos?", "¿A qué siglo se denomina como el siglo de oro?", "¿Cómo se denomina a los primeros pobladores que se desplazaban de un lugar a otro?", "¿En qué periodo comenzó la domesticación de animales?"},
                                    {"¿Cuál es considerada la capital del imperio Inca?", "¿Quiénes lucharon en la denominada Batalla del Maratón?", "¿En qué año Walt Disney presentó su primera pelícual?", "¿Cómo se llamó el primer presidente de Estados Unidos?", "¿Qué filósofo fue maestro de Alejandro Magno?", "¿En qué año fue descubierta América?", "¿Qué imperio conquistó el antiguo Egipto en el año 30 a. C.?", "¿Quién fue el primer hombre que pisó la luna?", "¿Qué presidente estadounidense fue asesinado en Dallas?", "En la política Romana ¿Cómo se les llamaron a los trabajadores libres?"},
                                    {"¿En qué guerra participó Juana de Arco?", "¿Quién fue el último zar de Rusia?", "¿Qué inició la primera guerra mundial?", "¿Qué inició la segunda guerra mundial?", "¿A qué emperador romano asesinó un grupo de senadores?", "¿Qué famosa batalla perdió y dejó humillado a Napoleón Bonaparte?", "¿Qué isla generó un conflicto entre Reino Unido y Argentina?", "En qué año cayó el Imperio Romano de Occidente?", "¿Quién inventó la imprenta?", "¿Cuál era la forma de gobierno en la que el rey tomaba las decisiones y su cargo era hereditario y vitalicio?"},
                                    {"¿Cómo se llama el himno de Francia?", "¿De qué año es la primera Constitución española, la Pepa?", "¿Cuál es el antiguo nombre de San Petersburgo?", "¿A quién nombro senador Calígula?", "¿Cuál era la capital de la República Federal Alemana?", "¿Quién inició la Revolución cultural China?", "¿Qué dinastía reinó en España antes que los Borbones?", "¿Qué ciudad fundaron los aztecas?", "¿Quién fue el dictador italiano que lideraba Italia al comienzo de la Segunda Guerra Mundial?", "¿Qué volcán devastó Pompeya?"}};
    private String[][] respuestasHistoria = {{"1930","1955","1939"},{"Versalles","Valladares","Amigables"},{"1998","1989","1950"},{"1754","1760","1731"},{"Cristóbal Colón","Nikola Tesla","Albert E."},{"1758","1790","1799"},{"Mexico","Roma","Grecia"},{"Siglo XVI","Siglo XVII","Siglo XVIII"},{"Nomás","Nativos","Nómadas"},{"Neolítico","Edad Antigua","Edad Media"},
                                     {"Iximché","Xela","Cuzco"}, {"Griegos y Persas","Romanos y Nazis","Mayas y Persas"},{"1939","1940","1941"},{"Abraham Lincoln","J.F. Kennedy","George Washington"},{"Platón","Aristóteles","Sócrates"},{"1493","1395","1492"},{"Imperio Otomano","Imperio Bizantino","Imperio Romano"},{"Neil Amstrong","Valentina Tereshckova","Buzz Lightyear"},{"Robert Kennedy", "John F. Kennedy","Abraham Lincoln"},{"Desencadenados","Aire","Libertos"},
                                     {"Guerra de los 6 dias","Segunda Guerra Mundial","Guerra de los 100 años"},{"Alejandro II","Nicolás II","Pedro I el Grande"},{"Tratado de Versalles","Escapada de Hitler","Asesinato de Francisco Fernando"},{"Muerte del Comandante Tyronne III","Invasión a Polonia","Invasión Austria-Hungría"},{"Calígula","Nerón","Julio César"},{"Campaña de Trafalgar","Batalla de Waterloo","Batalla de Austerlitz"},{"Islas Marianas","Perejil","Las islas Malvinas"},{"27","476","572"},{"Johannes Gutenberg","Thomas Edison","Nikola Tesla"},{"Totalitarismo","Monarquía","Libertarismo"},
                                     {"La Marsellesa","Himno a Paris","Le homme et la femme"},{"1978","1812","1931"},{"Leningrado","San Petersburgo","Stalingrado"},{"Su lacayo","Su caballo","Su perro"},{"Bonn","Berlín","Munich"},{"Deng Xiaoping","Jiang Zeming","Mao Zedong"},{"Los Austrias","Los Borbones","Los Trastámaras"},{"Tulúm","Chichén Itzá","Tenochtitlán"},{"Humberto I","Benito Mussolini","Victor Manuel II"},{"El Santa Helena","El Etna","El Vesubio"}};
    private String[][] respuestasCorrectasHistoria = {{"1939","Versalles","1989","1760","Cristóbal Colón","1799","Grecia","Siglo XVI","Nómadas","Neolítico"},
                                              {"Cuzco","Griegos y Persas","1939","George Washington","Aristóteles","1492","Imperio Romano","Neil Amstrong","John F. Kennedy0","Libertos"},
                                              {"Guerra de los 100 años","Nicolás II","Asesinato de Francisco Fernando","Invasión a Polonia","Julio César","Batalla de Waterloo","Las islas Malvinas","476","Johannes Gutenberg","Monarquía"},
                                              {"La Marsellesa","1812","Leningrado","Su caballo","Bonn","Mao Zedong","Los Austrias","Tenochtitlán","Benito Mussolini","El Vesubio"}};

    public Historia(){
        super();
        puntosHistoria = 0;
        //preguntasHistoria = new String[4][10];
        //respuestasHistoria = new String[40][3];
        //respuestasCorrectasHistoria = new String[4][10];
    }

    public Historia(String nombreUsuario, String contraseña, String colegio, int grado, int puntaje){
        super(nombreUsuario, contraseña, colegio, grado, puntaje);
        this.puntosHistoria = 0;
        preguntasHistoria = new String[4][10];
        respuestasHistoria = new String[40][3];
        respuestasCorrectasHistoria = new String[4][10];
    }

    public int getPuntosHistoria() {
        return this.puntosHistoria;
    }

    public void setPuntosHistoria(int puntosHistoria) {
        this.puntosHistoria = puntosHistoria;
    }

    public String[][] getPreguntasHistoria() {
        return this.preguntasHistoria;
    }

    public void setPreguntasHistoria(String[][] preguntasHistoria) {
        this.preguntasHistoria = preguntasHistoria;
    }

    public String[][] getRespuestasHistoria() {
        return this.respuestasHistoria;
    }

    public void setRespuestasHistoria(String[][] respuestasHistoria) {
        this.respuestasHistoria = respuestasHistoria;
    }

    public String[][] getRespuestasCorrectasHistoria() {
        return this.respuestasCorrectasHistoria;
    }

    public void setRespuestasCorrectasHistoria(String[][] respuestasCorrectasHistoria) {
        this.respuestasCorrectasHistoria = respuestasCorrectasHistoria;
    }

    @Override
    public String toString() {
        return "{" +
            " puntosHistoria='" + getPuntosHistoria() + "'" +
            ", preguntasHistoria='" + getPreguntasHistoria() + "'" +
            ", respuestasHistoria='" + getRespuestasHistoria() + "'" +
            ", respuestasCorrectasHistoria='" + getRespuestasCorrectasHistoria() + "'" +
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
                ventana.preguntona.setText(j + ". " + preguntasHistoria[grado - 1][random]);
                ventana.r1.setText("-1. " + respuestasHistoria[random + ((grado - 1) * (10))][0]);
                ventana.r2.setText("-2. " + respuestasHistoria[random + ((grado - 1) * (10))][1]);
                ventana.r3.setText("-3. " + respuestasHistoria[random + ((grado - 1) * (10))][2]);
                 ventana.show();
                int x=JOptionPane.showOptionDialog(null, "Escoja la respuesta correcta",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                if(x==0){
                    respuestaCorrecta = respuestasHistoria[random + ((grado - 1) * (10))][0];
                }else if(x == 1){
                    respuestaCorrecta = respuestasHistoria[random + ((grado - 1) * (10))][1]; 
                }else if(x == 2){
                    respuestaCorrecta = respuestasHistoria[random + ((grado - 1) * (10))][2];
                }
                for(int i = 0; i<10 ; i++){
                    if(respuestaCorrecta == respuestasCorrectasHistoria[grado - 1][i]){
                        bandera2 = true;
                    }
                }
                if(bandera2 == true){
                    puntosHistoria = puntosHistoria + 1;
                    super.setPuntaje(puntosHistoria);
                }
                
            }
        }
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/quizzes4learning","root","");
            String query=("UPDATE materias SET historia=? WHERE usuario=?");
            PreparedStatement ps=con.prepareStatement(query);
            login2 valu= new login2();

            ps.setInt(1,puntosHistoria);
            ps.setString(2,valu.username);
            int res=ps.executeUpdate();
                if(res>0)
                {
                 JOptionPane.showMessageDialog(null, "Si se cambio");
                }
                else
                {     JOptionPane.showMessageDialog(null, "No se cambio");
                 }
            JOptionPane.showMessageDialog(null, "tu puntuación fue de: " + puntosHistoria + "/5");

        }catch(Exception e)
            {
              JOptionPane.showMessageDialog(null, "No se cambio");
            }
    }    
}

