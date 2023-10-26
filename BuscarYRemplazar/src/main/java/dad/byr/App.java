package dad.byr;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Buscar y Reemplazar :)");

        Label buscarLabel = new Label("Buscar:");
        TextField buscarTextField = new TextField();
        Label reemplazarLabel = new Label("Reemplazar con:");
        TextField reemplazarTextField = new TextField();

        CheckBox mayusculasCheckbox = new CheckBox("Mayúsculas y minúsculas");
        CheckBox buscarAtrasCheckbox = new CheckBox("Buscar hacia atrás");
        CheckBox expresionRegularCheckbox = new CheckBox("Expresión regular");
        CheckBox resaltarResultadosCheckbox = new CheckBox("Resaltar resultados");

        Button buscarButton = new Button("Buscar");
        Button reemplazarButton = new Button("Reemplazar");
        Button reemplazarTodoButton = new Button("Reemplazar todo");
        Button cerrarButton = new Button("Cerrar");
        Button ayudaButton = new Button("Ayuda");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        grid.add(buscarLabel, 0, 0);
        grid.add(reemplazarLabel, 0, 1);
        grid.add(mayusculasCheckbox, 0, 2);
        grid.add(expresionRegularCheckbox, 0, 3);

        grid.add(buscarTextField, 1, 0);
        grid.add(reemplazarTextField, 1, 1);
        grid.add(buscarAtrasCheckbox, 1, 2);
        grid.add(resaltarResultadosCheckbox, 1, 3);

        grid.add(buscarButton, 2, 0);
        grid.add(reemplazarButton, 2, 1);
        grid.add(reemplazarTodoButton, 2, 2);
        grid.add(cerrarButton, 2, 3);
        grid.add(ayudaButton, 2, 4);

        Scene scene = new Scene(grid, 600, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


