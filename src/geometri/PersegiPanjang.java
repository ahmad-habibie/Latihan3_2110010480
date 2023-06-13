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
public class PersegiPanjang {
    private double panjang,lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        
    public double setLuas () {
        return panjang*lebar;
    }
    public double setKeliling () {
        return 2*(panjang+lebar);
    }
}
