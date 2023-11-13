/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.application;

/**
 *
 * @author Faculty
 */
public class Account {
    private String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void depositMoney(int amount)
    {
        if(amount > 0)
        {
            this.balance = this.balance + amount;
        }
        else{
            System.out.println("Negative Amount can not be deposited");
        }
    }
    
    public void withdrawMoney(int amount)
    {
        if(amount <= balance)
        {
            this.balance = this.balance - amount;
        }
        else
        {
            System.out.println("Your amount less than available ballance");
        }
    }
}
