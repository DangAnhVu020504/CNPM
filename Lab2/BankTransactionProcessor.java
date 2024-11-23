import java.util.*;
import java.util.stream.Collectors;

public class BankTransactionProcessor {
    private final List<BankTransaction> transactions;

    public BankTransactionProcessor(List<BankTransaction> transactions) {
        this.transactions = transactions;
    }

    public double calculateTotalProfitAndLoss() {
        return transactions.stream().mapToDouble(BankTransaction::getAmount).sum();
    }

    public Map<String, Long> countTransactionsPerMonth(int year) {
        return transactions.stream()
                .filter(t -> t.getDate().getYear() == year)
                .collect(Collectors.groupingBy(
                        t -> String.format("%02d-%d", t.getDate().getMonthValue(), year),
                        Collectors.counting()
                ));
    }

    public List<BankTransaction> getTopExpenses(int topN) {
        return transactions.stream()
                .filter(t -> t.getAmount() < 0) // Chỉ lấy chi tiêu (giao dịch âm)
                .sorted(Comparator.comparingDouble(BankTransaction::getAmount)) // Sắp xếp từ nhỏ đến lớn
                .limit(topN)
                .collect(Collectors.toList());
    }
    
    public String getMostFrequentCategory() {
        return transactions.stream()
                .filter(t -> t.getAmount() < 0) // Chỉ xét chi tiêu (giao dịch âm)
                .collect(Collectors.groupingBy(
                        BankTransaction::getCategory, 
                        Collectors.summingDouble(BankTransaction::getAmount)))
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue()) // Tìm danh mục có tổng chi tiêu nhỏ nhất (âm lớn nhất)
                .map(Map.Entry::getKey)
                .orElse("Unknown");
    }
    
}
