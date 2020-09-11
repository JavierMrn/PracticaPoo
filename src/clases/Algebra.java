package clases;

import java.util.ArrayList;

public class Algebra {
    private ArrayList<Alumno> alumnos;

    //constructores 
    public Algebra(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Algebra() {
    }
    
    //getters and setters
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
