import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class awt20 extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create components
        Label lbl1 = new Label("First number:");
        TextField tf1 = new TextField();

        Label lbl2 = new Label("Second number:");
        TextField tf2 = new TextField();

        Label lblResult = new Label("Result:");
        TextField tfResult = new TextField();
        tfResult.setEditable(false);

        Button btnAdd = new Button("Add");

        // Button action
        btnAdd.setOnAction(e -> {
            try {
                double num1 = Double.parseDouble(tf1.getText());
                double num2 = Double.parseDouble(tf2.getText());
                tfResult.setText(String.valueOf(num1 + num2));
            } catch (NumberFormatException ex) {
                tfResult.setText("Invalid input");
            }
        });

        // Layout
        VBox root = new VBox(10, lbl1, tf1, lbl2, tf2, btnAdd, lblResult, tfResult);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        // Scene
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Add Two Numbers - awt20");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
