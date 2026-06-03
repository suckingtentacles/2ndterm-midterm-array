import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] namaMenu = {"Soto", "Rawon", "Pecel", "Bakso", "Siomay"};
        int[] hargaMenu = {15000, 20000, 10000, 12500, 25000};
        
        int[] jumlahPorsi = new int[5];

        System.out.println("Masukkan jumlah porsi (isi 0 jika tidak memesan):");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.print("Jumlah " + namaMenu[i] + ": ");
            jumlahPorsi[i] = input.nextInt();
        }

        System.out.println("\nOutput :");
        System.out.println("Total Harga :");
        
        int totalSemua = 0;

        for (int i = 0; i < namaMenu.length; i++) {
            if (jumlahPorsi[i] > 0) {
                int subTotal = hargaMenu[i] * jumlahPorsi[i];
                totalSemua = totalSemua + subTotal;
                
                System.out.println("  - " + namaMenu[i] + " @" + hargaMenu[i] + " * " + jumlahPorsi[i] + " = " + subTotal);
            }
        }

        System.out.println("Total = " + totalSemua);
        input.close();
    }
}