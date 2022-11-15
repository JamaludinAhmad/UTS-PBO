/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lingkaran;

/**
 *
 * @author user
 */
public class SetengahLingkaran implements Lingkaran{
    
    double hasil;
    public SetengahLingkaran(){
        hasil = 0;
    }
    @Override
    public void hitungLuas() {
        hasil = (panjang * lebar) * (Math.PI * lebar * lebar);
    }
    
    public double getHasil(){
        return hasil;
    }
}
