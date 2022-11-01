import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getUniqueStringValues(new String[]{"hello", "hi", "good morning", "hello"}));
    }

    private static List<String> getUniqueStringValues(String[] values) {
        ArrayList<String> output = new ArrayList<>();
        for (String value : values) {
            if (!output.contains(value)) output.add(value);
        }
        return output;
    }
}
