/*
* Main.java
* v 1.0
* 04.05.2016
* © Denis Drabchuck
*
* This program is laboratory work #2, EPAM java courses
* The aim of this program is to calculate factorial of int number
*/

package ua.kpi.tef;

import ua.kpi.tef.controller.Controller;
import ua.kpi.tef.model.Model;
import ua.kpi.tef.view.View;

/**
 * Created by Denys Drabchuck on 04.05.2016.
 */
public class Main {

    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }

}
