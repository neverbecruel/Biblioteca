package com.exemple.Main;
import com.exemple.Library.Biblioteca;
import com.exemple.Library.Livro;

public class Main {
    public static void main(String[] args){
        Livro Sherlock = new Livro("Sherlock", "Sir Arthur Conan Doyle", 1980);
        Livro Quem_mexeu_no_meu_queijo = new Livro("Quem mexeu no meu queijo?", "Spencer Johnson", 1998);
        Livro DomCasmurro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro Python = new Livro("Aprenda Python 3 do jeito certo", "Zed A.Shawn", 2017);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adcionarLivro(DomCasmurro);
        biblioteca.adcionarLivro(Quem_mexeu_no_meu_queijo);
        biblioteca.adcionarLivro(Sherlock);
        biblioteca.adcionarLivro(Python);
        biblioteca.listarLivrosDisponiveis();
//        biblioteca.removerLivro(DomCasmurro);
//        biblioteca.listarLivrosDisponiveis();
        System.out.println(biblioteca.buscarLivroPorTitulo("sherlock").getDisponibilidade());
        Python.getInfo();
    }
}
