package org.example.materiales;

public class DVDS extends Materiales{
    private int duracion;

    public DVDS(String titulo, String autor, String fechaDePublicacion,estado estado, int duracion) {
        super(titulo, autor, fechaDePublicacion,estado);
        this.duracion = duracion;

    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
