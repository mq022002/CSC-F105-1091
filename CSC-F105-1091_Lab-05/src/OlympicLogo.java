import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class OlympicLogo extends Application {

	public void start(Stage primaryStage){
		Circle blueRing = new Circle(200, 100 , 50);
		blueRing.setStroke(Color.BLUE);
		blueRing.setStrokeWidth(5);
		blueRing.setFill(null);
		
		Circle yellowRing = new Circle(250, 150 , 50);
		yellowRing.setStroke(Color.YELLOW);
		yellowRing.setStrokeWidth(5);
		yellowRing.setFill(null);
		
		Circle blackRing = new Circle(320, 100 , 50);
		blackRing.setStroke(Color.BLACK);
		blackRing.setStrokeWidth(5);
		blackRing.setFill(null);
		
		Circle greenRing = new Circle(390, 150 , 50);
		greenRing.setStroke(Color.GREEN);
		greenRing.setStrokeWidth(5);
		greenRing.setFill(null);
		
		Circle redRing = new Circle(440, 100 , 50);
		redRing.setStroke(Color.RED);
		redRing.setStrokeWidth(5);
		redRing.setFill(null);
		
		Group root = new Group(blueRing, yellowRing, blackRing, greenRing, redRing);
		Scene scene = new Scene(root, 600, 300, Color.WHITE);
		
		primaryStage.setTitle("Olympic Logo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);

	}

}
