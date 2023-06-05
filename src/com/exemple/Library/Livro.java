package com.exemple.Library;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponibilidade = true;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(){
        this.titulo = titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(){
        this.autor = autor;
    }
    public int getAno(){
        return this.ano;
    }
    public void setAno(){
        this.ano = ano;
    }
    public boolean getDisponibilidade(){
        return this.disponibilidade;
    }
    public void setDisponibilidade(){
        this.disponibilidade = disponibilidade;
    }
    public void getInfo(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + ano);
        System.out.println("Disponibilidade: " + disponibilidade);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
    }

}

