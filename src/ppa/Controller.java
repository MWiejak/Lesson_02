package ppa;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    protected Circle leftCircle;

    @FXML
    protected Circle rightCircle;
    @FXML
    protected Button button;

    protected boolean leftPosition;
    

    public void initialize() {
        leftCircle.setFill(Color.RED);
        rightCircle.setFill(Color.BLUE);
        leftPosition = true;
        
        EventHandler <MouseEvent> left = new EventHandler<MouseEvent>() {
        	@Override
        	public void handle(MouseEvent e) {
        		leftCircle.setFill(Color.GREEN);
        	}	
        };
        leftCircle.addEventFilter(MouseEvent.MOUSE_CLICKED, left);
        
        EventHandler <MouseEvent> right = new EventHandler<MouseEvent>() {
        	@Override
        	public void handle(MouseEvent e) {
        		rightCircle.setFill(Color.GREEN);
        	}	
        };
        rightCircle.addEventFilter(MouseEvent.MOUSE_CLICKED, right);
        
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
        	@Override
        	public void handle(MouseEvent e) {
                Paint leftFill = leftCircle.getFill();
                if (leftPosition) {
                    leftCircle.setFill(Color.GREEN);
                    rightCircle.setFill(Color.RED);
                    leftPosition = false;
                } else {
                    leftCircle.setFill(Color.BLUE);
                    rightCircle.setFill(Color.GREEN);
                    leftPosition = true;
                }
        	}
        }
        );
        
    }

//    public void changeColor(ActionEvent actionEvent) {
//        Paint leftFill = leftCircle.getFill();
//        if (leftPosition) {
//            leftCircle.setFill(Color.BLUE);
//            rightCircle.setFill(Color.RED);
//            leftPosition = false;
//        } else {
//            leftCircle.setFill(Color.RED);
//            rightCircle.setFill(Color.BLUE);
//            leftPosition = true;
//        }
//    }
    
    
    
}