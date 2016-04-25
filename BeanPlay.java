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
		Pane pane = new Pane();
		Scene scene = new Scene(pane,500,500);
		//Draw the bean game border
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
        pane.getChildren().add(pol);
		
		// write the circle for block
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
            pane.getChildren().add(cir[i]);
        }
		//write the circle for the location to replace by player
		Circle cir2[] = new Circle[8];
		for(int i= 0;i<8;++i){
			cir2[i] = new Circle(7);
			cir2[i].setLayoutX(145+i*30);
			cir2[i].setLayoutY(390);
			cir2[i].setStroke(Color.WHITE);
			cir2[i].setFill(Color.WHITE);
			pane.getChildren().add(cir2[i]);
		}		
		
		//write the line for block
		Line li1[] = new Line[7];
		for(int i = 0;i<7;++i){
			li1[i] = new Line(160+i*30,282,160+i*30,400);
			li1[i].setStrokeWidth(7);
			li1[i].setStroke(Color.BLACK);
			pane.getChildren().add(li1[i]);
		}
		//write the line for location
	    Line li2[]= new Line[8];
		li2[0] = new Line(95,400,160,400);
		li2[0].setStrokeWidth(7);
		pane.getChildren().add(li2[0]);
		for(int i = 1;i<7;++i){
			li2[i] = new Line(160+(i-1)*30,400,190+(i-1)*30,400);
			li2[i].setStrokeWidth(7);
			li2[i].setStroke(Color.GRAY);
			pane.getChildren().add(li2[i]);
		}
		li2[7] = new Line(340,400,405,400);
		li2[7].setStrokeWidth(7);
		pane.getChildren().add(li2[7]);
		
		//mouse listener
		scene.setOnMouseClicked(e ->{
			double x = 250;
			double y = 100;
			//random color for ball
			SecureRandom ran = new SecureRandom();
			Circle playBall = new Circle();
			playBall.setCenterX(x);
			playBall.setCenterY(y);
			playBall.setRadius(5);
			Color color = new Color(ran.nextDouble(),ran.nextDouble(),ran.nextDouble(), 1.0);
			playBall.setFill(color);
			pane.getChildren().add(playBall);
			//random situation
			int si = ran.nextInt(8)+1;
			switch(si){
				case 1:
					roll(playBall,cir[0],cir[1],cir[5],cir[6],cir[11],cir[16],cir[22],cir2[0]);
					break;
				case 2:
					roll(playBall,cir[0],cir[1],cir[5],cir[6],cir[12],cir[17],cir[23],cir2[1]);
					break;
				case 3:
					roll(playBall,cir[0],cir[1],cir[5],cir[6],cir[12],cir[17],cir[23],cir2[2]);
					break;
				case 4:
					roll(playBall,cir[0],cir[1],cir[5],cir[6],cir[12],cir[18],cir[24],cir2[3]);
					break;
				case 5:
					roll(playBall,cir[0],cir[1],cir[5],cir[6],cir[12],cir[18],cir[25],cir2[4]);
					break;
				case 6:
					roll(playBall,cir[0],cir[1],cir[5],cir[8],cir[13],cir[19],cir[26],cir2[5]);
					break;
				case 7:
					roll(playBall,cir[0],cir[1],cir[3],cir[9],cir[14],cir[20],cir[27],cir2[6]);
					break;
				case 8:
					roll(playBall,cir[0],cir[2],cir[4],cir[7],cir[10],cir[15],cir[21],cir2[7]);
					break;		
				}			
			
		});
		primaryStage.setTitle("BeanGame");
		primaryStage.setScene(scene);
		primaryStage.show();
	

	}
	//Animation
	public void roll(Circle playBall,Circle ci1 ,Circle ci2,Circle ci3,Circle ci4,Circle ci5,Circle ci6,Circle ci7,Circle bottom){
		Timeline rolling = new Timeline(
			new KeyFrame(Duration.seconds(0),new KeyValue(playBall.centerYProperty(),50)),
			new KeyFrame(Duration.seconds(0.2),new KeyValue(playBall.centerYProperty(),ci1.getLayoutY()-15)),
			new KeyFrame(Duration.seconds(0.4),new KeyValue(playBall.centerXProperty(),ci2.getLayoutX())),
			new KeyFrame(Duration.seconds(0.6),new KeyValue(playBall.centerYProperty(),ci2.getLayoutY()-15)),
			new KeyFrame(Duration.seconds(0.8),new KeyValue(playBall.centerXProperty(),ci3.getLayoutX())),
			new KeyFrame(Duration.seconds(1.0),new KeyValue(playBall.centerYProperty(),ci3.getLayoutY()-15)),
			new KeyFrame(Duration.seconds(1.2),new KeyValue(playBall.centerXProperty(),ci4.getLayoutX())),
			new KeyFrame(Duration.seconds(1.4),new KeyValue(playBall.centerYProperty(),ci4.getLayoutY()-15)),
			new KeyFrame(Duration.seconds(1.6),new KeyValue(playBall.centerXProperty(),ci5.getLayoutX())),
			new KeyFrame(Duration.seconds(1.8),new KeyValue(playBall.centerYProperty(),ci5.getLayoutY()-15)),
			new KeyFrame(Duration.seconds(2.0),new KeyValue(playBall.centerXProperty(),ci6.getLayoutX())),
			new KeyFrame(Duration.seconds(2.2),new KeyValue(playBall.centerYProperty(),ci6.getLayoutY()-15)),
			new KeyFrame(Duration.seconds(2.4),new KeyValue(playBall.centerXProperty(),ci7.getLayoutX())),
			new KeyFrame(Duration.seconds(2.6),new KeyValue(playBall.centerYProperty(),ci7.getLayoutY()-15)),
			new KeyFrame(Duration.seconds(2.8),new KeyValue(playBall.centerXProperty(),bottom.getLayoutX())),
			new KeyFrame(Duration.seconds(3.0),new KeyValue(playBall.centerYProperty(),bottom.getLayoutY()-5)));
			rolling.play();
	}
}
