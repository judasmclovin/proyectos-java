/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primer.proyecto.by.judas;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DANIEL
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Estudiantes> listaEstudiantes = new ArrayList<>();
    static RegistroEstudiantes registro = new RegistroEstudiantes(listaEstudiantes);
    
    public static void main(String[] args) {
        int opcion = 0;
        int id;
        String name, correo;
        listaEstudiantesZ();
        do{
            opcion = menu();
            switch(opcion){
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    System.out.println("Introduzca la id del estudiante a eliminar: ");
                    id = Integer.parseInt(entrada.nextLine());
                    registro.eliminarEstudiantes(id);
                    break;
                case 3:
                    System.out.println("Introduzca el nombre del estudiante a eliminar:");
                    name = entrada.nextLine();
                    registro.eliminarEstudiantesByName(name);
                    break;
                case 4:
                    System.out.println("Introduzca la ID del estudiante a buscar:");
                    id = Integer.parseInt(entrada.nextLine());
                    registro.buscarEstudiantes(id);
                    break;
                case 5:
                    System.out.println("Introduzca el nombre del estudiante a buscar:");
                    name = entrada.nextLine();
                    registro.buscarEstudiantesByName(name);
                    break;
                case 6:
                    for (Estudiantes estudiante : listaEstudiantes) {
                        System.out.println(estudiante.toString());
                    }
                    break;
                case 7:
                    int cantidad = listaEstudiantes.size();
                    System.out.println("El número de estudiantes en la lista es: " + cantidad);
                    System.out.println("Elige un número al azar de dicho rango para verificar el email:");
                    int choice = Integer.parseInt(entrada.nextLine());
                    Estudiantes verificado = listaEstudiantes.get(choice);
                    System.out.println("El estudiante escogido es: ");
                    System.out.println(verificado.toString());
                    verificado.validarEmail(verificado.getEmail());
                    break;
            }
        }while(opcion!=0);
    }
    
    public static int menu(){
        int seleccion = 0;
        System.out.println("=== Menú Principal ===");
        System.out.println("1. Agregar estudiante");
        System.out.println("2. Eliminar estudiante por ID");
        System.out.println("3. Eliminar estudiante por nombre");
        System.out.println("4. Buscar estudiante por ID");
        System.out.println("5. Buscar estudiante por nombre");
        System.out.println("6. Mostrar lista de estudiantes");
        System.out.println("7. Verificar validez de un correo electrónico");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
        return seleccion = Integer.parseInt(entrada.nextLine());
    }
    
    public static void agregarEstudiante(){
        String nombre, email;
        int edad;
        char sexo;
        
        System.out.println("Ingrese el nombre completo del estudiante a añadir:");
        nombre=entrada.nextLine();
        System.out.println("Introduzca la edad:");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("Introduzca el sexo");
        sexo = entrada.nextLine().charAt(0);
        System.out.println("Por ultimo, introduzca el correo electronico:");
        email = entrada.nextLine();
        
        Estudiantes estudiante = new Estudiantes(nombre,edad,sexo,email);
        
        registro.agregarEstudiantes(estudiante);
        estudiante.toString();
    }
    public static void listaEstudiantesZ(){
        Estudiantes estudiante1 = new Estudiantes("Julian Alvarez Toledo", 13, 'H', "julianelmascapo@yahoo.com");
        Estudiantes estudiante2 = new Estudiantes("María González López", 14, 'F', "mariagonzalez@gmail.com");
        Estudiantes estudiante3 = new Estudiantes("Pedro Rodríguez Martínez", 12, 'H', "pedrorodriguez@hotmail.com");
        Estudiantes estudiante4 = new Estudiantes("Ana Sánchez Torres", 15, 'F', "anasanchez@gmail.com");
        Estudiantes estudiante5 = new Estudiantes("Luis García Vargas", 16, 'H', "luisgarcia@yahoo.com");
        Estudiantes estudiante6 = new Estudiantes("Laura Martínez Pérez", 13, 'F', "lauramartinez@gmail.com");
        Estudiantes estudiante7 = new Estudiantes("Carlos Fernández Gómez", 14, 'H', "carlosfernandez@hotmail.com");
        Estudiantes estudiante8 = new Estudiantes("Marta López Sánchez", 12, 'F', "martalopez@gmail.com");
        Estudiantes estudiante9 = new Estudiantes("Diego Torres Rodríguez", 15, 'H', "diegotorres@yahoo.com");
        Estudiantes estudiante10 = new Estudiantes("Sofía Vargas García", 16, 'F', "sofiavargas@gmail.com");
        
        registro.agregarEstudiantes(estudiante1);
        registro.agregarEstudiantes(estudiante2);
        registro.agregarEstudiantes(estudiante3);
        registro.agregarEstudiantes(estudiante4);
        registro.agregarEstudiantes(estudiante5);
        registro.agregarEstudiantes(estudiante6);
        registro.agregarEstudiantes(estudiante7);
        registro.agregarEstudiantes(estudiante8);
        registro.agregarEstudiantes(estudiante9);
        registro.agregarEstudiantes(estudiante10);
    }
}
