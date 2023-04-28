package streams.test;

import streams.StreamsKata;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;

public class StreamsKataTest {
// }

    @Test
    public void transformShouldFlattenCollection() {
        List<List<String>> collection = asList(asList("Viktor", "Farcic"), asList("John", "Doe", "Third"));
        List<String> expected = asList("Viktor", "Farcic", "John", "Doe", "Third");
        assert(StreamsKata.transform(collection)).equals( expected);
    }

// {
}
// }