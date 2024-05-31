public class Money {
    
private long dollars;
    private long cents;
 
    //Constructors
    public Money(double amount) {
        dollars = (long) amount;
        cents = (long) Math.round((amount - dollars) * 100);
    }
 
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }
 
    //Method to get dollars
    public Money add(Money otherAmount) {
        long totalCents = this.toCents() + otherAmount.toCents();
        return fromCents(totalCents);
    }
 
    //Method to subtract
    public Money subtract(Money otherAmount) {
        long totalCents = this.toCents() - otherAmount.toCents();
        return fromCents(totalCents);
    }
 
    //Method to compare
    public int compareTo(Money otherObject) {
        long thisCents = this.toCents();
        long otherCents = otherObject.toCents();
        return Long.compare(thisCents, otherCents);
    }
 
    //Method to check equality
    public boolean equals(Money otherObject) {
        return this.toCents() == otherObject.toCents();
    }
 
    //Method to convert to string
    @Override
    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" : "") + cents;
    }
 
    //Helper method to convert dollars and cents to cents
    private long toCents() {
        return dollars * 100 + cents;
    }
 
    //Helper method to convert total cents to dollars and cents
    private static Money fromCents(long totalCents) {
        long dollars = totalCents / 100;
        long cents = totalCents % 100;
        Money money = new Money(0);
        money.dollars = dollars;
        money.cents = cents;
        return money;
    }
}