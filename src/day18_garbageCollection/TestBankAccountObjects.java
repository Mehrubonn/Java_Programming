package day18_garbageCollection;

public class TestBankAccountObjects {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setInfo("Qodir", 347456677);
        System.out.println(bankAccount1);

        bankAccount1.deposit(-9);
        bankAccount1.checkBalance();

        bankAccount1.withdraw(8000);
        bankAccount1.checkBalance();


        System.out.println("--------------------------------------------------");
        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.setInfo("Kori", 1234567);

        BankAccount bankAccount3 = new BankAccount();
        bankAccount3.setInfo("Mers", 3456789);

        bankAccount2.deposit(5000);

        bankAccount3.deposit(3000);

        System.out.println(bankAccount2);
        System.out.println(bankAccount3);

        bankAccount2.withdraw(9000);
        bankAccount3.withdraw(100);


    }
}







