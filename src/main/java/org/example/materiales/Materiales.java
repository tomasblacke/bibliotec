package org.example.materiales;

public abstract class Materiales {
    private String titulo;
    private String autor;
    private String fechaDePublicacion;
    public enum estado{
        DISPONIBLE,
        PRESTADO,
        EN_REPARECIO,
        EN_SALA;
    }
    private estado estado;

    public Materiales(String titulo, String autor, String fechaDePublicacion, estado estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaDePublicacion = fechaDePublicacion;
        this.estado= estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(String fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public Materiales.estado getEstado() {
        return estado;
    }

    public void setEstado(Materiales.estado estado) {
        this.estado = estado;
    }
}
