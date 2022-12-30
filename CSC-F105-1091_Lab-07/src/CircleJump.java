import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleJump extends Application {
	
	public void start(Stage primaryStage){
		Button button = new Button("Push Me!");
		Circle circle = new Circle(100, 150, 50);
		
		Group root = new Group(button, circle);
		
		Scene scene = new Scene(root, 400, 600);
		
		primaryStage.setTitle("CircleJump");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
