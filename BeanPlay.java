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
		Scene scene = new Scene(new LinePane(),200,200);
		primaryStage.setTitle("BeanGame");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
class LinePane extends Pane{
	public LinePane(){
		//two lines for border
		Line line1 = new Line(120,0,200,200);
		line1.setStrokeWidth(1);
		line1.setStroke(Color.BLACK);
		getChildren().add(line1);
		
		Line line2 = new Line(80,0,0,200);
		line2.setStrokeWidth(1);
		line2.setStroke(Color.BLACK);
		getChildren().add(line2);
		
		
		//thirty-six circle(dot) for block
		Circle circle1 = new Circle();
		circle1.setCenterX(100);
		circle1.setCenterY(5);
		circle1.setRadius(6);
		circle1.setStroke(Color.BLACK);
		circle1.setFill(Color.BLACK);
		getChildren().add(circle1);
		
		
		
		Circle circle2 = new Circle();
		circle2.setCenterX(90);
		circle2.setCenterY(25);
		circle2.setRadius(4);
		circle2.setStroke(Color.BLACK);
		circle2.setFill(Color.BLACK);
		getChildren().add(circle2);
		
		Circle circle3 = new Circle();
		circle3.setCenterX(110);
		circle3.setCenterY(25);
		circle3.setRadius(4);
		circle3.setStroke(Color.BLACK);
		circle3.setFill(Color.BLACK);
		getChildren().add(circle3);
		
		
		
		Circle circle4 = new Circle();
		circle4.setCenterX(100);
		circle4.setCenterY(45);
		circle4.setRadius(4);
		circle4.setStroke(Color.BLACK);
		circle4.setFill(Color.BLACK);
		getChildren().add(circle4);
		
		Circle circle5 = new Circle();
		circle5.setCenterX(120);
		circle5.setCenterY(45);
		circle5.setRadius(4);
		circle5.setStroke(Color.BLACK);
		circle5.setFill(Color.BLACK);
		getChildren().add(circle5);
		
		Circle circle6 = new Circle();
		circle6.setCenterX(80);
		circle6.setCenterY(45);
		circle6.setRadius(4);
		circle6.setStroke(Color.BLACK);
		circle6.setFill(Color.BLACK);
		getChildren().add(circle6);
		
		
		
		
		Circle circle7 = new Circle();
		circle7.setCenterX(70);
		circle7.setCenterY(65);
		circle7.setRadius(4);
		circle7.setStroke(Color.BLACK);
		circle7.setFill(Color.BLACK);
		getChildren().add(circle7);
		
		
		Circle circle8 = new Circle();
		circle8.setCenterX(90);
		circle8.setCenterY(65);
		circle8.setRadius(4);
		circle8.setStroke(Color.BLACK);
		circle8.setFill(Color.BLACK);
		getChildren().add(circle8);
		
		
		Circle circle9 = new Circle();
		circle9.setCenterX(110);
		circle9.setCenterY(65);
		circle9.setRadius(4);
		circle9.setStroke(Color.BLACK);
		circle9.setFill(Color.BLACK);
		getChildren().add(circle9);
		
		
		Circle circle10 = new Circle();
		circle10.setCenterX(130);
		circle10.setCenterY(65);
		circle10.setRadius(4);
		circle10.setStroke(Color.BLACK);
		circle10.setFill(Color.BLACK);
		getChildren().add(circle10);
		
		
		
		Circle circle11 = new Circle();
		circle11.setCenterX(60);
		circle11.setCenterY(85);
		circle11.setRadius(4);
		circle11.setStroke(Color.BLACK);
		circle11.setFill(Color.BLACK);
		getChildren().add(circle11);
		
		Circle circle12 = new Circle();
		circle12.setCenterX(80);
		circle12.setCenterY(85);
		circle12.setRadius(4);
		circle12.setStroke(Color.BLACK);
		circle12.setFill(Color.BLACK);
		getChildren().add(circle12);
		
		Circle circle13 = new Circle();
		circle13.setCenterX(100);
		circle13.setCenterY(85);
		circle13.setRadius(4);
		circle13.setStroke(Color.BLACK);
		circle13.setFill(Color.BLACK);
		getChildren().add(circle13);
		
		Circle circle14 = new Circle();
		circle14.setCenterX(120);
		circle14.setCenterY(85);
		circle14.setRadius(4);
		circle14.setStroke(Color.BLACK);
		circle14.setFill(Color.BLACK);
		getChildren().add(circle14);
		
		Circle circle15 = new Circle();
		circle15.setCenterX(140);
		circle15.setCenterY(85);
		circle15.setRadius(4);
		circle15.setStroke(Color.BLACK);
		circle15.setFill(Color.BLACK);
		getChildren().add(circle15);
		
		
		
		Circle circle16 = new Circle();
		circle16.setCenterX(50);
		circle16.setCenterY(105);
		circle16.setRadius(4);
		circle16.setStroke(Color.BLACK);
		circle16.setFill(Color.BLACK);
		getChildren().add(circle16);
		
		Circle circle17 = new Circle();
		circle17.setCenterX(70);
		circle17.setCenterY(105);
		circle17.setRadius(4);
		circle17.setStroke(Color.BLACK);
		circle17.setFill(Color.BLACK);
		getChildren().add(circle17);
		
		Circle circle18 = new Circle();
		circle18.setCenterX(90);
		circle18.setCenterY(105);
		circle18.setRadius(4);
		circle18.setStroke(Color.BLACK);
		circle18.setFill(Color.BLACK);
		getChildren().add(circle18);
		
		Circle circle19 = new Circle();
		circle19.setCenterX(110);
		circle19.setCenterY(105);
		circle19.setRadius(4);
		circle19.setStroke(Color.BLACK);
		circle19.setFill(Color.BLACK);
		getChildren().add(circle19);
		
		Circle circle20 = new Circle();
		circle20.setCenterX(130);
		circle20.setCenterY(105);
		circle20.setRadius(4);
		circle20.setStroke(Color.BLACK);
		circle20.setFill(Color.BLACK);
		getChildren().add(circle20);
		
		Circle circle21 = new Circle();
		circle21.setCenterX(150);
		circle21.setCenterY(105);
		circle21.setRadius(4);
		circle21.setStroke(Color.BLACK);
		circle21.setFill(Color.BLACK);
		getChildren().add(circle21);
		
		
		
		
		Circle circle22 = new Circle();
		circle22.setCenterX(40);
		circle22.setCenterY(125);
		circle22.setRadius(4);
		circle22.setStroke(Color.BLACK);
		circle22.setFill(Color.BLACK);
		getChildren().add(circle22);
		
		Circle circle23 = new Circle();
		circle23.setCenterX(60);
		circle23.setCenterY(125);
		circle23.setRadius(4);
		circle23.setStroke(Color.BLACK);
		circle23.setFill(Color.BLACK);
		getChildren().add(circle23);
		
		Circle circle24 = new Circle();
		circle24.setCenterX(80);
		circle24.setCenterY(125);
		circle24.setRadius(4);
		circle24.setStroke(Color.BLACK);
		circle24.setFill(Color.BLACK);
		getChildren().add(circle24);
		
		Circle circle25 = new Circle();
		circle25.setCenterX(100);
		circle25.setCenterY(125);
		circle25.setRadius(4);
		circle25.setStroke(Color.BLACK);
		circle25.setFill(Color.BLACK);
		getChildren().add(circle25);
		
		Circle circle26 = new Circle();
		circle26.setCenterX(120);
		circle26.setCenterY(125);
		circle26.setRadius(4);
		circle26.setStroke(Color.BLACK);
		circle26.setFill(Color.BLACK);
		getChildren().add(circle26);
		
		Circle circle27 = new Circle();
		circle27.setCenterX(140);
		circle27.setCenterY(125);
		circle27.setRadius(4);
		circle27.setStroke(Color.BLACK);
		circle27.setFill(Color.BLACK);
		getChildren().add(circle27);
		
		Circle circle28 = new Circle();
		circle28.setCenterX(160);
		circle28.setCenterY(125);
		circle28.setRadius(4);
		circle28.setStroke(Color.BLACK);
		circle28.setFill(Color.BLACK);
		getChildren().add(circle28);
		
		
		
		Circle circle29 = new Circle();
		circle29.setCenterX(30);
		circle29.setCenterY(145);
		circle29.setRadius(4);
		circle29.setStroke(Color.BLACK);
		circle29.setFill(Color.BLACK);
		getChildren().add(circle29);
		
		Circle circle30 = new Circle();
		circle30.setCenterX(50);
		circle30.setCenterY(145);
		circle30.setRadius(4);
		circle30.setStroke(Color.BLACK);
		circle30.setFill(Color.BLACK);
		getChildren().add(circle30);
		
		Circle circle31 = new Circle();
		circle31.setCenterX(70);
		circle31.setCenterY(145);
		circle31.setRadius(4);
		circle31.setStroke(Color.BLACK);
		circle31.setFill(Color.BLACK);
		getChildren().add(circle31);
		
		Circle circle32 = new Circle();
		circle32.setCenterX(90);
		circle32.setCenterY(145);
		circle32.setRadius(4);
		circle32.setStroke(Color.BLACK);
		circle32.setFill(Color.BLACK);
		getChildren().add(circle32);
		
		Circle circle33 = new Circle();
		circle33.setCenterX(110);
		circle33.setCenterY(145);
		circle33.setRadius(4);
		circle33.setStroke(Color.BLACK);
		circle33.setFill(Color.BLACK);
		getChildren().add(circle33);
		
		Circle circle34 = new Circle();
		circle34.setCenterX(130);
		circle34.setCenterY(145);
		circle34.setRadius(4);
		circle34.setStroke(Color.BLACK);
		circle34.setFill(Color.BLACK);
		getChildren().add(circle34);
		
		Circle circle35 = new Circle();
		circle35.setCenterX(150);
		circle35.setCenterY(145);
		circle35.setRadius(4);
		circle35.setStroke(Color.BLACK);
		circle35.setFill(Color.BLACK);
		getChildren().add(circle35);
		
		Circle circle36 = new Circle();
		circle36.setCenterX(170);
		circle36.setCenterY(145);
		circle36.setRadius(4);
		circle36.setStroke(Color.BLACK);
		circle36.setFill(Color.BLACK);
		getChildren().add(circle36);
		
		//eight lines for local blocks
		Line line3 = new Line(30,145,30,200);
		line3.setStrokeWidth(4);
		line1.setStroke(Color.BLACK);
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
