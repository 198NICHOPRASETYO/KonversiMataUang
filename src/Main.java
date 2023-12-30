import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConverterMataUang converter = new ConverterMataUang();
        Scanner scanner = new Scanner(System.in);

        boolean continueConversion = true;

        while (continueConversion) {
            System.out.println("===== Selamat Datang Di Aplikasi Konversi Mata Uang =====");
            System.out.print("Masukkan jumlah uang (IDR): ");
            double amount = scanner.nextDouble();

            System.out.print("Pilih mata uang yang ingin dikonversi (USD, JPY, PHP, THB, EUR, CNY, KRW, MYR, TRY): ");
            String currencyCode = scanner.next().toUpperCase();

            double result = converter.convertTo(currencyCode, amount);

            if (result != -1) {
                System.out.println(amount + " IDR setara dengan " + result + " " + currencyCode);
            }

            System.out.println("Apakah Anda ingin mengonversi jumlah mata uang lagi? (ya/tidak): ");
            System.out.println("=================================================================");
            String continueInput = scanner.next().toLowerCase();
            continueConversion = continueInput.equals("ya");
        }

        System.out.println("Terima kasih telah menggunakan aplikasi konversi mata uang.");
    }
}
