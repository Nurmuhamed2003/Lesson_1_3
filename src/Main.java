public class Main {
    public static void main(String[] args) {

        double[] homework = {1.5, -5.1, 13.3, 3.6, -2.6, 9.7, -8.1, -1.5, 7.3, -6, 9.5, -12.9, 5.4, -7, 7.2};
        // (13.3 + 3.6 + 9.7 + 7.3 + 9.5 + 5.4 + 7.2)/7= 56/7 = 8 (Итоговый результат)

        double result = 0;
        int positiveNumber = 0;
        boolean sorted = false;

        for (double i : homework) {
            if (i < 0) {
                sorted = true;
            } else if (i > 0 && sorted) {
                result += i;
                positiveNumber++;
                System.out.println(i);
                System.out.println(result/positiveNumber);
                System.out.println((int)result/positiveNumber);
            }
        }
    }
}

