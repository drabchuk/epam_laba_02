/*
* View.java
* v 1.0
* 04.05.2016
* © Denis Drabchuck
*/

package ua.kpi.tef.view;


/**
 * Created by Denis Drabchuck on 04.05.2016.
 */
public class View {

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessages(Object... strings) {
        for (Object s: strings) {
            System.out.print(s.toString());
        }
        System.out.println();
    }

}
