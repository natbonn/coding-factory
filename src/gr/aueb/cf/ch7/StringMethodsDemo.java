package gr.aueb.cf.ch7;

public class StringMethodsDemo {

    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";
        int index = -1;

        // contains()
        if (s.contains("Economics")) {
            System.out.println("Το string περιέχει το substring 'Economics'");
        }

        // indexOf() με substring
        index = s.indexOf("Uni");
        System.out.println("Η θέση του 'Uni' είναι: " + index);

        // indexOf() με char
        index = s.indexOf('e');
        System.out.println("Η θέση του πρώτου 'e' είναι: " + index);

        // lastIndexOf()
        index = s.lastIndexOf('e');
        System.out.println("Η θέση του τελευταίου 'e' είναι: " + index);

        // indexOf() for 's'
        index = s.indexOf('s');
        System.out.println("Η θέση του πρώτου 's' είναι: " + index);

        // indexOf() με starting position
        index = s.indexOf('s', 7);
        System.out.println("Η θέση του πρώτου 's' μετά τη θέση 7 είναι: " + index);

        // startsWith()
        if (s.startsWith("Athens")) {
            System.out.println("Το string ξεκινάει με 'Athens'");
        }

        if (s.startsWith("University", 7)) {
            System.out.println("Το string ξεκινάει με 'University' στη θέση 7");
        }
    }
}
