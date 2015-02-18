/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package measurable;

/**
 *
 * @author User
 */
public class Bank implements Measurable{
    double balance;
    Bank(double balance){
        this.balance = balance;
    }
    @Override
    public double getMeasure(){
        return balance;
    }
}
