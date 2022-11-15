
package com.lingkaran;


public class SetengahLingkaran implements Lingkaran{
    
    double hasil;
    public SetengahLingkaran(){
        hasil = 0;
    }
    
    @Override
    public void hitungLuas() {
        hasil = (PANJANG * LEBAR) - ((3.14 * LEBAR * LEBAR) / 2);
    }
    
    @Override
    public void tampilkanLuas() {
        System.out.println("luas nya adalah : " + this.getHasil());
    }
    
    public double getHasil(){
        return hasil;
    }

    
}
