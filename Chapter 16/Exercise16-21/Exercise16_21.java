/*
Name: Robert Riddle
Date: 08/10/2024

 This program creates a a timer using input from the user in the form of a text field, once the user hits enter
 the number that they typed into the textfield will begin the timeline animation and once the number hits zero
 the media file will play 
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.animation.Timeline;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.util.Duration;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

public class Exercise16_21 extends Application {
	protected Media MP3 = new Media ("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3"); // Used to import media file and create an object the media player can use.
	protected MediaPlayer mediaPlayer = new MediaPlayer(MP3); // used to play media that is added to the the program
	
	@Override
	public void start(Stage primaryStage) {
		
		TextField timerCD = new TextField("");
		timerCD.setStyle("-fx-background-color: white ;"
				+ "-fx-text-fill: black;");
		timerCD.setFont(Font.font("Courier new", 50));
		timerCD.setPrefColumnCount(5); // sets windows preferred width
		timerCD.setAlignment(Pos.CENTER); // centers text field in the window
		StackPane sPane = new StackPane(timerCD);
		
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE); // loops the media file to play continuously
		
		// creates animation for count down
		Timeline countDown = new Timeline(new KeyFrame(Duration.millis(1000), e -> {
		timerCD.setText((Integer.parseInt(timerCD.getText()) - 1) + ""); // converts input from textfield and returns them into integers 
		}));

		timerCD.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                if (countDown.getStatus() == Animation.Status.RUNNING) {
                    countDown.stop();
                }
                
            countDown.setCycleCount(Integer.parseInt(timerCD.getText()));
            timerCD.setEditable(false); //line of code that stops user from editing input number while animation is playing
            countDown.play();
            }
            	});
		// when count hits zero will play media
		countDown.setOnFinished(event -> {
			mediaPlayer.play(); // control used to play media file from media player after timer finishes
		});

		
		Scene scene = new Scene(sPane);
		primaryStage.setTitle("CountDownTimer");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String args[] ) {
		launch(args);
	}

}