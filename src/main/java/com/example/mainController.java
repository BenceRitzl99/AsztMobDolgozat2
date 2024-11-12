/*
* File: mainController.java
* Author: Ritzl Bence
* Copyright: 2024, Ritzl Bence
* Group: Szoft II/1/N
* Date: 2024-11-12
* Github: https://github.com/BenceRitzl99/
* Licenc: GNU GPL
*/

package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField aField;

    @FXML
    private TextField areaField;

    @FXML
    private TextField bField;

    @FXML
    private TextField cField;

    @FXML
    private TextField dField;

    @FXML
    void gombKilepes(ActionEvent event) {

    }

    @FXML
    void gombSzamitas(ActionEvent event) {
        startSzamitas();
    }
    private void startSzamitas() {
        String a = aField.getText();
        String b = bField.getText();
        String c = cField.getText();
        String d = dField.getText();

        double aDouble = Double.parseDouble(a);
        double bDouble = Double.parseDouble(b);
        double cDouble = Double.parseDouble(c);
        double dDouble = Double.parseDouble(d);

        double area = szamitArea(aDouble, bDouble, cDouble, dDouble);
        areaField.setText(String.valueOf(area));

        szamitArea(aDouble, bDouble, cDouble, dDouble);
    }

    private double szamitArea(double a, double b, double c, double d) {
        double area = ((a+c) / (4*(a-c))) * Math.sqrt(((a+b-c+d) * (a-b-c+d) * (a+b-c-d) * (-a+b+c+d)));
        return area;
    }

}
