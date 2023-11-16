package org.example;

import org.example.askName.AskName;
import org.example.checkMyNumber.CheckMyNumber;
import org.example.dontMultiple.DontMultiply;
import org.example.readPrice.ReadPrice;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        AskName.SayMyName();
        ReadPrice.getPrice();
        CheckMyNumber.getTheTruthOfMyNumber();
        DontMultiply.getTheTruthOfMultiplication();

        }
    }
