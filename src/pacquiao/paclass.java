
package pacquiao;

public class paclass {

    private int gerak, skor, makan;
    private int x =1, y =1 ;

    public void atas() {
        y--;
        gerak--;
    }
    public void bawah() {
        y++;
        gerak--;
    }
    public void kiri() {
        x--;
        gerak--;
    }
    public void kanan() {
        x++;
        gerak--;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setMakan(int m) {
        makan = m;
    }
    public void setGerak(int g) {
        gerak = g;
    }
    public int getGerak() {
        return gerak;
    }
    public void skor() {
        skor++;
        System.out.println("Score : "+skor);
    }
    public int getSkor() {
        return skor;
    }
}
