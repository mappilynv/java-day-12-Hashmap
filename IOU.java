import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> iou;

    //creates a new IOU
    public IOU() {
        this.iou = new HashMap<>();
    }

    //saves the amount owed and the person owed to the IOU.
    public void setSum(String toWhom, double amount) {
        this.iou.put(toWhom, amount);
    }

    //returns the amount owed to the person whose name is given as a parameter. If the person cannot be found, it returns 0.
    public double howMuchDoIOweTo(String toWhom) {
        if (this.iou.containsKey(toWhom)) {
            return this.iou.get(toWhom);
        }
        return 0;
    }

    public static void main(String[] args) {
//        IOU mattsIOU = new IOU();
//        mattsIOU.setSum("Arthur", 51.5);
//        mattsIOU.setSum("Michael", 30);
//
//        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
//        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Arthur", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
    }
}
