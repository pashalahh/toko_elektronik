/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package konektor;

/**
 *
 * @author LENOVO
 */
public class produk {
    private int id_produk;
    private String nama_produk;
    private int harga;
    private int stok;
    private int id_kategori;
    private int diskon;
    
    
    public int getIdproduk() {
        return id_produk;
    }

    public void setIdproduk(int id_produk) {
        this.id_produk = id_produk;
    }

    public String getNamaproduk() {
        return nama_produk;
    }

    public void setNamaproduk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getIdkategori() {
        return id_kategori;
    }

    public void setIdkategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    public int getDiskon() {
        return diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    
}
