/**
 * @author AbednegoSteven - 1972009
 */

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class nomor1 {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.GERMAN);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan uang yang hendak didepositokan : ");
        int deposito = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan lama deposito (tahun) : ");
        int lamaDeposito = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan bunga deposito : ");
        double bungaDeposito = scanner.nextDouble();
        scanner.nextLine();
        double depositoKenaBunga = (bungaDeposito/100) * lamaDeposito * deposito;
        double saldoAkhir = depositoKenaBunga + deposito;

        String depositoKenaBunga2 = numberFormat.format(depositoKenaBunga);
        String saldoAkhir2 = numberFormat.format(saldoAkhir);
        System.out.println("Jumlah uang : " + deposito);

        System.out.println("Bunga Deposito  : " + depositoKenaBunga2 );
        System.out.println("Saldo akhir : " + saldoAkhir2);
    }
}
