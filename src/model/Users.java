/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author asus
 */
public class Users {
    private int id_user,jenisKelamin;
    private String nama,nik,alamat,level,username,password;

    public Users(int id_user, String nama, String nik, String alamat, int jenisKelamin, String level, String username, String password) {
        this.id_user = id_user;
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.level = level;
        this.username = username;
        this.password = password;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJenisKelamin(int jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId_user() {
        return id_user;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJenisKelamin() {
        return jenisKelamin;
    }

    public String getLevel() {
        return level;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
}
