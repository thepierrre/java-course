//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Account piotrsAccount = new Account();
//        Account piotrsAccount = new Account("12345", 1000,
//                "Piotr Owczarczyk", "powczarc@gmail.com", "0123456789");
        Account piotrsAccount = new Account();

        System.out.println(piotrsAccount.getNumber());
        System.out.println(piotrsAccount.getBalance());

//        piotrsAccount.setNumber("2345");
//        piotrsAccount.setBalance(1000);
//        piotrsAccount.setCustomerName("Piotr Owczarczyk");
//        piotrsAccount.setCustomerEmail("powczarc@gmail.com");
//        piotrsAccount.setCustomerPhone("0123456789");
        piotrsAccount.depositFunds(250);
        piotrsAccount.withdrawFunds(50);

        Account timsAccount = new Account("Tim", "tim@gmail.com", "1236543");
        System.out.println("Account No.: " + timsAccount.getNumber());

        Customer customer = new Customer("Timothy", 1000, "timothy@gmail.com");
        System.out.println(customer.getName());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

        Customer thirdCustomer = new Customer("Luca", 2000,"luca@gmail.com");
        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmail());


        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S9300" + i,
                    switch (i) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
                System.out.println(s);
        }
    }
}