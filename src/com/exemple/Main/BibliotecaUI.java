package com.exemple.Main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BibliotecaUI extends Application {
    private TextField tituloField;
    private TextField autorField;
    private TextField anoField;
    private TextArea displayArea;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Biblioteca");

        // Painel de entrada
        GridPane inputPane = new GridPane();
        inputPane.setPadding(new Insets(10, 10, 10, 10));
        inputPane.setVgap(5);
        inputPane.setHgap(5);

        Label tituloLabel = new Label("Título:");
        tituloField = new TextField();
        inputPane.add(tituloLabel, 0, 0);
        inputPane.add(tituloField, 1, 0);

        Label autorLabel = new Label("Autor:");
        autorField = new TextField();
        inputPane.add(autorLabel, 0, 1);
        inputPane.add(autorField, 1, 1);

        Label anoLabel = new Label("Ano:");
        anoField = new TextField();
        inputPane.add(anoLabel, 0, 2);
        inputPane.add(anoField, 1, 2);

        Button addButton = new Button("Adicionar Livro");
        inputPane.add(addButton, 1, 3);

        // Área de exibição
        displayArea = new TextArea();
        displayArea.setEditable(false);

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10, 10, 10, 10));
        vbox.getChildren().addAll(inputPane, displayArea);

        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Listener para o botão
        addButton.setOnAction(e -> adicionarLivro());
    }

    private void adicionarLivro() {
        String titulo = tituloField.getText();
        String autor = autorField.getText();
        String ano = anoField.getText();
        displayArea.appendText("Título: " + titulo + ", Autor: " + autor + ", Ano: " + ano + "\n");
        tituloField.clear();
        autorField.clear();
        anoField.clear();
    }
}
