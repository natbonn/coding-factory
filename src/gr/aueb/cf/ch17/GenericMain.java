package gr.aueb.cf.ch17;

public class GenericMain {

    public static void main(String[] args) {
        GenericNode<String> strNode = new GenericNode<>();
        GenericNode<Double> doubleNode = new GenericNode<>();
        var intNode = new GenericNode<Integer>();    // σύντμηση του πάνω - προσοχή στη δεξιά πλευρά

        strNode.setValue("Hello");                   // set value
        doubleNode.setValue(2.45);
        intNode.setValue(5);

        String str = strNode.getValue();             // get value
        Double dbl = doubleNode.getValue();
        Integer intVal = intNode.getValue();
    }
}
