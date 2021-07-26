
public class StringFunctions {
    public static String reverseString(String s){
        StringBuilder reversed = new StringBuilder();
        reversed.append(s);
        reversed.reverse();
        s = String.valueOf(reversed);
        return s;
    }
    public static int sizeofString(String s){
        return s.length();
    }
}
