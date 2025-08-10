import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class FlowPaneExample extends Application {
    @Override
    public void start(Stage stage) {
        // Step 2: Choose layout
        FlowPane root = new FlowPane();

        // Step 3: Create UI components
        Button btn = new Button("Click Me");
        Label label = new Label("Hello");

        // Step 4: Add components to layout
        root.getChildren().addAll(btn, label);

        // Step 5: Create scene and attach to stage
        Scene scene = new Scene(root, 400, 200);
        stage.setScene(scene);
        stage.setTitle("My App");

        // Step 6: Add interactivity
        btn.setOnAction(e -> label.setText("You clicked!"));

        // Step 7: Show it
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
