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
public class BankingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Account account1 = new Account("Abdur Rashid", 5000);
        
        account1.depositMoney(30000);
        account1.withdrawMoney(10000);
        
        System.out.println("Balance : " +account1.getBalance());
    }
    
}
