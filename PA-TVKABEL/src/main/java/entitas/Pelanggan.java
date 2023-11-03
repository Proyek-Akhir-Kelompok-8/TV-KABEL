package entitas;

import db.database;
import java.sql.*;

 
public class Pelanggan extends database{
    private int IdPelanggan;
    private String namaPelanggan;
    private int paketTvKabelIdPaket;
    private String alamat;
    private String noHandphone;
    private String email;
    private Date tanggalBerlangganan;
    private String statusLangganan;
    private int pegawaiIdPegawai;
    
    
    


    
public boolean createPelanggan(String idPelanggan, String nama, String idPaket, String alamat, String noHP, String email, String tanggalBerlangganan, String statusLangganan, String idPegawai) {
    boolean isOperationSuccess = false;

    Connection connection = null;
    PreparedStatement preparedStatement = null;

    try {
        connection = this.getConnection();
        String sql = "INSERT INTO pelanggan (ID_Pelanggan, Nama_Pelanggan, PAKET_TV_KABEL_ID_Paket, Alamat, No_Handphone, Email, Tanggal_Berlangganan, Status_Langganan, PEGAWAI_ID_Pegawai) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, idPelanggan);
        preparedStatement.setString(2, nama);
        preparedStatement.setString(3, idPaket);
        preparedStatement.setString(4, alamat);
        preparedStatement.setString(5, noHP);
        preparedStatement.setString(6, email);
        preparedStatement.setString(7, tanggalBerlangganan);
        preparedStatement.setString(8, statusLangganan);
        preparedStatement.setString(9, idPegawai);

        int result = preparedStatement.executeUpdate();
        isOperationSuccess = result > 0;
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    return isOperationSuccess;
}    
    
    
public boolean deletePelanggan(String idPelanggan) {
    boolean isOperationSuccess = false;

    Connection connection = null;
    PreparedStatement preparedStatement = null;

    try {
        connection = this.getConnection();
        String sql = "DELETE FROM pelanggan WHERE ID_Pelanggan = ?";
        preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, idPelanggan);

        int result = preparedStatement.executeUpdate();
        isOperationSuccess = result > 0;
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    return isOperationSuccess;
}
    
    
public boolean updatePelanggan(String idPelanggan, String nama, String idPaket, String alamat, String noHP, String email, String tanggalBerlangganan, String statusLangganan, String idPegawai) {
    boolean isOperationSuccess = false;

    Connection connection = null;
    PreparedStatement preparedStatement = null;

    try {
        connection = this.getConnection();
        String sql = "UPDATE pelanggan SET Nama_Pelanggan = ?, PAKET_TV_KABEL_ID_Paket = ?, Alamat = ?, No_Handphone = ?, Email = ?, Tanggal_Berlangganan = ?, Status_Langganan = ?, PEGAWAI_ID_Pegawai = ? WHERE ID_Pelanggan = ?";
        preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, nama);
        preparedStatement.setString(2, idPaket);
        preparedStatement.setString(3, alamat);
        preparedStatement.setString(4, noHP);
        preparedStatement.setString(5, email);
        preparedStatement.setString(6, tanggalBerlangganan);
        preparedStatement.setString(7, statusLangganan);
        preparedStatement.setString(8, idPegawai);
        preparedStatement.setString(9, idPelanggan);

        int result = preparedStatement.executeUpdate();
        isOperationSuccess = result > 0;
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    return isOperationSuccess;
}
    
    
    
    
    
    
    
    
















}
