package com.exemple.Library;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livrosDisponiveis;


    public Biblioteca(){
        livrosDisponiveis = new ArrayList<>();
    }

    public void adcionarLivro(Livro livro){
        livrosDisponiveis.add(livro);
    }
    public void removerLivro(Livro livro) {
        livrosDisponiveis.remove(livro);
    }
    public Livro buscarLivroPorTitulo(String titulo){
        for (Livro livro : livrosDisponiveis){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }return null;
    }
    public void listarLivrosDisponiveis(){
        for (Livro livro : livrosDisponiveis){
            if (livro.getDisponibilidade()){
                System.out.println(livro.getTitulo());
        }
    }
        System.out.println("-=-=-=-=-=-=-=-=-");
}}
