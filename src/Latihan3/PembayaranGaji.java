/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author erisa
 */
class PembayaranGaji {
    
    public int hitungGaji(Pegawai peg){
        int uang = peg.gaji();
        
        if(peg instanceof Direktur)
            uang += ((Direktur)peg).Tunjangan();
        if(peg instanceof Staf)
            uang +=((Staf)peg).Bonus();
        return uang;
    }
    
    public static void main(String [] args){
        PembayaranGaji pg = new PembayaranGaji();
        Staf ali = new Staf();
        Direktur Toni = new Direktur();
        System.out.println("Gaji yang dibayarkan untuk staf = "+pg.hitungGaji(ali));
        System.out.println("Gaji yang dibayarkan untuk Direktur "+pg.hitungGaji(Toni));
    }
    
}
