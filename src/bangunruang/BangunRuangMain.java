/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Lenovo
 */
public class BangunRuangMain {
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.r = 100;
        bola.hitungVol();
        bola.hitungLuasSelimut();

        Kerucut kerucut = new Kerucut();
        kerucut.r = 28;
        kerucut.s = 30;
        kerucut.tinggi = 25;
        kerucut.hitungVol();
        kerucut.hitungLuasSelimut();
        
        Tabung tabung = new Tabung();
        tabung.r = 21;
        tabung.tinggi = 35;
        tabung.hitungVol();
        tabung.hitungLuasSelimut();
    }
}
