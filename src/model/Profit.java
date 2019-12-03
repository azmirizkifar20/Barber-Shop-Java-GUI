package model;

public class Profit {
    int total, keuntungan, gaji;

    public Profit(int total, int keuntungan, int gaji) {
        this.total = total;
        this.keuntungan = keuntungan;
        this.gaji = gaji;
    }

    public Profit() {
    }
    
    

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getKeuntungan() {
        return keuntungan;
    }

    public void setKeuntungan(int keuntungan) {
        this.keuntungan = keuntungan;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    
}
