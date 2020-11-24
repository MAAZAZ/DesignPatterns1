/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzcoffee;

import composant.Boisson;
import composant.Colombia;
import composant.Deca;
import composant.Expresso;
import composant.Sumatra;
import decorateur.Caramel;
import decorateur.Chantilly;
import decorateur.Chocolat;
import decorateur.Lait;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author MAAZAZ
 */
public class StarBuzzCoffee extends Application {
    
     private BorderPane root=new BorderPane();
     private Boisson boisson;
    
    @Override
    public void start(Stage primaryStage) {
        
        VBox main=new VBox();
        HBox boxcomposants=new HBox();
        HBox boxdecorators=new HBox();
        HBox boxaffichage=new HBox();
        
        Button boisson1 = new Button();
        Button boisson2 = new Button();
        Button boisson3 = new Button();
        Button boisson4 = new Button();
        
        Label lbl1= new Label("Vous avez demandé :");
        Label lbl2 = new Label("Prix :");
        TextField t1 = new TextField();
        t1.setPrefSize(400,100);
        t1.setPadding(new Insets(1,1,1,1));
        TextField t2 = new TextField();
        
        Button confirmer = new Button();
        confirmer.setText("Confirmer");
        confirmer.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                t1.setDisable(true);
                t2.setDisable(true);
            }
        });
        
        Button annuler = new Button();
        annuler.setText("Annuler");
        annuler.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                t1.setText("");
                t2.setText("");
            }
        });
        
        boisson1.setText("Espresso");
        boisson1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                boisson= new Expresso();
                t1.setText(boisson.getDescription());
                t2.setText(""+boisson.cout());
            }
        });
        
        boisson2.setText("Sumatra");
        boisson2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                boisson= new Sumatra();
                 t1.setText(boisson.getDescription());
                 t2.setText(""+boisson.cout());
            }
        });
        
        boisson3.setText("Colombia");
        boisson3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                boisson= new Colombia();
                 t1.setText(boisson.getDescription());
                 t2.setText(""+boisson.cout());
            }
        });
        
        boisson4.setText("Deca");
        boisson4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                boisson= new Deca();
                t1.setText(boisson.getDescription());
                t2.setText(""+boisson.cout());
            }
        });
        boxcomposants.getChildren().addAll(boisson1,boisson2,boisson3,boisson4);
        boxcomposants.setPadding(new Insets(30));
        boxcomposants.setSpacing(10);
        
        Button decor1 = new Button();
        Button decor2 = new Button();
        Button decor3 = new Button();
        Button decor4 = new Button();
        
        decor1.setText("Lait");
        decor1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                if(boisson!=null){
                    boisson= new Lait(boisson);
                    t1.setText(boisson.getDescription());
                    t2.setText(""+boisson.cout());   
                }
            }
        });
        
        decor2.setText("Chocolat");
        decor2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                if(boisson!=null){
                    boisson= new Chocolat(boisson);
                     t1.setText(boisson.getDescription());
                     t2.setText(""+boisson.cout());
                }
            }
        });
        
        decor3.setText("Chantilly");
        decor3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                if(boisson!=null){
                    boisson= new Chantilly(boisson);
                     t1.setText(boisson.getDescription());
                     t2.setText(""+boisson.cout());
                }
            }
        });
        
        decor4.setText("Caramel");
        decor4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                if(boisson!=null){
                    boisson= new Caramel(boisson);
                     t1.setText(boisson.getDescription());
                     t2.setText(""+boisson.cout());
                }
            }
        });
        boxdecorators.getChildren().addAll(decor1,decor2,decor3,decor4);
        boxdecorators.setPadding(new Insets(30));
        boxdecorators.setSpacing(10);
        
        GridPane grid = new GridPane();
        grid.add(lbl1, 0, 0);
        grid.add(t1, 0, 1);
        grid.add(lbl2, 1, 0);
        grid.add(t2, 1, 1);
        grid.add(annuler, 3,1);
        grid.add(confirmer,2,1);
        grid.setVgap(10);
        grid.setHgap(10);
        
        boxaffichage.getChildren().add(grid);
        boxaffichage.setPadding(new Insets(30));
        boxaffichage.setSpacing(10);
        
        main.getChildren().addAll(boxcomposants, boxdecorators, boxaffichage);
        
        StackPane root = new StackPane();
        root.getChildren().add(main);
        
        Scene scene = new Scene(root,850, 300);
        
        primaryStage.setTitle("StarBuzz Coffee");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
