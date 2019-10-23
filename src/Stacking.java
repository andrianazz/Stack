import java.sql.SQLOutput;

public class Stacking {

    String data[];
    int top;

    public Stacking(int jmlh) {
        data = new String[jmlh];
        top = -1;
    }

    public void push(String buku){
        if(top < data.length-1){
            top++;
            data[top] = buku;
        } else{
            System.out.println("RAK Sudah Penuh");
        }
    }

    public String pop(){
        if (top >= 0){
            String temp = data[top];
            top--;
            return temp;
        } else{
            System.out.println("Rak Kosong");
        }
        return "";
    }

    public void cetak(){
        System.out.println("Rak Buku");
        System.out.println("=====================================");
        for (int i = data.length-1; i >= 0  ; i--) {
            System.out.println(data[i] + "");
        }
    }

    public String cari(String book){
        System.out.println("Mencari buku buku " + book);
        for (int i = data.length-1; i >= 0; i--) {
            if (data[i] == book){
                return "Buku ada di tumpukan " + (i+1);
            }
        }
        return "Buku tidak ada";
    }


}
