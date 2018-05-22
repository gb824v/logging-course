package com.att.biq.day27.logging.examples.advance.sort;

import com.att.biq.day27.logging.examples.advance.sort.bubble.BubbleSort;
import com.att.biq.day27.logging.examples.advance.sort.jdk.stream.StreamSortBasedSorter;

import java.util.Collection;

public interface SortCollection {
    enum SORT_ALG {BUBBLE, COLLECTION, STREAM};

    <E extends Comparable<E>> Collection<E> sortACollection(Collection<E> input);

    static SortCollection get(SORT_ALG sortAlg) {
        switch (sortAlg) {
            case pukteam.course.logging.examples.advance.sort.SortCollection.SORT_ALG.BUBBLE:
                return new BubbleSort();
            case pukteam.course.logging.examples.advance.sort.SortCollection.SORT_ALG.COLLECTION:
                return new com.att.biq.day27.logging.examples.advance.sort.jdk.collection.NativeCollectionBasedSorter();
            case pukteam.course.logging.examples.advance.sort.SortCollection.SORT_ALG.STREAM:
                return new StreamSortBasedSorter();
            default:
                throw new UnsupportedOperationException("Unknown sort algorithm: " + sortAlg);
        }

    }
}
