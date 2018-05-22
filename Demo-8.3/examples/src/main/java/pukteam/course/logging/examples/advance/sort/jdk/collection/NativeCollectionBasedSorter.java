package pukteam.course.logging.examples.advance.sort.jdk.collection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.att.biq.day27.logging.examples.advance.sort.SortCollection;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class NativeCollectionBasedSorter implements SortCollection {

    private static Logger log = LogManager.getLogger(
			com.att.biq.day27.logging.examples.advance.sort.jdk.collection.NativeCollectionBasedSorter.class);

    @Override
    public <E extends Comparable<E>> Collection<E> sortACollection(Collection<E> input) {

        log.debug("About to sort collection using native Collections.sort() method: " + input);
        Instant start = Instant.now();

        List<E> result = new ArrayList<>(input);
        Collections.sort(result);

        Instant end = Instant.now();
        log.debug("Sorted collection in: " + Duration.between(start, end).toNanos() + " nano seconds...");

        return result;
    }

}
