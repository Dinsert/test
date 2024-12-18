public abstract class P implements Ja {

    @Override
    public int a() {
        return 0;
    }

    int anInt;
    String a;
    int aByte;

    public P(int anInt, String a, int aByte) {
        this.anInt = anInt;
        this.a = a;
        this.aByte = aByte;
    }

    public P(String a, int aByte) {
        this(0, a, aByte);
        this.a = a;
        this.aByte = aByte;
    }

    public P(String a) {
        this(a, 0);
        this.a = a;
    }

    public P() {
    }
}
