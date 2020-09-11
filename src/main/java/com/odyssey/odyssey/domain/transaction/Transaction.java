package com.odyssey.odyssey.domain.transaction;

import java.math.BigDecimal;

public class Transaction {

    private BigDecimal transactionAmount;

    private TransactionMerchant transactionMerchant;

    private String cardNumber;

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public TransactionMerchant getTransactionMerchant() {
        return transactionMerchant;
    }

    public void setTransactionMerchant(TransactionMerchant transactionMerchant) {
        this.transactionMerchant = transactionMerchant;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
