public class MountainCustomerFactory implements ICustomerFactory {

    private static MountainCustomerFactory factory = new MountainCustomerFactory();

    private MountainCustomerFactory() {

    }

    public static MountainCustomerFactory getFactory() {
        return factory;
    }

    @Override
    public IMail createMail() {
        return new MountainMail();
    }

    @Override
    public IBrochure createBrochure() {
        return new MountainBrochure();
    }
    
}