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

}
