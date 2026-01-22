/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konektor;

public class kategori {
    private int idKategori;
    private String namaKategori;
    
    public kategori(int idKategori, String namaKategori) {
        this.idKategori = idKategori;
        this.namaKategori = namaKategori;
    }

    public int getIdKategori() {
        return idKategori;
    }

    public String getNamaKategori() {
        return namaKategori;
    }
    

    @Override
    public String toString() {
        return namaKategori;
    }
}


/**
 *
 * @author LENOVO
 */

