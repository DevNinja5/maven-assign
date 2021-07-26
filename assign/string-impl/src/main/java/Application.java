
public class Application {
    public static void main(String[] args) {
        StringFunctions obj = new StringFunctions();
        String s ="abcd";
        int x = StringFunctions.sizeofString(s);
        String rev = StringFunctions.reverseString(s);
        //int size = StringFunctions.sizeofString("jhvchjvcdhvchd");
        System.out.println(x+"\n"+rev);
    }
}
