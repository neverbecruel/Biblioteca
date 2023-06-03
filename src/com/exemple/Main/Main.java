package com.exemple.Main;

import com.exemple.Library.Livro;

public class Main {
    public static void main(String[] args){
        Livro livro = new Livro("Sherlock", "Sir Arthur Conan Doyle", 1980);
        livro.getInfo();
    }
}
