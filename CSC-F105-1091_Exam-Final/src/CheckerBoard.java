//************************************************************************
// Checkerboard.java    Author: Lewis/Loftus
//
// Solution to Programming Project 6.12
//************************************************************************

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;

public class CheckerBoard extends Application{

	//--------------------------------------------------------------------
	// Displays an 8 x 8 CheckerBoard with squares alternating black
	// and white.
	//--------------------------------------------------------------------

	public void start(Stage primaryStage){
		final int CELL_SIZE = 50;

		int x, y;
		Color cellColor = Color.WHITE;

		Group root = new Group();

		for (int row = 1; row <= 8; row++){
			y = row * CELL_SIZE;

			if (cellColor == Color.WHITE)
				cellColor = Color.BLACK;
			else
				cellColor = Color.WHITE;

			for (int col = 1; col <= 8; col++){
				x = col * CELL_SIZE;

				Circle circ = new Circle(x, y, 25);
				circ.setFill(cellColor);

				root.getChildren().add(circ);

				if (cellColor == Color.WHITE)
					cellColor = Color.BLACK;
				else
					cellColor = Color.WHITE;
      }
    }

		Scene scene = new Scene(root, 500, 500, Color.BEIGE);

		primaryStage.setTitle("Checkerboard");
		primaryStage.setScene(scene);
		primaryStage.show();
  }

	public static void main(String[] args){
		launch(args);
  }
}
