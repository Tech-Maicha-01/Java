import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ToolTipDemo extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        VBox root=new VBox(20);
        Button button=new Button("Hover over me");
        Tooltip tip=new Tooltip("This a a hovering message");
        button.setTooltip(tip);
        root.getChildren().addAll(button);
        Scene scene=new Scene(root,400,300);
        primaryStage.setTitle("This is a new scene");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch();
    }
}