package org.example;
import org.example.Biblioteca;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarUsuarios();
        biblioteca.agregarMateriales();
        biblioteca.mostrarUsuarios();




    }
}