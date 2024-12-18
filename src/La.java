import java.util.Objects;

public class La<T> {

    private int por;
    private String owq;
    private double i1;

    public La(int por, String owq, double i1) {
        this.por = por;
        this.owq = owq;
        this.i1 = i1;
    }

    public int getPor() {
        return por;
    }

    public void setPor(int por) {
        this.por = por;
    }

    public String getOwq() {
        return owq;
    }

    public void setOwq(String owq) {
        this.owq = owq;
    }

    public double getI1() {
        return i1;
    }

    public void setI1(double i1) {
        this.i1 = i1;
    }

    public T s(La<T> la) {
        la.i1 = 1;
        return null;
    }

    public static void ja() {
        throw new RuntimeException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        La<?> la = (La<?>) o;
        return por == la.por && Double.compare(i1, la.i1) == 0 && Objects.equals(owq, la.owq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(por, owq, i1);
    }

    @Override
    public String toString() {
        return "La{" +
                "por=" + por +
                ", owq='" + owq + '\'' +
                ", i1=" + i1 +
                '}';
    }

}
