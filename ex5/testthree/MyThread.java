public class MyThread extends Thread {
    private final String customerType;

    public MyThread(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public void run() {
        ICustomerFactory customerFactory = CustomerFactoryTypeProvider.getFactory(customerType);
        IMail mail = customerFactory.createMail();
        IBrochure brochure = customerFactory.createBrochure();
        sentEmailAndBrochure(mail, brochure);
    }

    public static void sentEmailAndBrochure(IMail email, IBrochure brochure) {
        email.displayMail();
        brochure.displayBrochure();
    }
}