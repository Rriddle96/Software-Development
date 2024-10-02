/* 
Name: Robert Riddle
Date: 09/30/2024

This program creates a circle in JavaFX and also allows the user to move it by pressing one of 
the four buttons in the JavaFX screen, The circle's movement is also check by two if statements 
to see if it is near the bounds of the window screens.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class MoveCircle extends Application {

    private Circle circle = new Circle(30); // Set an initial radius
    
    private BorderPane pane = new BorderPane(); // Use the same pane for the layout

    @Override
    public void start(Stage primaryStage) {
    	
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        
        // Center the circle in the pane
        circle.setCenterX(0);
        circle.setCenterY(0);
        

        Button btUp = new Button("Up ");
        btUp.setOnAction(e -> moveCircle(0, -10)); // Move up

        Button btDown = new Button("Down ");
        btDown.setOnAction(e -> moveCircle(0, 10)); // Move down

        Button btLeft = new Button("Left ");
        btLeft.setOnAction(e -> moveCircle(-10, 0)); // Move left

        Button btRight = new Button("Right ");
        btRight.setOnAction(e -> moveCircle(10, 0)); // Move right

        HBox buttons = new HBox(btUp, btDown, btLeft, btRight);
        buttons.setAlignment(Pos.BOTTOM_CENTER);
        buttons.setSpacing(30);
        buttons.setPadding(new Insets(20, 20, 20, 20));

        pane.setCenter(circle);
        pane.setBottom(buttons);
        
        pane.setStyle("-fx-background-color: #00848c");

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Move the Circle");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Resize listener
        pane.widthProperty().addListener(ov -> resize());
        pane.heightProperty().addListener(ov -> resize());

        // Initial resize to set the correct radius
        resize();
    }

    private void moveCircle(double deltaX, double deltaY) {
        double newX = circle.getTranslateX() + deltaX;
        double newY = circle.getTranslateY() + deltaY;

        // Calculate boundaries
        double radius = circle.getRadius();
        double paneWidth = pane.getWidth();
        double paneHeight = pane.getHeight();

        // Check boundaries to prevent leaving the window
        if (newX + radius <= paneWidth / 2 && newX - radius >= -paneWidth / 2) {
            circle.setTranslateX(newX);
        }
        if (newY + radius <= paneHeight / 2 && newY - radius >= -paneHeight / 2) {
            circle.setTranslateY(newY);
        }
    }

    private void resize() {
        double length = Math.min(pane.getWidth(), pane.getHeight());
        circle.setRadius(length / 15); // Set circle radius based on window size

        // Optional: Centers the circle when resized
       // circle.setTranslateX(0);
       // circle.setTranslateY(0);
    }

    public static void main(String[] args) {
        launch(args);
    }
}