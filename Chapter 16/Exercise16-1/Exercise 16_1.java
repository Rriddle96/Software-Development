import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class TextMover extends Application {
	protected Text text = new Text("Programming is fun");
	
	@Override
	public void start(Stage primaryStage) {	
	BorderPane pane = new BorderPane();
	
	HBox paneForButtons = new HBox(20);
	Button btLeft = new Button("<-");
	Button btRight = new Button("->");
	paneForButtons.getChildren().addAll(btLeft, btRight);
	paneForButtons.setAlignment(Pos.CENTER);
	pane.setBottom(paneForButtons);
	
	Pane paneForText = new Pane();
	paneForText.setStyle("-fx-background-color: lightgray;"
			+ "-fx-border-color: black;");
	text.setFont(Font.font("Trebuchet MS", 30));
	paneForText.getChildren().add(text);
	pane.setCenter(paneForText);
	text.setX(100);
	text.setY(80);
	
	// actions to move the text left or right
	btLeft.setOnAction(e -> {
        if (text.getX() > 10) { // Checks boundary
            text.setX(text.getX() - 10);
        } else {
            text.setX(0); // Keeps text at the edge
        }
    });
	btRight.setOnAction(e -> {
        double paneWidth = paneForText.getWidth();
        double textWidth = text.getLayoutBounds().getWidth();
        
        if (text.getX() < paneWidth - textWidth - 10) { // Checks boundary
            text.setX(text.getX() + 10);
        } else {
            text.setX(paneWidth - textWidth); // Keeps text at the edge
        }
    });
	
	
	HBox paneForRadioButtons = new HBox(20);
	RadioButton rbRed = new RadioButton("RED");
	RadioButton rbYellow = new RadioButton("YELLOW");
	RadioButton rbBlack = new RadioButton("BLACK");
	RadioButton rbOrange = new RadioButton("ORANGE");
	RadioButton rbGreen = new RadioButton("GREEN");
	
	ToggleGroup group = new ToggleGroup();
	rbRed.setToggleGroup(group);
	rbYellow.setToggleGroup(group);
	rbBlack.setToggleGroup(group);
	rbOrange.setToggleGroup(group);
	rbGreen.setToggleGroup(group);
	paneForRadioButtons.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);
	paneForRadioButtons.setAlignment(Pos.CENTER);
	pane.setTop(paneForRadioButtons);
	
	// Changes the color of text using an if statement to change color fill
	rbRed.setOnAction(e -> {
		if (rbRed.isSelected()) {
			text.setFill(Color.RED);
		}
	});
	rbYellow.setOnAction(e -> {
		if (rbYellow.isSelected()) {
			text.setFill(Color.YELLOW);
		}
	});
	rbBlack.setOnAction(e -> {
		if (rbBlack.isSelected()) {
			text.setFill(Color.BLACK);
		}
	});
	rbOrange.setOnAction(e -> {
		if (rbOrange.isSelected()) {
			text.setFill(Color.ORANGE);
		}
	});
	rbGreen.setOnAction(e -> {
		if (rbGreen.isSelected()) {
			text.setFill(Color.GREEN);
		}
	});
	
	Scene scene = new Scene(pane, 450, 200); // sets window display size
	primaryStage.setScene(scene);
	primaryStage.show();
	
	
	}
	public static void main(String args[] ) {
		launch(args);
	}
	
}