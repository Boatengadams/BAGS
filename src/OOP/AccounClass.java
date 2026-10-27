package OOP;
//    Accout
//--------------------------
//-id : int
//-balance : double
//-annualInterestRate : double
//-dateCreated : Date
//-----------------------------
//+Account(int, doublem double)
//+withdraw(double): boolean
//+deposite(double): void
//    +getters/setters

import java.util.Date;

 class AccountClass {

    public static class Account{
        private int id;
        private double balance;
        private double annualInterestRate;
        private Date dateCreated;

        public Account() {
            this.id = id;
            this.balance = balance;
            this.annualInterestRate = annualInterestRate;
            this.dateCreated = new Date();
        }
        public boolean withdraw(double amount){
            if (balance>=amount){
                balance -= amount;
                return true;
            }
            return false;
        }
        public void deposite (double amount){
            balance += amount;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public void setAnnualInterestRate(double annualInterestRate) {
            this.annualInterestRate = annualInterestRate;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

    }

//    1. Create the following Account bojects
//---------------------------
// testAccount: Account
// -----------------------------
//    id :1122
//    balance = 20,000
//    annualInterestRate = 4.5
//_________________________________________
//2. Withdraw 2500 fron the account
//    3. deposiste 300 to the account
//    4.Print the account's infotmation

    static void main(String[] args) {
        Account yaw = new Account();
        yaw.id = 1122;
        yaw.balance = 20000;
        yaw.annualInterestRate = 4.5;
        if(yaw.withdraw(2500))
            System.out.println("Withdraw successful");
        else
            System.out.println("Withdraw not successful");

        yaw.deposite(300);

        System.out.println(yaw.getId() + " " +
                yaw.getBalance()+" " +
                yaw.getAnnualInterestRate()+" "+
                yaw.getDateCreated());



    }

    static void printAccountInfo() {

    }
}

