package org.example;
import org.example.Biblioteca;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarUsuarios();
        biblioteca.agregarMateriales();
        int opcionMenu;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Elija una opcion");
            System.out.println("1-Mostrar Usuarios en la biblioteca");
            System.out.println("2-Actualizar Datos en la biblioteca");
            System.out.println("3-Pedir Prestamo");
            System.out.println("4-Devolver Prestamo");
            System.out.println("5-Materiales Prestados");
            System.out.println("99-Salir ");
        opcionMenu = scanner.nextInt();
        switch (opcionMenu){

            case 1:
                    biblioteca.mostrarUsuarios();
                    break;
            case 2:
                    biblioteca.mostrarUsuarioAndCambiar();
                    break;
            case 3:
                    biblioteca.prestarMateriales();
                    break;
        }



        }while (opcionMenu !=99);




    }
}