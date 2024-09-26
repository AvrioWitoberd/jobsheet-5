import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
         try {
             System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();
                
         if (usia < 0) {
             System.out.println("Usia tidak boleh negatif. Silakan coba lagi.");
         continue;  
}
        String kategori;
         if (0 <= usia && usia <= 12) {
           kategori = "Anak";
        } else if (13 <= usia && usia <= 19) {
           kategori = "Remaja";
        } else if (20 <= usia && usia <= 64) {
           kategori = "Dewasa";
        } else {
           kategori = "Lansia";
}
             System.out.println("Kategori usia Anda adalah: " + kategori);
         break; 
                
        } catch (Exception e) {
             System.out.println("Input tidak valid Harap masukkan angka positif.");
        scanner.next(); 
}
    } 
        scanner.close();  
    }
}

