package ba.unsa.etf.rpr.tutorijal02;

public class Main {

    public static void main(String[] args) {
            Interval i = new Interval(1.1, 2.5, true, false);
            Interval i2 = new Interval(1.1, 2.5, true, true);
            System.out.println(i.equals(i2));

    }
}
