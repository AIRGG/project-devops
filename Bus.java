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
public class Bus {
    Integer harga = 0;
    Integer orang = 0;
    String tikettype = "";
    
    public Bus (Integer orang) {
        this.orang = orang;
    }
    public void hitung () {
        System.out.println("-- Pilih Bus --");
        System.out.println("1. Argo Winangun");
        System.out.println("2. Gajah Mungkur");
        Scanner scan = new Scanner(System.in);
        int inp = scan.nextInt();
        hitung(inp, false);
    }
    public void hitung (int inp, Boolean fortest) {
        if (fortest) {
            System.out.println("-- Pilih Bus --");
            System.out.println("1. Argo Winangun");
            System.out.println("2. Gajah Mungkur");
        }
        switch (inp) {
            case 1:
                tikettype = "Argo Winangun";
                this.harga = 30000;
                break;
            case 2:
                tikettype = "Gajah Mungkur";
                this.harga = 50000;
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
