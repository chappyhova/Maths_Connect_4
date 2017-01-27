package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    BigDecimalConverter decimalConverter = new BigDecimalConverter();


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Maths Connect 4");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public Double calculatingMethod(String buttonName, String todaysNumber) {
        if (buttonName.equals("button1")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("4")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button2")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("0.5")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button3")) {
            System.out.println(decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("0.2")).toString());
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("0.2")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button4")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("7")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button5")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("3")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button6")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("-3")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button7")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("0")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button8")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("0.1")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button9")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("10")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button10")) {
            String answer = decimalConverter.bigDecimalConverter("6").toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button11")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).divide(decimalConverter.bigDecimalConverter("0.5")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button12")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("6")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button13")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("5")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button14")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("101")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button15")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).divide(decimalConverter.bigDecimalConverter("0.25")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button16")) {
            String answer = decimalConverter.bigDecimalConverter("5").toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button17")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("9")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button18")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button19")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button20")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("0.01")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button21")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("2")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button22")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("4")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button23")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("100.01")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button24")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("11")).toString();
            return parseMethodDouble(answer);
        }
        if (buttonName.equals("button25")) {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("12")).toString();
            return parseMethodDouble(answer);
        } else {
            String answer = decimalConverter.bigDecimalConverter(todaysNumber).multiply(decimalConverter.bigDecimalConverter("4")).toString();
            return parseMethodDouble(answer);

        }
    }

    public Double parseMethodDouble(String stringDouble) {
        return Double.parseDouble(stringDouble);
    }
}
