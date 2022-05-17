import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviationMap;

    public Abbreviations(){
        this.abbreviationMap = new HashMap<>();
    }

    //adds a new abbreviation and its explanation.
    public void addAbbreviation(String abbreviation, String explanation){
        abbreviationMap.put(sanitizedString(abbreviation), sanitizedString(explanation));
    }


    //checks if an abbreviation has already been added; returns true if it has and false if it has not.
    public boolean hasAbbreviation(String abbreviation){
        abbreviation = sanitizedString(abbreviation);
        if(this.abbreviationMap.containsKey(abbreviation)){
            return true;
        } else {
           return false;
        }

    }

    //finds the explanation for an abbreviation; returns null if the abbreviation has not been added yet.
    public String findExplanationFor(String abbreviation){
        return this.abbreviationMap.get(sanitizedString(abbreviation));

    }

    public static String sanitizedString(String string){
        if (string == null){
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();


    }


}
