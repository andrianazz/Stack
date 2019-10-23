public class Testing {
    public static void main(String[] args) {
        Stacking x = new Stacking(5);

        x.push("Kalkulus");
        x.push("Studi Islam");
        x.push("Pemrograman");
        x.push("Web");
        x.push("Jaringan");

        x.cetak();

        System.out.println("========================================");
        System.out.println(x.cari("Kalkulus"));
    }
}
