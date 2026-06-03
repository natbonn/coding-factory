package gr.aueb.cf.ch13;

/**
 * Utility classes are non-instantiable.
 * They provide public static methods only.
 */

public class HelloUtil {

    /**
     * No instances allowed.
     */
    private HelloUtil() {}

    public static void sayHello() {
        System.out.println("Hello World!");
    }
}
