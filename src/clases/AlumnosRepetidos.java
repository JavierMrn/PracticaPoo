package clases;

import java.util.ArrayList;

public class AlumnosRepetidos {
    private ArrayList<Alumno> alumnos;

    //constructores 
    public AlumnosRepetidos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public AlumnosRepetidos() {
    }
    
    //getters and setters
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
