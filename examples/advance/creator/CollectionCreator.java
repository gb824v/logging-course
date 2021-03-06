package com.att.biq.day27.logging.examples.advance.creator;

import com.att.biq.day27.logging.examples.advance.creator.number.NumberCollectionCreator;

import java.util.Collection;

public interface CollectionCreator<T> {
    Collection<T> create(int total);

    static <E> CollectionCreator<E> get(Class<E> type) {

        if (type == Integer.class)
            return (CollectionCreator<E>) new NumberCollectionCreator();

        if (type == String.class) {
            return (CollectionCreator<E>) new com.att.biq.day27.logging.examples.advance.creator.string.StringCollectionCreator();
        }

        throw new UnsupportedOperationException("Can't create collection creator for type: " + type.getSimpleName());
    }
}
