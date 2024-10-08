import java.util.Calendar;
  import java.util.GregorianCalendar;
  import javafx.scene.layout.Pane;
  import javafx.scene.paint.Color;
  import javafx.scene.shape.Circle;
  import javafx.scene.shape.Line;
  import javafx.scene.text.Text;

  public class ClockPane extends Pane {
    private int hour;
    private int minute;
    private int second;
    // data fields for boolean methods
    private boolean hourHandVisible = true;
    private boolean minuteHandVisible = true;
    private boolean secondHandVisible = true;

    // Constructs a default clock with the current time
    public ClockPane() {
      setCurrentTime();
    }

    // Constructs a clock with specified hour, minute, and second 
    public ClockPane(int hour,int minute,int second) {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
    }

    // Returns hour 
    public int getHour() {
      return hour;
    }

    // Sets a new hour
    public void setHour(int hour) {
      this.hour = hour;
      paintClock();
    }

    // Returns minute
    public int getMinute() {
      return minute;
    }

    // Sets a new minute 
    public void setMinute(int minute) {
      this.minute = minute;
      paintClock();
    }
    
    // Returns second 
    public int getSecond() {
      return second;
    }

   //  Sets a new second 
    public void setSecond(int second) {
     this.second = second;
      paintClock();
    }
 // returns boolean hour value
    public boolean isHourHandVisible() {
        return hourHandVisible;
    }
    // sets boolean hour value
    public void setHourHandVisible(boolean visible) {
        this.hourHandVisible = visible;
        paintClock();
    }
 // returns boolean minute value
    public boolean isMinuteHandVisible() {
        return minuteHandVisible;
    }
    // sets boolean minute value
    public void setMinuteHandVisible(boolean visible) {
        this.minuteHandVisible = visible;
        paintClock();
    }
    // returns boolean second value
    public boolean isSecondHandVisible() {
        return secondHandVisible;
    }
    // sets boolean second value
    public void setSecondHandVisible(boolean visible) {
        this.secondHandVisible = visible;
        paintClock();
    }


    /* Set the current time for the clock */
    public void setCurrentTime() {
      // Construct a calendar for the current date and time
      Calendar calendar = new GregorianCalendar();

      // Set current hour, minute and second
      this.hour = calendar.get(Calendar.HOUR_OF_DAY);
      this.minute = calendar.get(Calendar.MINUTE);
      this.second = calendar.get(Calendar.SECOND);

      paintClock(); // Repaint the clock
    }

    /** Paint the clock */
    private void paintClock() {
      // Initialize clock parameters
      double clockRadius =
        Math.min(getWidth(), getHeight()) * 0.8 * 0.5;
      double centerX = getWidth() /2;
      double centerY = getHeight() /2;

      // Draw circle
      Circle circle = new Circle(centerX, centerY, clockRadius);
      circle.setFill(Color.WHITE);
      circle.setStroke(Color.BLACK);
      Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
      Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
      Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
      Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");

      // Draw second hand

      double sLength = clockRadius * 0.8;
      double secondX = centerX + sLength *
        Math.sin(second * (2 * Math.PI / 60));
      double secondY = centerY - sLength *
        Math.cos(second * (2 * Math.PI / 60));
      Line sLine = new Line(centerX, centerY, secondX, secondY);
      sLine.setStroke(Color.RED);
      
      // Draw minute hand
      double mLength = clockRadius * 0.65;
      double xMinute = centerX + mLength *
        Math.sin(minute * (2 * Math.PI / 60));
      double minuteY = centerY - mLength *
        Math.cos(minute * (2 * Math.PI / 60));
      Line mLine = new Line(centerX, centerY, xMinute, minuteY);
      mLine.setStroke(Color.BLUE);

      // Draw hour hand
      double hLength = clockRadius *  0.5;
      double hourX = centerX + hLength *
        Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
      double hourY = centerY - hLength *
        Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
      Line hLine = new Line(centerX, centerY, hourX, hourY);
      hLine.setStroke(Color.GREEN);

      getChildren().clear();
      getChildren().addAll(circle, t1, t2, t3, t4);
      if (hourHandVisible)
    	  getChildren().add(hLine);
      if(minuteHandVisible)
    	  getChildren().add(mLine);
      if (secondHandVisible)
    	  getChildren().add(sLine);
    }
    

    @Override
    public void setWidth(double width) {
      super.setWidth(width);
      paintClock();
    }

    @Override
    public void setHeight(double height) {
      super.setHeight(height);
      paintClock();
    }
  }