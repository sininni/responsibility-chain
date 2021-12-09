package atm;

public class BasicBill implements Bill {
    private Bill next;
    private final int billAmount;

    public BasicBill(int billAmount) {
        this.billAmount = billAmount;

    }

    @Override
    public void setNext(Bill bill) {
        next = bill;
    }

    @Override
    public void process(int amount){

        if (next != null) {
            next.process(amount % billAmount);
        } else if (amount  % billAmount != 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("Please, recieve " + amount / billAmount + " of "+ billAmount + " UAH bills");
    }
}
