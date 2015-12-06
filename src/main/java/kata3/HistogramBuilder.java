package kata3;

import static java.util.Arrays.stream;

public class HistogramBuilder<T> {

    public Histogram<T> build(T[] vector) {
        Histogram<T> histogram = new Histogram<>();
        stream(vector).forEach(histogram::increment);
        return histogram;
    }

}
