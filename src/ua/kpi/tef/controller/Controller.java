/*
* Controller.java
* 1.0 v
* 04.05.2016
* © Denis Drabchuck
*/

package ua.kpi.tef.controller;

import ua.kpi.tef.model.Model;
import ua.kpi.tef.view.View;
import static ua.kpi.tef.view.TextConstants.*;
import static ua.kpi.tef.model.Constants.*;

import java.util.Scanner;

/**
 * Created by Denis Drabchuck on 22.04.2016.
 */
public class Controller {

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        view.printMessage(GREETING);
        view.printMessage(DESCRIPTION);

        int userNumber = inputIntValueWithScannerInTheRange(sc,
                MIN_FACTORIAL_ARGUMENT, MAX_FACTORIAL_ARGUMENT);

        long userNumberFactorial = model.calculateFactorial(userNumber);

        view.printMessages(userNumber, FACTORIAL_SYMBOL, EQUALS,
                userNumberFactorial);
    }

    /**
     * This method return int value
     * bounded by lowerBound and upperBound
     * forces the user to enter the correct number
     *
     * @param sc
     * @param lowerBound
     * @param upperBound
     *
     * @return entered int value within boundaries
     * */
    protected int inputIntValueWithScannerInTheRange(Scanner sc,
                                                  int lowerBound,
                                                  int upperBound) {

        view.printMessages(INPUT_INT_START,
                lowerBound, TO, upperBound, EQUALS);

        do {
            //Read int value
            while (!sc.hasNextInt()) {
                view.printMessage(WRONG_INPUT_DATA);
                sc.next();
            }
            int input = sc.nextInt();

            //Check if input is in range
            if (isInRange(input, lowerBound, upperBound))
                return input;
            view.printMessage(WRONG_INPUT_DATA);
        } while (true);
    }

    /**
     * This method check if int value is in range
     * Returns true if the value within boundaries
     * Returns false if the value isn't within boundaries
     *
     * @param check
     * @param lowerBound
     * @param upperBound
     *
     * @return (check >= lowerBound) and (check <= upperBound)*/
    protected boolean isInRange(int check, int lowerBound, int upperBound) {
        return ((check >= lowerBound) && (check <= upperBound));
    }
}
