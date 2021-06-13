/*
Abednego Steven - 1972009
 */
public class NumberConverter {
    public static String convertToBinary(int number){
        String binary = Integer.toBinaryString(number);
        return binary;
    }
    public static String convertToOctal(int number){
        String octal = Integer.toOctalString(number);
        return octal;
    }
    public static String convertToHex(int number){
        String hex = Integer.toHexString(number).toUpperCase();
        return hex;
    }
}
