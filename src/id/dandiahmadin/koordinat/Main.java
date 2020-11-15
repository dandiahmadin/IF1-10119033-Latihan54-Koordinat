/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.koordinat;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi Koordinat dengan pendekatan object oriented dan 
 * penerapan konsep pewarisan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat warnaKoordinat1 = new WarnaKoordinat(10, 4, "Jingga");
        System.out.println("Warna Koordinat : ".concat(warnaKoordinat1.getNamaWarna()));
        System.out.println("Koordinat Sumbu x : " + warnaKoordinat1.getX() + ", y : " + warnaKoordinat1.getY());
    }
    
}
