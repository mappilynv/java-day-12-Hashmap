import java.util.HashMap;

public class Program {

    //prints all the keys in the hashmap given as a parameter.
    public static void printKeys(HashMap<String,String> hashmap){
        for(String key: hashmap.keySet()){
            System.out.println(key);
        }

    }

    //prints the keys in the hashmap given as a parameter, which contain the string given as a parameter.
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for(String key: hashmap.keySet()){
            if(key.contains(text)){
                System.out.println(key);
            }
        }
    }


    //prints the values in the given hashmap whichs keys contain the given string
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for(String key: hashmap.keySet()){
            if(key.contains(text)){
                System.out.println(hashmap.get(key));
            }
        }
    }

    /**
     * Print me another hash map exercise
     */


    //prints all the values in the hashmap given as a parameter using the toString method of the Book objects
    public static void printValues(HashMap<String,Book> hashmap){
        for(String value: hashmap.keySet()){
            System.out.println(hashmap.get(value));
        }
    }

    //prints only the Books in the given hashmap which name contains the given string. You can find out the name of a Book with the method getName
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for(Book book: hashmap.values()){
            if(book.getName().contains(text)){
                System.out.println(book);
            }
        }
    }


    public static String sanitizedString(String string){
        if (string == null){
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }

    public static void main(String[] args) {
//        HashMap<String, String> hashmap = new HashMap<>();
//        hashmap.put("f.e", "for example");
//        hashmap.put("etc.", "and so on");
//        hashmap.put("i.e", "more precisely");
//
//        printKeys(hashmap);
//        System.out.println("---");
//        printKeysWhere(hashmap, "i");
//        System.out.println("---");
//        printValuesOfKeysWhere(hashmap, ".e");


    }

}
