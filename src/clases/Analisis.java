package clases;

import java.util.ArrayList;

public class Analisis {

    private ArrayList<Alumno> alumnos;

    //constructores 
    public Analisis(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Analisis() {
    }
    
    //getters and setters
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
