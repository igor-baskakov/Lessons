package SE.SE01.t02;

public class Task02 {
    public static void main(String[] args) {
        double e = 0.01;
        double an = 1;
        int i = 0;
        while (an > e) {
            an = 1 / Math.pow((i + 1), 2);
            i = i + 1;
            System.out.println(an);
        }
        System.out.println("i= " + i);
    }
}
