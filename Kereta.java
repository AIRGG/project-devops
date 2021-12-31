/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectdevops_tiket;

import java.util.Scanner;

/**
 *
 * @author AIRGG
 */
public class Kereta {
    Integer harga = 0;
    Integer orang = 0;
    String tikettype = "";
    
    public Kereta (Integer orang) {
        this.orang = orang;
    }
    public void hitung () {
        System.out.println("-- Pilih Kereta --");
        System.out.println("1. Express");
        System.out.println("2. Ekonomi");
        Scanner scan = new Scanner(System.in);
        int inp = scan.nextInt();
        hitung(inp, false);
    }
    public void hitung (int inp, Boolean fortest) {
//        System.out.println("Harga Tiket Kereta: "+ (harga * orang));
        if (fortest) {
            System.out.println("-- Pilih Kereta --");
            System.out.println("1. Express");
            System.out.println("2. Ekonomi");
        }
        switch (inp) {
            case 1:
                tikettype = "Express";
                this.harga = 10000;
                break;
            case 2:
                tikettype = "Ekonomi";
                this.harga = 5000;
                break;
            default:
                System.out.println("..Wrong Input..");
                return;
        }
        
        System.out.println(String.format("Tiket '%s' Harga %s", tikettype, this.harga));
        System.out.println(String.format("Penumpang: %s Orang", this.orang));
        System.out.println(String.format("Total Bayar: '%s'", (this.orang * this.harga)));
    }
}
