/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author erisa
 */
public class Triagle extends Shape{
    //private variable
    private int base;
    private int height;
    //contructor
    public Triagle(String color, int base, int height){
        super (color);
        this.base=base;
        this.height=height;
        
    }
    @Override
    public String toString(){
        return "Triagle[base=" + base +  ",height=" +height +"," + super.toString()+ "]";
    }
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
    
}
