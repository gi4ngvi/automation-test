package entity;

public class Account {
    private String accountID;
    private String customerID;
    private String name;
    private String email;
    private String accountType;
    private int deposit;
    private String openDate;

    public Account(Builder builder) {
        this.accountID = builder.accountID;
        this.customerID = builder.customerID;
        this.name = builder.name;
        this.email = builder.email;
        this.accountType = builder.accountType;
        this.deposit = builder.deposit;
        this.openDate = builder.openDate;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public static class Builder {
        private String accountID;
        private String customerID;
        private String name;
        private String email;
        private String accountType;
        private int deposit;
        private String openDate;

        public Builder accountID(String accountID) {
            this.accountID = accountID;
            return this;
        }

        public Builder customerID(String customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        public Builder deposit(int deposit) {
            this.deposit = deposit;
            return this;
        }

        public Builder openDate(String openDate) {
            this.openDate = openDate;
            return this;
        }

        public Account build() {
            return new Account(this);
        }
    }
}
