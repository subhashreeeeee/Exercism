import java.util.Objects;
import java.util.*;
import static java.lang.Math.*;
public class PythagoreanTriplet {
    private final int a, b, c;
    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PythagoreanTriplet)) return false;
        PythagoreanTriplet object = (PythagoreanTriplet) o;
        return a == object.a &&
                b == object.b &&
                c == object.c;
    }
    
    public static PythagoreanTripletBuilder makeTripletsList() {
        return new PythagoreanTripletBuilder();
    }
    public static class PythagoreanTripletBuilder {
        private int limit = 0, sum = 0;
        public PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int limit) {
            this.limit = limit;
            return this;
        }
        public PythagoreanTripletBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }
        public List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> list = new ArrayList<>();
            for (int a = 1; a < limit; a++) {
                int squaredA = (int) pow(a, 2);
                for (int b = a; b < limit ; b++) {
                    int c = sum - (a + b);
                    if (b > c) break;
                        int squaredB = (int) pow(b, 2);
                        int squaredC = (int) pow(c, 2);
                        if (squaredA + squaredB == squaredC) {
                            list.add(new PythagoreanTriplet(a, b, c));
                        }
                }
            }
            return list;
        }
    }
}
