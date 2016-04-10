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
                95d,304d,
                95d,400d,
                405d,400d,
                405d,304d,
                300d,150d,
                300d,100d
        );
        getChildren().add(pol);
		
		
		//thirty-six circle(dot) for block
		Circle cir[] = new Circle[36];
		for(int i=0;i<36;++i){
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
            /* Row 4 */
            else if(i>=6&&i<10) {
                cir[i].setLayoutX(205+(i-6)*30);
                cir[i].setLayoutY(216);
            }
            /* Row 5 */
            else if(i>=10&&i<15) {
                cir[i].setLayoutX(190+(i-10)*30);
                cir[i].setLayoutY(238);
            }
            /* Row 6 */
            else if(i>=15&&i<21) {
                cir[i].setLayoutX(175+(i-15)*30);
                cir[i].setLayoutY(260);
            }
            /* Row 7 */
            else if(i>=21&&i<28){
                cir[i].setLayoutX(160+(i-21)*30);
                cir[i].setLayoutY(282);
            }
			else{
				cir[i].setLayoutX(145d+(i-28)*30);
				cir[i].setLayoutY(304);
			}
            getChildren().add(cir[i]);
        }
		
		
		//eight lines for local blocks
		Line line3 = new Line(30,145,30,200);
		line3.setStrokeWidth(4);
		line3.setStroke(Color.BLACK);
		getChildren().add(line3);
		
		Line line4 = new Line(50,145,50,200);
		line4.setStrokeWidth(4);
		line4.setStroke(Color.BLACK);
		getChildren().add(line4);
		
		Line line5 = new Line(70,145,70,200);
		line5.setStrokeWidth(4);
		line5.setStroke(Color.BLACK);
		getChildren().add(line5);
		
		Line line6 = new Line(90,145,90,200);
		line6.setStrokeWidth(4);
		line6.setStroke(Color.BLACK);
		getChildren().add(line6);
		
		Line line7 = new Line(110,145,110,200);
		line7.setStrokeWidth(4);
		line7.setStroke(Color.BLACK);
		getChildren().add(line7);
		
		Line line8 = new Line(130,145,130,200);
		line8.setStrokeWidth(4);
		line8.setStroke(Color.BLACK);
		getChildren().add(line8);
		
		Line line9 = new Line(150,145,150,200);
		line9.setStrokeWidth(4);
		line9.setStroke(Color.BLACK);
		getChildren().add(line9);
		
		Line line10 = new Line(170,145,170,200);
		line10.setStrokeWidth(4);
		line10.setStroke(Color.BLACK);
		getChildren().add(line10);
		
		
		//ten lines for underlines and have different colors
		Line line11 = new Line(0,200,30,200);
		line11.setStrokeWidth(6);
		line11.setStroke(Color.RED);
		getChildren().add(line11);
		
		Line line12 = new Line(30,200,50,200);
		line12.setStrokeWidth(6);
		line12.setStroke(Color.BEIGE);
		getChildren().add(line12);
		
		Line line13 = new Line(50,200,70,200);
		line13.setStrokeWidth(6);
		line13.setStroke(Color.BLUE);
		getChildren().add(line13);
		
		Line line14 = new Line(70,200,90,200);
		line14.setStrokeWidth(6);
		line14.setStroke(Color.BROWN);
		getChildren().add(line14);
		
		Line line15 = new Line(90,200,110,200);
		line15.setStrokeWidth(6);
		line15.setStroke(Color.CYAN);
		getChildren().add(line15);
		
		Line line16 = new Line(110,200,130,200);
		line16.setStrokeWidth(6);
		line16.setStroke(Color.GREEN);
		getChildren().add(line16);
		
		Line line17 = new Line(130,200,150,200);
		line17.setStrokeWidth(6);
		line17.setStroke(Color.GRAY);
		getChildren().add(line17);
		
		Line line18 = new Line(150,200,170,200);
		line18.setStrokeWidth(6);
		line18.setStroke(Color.MAGENTA);
		getChildren().add(line18);
		
		Line line19 = new Line(170,200,200,200);
		line19.setStrokeWidth(6);
		line19.setStroke(Color.GOLD);
		getChildren().add(line19);
	}
}
