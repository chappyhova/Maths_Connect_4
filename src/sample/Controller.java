package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Shape;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    public TextField selectedNumberInput;
    public TextField input1;
    public TextField input2;
    public TextField input3;
    public TextField input4;
    public TextField input5;
    public TextField input6;
    public TextField input7;
    public TextField input8;
    public TextField input9;
    public TextField input10;
    public TextField input11;
    public TextField input12;
    public TextField input13;
    public TextField input14;
    public TextField input15;
    public TextField input16;
    public TextField input17;
    public TextField input18;
    public TextField input19;
    public TextField input20;
    public TextField input21;
    public TextField input22;
    public TextField input23;
    public TextField input24;
    public TextField input25;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button button10;
    public Button button11;
    public Button button12;
    public Button button13;
    public Button button14;
    public Button button15;
    public Button button16;
    public Button button17;
    public Button button18;
    public Button button19;
    public Button button20;
    public Button button21;
    public Button button22;
    public Button button23;
    public Button button24;
    public Button button25;
    public Shape redCounter;
    public Shape yellowCounter;
    public int counter;
    HashMap<String, TextField> map = new HashMap<>();
    Main mainHelper = new Main();

    public void initialize(){
        counter = 1;
        yellowCounter.setStrokeWidth(4);
        map.put("button1", input1);
        map.put("button2", input2);
        map.put("button3", input3);
        map.put("button4", input4);
        map.put("button5", input5);
        map.put("button6", input6);
        map.put("button7", input7);
        map.put("button8", input8);
        map.put("button9", input9);
        map.put("button10", input10);
        map.put("button11", input11);
        map.put("button12", input12);
        map.put("button13", input13);
        map.put("button14", input14);
        map.put("button15", input15);
        map.put("button16", input16);
        map.put("button17", input17);
        map.put("button18", input18);
        map.put("button19", input19);
        map.put("button20", input20);
        map.put("button21", input21);
        map.put("button22", input22);
        map.put("button23", input23);
        map.put("button24", input24);
        map.put("button25", input25);

    }

    public void applyNumber(){
        String chosenNumber = selectedNumberInput.getText();
        button1.setText("4 x " + chosenNumber);
        button2.setText("½ x " + chosenNumber);
        button3.setText("0.2 x " + chosenNumber);
        button4.setText(chosenNumber + " x 7");
        button5.setText(chosenNumber + " x 3");
        button6.setText("-3 x " + chosenNumber);
        button7.setText("0 x " + chosenNumber);
        button8.setText("10% of " + chosenNumber);
        button9.setText("10 x " + chosenNumber);
        button10.setText(parseMethodInt(selectedNumberInput) * 6 + " ÷ " + chosenNumber);
        button11.setText(chosenNumber + " ÷ 0.5");
        button12.setText(chosenNumber + " x 6");
        button13.setText("5 x " + chosenNumber);
        button14.setText("101 x " + chosenNumber);
        button15.setText(chosenNumber + " ÷ ¼");
        button16.setText("5/" + chosenNumber + " of " + chosenNumber);
        button17.setText("9 x " + chosenNumber);
        button18.setText(parseMethodInt(selectedNumberInput) * 13 + " ÷ 13");
        button19.setText("√" + parseMethodInt(selectedNumberInput) * parseMethodInt(selectedNumberInput));
        button20.setText(chosenNumber + " x 0.01");
        button21.setText("2 x " + chosenNumber);
        button22.setText(chosenNumber + " + " + chosenNumber + " + " + chosenNumber + " + " + chosenNumber);
        button23.setText("100.01 x " + chosenNumber);
        button24.setText(chosenNumber + " x 11");
        button25.setText("A dozen " + chosenNumber +"s");
    }

    public String whichTeam(int counter){
        String yellowTeam = "-fx-background-color: #ffec1f;";
        String redTeam = "-fx-background-color: #ff1f1f;";
        String brokenTeam = "-fx-background-color: #ff0000;";
        if (counter % 2 > 0){
            return yellowTeam;
        }
        if (counter % 2 == 0){
            return redTeam;
        }
        else{
            return brokenTeam;
        }
    }

    public void borderSetting(int counter){
        if (counter % 2 > 0){
            yellowCounter.setStrokeWidth(0);
            redCounter.setStrokeWidth(4);
        }
        if (counter % 2 == 0){
            redCounter.setStrokeWidth(0);
            yellowCounter.setStrokeWidth(4);
        }
    }

    public void buttonClicked(ActionEvent event){
        Node n = (Node)event.getSource();
        String buttonName = n.getId().toString();

        //Double userAnswer = parseMethodDouble(map.get(buttonName));
        //Double correctAnswer = parseMethodDouble(selectedNumberInput);

        String correctAnswer = selectedNumberInput.getText();
        Double userAnswer = parseMethodDouble(map.get(buttonName));

        if (mainHelper.calculatingMethod(buttonName, correctAnswer).equals(userAnswer)){
            String teamColour = whichTeam(counter);
            borderSetting(counter);
            n.setStyle(teamColour);
            counter ++;
        }
        else{

            borderSetting(counter);
            counter++;
        }
    }

    public Double parseMethodDouble(TextField tf){
        return Double.parseDouble(tf.getText());
    }

    public int parseMethodInt(TextField tf){
        return Integer.parseInt(tf.getText());
    }

}
