package classToUse;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;

public class Car extends Pane{
    //Data fields
    protected double speed = 1;
    protected double x = 0;
    protected double y = 100;
    protected Circle tireLeft;
    protected Circle tireRight;
    protected Rectangle body;
    protected Polygon head; 
    protected Timeline animation;

    //Constructor
    public Car() {
        drawCar();
        animation = new Timeline(
			new KeyFrame(Duration.millis(50), e -> moveCar()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
    }

    //Methods
    public void drawCar() {
		getChildren().clear();
		body = new Rectangle(x, y - 20, 50, 10);
		head = new Polygon(x + 10, y - 20, x + 20, y - 30, x + 30, 
			y - 30, x + 40, y - 20);
		tireLeft = new Circle(x + 15, y - 5, 5);
		tireRight = new Circle(x + 35, y - 5, 5);

        body.setFill(Color.AQUA);
        head.setFill(Color.BLUE);
        tireLeft.setFill(Color.BLACK);
        tireLeft.setFill(Color.BLACK);

		getChildren().addAll(body, head, tireLeft, tireRight);
    }

    public void stopCar() {
        animation.pause();
    }

    public void startCar() {
        animation.play();
    }

	public void increaseSpeed() {
		animation.setRate(animation.getRate() + 1);
	}

	public void decreaseSpeed() {
		if (animation.getRate() > 0)
        {
            animation.setRate(animation.getRate() - 1);
        }
	}

    public void moveCar() {
        x += speed;
    
        if (x+50 >= getWidth()) {
            x = 0;
        }
        drawCar();
    }

}
