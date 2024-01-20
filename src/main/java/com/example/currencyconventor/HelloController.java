package com.example.currencyconventor;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    private String currencyOne, currencyTwo;
    private ObservableList<String> currencyList;

    @FXML
    private ChoiceBox<String> box1;

    @FXML
    private ChoiceBox<String> box2;

    @FXML
    private TextField textfield;
    @FXML
    private Label label4;

    public void initialize(){
        currencyList = FXCollections.observableArrayList();
        currencyList.add("Dollar");
        currencyList.add("Euro");
        currencyList.add("Pound");
        currencyList.add("Ruble");
        currencyList.add("Yen");
        box1.setItems(currencyList);
        box2.setItems(currencyList);
    }

    public void setCurrencyList(){currencyOne = box1.getValue();}
    public void setCurrencyList2(){currencyTwo = box2.getValue();}

    public void convertCurrency()  {
        if(currencyOne.equals("Dollar") && currencyTwo.equals("Euro")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) * 1.95));
        }
        else if(currencyOne.equals("Dollar") && currencyTwo.equals("Pound")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) * 2.25));
        }
        else if(currencyOne.equals("Dollar") && currencyTwo.equals("Ruble")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) * 70));
        }
        else if(currencyOne.equals("Dollar") && currencyTwo.equals("Yen")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) * 1.09));
        }
        else if(currencyOne.equals("Euro") && currencyTwo.equals("Dollar")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 1.95));
        }
        else if(currencyOne.equals("Euro") && currencyTwo.equals("Pound")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 2.25));
        }
        else if(currencyOne.equals("Euro") && currencyTwo.equals("Ruble")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 70));
        }

        else if(currencyOne.equals("Euro") && currencyTwo.equals("Yen")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 1.09));
        }
        else if(currencyOne.equals("Pound") && currencyTwo.equals("Dollar")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 2.25));
        }

        else if(currencyOne.equals("Pound") && currencyTwo.equals("Euro")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 1.95));
        }
        else if(currencyOne.equals("Pound") && currencyTwo.equals("Ruble")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 70));
        }

        else if(currencyOne.equals("Pound") && currencyTwo.equals("Yen")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 1.09));
        }
        else if(currencyOne.equals("Ruble") && currencyTwo.equals("Dollar")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 70));
        }

        else if(currencyOne.equals("Ruble") && currencyTwo.equals("Euro")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 1.95));
        }
        else if(currencyOne.equals("Ruble") && currencyTwo.equals("Pound")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 2.25));
        }

        else if(currencyOne.equals("Ruble") && currencyTwo.equals("Yen")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 1.09));
        }
        else if(currencyOne.equals("Yen") && currencyTwo.equals("Dollar")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 1.09));
        }

        else if(currencyOne.equals("Yen") && currencyTwo.equals("Euro")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 1.95));
        }
        else if(currencyOne.equals("Yen") && currencyTwo.equals("Pound")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 2.25));
        }

        else if(currencyOne.equals("Yen") && currencyTwo.equals("Ruble")){
            label4.setText(Double.toString(Double.parseDouble(textfield.getText()) / 70));
        }

        else{
            label4.setText("Error");
        }

    }

}
