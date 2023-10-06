package com.example.reciclarview;

public class Filme {
    private String titulo;
    private String genero;
    private String ano;

    public Filme(String titulo, String ano, String genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;



    } // Fim Construtor

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
