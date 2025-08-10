import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class awt22 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Hover me!");

        // Create a Tooltip and attach it to the button
        Tooltip tip = new Tooltip("This is a helpful tooltip message");
        btn.setTooltip(tip);

        VBox root = new VBox(20, btn);
        root.setStyle("-fx-padding: 30; -fx-alignment: center;");

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Tooltip Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
