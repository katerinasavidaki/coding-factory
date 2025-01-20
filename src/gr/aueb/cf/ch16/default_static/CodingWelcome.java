package gr.aueb.cf.ch16.default_static;

public class CodingWelcome implements IWelcome {

    // Hide. (Static method of IWelcome is hidden from CodingWelcome)
    public static void staticMethod() {
        System.out.println("static method from CodingWelcome hides IWelcome");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in CodingWelcome");
        IWelcome.super.defaultMethod();
    }
}
