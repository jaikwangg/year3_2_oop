import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String customerType = getCustomerTypeFromUser();
        ICustomerFactory customerFactory = CustomerFactoryTypeProvider.getFactory(customerType);
        IMail mail = customerFactory.createMail();
        IBrochure brochure = customerFactory.createBrochure();
        sentEmailAndBrochure(mail, brochure);
    }
    
    public static String getCustomerTypeFromUser() {
        String customerType = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch (type) {
            case 1:
                customerType = "Regular";
                break;
            case 2:
                customerType = "Mountain";
                break;
            case 3:
                customerType = "Delinquent";
                break;
        }
        inp.close();
        return customerType;
    }
    public static void sentEmailAndBrochure(IMail email, IBrochure brochure) {
        email.displayMail();
        brochure.displayBrochure();
    }
}
