import java.util.List;
import java.util.Map;

public class MainApplication {
    public static void main(String[] args) {
        String filePath = "C:\\xampp2\\htdocs\\CNPM\\Lab2\\bank_statements.csv"; 
        BankTransactionParser parser = new BankTransactionParser();
        List<BankTransaction> transactions = parser.parse(filePath);

        BankTransactionProcessor processor = new BankTransactionProcessor(transactions);

        // 1. Tổng lợi nhuận và lỗ
        double total = processor.calculateTotalProfitAndLoss();
        System.out.println("1. Tong loi nhuan va lo: " + total + (total >= 0 ? " (DUONG)" : " (AM)"));

        // 2. Số lần giao dịch trong từng tháng của năm 2017
        Map<String, Long> transactionsPerMonth = processor.countTransactionsPerMonth(2017);
        System.out.println("2. So lan giao dich cua tung thang trong nam 2017:");
        transactionsPerMonth.forEach((month, count) -> System.out.println(month + ": " + count + " transactions"));

        // 3. Top 10 chi tiêu lớn nhất
        System.out.println("3. Top 10 chi tieu lon nhat:");
        List<BankTransaction> topExpenses = processor.getTopExpenses(10);
        topExpenses.forEach(System.out::println);

        // 4. Danh mục chi tiêu nhiều nhất
        String mostFrequentCategory = processor.getMostFrequentCategory();
        System.out.println("4. Giao dich nhieu nhat: " + mostFrequentCategory);
    }
}
