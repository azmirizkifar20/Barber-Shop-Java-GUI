package model;

public class Member {
    String id_member, nama_member, alamat, tanggal_lahir, no_telp, email;

    public Member(String id_member, String nama_member, String alamat, String tanggal_lahir, String no_telp, String email) {
        this.id_member = id_member;
        this.nama_member = nama_member;
        this.alamat = alamat;
        this.tanggal_lahir = tanggal_lahir;
        this.no_telp = no_telp;
        this.email = email;
    }

    public String getId_member() {
        return id_member;
    }

    public void setId_member(String id_member) {
        this.id_member = id_member;
    }

    public String getNama_member() {
        return nama_member;
    }

    public void setNama_member(String nama_member) {
        this.nama_member = nama_member;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
