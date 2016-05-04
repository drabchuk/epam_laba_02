/*
* Model.java
* v 1.0
* 04.05.2016
* © Denis Drabchuck
*/

package ua.kpi.tef.model;

/**
 * Created by Denis Drabchuck on 04.05.2016.
 */
public class Model {

    // The Program logic

    /**
     * int this method return factorial of param
     * and choose realization method
     *
     * @param a
     * @return a!
     */
    public long calculateFactorial(int a) {
        return calculateFactorialByRecursion(a);
    }

    /**
     * this method implements recursion algorithm to find factorial
     *
     * @param a
     * @return a!
     */
    private long calculateFactorialByRecursion(long a) {
        if(a == 0L) {
            return 1L;
        } else {
            return a * calculateFactorialByRecursion(a - 1);
        }
    }
}
