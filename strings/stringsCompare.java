public class stringsCompare {
    
    public static void main(String[] args) {
        String name1 = "Tom";
        String name2 = "Tom";
        String name3 = new String("Tom");
        
        if (name1 == name2) {
            System.out.println("Strings are equal! ");
        }else{
            System.out.println("Strings aren't equal! ");
        }
        
        if (name1 == name3) {
            System.out.println("Strings are equal! ");
        }else{
            System.out.println("Strings ain't equal! ");
        }

        if (name1.equals(name3)) {
            System.out.println("Strings are equal! ");
        }else{
            System.out.println("Strings aren't equal! ");
        }
    }
}
