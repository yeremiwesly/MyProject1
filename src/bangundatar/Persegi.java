/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Lenovo
 */
public class Persegi {
    int sisi;
    
    public void hitungLuas() {
        int hasil = sisi * sisi;
        System.out.println("Luas persegi: " + hasil+ " cm");
    }
    
    public void hitungKeliling() {
        int hasil = 4 * sisi;
        System.out.println("Keliling persegi: " + hasil+ " cm");
    }
}
