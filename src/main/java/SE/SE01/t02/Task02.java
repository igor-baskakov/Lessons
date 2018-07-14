package SE.SE01.t02;

public class Task02 {
    public static void an(double epsilon) {
        double an = 1;
        int i = 1;
        while (an >= epsilon) {
            an = 1 / Math.pow((i + 1), 2);
            System.out.format("a[%d]= %f,%n",i,an);
            i++;
        }
        System.out.format("искомый номер последовательности: %d", i-1);
    }
}
