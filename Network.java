import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<String> numbers = new ArrayList<>();

    public boolean registration(String n) {
        if (checkNumber(n)) {
            return false;
        } else {
            numbers.add(n);
            System.out.println("Number "+ n+" reg");
            return true;

        }
    }
    public boolean checkNumber(String n){
        if (numbers.contains(n)) {
            return true;
        } else {
            return false;
        }
    }
}
