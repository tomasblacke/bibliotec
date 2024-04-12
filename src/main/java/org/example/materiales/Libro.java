package org.example.materiales;

public class Libro extends Materiales{
    private int nroPaginas;

    public Libro(String titulo, String autor, String fechaDePublicacion,estado estado, int nroPaginas) {
        super(titulo, autor, fechaDePublicacion,estado);
        this.nroPaginas = nroPaginas;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }
}
