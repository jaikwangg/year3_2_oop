public class CustomerFactoryTypeProvider {
    public static ICustomerFactory getFactory(String type) {
        switch (type) {
            case "Regular":
                return RegularCustomerFactory.getFactory();

            case "Mountain":
                return MountainCustomerFactory.getFactory();

            case "Delinquent":
                return DelinquentCustomerFactory.getFactory();
            default:
                return null;
        }
    }
}