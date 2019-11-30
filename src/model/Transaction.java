/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Transaction {
    int id;
    String tanggal, menu, barber, cashier, member;
    int total, uangBayar, diskon, kembalian;

    public Transaction(int id, String tanggal, String menu, String barber, String cashier, String member, int total, int uangBayar, int diskon, int kembalian) {
        this.id = id;
        this.tanggal = tanggal;
        this.menu = menu;
        this.barber = barber;
        this.cashier = cashier;
        this.member = member;
        this.total = total;
        this.uangBayar = uangBayar;
        this.diskon = diskon;
        this.kembalian = kembalian;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getBarber() {
        return barber;
    }

    public void setBarber(String barber) {
        this.barber = barber;
    }

    public String getCashier() {
        return cashier;
    }

    public void setCashier(String cashier) {
        this.cashier = cashier;
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getUangBayar() {
        return uangBayar;
    }

    public void setUangBayar(int uangBayar) {
        this.uangBayar = uangBayar;
    }

    public int getDiskon() {
        return diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    public int getKembalian() {
        return kembalian;
    }

    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }
    
}
