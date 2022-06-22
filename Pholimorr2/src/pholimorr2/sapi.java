/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pholimorr2;

/**
 *
 * @author JaneshPutra
 */

   class sapi implements hewan {

      // deklrasi method
    @Override
    public String suara() {
        System.out.println("Mooo");
        return null; //untuk mengembalikan nilai
    }

    @Override
    public String gerak() {
        System.out.println("Berjalan");
        return null;
    }

    @Override
    public String jenisMakanan() {
        System.out.println("Herbifora");
        return null;
    }
} 

