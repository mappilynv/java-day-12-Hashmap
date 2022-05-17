import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matthew", "Matt");
        nicknames.put("michael", "Mix");
        nicknames.put("arthur", "Artie");

        System.out.println(nicknames.get("matthew"));

    }

}
