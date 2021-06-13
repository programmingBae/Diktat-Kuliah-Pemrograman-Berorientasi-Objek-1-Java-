/**
 * @author AbednegoSteven - 1972009
 */
import java.util.regex.*;
public class ConverterCalculator {


    private static String binRegex = "\\A[01]+\\Z";
    // private static String hexRegex = "\\A[0-9A-F]+\\Z\n";
    // private static String octalRegex = "\\A0[0-7]*\\Z";
    public static String convertToBinary (int number){
        return coreConverterFromDecimal(number,2);
    }
    public static String convertToHexa(int number){
        return coreConverterFromDecimal(number,16);
    }
    public static String convertToOctal(int number){
        return coreConverterFromDecimal(number,8);
    }
    public static int convertBinaryToDecimal(String number){
        return coreConverterToDecimal(number,2);
    }
    public static int convertHexaToDecimal(String number){
        return coreConverterToDecimal(number,16);
    }
    private static String coreConverterFromDecimal(int number, int radix){
        StringBuilder sb = new StringBuilder();
        int a = 0; // untuk mengecek apakah bilangan sudah kelipatan 4 atau 3
        int rem;
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(number > 0)
        {
            if (a%4==0 && radix == 2 ){
                sb.append(" ");

            }else if (a%3 == 0 && radix == 8){
                sb.append(" ");
            }else if (a%4==0 && radix == 16 ){
                sb.append(" ");
            }
            if (radix == 16){
                rem = number%16;
                sb.append(hexchars[rem]);
                number = number / radix;
                a++;
            }else {
                sb.append(number % radix);
                number = number / radix;
                a++;
            }
        }
        return String.valueOf(sb.reverse());
    }
    private static int coreConverterToDecimal(String numberString, int radix){
        Pattern pattern2 = Pattern.compile(binRegex);
        Matcher m2= pattern2.matcher(numberString);
        numberString = numberString.toUpperCase();
        int val = 0;
        // Jika !m2.matches maka numberString adalah hex, dan jika
        // m2.matches maka numberString adalah binary.
        if (!m2.matches()){
            if (radix == 16){
                String digits = "0123456789ABCDEF";
                for (int i = 0; i < numberString.length(); i++)
                {
                    char c = numberString.charAt(i);
                    int d = digits.indexOf(c);
                    val = 16*val + d;
                }
            }
        }else if (m2.matches()){
            if (radix == 2){
            double j=0;
            for(int i=0;i<numberString.length();i++){
                if(numberString.charAt(i)== '1'){
                    j=j+ Math.pow(2,numberString.length()-1-i);
                }
            }
            val = (int)j;
            }
        }

        return val;

    }


}
