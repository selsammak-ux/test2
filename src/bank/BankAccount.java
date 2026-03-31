/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author victus
 */
public class BankAccount {
    private double balance ;
private String accountHolder;

public BankAccount(String name){
this.accountHolder = name;
this.balance = 0.0;
        }

    public void deposit(double amount) {
if (amount > 0) { // Selection structure
balance += amount;
System.out.println("Success!");
} else {
System.out.println("Error: Invalid Amount");
}
    }
}