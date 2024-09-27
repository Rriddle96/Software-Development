/*
 Name: Robert Riddle
 Date: 09/27/2024
 
 This program tests and uses a modified Clockpane class to create a clock
 that only shows the hour and minute hand, it also generates random values
 for the hour and minute.
 
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Random;

public class DisplayClock extends Application {
    @Override
    public void start(Stage primaryStage) {
        ClockPane clock = new ClockPane();
        
        // Generates random hour (0-11) and minute (0 or 30)
        Random random = new Random();
        int hour = random.nextInt(12); // 0 to 11
        int minute = random.nextBoolean() ? 0 : 30; // 0 or 30

        clock.setHour(hour);
        clock.setMinute(minute);
        clock.setSecondHandVisible(false); // Hides second hand

        // Set up the stage
        Scene scene = new Scene(clock, 400, 400);
        primaryStage.setTitle("Test Clock Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
