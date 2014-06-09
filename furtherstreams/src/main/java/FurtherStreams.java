import java.util.function.BiFunction;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class FurtherStreams{


    static <T> Stream<T> takeWhile(Stream<T> s, Predicate<? super T> predicate){
        // TODO
        return null;
    }

    static <T> Stream<T> dropWhile(Stream<T> s, Predicate<? super T> predicate){

        // TODO
        return null;
    }

    static <A, B, C> Stream<C> zip(Stream<? extends A> a, Stream<? extends B> b,
                                   BiFunction<? super A, ? super B, ? extends C> zipper) {

        // TODO
        return null;
    }


}
