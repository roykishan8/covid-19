package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
//  w  w  w  .j  av a  2  s.c om
public class covidchart extends Application {

  @Override
  public void start(Stage stage) {
    final CategoryAxis xAxis = new CategoryAxis();
    final NumberAxis yAxis = new NumberAxis();
    xAxis.setLabel("Date");
    yAxis.setLabel("People infected");

    final LineChart<String, Number> lineChart = new LineChart<String, Number>(
        xAxis, yAxis);

    lineChart.setTitle("COVID-19");

    XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
    series.setName("Total Cases");
    Datalist l=new Datalist();
   for(int i=0;i<27;i++) {
	   series.getData().add(new XYChart.Data<String, Number>(l.getDate(i),l.getcases(i)));
   }


    Scene scene = new Scene(lineChart, 800, 600);
    lineChart.getData().add(series);

    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}