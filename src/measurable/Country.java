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
public class Country implements Measurable{
    String name;
    double area;
    
    Country(String name, double area){
        this.name = name;
        this.area = area;
    }
    
    @Override
    public double getMeasure(){
        return area;
    }
}
