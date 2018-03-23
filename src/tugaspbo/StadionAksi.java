/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo;

/**
 *
 * @author Hanafi
 */
public class StadionAksi {
    public static void main(String[] args) {
        Stadion satu= new Stadion ();
        Stadion dua= new Stadion ();
        Stadion tiga= new Stadion ();
        
        satu.namastd="Gelora Bung Tomo ";
        satu.kapasitas="60000";
        satu.kota="Surabaya";
        satu.negara="Indonesia";
        satu.markas="Persebaya Surabaya";
        
        dua.namastd="Si Jalak Harupat";
        dua.kapasitas="40000";
        dua.kota="Bandung";
        dua.negara="Indonesia";
        dua.markas="Persib Bandung dan Persikab Bandung";
        
        tiga.namastd="Gelora Bung Karno";
        tiga.kapasitas="88306";
        tiga.kota="Jakarta";
        tiga.negara="Indonesia";
        tiga.markas="Timnas Indonesia dan Persija Jakarta";
        
        satu.cetakinfo();
        dua.cetakinfo();
        tiga.cetakinfo();
    }
    
}
