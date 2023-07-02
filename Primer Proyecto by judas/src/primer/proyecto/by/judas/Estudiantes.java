/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primer.proyecto.by.judas;

import java.util.Random;

/**
 *
 * @author DANIEL
 */
public class Estudiantes {
    
    //ATRIBUTOS
    private String nombre;
    private int edad;
    private char sexo;
    private String email;
    private int id;
    
    //CONSTRUCTORES

    public Estudiantes(String nombre, int edad, char sexo, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.email = email;
        this.id = generarIDrandom();
    }
    
    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad > 10 && edad <= 18){
            this.edad = edad;
        }
        else{
            throw new IllegalArgumentException("Edad fuera del límite permitido");
        }
    }

    public void setSexo(char sexo) {
        if(sexo == 'H' || sexo == 'F'){
            this.sexo=sexo;
        }
        else{
            throw new IllegalArgumentException("El sexo debe ser 'H' o 'F'.");
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    //METODOS
    
    public int generarIDrandom(){
        Random random = new Random();
        return this.id = random.nextInt(10000);
    }
    
    public boolean validarEmail(String email){
        String validacion= "\\w+@\\w+\\.\\w+";
        boolean esValido = email.matches(validacion);
    
        if (esValido) {
            System.out.println("El correo electrónico es válido.");
        } else {
            System.out.println("El correo electrónico no es válido.");
        }

        return esValido;
    }
    
    public boolean validarNombre(String nombre){
        for(int i=0;i<nombre.length();i++){
            char x = nombre.charAt(i);
            if (!Character.isLetter(x)) {
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString(){
        return "Estudiante Nº" + id + 
                "\n Nombre = " + nombre +
                "\n Edad = " + edad +
                "\n Sexo = " + sexo +
                "\n Correo = " + email;
    }
    
}
