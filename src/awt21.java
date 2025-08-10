import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.Desktop;
import java.net.URI;

public class awt21 extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a Hyperlink
        Hyperlink link = new Hyperlink("Visit OpenAI");
        
        // Set action when hyperlink is clicked
        link.setOnAction(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://openai.com"));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        VBox root = new VBox(15, link);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("JavaFX Hyperlink Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}a
