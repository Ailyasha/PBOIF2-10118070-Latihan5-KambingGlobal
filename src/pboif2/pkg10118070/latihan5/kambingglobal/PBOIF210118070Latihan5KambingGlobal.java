/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan5.kambingglobal;

/**
 *
 * @author
 * NAMA     : Aufa Ilyasha
 * Kelas    : IF2
 * NIM      : 10118070
 */
public class PBOIF210118070Latihan5KambingGlobal {

    //Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " +
                jumlahKambing);
    }
     
    public static void main(String[] args) {
        PBOIF210118070Latihan5KambingGlobal kambingSusu = new PBOIF210118070Latihan5KambingGlobal();
      
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
         kambingSusu.getJumlahKambing();
         
        // Menambah satu kambing
         kambingSusu.tambahKambing();
         
        // Menampilkan jumlah kambing yang ada
         kambingSusu.getJumlahKambing();
    }
    
}
