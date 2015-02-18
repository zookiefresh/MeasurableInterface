/*
   Interfaces allow to apply polymorphism to unrelated objects
 */
package measurable;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args){
        Measurable[] accounts = new Measurable[3];
        accounts[0] = new Bank(0);
        accounts[1] = new Bank(1000.0);
        accounts[2] = new Bank(2000.0);
        
        System.out.println("avg = " + average(accounts));
        
         Measurable[] countries = new Measurable[3];
         countries[0] = new Country("US", 587456208.85);
         countries[1] = new Country("UK", 239423.5);
         countries[2] = new Country("France", 35523.0);                               
         
         System.out.println("avg = " + average(countries));
    }
    
    static double average(Measurable[] objs){
        double sum = 0.0;
        for(Measurable obj : objs){
            sum = sum + obj.getMeasure();
        }
        return sum/ objs.length;
    }
}
