/*
Name: Robert Riddle
Date: 1/10/2024

This program creates an animation of a rectangle moving around the corners of a pentagon
while also fading in and out.
 */
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.FadeTransition; // needed for fading effect

public class ObjectAnimation extends Application{
	@Override
	public void start(Stage primaryStage) {
	
		Pane pane = new Pane();
		// changes the panes color
		pane.setStyle("-fx-background-color: #e09d26");
		
		Polygon polygon = new Polygon();
		
		// creates pentagon with five points
		polygon.getPoints().addAll(new Double[] {
				300.0, 40.0,
				450.0, 150.0,
				380.0, 300.0,
				225.0, 300.0,
				150.0, 150.0
				
			});
			    
		// colors the pentagon
		polygon.setFill(Color.rgb(189, 84, 0));
	    
		// creates the rectangle whit proper dimensions
		Rectangle rectangle = new Rectangle(0, 0, 30, 100);
		rectangle.setFill(Color.rgb(0, 179, 91)); // colors rectangle

		// creates the fading effect for rectangle
		FadeTransition fade = new FadeTransition(Duration.millis(6000), rectangle);
		fade.setFromValue(1.0);
		fade.setToValue(0.1);
		fade.setDuration(Duration.millis(500));
		fade.setCycleCount(Timeline.INDEFINITE);
		fade.setAutoReverse(true);
		fade.play();
		
		// adds the objects in order
		pane.getChildren().add(polygon);
		pane.getChildren().add(rectangle);
		
		// creates the path that the rectangle follows
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.seconds(3));
		pt.setPath(polygon);
		pt.setNode(rectangle);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.play();
		
		// listeners used to pause and play animation
		polygon.setOnMousePressed(e -> pt.pause());
		polygon.setOnMouseReleased(e -> pt.play());
		
		Scene scene = new Scene(pane, 600, 400);
		primaryStage.setTitle("DEMO");
		primaryStage.setScene(scene);
		primaryStage.show();


		
	}
	

    public static void main(String[] args) {
        launch(args);
    }

}
