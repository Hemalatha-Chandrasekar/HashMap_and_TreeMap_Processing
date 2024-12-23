import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        ExampleOneHashMap exampleOneHashMap = new ExampleOneHashMap();
        exampleOneHashMap.exampleOneHashMap();
        exampleOneHashMap.ExampletwoHashMap();
        exampleOneHashMap.exampleTreemapOne();
        exampleOneHashMap.exampleTreemapTwo();
        // Creating a treemap with a customized comparator
        TreeMap<String, Integer> numbers = new TreeMap<>(new CustomComparator());

        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers);
    }
}

