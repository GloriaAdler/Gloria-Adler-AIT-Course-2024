package classwork.bank_account;

import classwork.bank_account.model.BankAccount;

public class BankAppl {
    public static void main(String[] args) {

BankAccount account001 = new BankAccount(101L, "John Smith", "Bank#1", 1, 100);
account001.display();


        //печать через toString
        System.out.println(account001);


BankAccount account002 = new BankAccount(002L, "Pit Brosman", "Bank#1", 1);
account002.display();

BankAccount account003 = new BankAccount(103L, "Bank#1", 1, 1000000);
account003.display();//null- пустая ссылка, никуда не ведет, т.к. у нее нет указателя

account001.deposit(500);
account001.display();
account002.deposit(300);
account002.display();
account003.deposit(1000000);
account003.display();

System.out.println("=======================================================================");

account001.withdraw(500);
account001.display();
account001.withdraw(200);//т.к. баланс был всего 100, то программа ничего не поменяет, деньги выданы не будут, баланс останется 100
account001.display();
account001.withdraw(100);//деньги сняты в 0
account001.display();






    }
}
