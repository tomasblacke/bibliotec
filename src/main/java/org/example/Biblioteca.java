package org.example;

import org.example.Prestamo.Prestamo;
import org.example.materiales.DVDS;
import org.example.materiales.Libro;
import org.example.materiales.Materiales;
import org.example.materiales.Revistas;
import org.example.usuario.Estudiante;
import org.example.usuario.Profesor;
import org.example.usuario.Usuario;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;


public class Biblioteca {

    private LinkedList<Usuario> misUsuarios;
    private LinkedList<Materiales> misMateriales;
    private LinkedList<Prestamo> misPrestamos;

    public Biblioteca() {
        this.misUsuarios = new LinkedList<>();
        this.misMateriales = new LinkedList<>();
        this.misPrestamos = new LinkedList<>();
    }

    ///AGREGO USUARIOS
    public void agregarUsuarios() {
        misUsuarios.add(new Estudiante("Juan", "Perez", "jp@gmail.com"));
        misUsuarios.add(new Estudiante("Pedro", "Gutierrez", "pg@gmail.com"));
        misUsuarios.add(new Estudiante("Sofia", "So", "soso@gmail.com"));
        misUsuarios.add(new Profesor("Javier", "Girafales", "jg@gmail.com"));
        misUsuarios.add(new Profesor("Domingo", "Sarmiento", "faustino@gmail.com"));
        misUsuarios.add(new Profesor("Luisa", "Ardiles", "la@gmail.com"));

    }

    public void agregarMateriales() {
        misMateriales.add(new Libro("Pocahontas", "John Doe", "12-5-1956", Materiales.estado.DISPONIBLE, 65));
        misMateriales.add(new Libro("Cuentos Cortos", "Talio", "18-8-1968", Materiales.estado.DISPONIBLE, 125));
        misMateriales.add(new Libro("Peligro", "Lienzo Fernandez", "23-6-2000", Materiales.estado.DISPONIBLE, 547));
        misMateriales.add(new DVDS("Aventuras Magicas", "Carlos", "10-5-1987", Materiales.estado.EN_SALA, 125));
        misMateriales.add(new Revistas("Por modas", "Mateo Perez", "20-10-2023", Materiales.estado.DISPONIBLE, 5));
    }


    /////METODOS DE PRESTAMOS
    public LocalDate calcularFechaDevolucion(Materiales material, Usuario usuario) {
        if (usuario instanceof Profesor) {
            return LocalDate.now().plusDays(14);
        }
        if (usuario instanceof Estudiante) {
            return LocalDate.now().plusDays(7);
        } else {
            return null;
        }
    }

    public void prestarMateriales(Usuario usuario, Materiales materiales, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        if (materiales.getEstado() == Materiales.estado.DISPONIBLE) {
            materiales.setEstado(Materiales.estado.PRESTADO);
            fechaDevolucion = calcularFechaDevolucion(materiales, usuario);
            Prestamo prestamo = new Prestamo(usuario, materiales, LocalDate.now(), fechaDevolucion);
            misPrestamos.add(prestamo);
        }
        if (materiales.getEstado() == Materiales.estado.EN_SALA) {
            System.out.println("Has solicitado un material para consumo en sala");
        }
        if (materiales.getEstado() == Materiales.estado.EN_REPARECIO) {
            System.out.println("Parece que este material se esta reparando");
        }
        if (materiales.getEstado() == Materiales.estado.PRESTADO) {
            System.out.println("El material ya ha sido prestado");
        }

    }
    public void devolucionMaterial(Usuario usuario,Materiales materiales){
        materiales.setEstado(Materiales.estado.DISPONIBLE);
        /*
        misPrestamos.remove(Prestamo);
        hay que hace una funcion que busque el prestamo y lo devuelva
    */
    }
    /////////////////////MUESTREO DE USUARIOS Y MODIFICACIONES DE DATOS//////////////////////
    public void mostrarUsuarioAndCambiar (Usuario usuario){
    System.out.println("Ingrese ID:");
    Scanner sc = new Scanner(System.in);
    int id= sc.nextInt();
    for (Usuario u : misUsuarios) {
        if (id == usuario.getId()) {
            System.out.println("==================");
            System.out.println("USUARIO:");
            System.out.println("==================");
            System.out.println("\tID: " + u.getId());
            System.out.println("\tNombre: " + u.getNombre());
            System.out.println("\tApellido: " + u.getApellido());
            System.out.println("==================");
        }
        System.out.println("1-Cambiar Nombre");
        System.out.println("2-Cambiar Mail");
        System.out.println("3-Cambiar Apellido");
        System.out.println("4-NADA");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese nuevo nombre:");
                String nombre = sc.next();
                u.setNombre(nombre);
                break;
            case 2:
                System.out.println("Ingrese nuevo mail");
                String mail = sc.next();
                u.setCorreo(mail);
                break;
            case 3:
                System.out.println("Ingrese nuevo apellido:");
                String apellido = sc.next();
                u.setApellido(apellido);
                break;
            case 4:
                break;
        }
    }




    }







}
