public class DelinquentCustomerFactory implements ICustomerFactory {

    private static DelinquentCustomerFactory factory = new DelinquentCustomerFactory();

    private DelinquentCustomerFactory() {

    }

    public static DelinquentCustomerFactory getFactory() {
        return factory;
    }
    @Override
    public IMail createMail() {
        return new DelinquentMail();
    }

    @Override
    public IBrochure createBrochure() {
        return new DelinquentBrochure();
    }
    
}