package streams;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsKata {

    public static List<String> transform(List<List<String>> collection) {

//        List<String> newCollection = new ArrayList<>();
//        for (List<String> subCollection : collection) {
//            for (String value : subCollection) {
//                newCollection.add(value);
//            }
//        }

        List<String> newCollection = collection.stream().flatMap(strings -> strings.stream()).collect(toList());
        return newCollection;
    }



}
