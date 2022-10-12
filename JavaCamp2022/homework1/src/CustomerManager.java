public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditManager;

    public CustomerManager(Customer customer, ICreditManager icreditManager) {
        _customer = customer;
        _creditManager = icreditManager;
    }

    public void addCustomer() {
        System.out.println("Müsteri eklendi : " + _customer.getFirstName());
    }

    public void removeCustomer() {
        System.out.println("Müşteri silindi : " + _customer.getFirstName());
    }

    public void giveCredit() {
        _creditManager.Calcualte();
        System.out.println("Kredi verildi");
    }
}