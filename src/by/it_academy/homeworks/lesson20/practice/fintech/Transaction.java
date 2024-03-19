package by.it_academy.homeworks.lesson20.practice.fintech;

import java.util.UUID;

public class Transaction {
    private UUID id;
    private int sum;

    private UUID accountId;
    private TypeOfTransaction type;

    public Transaction(int sum, UUID accountId, TypeOfTransaction type) {
        this.id = UUID.randomUUID();
        this.sum = sum;
        this.accountId = accountId;
        this.type = type;
    }

    public Transaction(UUID id, int sum, UUID accountId, TypeOfTransaction type) {
        this.id = id;
        this.sum = sum;
        this.accountId = accountId;
        this.type = type;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public TypeOfTransaction getType() {
        return type;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + this.id +
                ", sum=" + this.sum +
                ", accountId=" + this.accountId +
                ", type=" + this.type +
                '}';
    }

    public String serialize() {
        return  this.id +
                "/" + this.sum +
                "/" + this.accountId +
                "/" + this.type;
    }

    public static Transaction parseTransaction(String transactStr){
        String[] value = transactStr.split("/");

        int sum = Integer.parseInt(value[1]);
        UUID id = UUID.fromString(value[0]);
        UUID idAccount = UUID.fromString(value[3]);
        TypeOfTransaction typeOfTransaction = TypeOfTransaction.valueOf(value[2]);

        return new Transaction(id, sum,idAccount,typeOfTransaction);
    }
}
