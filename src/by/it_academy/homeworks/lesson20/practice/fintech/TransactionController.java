package by.it_academy.homeworks.lesson20.practice.fintech;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/*Примеры методов для реализации в классе Controller:
 - `getAllTransactions`: получить все транзакции, хранящиеся в файле History.txt.
 - `getTransactionsByAccount`: получить транзакции по ID счета.
 - `sortTransactionsByAmount`: сортировка транзакций по сумме транзакции в порядке возрастания или убывания.
 - `filterTransactionsByType`: фильтрация транзакций по типу транзакции (например, депозит, снятие средств, перевод).*/
public class TransactionController {
    public static List<Transaction> getAllTransactions(String filePath){
        List<Transaction> transactionList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String TransactionStr;
            while ((TransactionStr = reader.readLine()) != null) {
                Transaction currentTransaction = Transaction.parseTransaction(TransactionStr);
                transactionList.add(currentTransaction);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return transactionList;
    }

    public static List<Transaction> getTransactionsByAccount(UUID accountId, String filePath){
        List<Transaction> allTransactions = getAllTransactions(filePath);
        return allTransactions.stream()
                .filter((transaction -> transaction.getAccountId().equals(accountId)))
                .toList();
    }

    public static List<Transaction> sortTransactionByAmount(String filePath){
        List<Transaction> allTransactions = getAllTransactions(filePath);
        return allTransactions.stream().
                sorted(Comparator.comparing(Transaction::getSum)).
                toList();
    }

    public static List<Transaction> filterTransactionByType(TypeOfTransaction type, String filePath) {
        List<Transaction> allTransactions = getAllTransactions(filePath);
        return allTransactions.stream()
                .filter((transaction)->transaction.getType().equals(type))
                .toList();
    }
}
