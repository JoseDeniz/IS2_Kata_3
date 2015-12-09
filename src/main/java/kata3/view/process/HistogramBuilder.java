package kata3.view.process;

import kata3.model.Histogram;

import static java.util.Arrays.stream;

public class HistogramBuilder<T> {

    public Histogram<T> build(T[] vector) {
        Histogram<T> histogram = new Histogram<>();
        stream(vector).forEach(histogram::increment);
        return histogram;
    }

}
