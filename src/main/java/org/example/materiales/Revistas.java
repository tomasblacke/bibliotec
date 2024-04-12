package org.example.materiales;

public class Revistas extends Materiales{
    private int nroEdicion;

    public Revistas(String titulo, String autor, String fechaDePublicacion,estado estado, int nroEdicion) {
        super(titulo, autor, fechaDePublicacion,estado);
        this.nroEdicion = nroEdicion;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }
}
