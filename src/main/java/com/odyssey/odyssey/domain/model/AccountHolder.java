package com.odyssey.odyssey.domain.model;

public class AccountHolder {

    private String accountHolderName;

    private Address accountHolderAddress;

    private UserAuthenticationDetails userAuthenticationDetails;

    private String accountHolderPhoneNumber;

    private String accountHolderEmail;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Address getAccountHolderAddress() {
        return accountHolderAddress;
    }

    public void setAccountHolderAddress(Address accountHolderAddress) {
        this.accountHolderAddress = accountHolderAddress;
    }

    public UserAuthenticationDetails getUserAuthenticationDetails() {
        return userAuthenticationDetails;
    }

    public void setUserAuthenticationDetails(UserAuthenticationDetails userAuthenticationDetails) {
        this.userAuthenticationDetails = userAuthenticationDetails;
    }

    public String getAccountHolderPhoneNumber() {
        return accountHolderPhoneNumber;
    }

    public void setAccountHolderPhoneNumber(String accountHolderPhoneNumber) {
        this.accountHolderPhoneNumber = accountHolderPhoneNumber;
    }

    public String getAccountHolderEmail() {
        return accountHolderEmail;
    }

    public void setAccountHolderEmail(String accountHolderEmail) {
        this.accountHolderEmail = accountHolderEmail;
    }
}
