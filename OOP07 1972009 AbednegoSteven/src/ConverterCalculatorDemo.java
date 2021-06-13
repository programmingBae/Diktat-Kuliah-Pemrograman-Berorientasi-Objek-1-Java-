/**
 * @author AbednegoSteven - 1972009
 */
public class ConverterCalculatorDemo {
    public static void main(String[] args) {
        int number = 20000;
        System.out.println(ConverterCalculator.convertToBinary(number));
        System.out.println(ConverterCalculator.convertToHexa(number));
        System.out.println(ConverterCalculator.convertToOctal(number));

        String string1 = "FF";
        System.out.println(ConverterCalculator.convertHexaToDecimal(string1));
        String string2 = "256a";
        System.out.println(ConverterCalculator.convertHexaToDecimal(string2));
        String string3 = "1112";
        System.out.println(ConverterCalculator.convertBinaryToDecimal(string3));
        String string4 = "110011001111";
        System.out.println(ConverterCalculator.convertBinaryToDecimal(string4));

    }
}
