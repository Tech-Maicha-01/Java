import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {
    @Override
    public void start(Stage stage) {
        HBox hbox = new HBox(15); // spacing
        hbox.getChildren().addAll(
            new Button("Left"),
            new Button("Center"),
            new Button("Right")
        );

        Scene scene = new Scene(hbox, 300, 100);
        stage.setTitle("HBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
