package com.odyssey.odyssey.domain;

import java.math.BigDecimal;

public class Account {

    private BigDecimal balance;

    private String accountNumber;

    private String routingNumber;

    private AccountType accountType;

    private AccountHolder accountHolder;

    private DebitCard debitCard;

    private LoginInformation loginInformation;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    public DebitCard getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public LoginInformation getLoginInformation() {
        return loginInformation;
    }

    public void setLoginInformation(LoginInformation loginInformation) {
        this.loginInformation = loginInformation;
    }
}
