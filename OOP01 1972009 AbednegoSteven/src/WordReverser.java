/*
Abednego Steven - 1972009
 */
public class WordReverser {
    public static String reverseWord(String word){
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return sb.toString();
    }
}
