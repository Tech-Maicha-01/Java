import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class awt18 extends Application {
    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10); // horizontal gap
        gridPane.setVgap(10); // vertical gap

        // Adding buttons to specific rows and columns
        gridPane.add(new Button("Button 0,0"), 0, 0);
        gridPane.add(new Button("Button 1,0"), 1, 0);
        gridPane.add(new Button("Button 0,1"), 0, 1);
        gridPane.add(new Button("Button 1,1"), 1, 1);

        Scene scene = new Scene(gridPane, 300, 200);
        stage.setTitle("GridPane Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
