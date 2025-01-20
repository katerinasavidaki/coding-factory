package gr.aueb.cf.ch16.default_static;

public interface IWelcome {

    //static methods are not overridable
    static void staticMethod() {
        System.out.println("Hello from IWelcome static method");
    }

    // Methods that have implementation
    // It is not necessary for a class that implements IWelcome to use the default methods.
    // default methods are overridable
    default void defaultMethod() {
        System.out.println("Default method from IWelcome");
    }
}
