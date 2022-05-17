import java.util.HashMap;
import java.util.ArrayList;

public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content){
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", published=" + published +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList<Book> books = new ArrayList<>();
//        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
//        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "...");
//        books.add(senseAndSensibility);
//        books.add(prideAndPrejudice);
//
//        long start = System.nanoTime();
//
//        System.out.println(get(books, "Sense and Sensibility"));
//
//        System.out.println();
//
//        System.out.println(get(books, "Persuasion"));
//
//        long end = System.nanoTime();
//        double durationInMilliseconds = 1.0 * (end - start) / 1000000;
//        System.out.println("The book search took "+ durationInMilliseconds+" milliseconds.");

//        HashMap<String, Book> directory = new HashMap<>();
//        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
//        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "...");
//
//        directory.put(senseAndSensibility.getName(), senseAndSensibility);
//        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);
//
//        long start = System.nanoTime();
////
//////        Book book = directory.get("Persuasion");
//////        System.out.println(book);
//////        System.out.println();
//        Book book = directory.get("Pride and Prejudice");
//        System.out.println(book);
//        long end = System.nanoTime();
//        double durationInMilliseconds = 1.0 * (end - start) / 1000000;
//        System.out.println("The book search took "+ durationInMilliseconds+" milliseconds.");
//
//
//
//    }
//
//    public static Book get(ArrayList<Book> books, String name){
//        for(Book book: books){
//            if(book.getName().equals(name)){
//                return book;
//            }
//        }
//        return null;
//
//    }
        /**
         * Print me another hash map exercise
         */
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        Program.printValues(hashmap);
        System.out.println("---");
        Program.printValueIfNameContains(hashmap, "prejud");

    }

}
