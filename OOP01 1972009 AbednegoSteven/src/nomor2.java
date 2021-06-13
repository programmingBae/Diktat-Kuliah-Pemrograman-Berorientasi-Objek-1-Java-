/*
Abednego Steven - 1972009
 */
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class nomor2 {
    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.GERMAN);
        NumberFormat numberFormat2 = NumberFormat.getNumberInstance(Locale.GERMAN);
        DecimalFormat df = (DecimalFormat)numberFormat;
        DecimalFormat df2 = (DecimalFormat)numberFormat2;
        df.applyPattern("#.#####");
        df2.applyPattern("###,###.#####");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        double bilangan = scanner.nextDouble();
        double tes = Math.sqrt(bilangan);
        String tes2 = df.format(tes);
        double pangkat = Math.pow(bilangan,5);
        String pangkat5 = numberFormat2.format(pangkat);
        double kuadrat = bilangan * bilangan;
        String kuadratString = numberFormat.format(kuadrat);
        double abs = Math.abs(bilangan);
        String absString = numberFormat.format(abs);
        System.out.println("Hasil kuadrat : "+ kuadratString );
        System.out.println("Hasil pangkat 5 : "+pangkat5);
        System.out.println("Hasil akar kuadrat : "+tes2);
        System.out.println("Hasil absolut : "+absString);
        System.out.println("Hasil pembulatan : "+Math.round(bilangan));


    }
}
