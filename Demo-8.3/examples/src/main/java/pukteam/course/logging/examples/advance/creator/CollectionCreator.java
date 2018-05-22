package pukteam.course.logging.examples.advance.creator;

import com.att.biq.day27.logging.examples.advance.creator.number.NumberCollectionCreator;
import com.att.biq.day27.logging.examples.advance.creator.string.StringCollectionCreator;

import java.util.Collection;

public interface CollectionCreator<T> {
    Collection<T> create(int total);

    static <E> com.att.biq.day27.logging.examples.advance.creator.CollectionCreator<E> get(Class<E> type) {

        if (type == Integer.class)
            return (com.att.biq.day27.logging.examples.advance.creator.CollectionCreator<E>) new NumberCollectionCreator();

        if (type == String.class) {
            return (com.att.biq.day27.logging.examples.advance.creator.CollectionCreator<E>) new StringCollectionCreator();
        }

        throw new UnsupportedOperationException("Can't create collection creator for type: " + type.getSimpleName());
    }
}
