package classToUse;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;


public class Fan extends Pane {
    //Data fields
    protected Circle c;
    protected Arc[] blades = new Arc[4];
    public double increment = 1;

    //Constructor
    public Fan(double radius) {
        setMinHeight(200);
        setMinWidth(200);
        c = new Circle(100,100,radius,Color.TRANSPARENT);
        c.setStroke(Color.BLACK);

        double bladeRadius = radius * 0.9;
        for (int i = 0; i < blades.length; i++) {
            blades[i] = new Arc(
                    c.getCenterX(), c.getCenterY(), // center point
                    bladeRadius, bladeRadius, // X and Y radius
                    (i * 90) + 30, 35); // start angle and length
            blades[i].setFill(Color.RED);
            blades[i].setType(ArcType.ROUND);
        }

        getChildren().addAll(c);
        getChildren().addAll(blades);
    }

    //Methods
    public void spin() {
        for (Arc blade : blades) {
            double prevStartAngle = blade.getStartAngle();
            blade.setStartAngle(prevStartAngle + increment);
        }
    }

}
