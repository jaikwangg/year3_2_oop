public class RegularCustomerFactory implements ICustomerFactory {
    private static RegularCustomerFactory factory = new RegularCustomerFactory();

    private RegularCustomerFactory() {

    }

    public static RegularCustomerFactory getFactory() {
        return factory;
    }

    @Override
    public IMail createMail() {
        return new RegularMail();
    }

    @Override
    public IBrochure createBrochure() {
        return new RegularBrochure();
    }
}
