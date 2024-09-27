/*
Name: Robert Riddle
Date: 09/26/2024

The program creates a red stop sign using JavaFX to create a polygon image with text 
overlaid and displays it to the user
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class ShowPolygon extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		/* creates a polygon and places polygon to the pane as well as Places
		 the nodes on top of each other in the center of the pane.*/
		StackPane stackPane = new StackPane();
		
		Polygon polygon = new Polygon();
		polygon.setStroke(Color.WHITE);
		polygon.setFill(Color.RED);
		polygon.setRotate(22.5);
		ObservableList<Double> list = polygon.getPoints(); 
		final double WIDTH = 400, HEIGHT = 400;
		double centerX = WIDTH / 2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		// Creates the number of points needed to make an Octagon
		for (int i = 0; i < 8; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));
		}
		// creates the text that will be overlaid on the polygon.
		Text text = new Text("STOP");
		text.setFont(Font.font("Arial Narrow",FontWeight.BOLD, 120));
		text.setFill(Color.WHITE);
		
		// adds the polygon and text to the pane
		stackPane.getChildren().addAll(polygon, text);
		
		Scene scene = new Scene(stackPane, WIDTH, HEIGHT);
		primaryStage.setScene(scene);
		primaryStage.setTitle("StopSignDemo");
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}