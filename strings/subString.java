public class subString {
    public static String substring(String str, int start, int end){
        String substr = "";
        for(int i = start; i < end; i++){
            substr += substr.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(substring(str, 0, 5));
    }
}
