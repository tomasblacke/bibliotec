package org.example.Prestamo;

import org.example.materiales.Materiales;
import org.example.usuario.Usuario;

import java.time.LocalDate;

public class Prestamo {
    private Usuario usuario;
    private Materiales material;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private int idPrestamo=0;//cada prestamo debe tener su id para trackear

    public Prestamo(Usuario usuario, Materiales material, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.usuario = usuario;
        this.material = material;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.idPrestamo=idPrestamo++;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Materiales getMaterial() {
        return material;
    }

    public void setMaterial(Materiales material) {
        this.material = material;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
            this.fechaDevolucion = fechaDevolucion;
    }
    public int getIdPrestamo() {
        return idPrestamo;
    }
}
