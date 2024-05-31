public class CreditCard {
    //Instance variables

    private Money balance;
    private final Money creditLimit;
    private final Person owner;
 
    //Constructor
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0.00);
    }
 
    //Method to get balance
    public Money getBalance() {
        return this.balance;
    }
 
    //Method to get credit limit
    public Money getCreditLimit() {
        return this.creditLimit;
    }
 
    //Method to get personal details
    public String getPersonals() {
        return owner.toString();
    }
 
    //Method to charge
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit!");
        }
    }
 
    //Method to make payment
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}