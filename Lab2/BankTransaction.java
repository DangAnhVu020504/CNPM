import java.time.LocalDate;

public class BankTransaction {
    private final LocalDate date;
    private final double amount;
    private final String category;

    public BankTransaction(LocalDate date, double amount, String category) {
        this.date = date;
        this.amount = amount;
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return date + " : " + amount + " - " + category;
    }
}
