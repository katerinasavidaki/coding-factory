package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o");   // θεση 1
        int positionOfSecondo = cf.indexOf("o", 2);      // η indexof pairnei kai 2h parametro h οποία ein
                                                                // to offset. apo poia thesi k meta diladi na psaksei
        int lastPositionOfo = cf.lastIndexOf("o");  //ksekinaei apo deksia pros aristera na psaxnei

        String cf2 = cf.substring(0);    // "Coding Factory"
        String cf3 = cf.substring(1);    // "oding Factory"
        //substring(i,j) : i -> start index / j -> end index - 1
        String slice = cf.substring(1, 3);    // od
    }
}
