/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizzes4learning;

/**
 *
 * @author 50250
 */
public class Estudiante{
    protected String nombreUsuario;
    protected String contraseña;
    protected String colegio;
    protected int grado;
    protected int puntaje;
    
    public Estudiante(){
        nombreUsuario = "";
        contraseña = "";
        colegio = "";
        grado = 0;
        puntaje = 0;
    }
    public Estudiante(String nombreUsuario, String contraseña, String colegio, int grado, int puntaje){
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.colegio = colegio;
        this.grado = grado;
        this.puntaje = puntaje;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getColegio() {
        return this.colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public int getGrado() {
        return this.grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getPuntaje() {
        return this.puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "{" +
            " nombreUsuario='" + getNombreUsuario() + "'" +
            ", contraseña='" + getContraseña() + "'" +
            ", colegio='" + getColegio() + "'" +
            ", grado='" + getGrado() + "'" +
            ", puntaje='" + getPuntaje() + "'" +
            "}";
    }

}