import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class House extends Application
{
	public void start (Stage primaryStage)
	{
		//house
		Rectangle base =  new Rectangle(200, 500, 640, 220);
		base.setFill(Color.PALEGOLDENROD);
		base.setStroke(Color.BLACK);
		base.setStrokeWidth(3);
		
			//garage
		Rectangle garagebase = new Rectangle(840, 560, 200, 160);
		garagebase.setFill(Color.PALEGOLDENROD);
		garagebase.setStroke(Color.BLACK);
		garagebase.setStrokeWidth(3);
				//garagedoor
		Rectangle garagedoor = new Rectangle(860, 580, 160, 420);
		garagedoor.setFill(Color.LIGHTGOLDENRODYELLOW);
		garagedoor.setStroke(Color.BLACK);
		garagedoor.setStrokeWidth(3);
				//garagedoorwindows
		Rectangle garagedoorwindow1 = new Rectangle(867, 590, 25, 25);
		garagedoorwindow1.setFill(Color.YELLOW);
		garagedoorwindow1.setStroke(Color.BLACK);
		garagedoorwindow1.setStrokeWidth(2);
		Rectangle garagedoorwindow2 = new Rectangle(907, 590, 25, 25);
		garagedoorwindow2.setFill(Color.YELLOW);
		garagedoorwindow2.setStroke(Color.BLACK);
		garagedoorwindow2.setStrokeWidth(2);
		Rectangle garagedoorwindow3 = new Rectangle(947, 590, 25, 25);
		garagedoorwindow3.setFill(Color.YELLOW);
		garagedoorwindow3.setStroke(Color.BLACK);
		garagedoorwindow3.setStrokeWidth(2);
		Rectangle garagedoorwindow4 = new Rectangle(987, 590, 25, 25);
		garagedoorwindow4.setFill(Color.YELLOW);
		garagedoorwindow4.setStroke(Color.BLACK);
		garagedoorwindow4.setStrokeWidth(2);
		
		
			//chimney
		Rectangle chimney1 = new Rectangle(720, 450, 70, 50);
		chimney1.setFill(Color.MAROON);
		chimney1.setStroke(Color.BLACK);
		chimney1.setStrokeWidth(2);
		Rectangle chimney2 = new Rectangle(715, 440, 80, 20);
		chimney2.setFill(Color.LIGHTSLATEGREY);
		chimney2.setStroke(Color.BLACK);
		chimney2.setStrokeWidth(2);
		
			//chimneysmoke
		Circle smoke1 = new Circle(755, 440, 35);
		smoke1.setFill(Color.WHITESMOKE);
		smoke1.setStroke(Color.BLACK);
		smoke1.setStrokeWidth(2);
		Circle smoke2 = new Circle(795, 390, 50);
		smoke2.setFill(Color.WHITESMOKE);
		smoke2.setStroke(Color.BLACK);
		smoke2.setStrokeWidth(2);
		Circle smoke3 = new Circle(855, 330, 85);
		smoke3.setFill(Color.WHITESMOKE);
		smoke3.setStroke(Color.BLACK);
		smoke3.setStrokeWidth(2);
		Circle smoke4 = new Circle(915, 310, 115);
		smoke4.setFill(Color.WHITESMOKE);
		smoke4.setStroke(Color.BLACK);
		smoke4.setStrokeWidth(2);
		Circle smoke5 = new Circle(1040, 290, 145);
		smoke5.setFill(Color.WHITESMOKE);
		smoke5.setStroke(Color.BLACK);
		smoke5.setStrokeWidth(2);
		Circle smoke6 = new Circle(1160, 280, 185);
		smoke6.setFill(Color.WHITESMOKE);
		smoke6.setStroke(Color.BLACK);
		smoke6.setStrokeWidth(2);
		Circle smoke7 = new Circle(1280, 275, 200);
		smoke7.setFill(Color.WHITESMOKE);
		smoke7.setStroke(Color.BLACK);
		smoke7.setStrokeWidth(2);
		
			//windows
		Rectangle window1 = new Rectangle(260, 550, 45, 130);
		window1.setFill(Color.YELLOW);
		window1 .setStroke(Color.BLACK);
		window1.setStrokeWidth(2);
		Rectangle window2 = new Rectangle(315, 540, 90, 150);
		window2.setFill(Color.YELLOW);
		window2.setStroke(Color.BLACK);
		window2.setStrokeWidth(2);
		Rectangle window3 = new Rectangle(415, 550, 45, 130);
		window3.setFill(Color.YELLOW);
		window3 .setStroke(Color.BLACK);
		window3.setStrokeWidth(2);
				//windowsill
		Rectangle windowsill = new Rectangle(305, 690, 110, 20);
		windowsill.setFill(Color.LIGHTGOLDENRODYELLOW);
		windowsill.setStroke(Color.BLACK);
		windowsill.setStrokeWidth(2);
		
		//doors
		Rectangle door1 = new Rectangle(620, 613, 50, 107);
		door1.setFill(Color.SADDLEBROWN);
		door1.setStroke(Color.BLACK);
		door1.setStrokeWidth(2);
		Rectangle door2 = new Rectangle(670, 613, 50, 107);
		door2.setFill(Color.SADDLEBROWN);
		door2.setStroke(Color.BLACK);
		door2.setStrokeWidth(2);
			//doorknobs
		Circle doorknob1 = new Circle(657, 663, 5);
		doorknob1.setFill(Color.GOLD);
		doorknob1.setStroke(Color.BLACK);
		doorknob1.setStrokeWidth(2);
		Circle doorknob2 = new Circle(682, 663, 5);
		doorknob2.setFill(Color.GOLD);
		doorknob2.setStroke(Color.BLACK);
		doorknob2.setStrokeWidth(2);
			//doorhead
		Rectangle doorhead = new Rectangle(615, 603, 110, 20);
		doorhead.setFill(Color.LIGHTGOLDENRODYELLOW);
		doorhead.setStroke(Color.BLACK);
		doorhead.setStrokeWidth(2);
		
		//clouds
			//cloud1
		Circle cloud1p1 = new Circle(80, 320, 130);
		cloud1p1.setFill(Color.MEDIUMSLATEBLUE);
		Circle cloud1p2 = new Circle(200, 300, 150);
		cloud1p2.setFill(Color.MEDIUMSLATEBLUE);
		Circle cloud1p3 = new Circle(340, 350, 100);
		cloud1p3.setFill(Color.MEDIUMSLATEBLUE);
			//cloud2
		Circle cloud2p1 = new Circle(480, 50, 80);
		cloud2p1.setFill(Color.MEDIUMSLATEBLUE);
		Circle cloud2p2 = new Circle(600, 0, 130);
		cloud2p2.setFill(Color.MEDIUMSLATEBLUE);
		Circle cloud2p3 = new Circle(740, 20, 110);
		cloud2p3.setFill(Color.MEDIUMSLATEBLUE);
		
		//groups
		Group garage = new Group(garagebase, garagedoor, garagedoorwindow1, garagedoorwindow2, garagedoorwindow3, garagedoorwindow4);
		
		Group chimneysmoke = new Group(smoke7, smoke6, smoke5, smoke4, smoke3, smoke2, smoke1);
		
		Group house = new Group(garage, base, chimneysmoke, chimney1, chimney2, window1, window2, window3, windowsill);
		
		Group doors = new Group(door1, door2, doorhead, doorknob1, doorknob2);
		
		Group clouds = new Group(cloud1p1, cloud1p2, cloud1p3, cloud2p1, cloud2p2, cloud2p3);
		
		Group root = new Group(clouds, house, doors);
		Scene scene = new Scene(root, 1280, 720, Color.MIDNIGHTBLUE);
		
		primaryStage.setTitle("Lab6");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
