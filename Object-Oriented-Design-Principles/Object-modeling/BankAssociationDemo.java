import java.util.ArrayList;

class Bank {
    String name;
    ArrayList<BankAccount> accounts = new ArrayList<>();

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer, double initialBalance) {
        BankAccount account = new BankAccount(this, customer, initialBalance);
        accounts.add(account);
        customer.addAccount(account);
    }
}

class Customer {
    String name;
    ArrayList<BankAccount> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addAccount(BankAccount account) {
        accounts.add(account);
    }

    void displayBalances() {
        System.out.println("Accounts for customer: " + name);
        for (BankAccount account : accounts) {
            System.out.println("Bank: " + account.bank.name + " | Balance: $" + account.balance);
        }
    }
}

class BankAccount {
    Bank bank;
    Customer customer;
    double balance;

    BankAccount(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }
}

public class BankAssociationDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        Customer customer = new Customer("John Doe");

        bank.openAccount(customer, 5000);
        bank.openAccount(customer, 2500);

        customer.displayBalances();
    }
}
