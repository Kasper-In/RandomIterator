public class Main {
    public static void main(String[] args) {
        int min = 65;
        int max = 199;
        for (int r : new Randoms(min, max)) {
            System.out.println("Случайное число: " + r);
            if (r == max) {
                System.out.println("Выпало число " + max + ", давайте на этом закончим");
                break;
            }
        }
    }
}
