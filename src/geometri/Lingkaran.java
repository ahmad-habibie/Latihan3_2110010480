/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometri;

/**
 *
 * @author ahmad
 */
public class Lingkaran {
    private double radius;

    public Lingkaran(double radius){
        this.radius = radius;
    }

    public double luas(){
        return Math.PI * radius * radius;
    }

    public double keliling(){
        return 2 * Math.PI * radius;
    }
}
