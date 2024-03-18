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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public TypeOfTransaction getType() {
        return type;
    }

    public void setType(TypeOfTransaction type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", sum=" + sum +
                ", accountId=" + accountId +
                ", type=" + type +
                '}';
    }
}
