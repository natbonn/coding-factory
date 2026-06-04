package gr.aueb.cf.ch13;


public class OnlyOneCodingFactory {
    private final static OnlyOneCodingFactory INSTANCE = new OnlyOneCodingFactory();

    private OnlyOneCodingFactory() {}

    // Eager initialization - The instance is created when the class is loaded.
    public static OnlyOneCodingFactory getInstance() {
        return INSTANCE;
    }

    //Public API
    public void doSomething() {
        System.out.println("Say Hello");
    }


}
