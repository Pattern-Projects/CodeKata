import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {

    }
    public static List<String> transform(List<List<String>> collection) {

        List<String> newCollection = collection.stream().flatMap(strings -> strings.stream()).collect(toList());

        return newCollection;
    }


}