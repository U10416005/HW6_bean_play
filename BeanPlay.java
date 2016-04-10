//U10416005ªL«Ø¦t
import javafx.application.Application;
import javafx.animation.*;
import javafx.util.Duration;
import javafx.event.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import java.security.SecureRandom;

public class BeanPlay extends Application{
	@Override
    public void start(Stage primaryStage){
		Scene scene = new Scene(new LinePane(),500,500);
		primaryStage.setTitle("BeanGame");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
}
class LinePane extends Pane{
	public LinePane(){
		Polyline pol = new Polyline();
        pol.getPoints().addAll(
                200d,100d,
                200d,150d,
                95d,282d,
                95d,400d,
                405d,400d,
                405d,282d,
                300d,150d,
                300d,100d
        );
        getChildren().add(pol);
		
		
		Circle cir[] = new Circle[28];
		for(int i=0;i<28;++i){
			cir[i] = new Circle(7);
			if(i==0){
				cir[i].setLayoutX(250);
				cir[i].setLayoutY(150);
			}
			else if(i>0&&i<3){
				cir[i].setLayoutX(235+(i-1)*30);
				cir[i].setLayoutY(172);
			}
			else if(i>=3&&i<6) {
                cir[i].setLayoutX(220d+(i-3)*30);
                cir[i].setLayoutY(194);
            } 
            
            else if(i>=6&&i<10) {
                cir[i].setLayoutX(205+(i-6)*30);
                cir[i].setLayoutY(216);
            }
           
            else if(i>=10&&i<15) {
                cir[i].setLayoutX(190+(i-10)*30);
                cir[i].setLayoutY(238);
            }
           
            else if(i>=15&&i<21) {
                cir[i].setLayoutX(175+(i-15)*30);
                cir[i].setLayoutY(260);
            }
           
            else {
                cir[i].setLayoutX(160+(i-21)*30);
                cir[i].setLayoutY(282);
            }
            getChildren().add(cir[i]);
        }
		
		
		Line li1[] = new Line[7];
		for(int i = 0;i<7;++i){
			li1[i] = new Line(160+i*30,282,160+i*30,400);
			li1[i].setStrokeWidth(7);
			li1[i].setStroke(Color.BLACK);
			getChildren().add(li1[i]);
		}
	    Line li2[]= new Line[8];
		li2[0] = new Line(95,400,160,400);
		li2[0].setStrokeWidth(7);
		getChildren().add(li2[0]);
		for(int i = 1;i<7;++i){
			li2[i] = new Line(160+(i-1)*30,400,190+(i-1)*30,400);
			li2[i].setStrokeWidth(7);
			li2[i].setStroke(Color.GRAY);
			getChildren().add(li2[i]);
		}
		li2[7] = new Line(340,400,405,400);
		li2[7].setStrokeWidth(7);
		getChildren().add(li2[7]);
	}
}