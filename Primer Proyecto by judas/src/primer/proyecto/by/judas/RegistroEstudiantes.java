/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primer.proyecto.by.judas;

import java.util.ArrayList;

/**
 *
 * @author DANIEL
 */
public class RegistroEstudiantes {
    
    //ATRIBUTOS
    private ArrayList<Estudiantes> estudiantes;
    
    //CONSTRUCTOR

    public RegistroEstudiantes(ArrayList<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    //METODOS
    public void agregarEstudiantes(Estudiantes estudiante){
        estudiantes.add(estudiante);
    }
    
    public void eliminarEstudiantes(int id){
        for(Estudiantes alumno : estudiantes){
            if(alumno.getId() == id){
                estudiantes.remove(alumno);
                System.out.println("Estudiante "+alumno+" eliminado con exito");
                break;
            }
        }
        System.out.println("No se ha encontrado ningun alumno que tenga dicha id.");
    }
    public void eliminarEstudiantesByName(String nombre){
        for(Estudiantes alumno : estudiantes){
            if(alumno.getNombre().equals(nombre)){
                estudiantes.remove(alumno);
                System.out.println("Estudiante "+alumno+" eliminado con exito");
                break;
            }else{
                System.out.println("No se ha encontrado ningun alumno que tenga dicho nombre.");
            }
        }
    }
    public void buscarEstudiantes(int id){
        for(Estudiantes alumno : estudiantes){
            if(alumno.getId() == id){
                System.out.println("La id introducida concuerda con :");
                alumno.toString();
                break;
            }else{
                System.out.println("No se ha encontrado ningun alumno que tenga dicha id.");
            }
        }
    }
    public void buscarEstudiantesByName(String nombre){
        for(Estudiantes alumno : estudiantes){
            if(alumno.getNombre().equals(nombre)){
                System.out.println("El nombre otorgado concuerda con :");
                alumno.toString();
                break;
            }else{
                System.out.println("No se ha encontrado ningun alumno que tenga dicho nombre");
            }
        }
    }
}
