import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class awt19 extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        GridPane root=new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        
        
        Label firstno=new Label ("Enter the first number");
        TextField txt1=new TextField();
        
        Label secondno=new Label("Enter the second number");
        TextField txt2=new TextField();
        
        Label result=new Label("Result");
        TextField txt3=new TextField();
        txt3.setEditable(false);
        
        Button button=new Button("Add");
        
        button.setOnAction(e ->
        {
            try
            {
                int num1=Integer.parseInt(txt1.getText());
                int num2=Integer.parseInt(txt2.getText());
                int sum=num1+num2;
                txt3.setText(String.valueOf(sum));
            }
            catch(NumberFormatException ex)
            {
                txt3.setText("Invalid Input");
            }
        });
        
        root.add(firstno,0,0);
        root.add(txt1,1,0);
        
        root.add(secondno,0,1);
        root.add(txt2,1,1);
        
        root.add(button,1,2);
        
        root.add(result,0,3);
        root.add(txt3,1,3);
        
        
        Scene scene=new Scene(root,400,300);
        primaryStage.setTitle("Adding two numbers");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    public static void main(String[] args)
    {
        launch();
    }
}