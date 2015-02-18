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
public class Main {
    public static void main(String[] args){
        Measurable [] accounts = new Measurable[3];
        accounts[0] = new Bank(0);
        accounts[1] = new Bank(1000.0);
        accounts[2] = new Bank(2000.0);
        
        System.out.println("avg = " + average(accounts));
    }
    
    static double average(Measurable[] objs){
        double sum = 0.0;
        for(Measurable obj : objs){
            sum = sum + obj.getMeasure();
        }
        return sum/ objs.length;
    }
}
