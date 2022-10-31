import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getUniqueStringValues(new ArrayList<>(Arrays.asList("hello", "hi", "good morning", "hello")))); //преобразование в лист
        System.out.println(getUniqueIntegerValues(new ArrayList<>(Arrays.asList(1, 12, 2, 21, 12, 2))));
    }

    private static List<String> getUniqueStringValues(List<String> values) {
        List<String> toRemove = new ArrayList<>(); //лист элементов, которые не уникальны
        values.stream().filter(v -> values.stream().filter(v1 -> v1.equals(v)).count() > 1).forEach(toRemove::add); //лист, созданный из
        // последовательности, проверяется, существует ли в нём элементы, которые повторяется 2+ раз и добавляем эти элементы в лист для
        // удаления (toRemove)
        values.removeAll(toRemove); //удаляем все неуникальные элементы
        return values; //возвращение листа без неуникальных значений
    }

    private static List<Integer> getUniqueIntegerValues(List<Integer> values) { //то же для чисел
        List<Integer> toRemove = new ArrayList<>();
        values.stream().filter(v -> values.stream().filter(v1 -> v1.equals(v)).count() > 1).forEach(toRemove::add);
        values.removeAll(toRemove);
        return values;
    }
}