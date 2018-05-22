package com.att.biq.day27.logging.examples.advance.sort.jdk.stream;

import com.att.biq.day27.logging.examples.advance.sort.SortCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamSortBasedSorter implements SortCollection {
    @Override
    public <E extends Comparable<E>> Collection<E> sortACollection(Collection<E> input) {
        return input
                .stream()
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
