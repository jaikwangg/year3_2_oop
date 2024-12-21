public class DelinquentCustomer extends Customer {
    @Override
    public String createMail() {
        return "Delinquent Customer";
    }
}
