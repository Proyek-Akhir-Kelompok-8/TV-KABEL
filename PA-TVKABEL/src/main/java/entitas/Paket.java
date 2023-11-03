/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitas;

import db.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author donik
 */
public class Paket extends database{
    String idPaket, namaPaket, harga, masaBerlaku, daftarSaluran, fiturTambahan, idPegawai, saluranKhusus, layananVip, kontenPremium;

    public Paket(String idPaket, String namaPaket, String harga, String masaBerlaku, String daftarSaluran, String fiturTambahan, String idPegawai, String saluranKhusus, String layananVip, String kontenPremium) {
        this.idPaket = idPaket;
        this.namaPaket = namaPaket;
        this.harga = harga;
        this.masaBerlaku = masaBerlaku;
        this.daftarSaluran = daftarSaluran;
        this.fiturTambahan = fiturTambahan;
        this.idPegawai = idPegawai;
        this.saluranKhusus = saluranKhusus;
        this.layananVip = layananVip;
        this.kontenPremium = kontenPremium;
    }

    public String getIdPaket() {
        return idPaket;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public String getHarga() {
        return harga;
    }

    public String getMasaBerlaku() {
        return masaBerlaku;
    }

    public String getDaftarSaluran() {
        return daftarSaluran;
    }

    public String getFiturTambahan() {
        return fiturTambahan;
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public String getSaluranKhusus() {
        return saluranKhusus;
    }

    public String getLayananVip() {
        return layananVip;
    }

    public String getKontenPremium() {
        return kontenPremium;
    }
    
    public static ArrayList<Paket> readPaket() throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tv_kabel","root","");;
        Statement st = connection.createStatement();
        ArrayList<Paket> arrayPaket = new ArrayList<>();
        
        String query = String.format("SELECT `paket_tv_kabel`.*, `diamond`.`Saluran_Khusus`, `diamond`.`Layanan_VIP`, `platinum`.`Konten_Premium` FROM `paket_tv_kabel` LEFT JOIN `diamond` ON `diamond`.`ID_Paket` = `paket_tv_kabel`.`ID_Paket` LEFT JOIN `platinum` ON `platinum`.`ID_Paket` = `paket_tv_kabel`.`ID_Paket`");
        
        ResultSet values = st.executeQuery(query);
        while (values.next()) {            
            String idPaket = values.getString(1);
            String namaPaket = values.getString(2);
            String harga = values.getString(3);
            String masaBerlaku = values.getString(4);
            String daftarSaluran = values.getString(5);
            String fiturTambahan = values.getString(6);
            String idPegawai = values.getString(7);
            String saluranKhusus = values.getString(8);
            String layananVip = values.getString(9);
            String kontenPremium = values.getString(10);

            Paket data = new Paket(idPaket, namaPaket, harga, masaBerlaku, daftarSaluran, fiturTambahan, idPegawai, saluranKhusus, layananVip, kontenPremium);
            arrayPaket.add(data);
        }
        return arrayPaket;
    }
    
    
    
//    public static ArrayList<Paket> readPaket() throws SQLException{
//    Connection connection = null;
//    Statement st = null;
//    ArrayList<Paket> arrayPaket = new ArrayList<>();
//    
//    try {
//        // Inisialisasi koneksi database
//        connection = // inisialisasikan koneksi database Anda di sini
//
//        // Buat objek Statement
//        st = connection.createStatement();
//
//        String query = String.format("SELECT `paket_tv_kabel`.*, `diamond`.`Saluran_Khusus`, `diamond`.`Layanan_VIP`, `platinum`.`Konten_Premium` FROM `paket_tv_kabel` LEFT JOIN `diamond` ON `diamond`.`ID_Paket` = `paket_tv_kabel`.`ID_Paket` LEFT JOIN `platinum` ON `platinum`.`ID_Paket` = `paket_tv_kabel`.`ID_Paket`");
//
//        ResultSet values = st.executeQuery(query);
//        while (values.next()) {            
//            // Dapatkan data dari ResultSet dan buat objek Paket
//            String idPaket = values.getString(1);
//            String namaPaket = values.getString(2);
//            String harga = values.getString(3);
//            String masaBerlaku = values.getString(4);
//            String daftarSaluran = values.getString(5);
//            String fiturTambahan = values.getString(6);
//            String idPegawai = values.getString(7);
//            String saluranKhusus = values.getString(8);
//            String layananVip = values.getString(9);
//            String kontenPremium = values.getString(10);
//
//            Paket data = new Paket(idPaket, namaPaket, harga, masaBerlaku, daftarSaluran, fiturTambahan, idPegawai, saluranKhusus, layananVip, kontenPremium);
//            arrayPaket.add(data);
//        }
//    } finally {
//        // Pastikan untuk menutup statement dan koneksi
//        if (st != null) {
//            st.close();
//        }
//        if (connection != null) {
//            connection.close();
//        }
//    }
//
//    return arrayPaket;
//}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
