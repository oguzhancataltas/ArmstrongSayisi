public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 999; i++) {

            int basNumber = 0;
            int basValue;
            int tempNumber = i;
            int basPow = 1;
            int result = 0;

            while (tempNumber != 0) {

                tempNumber /= 10;
                basNumber++;
            }
            tempNumber = i;

            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                basPow = 1;
                for (int j = 1; j <= basNumber; j++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
            }

            if (result == i) {
                System.out.println(i + " bir armstrong sayısıdır.");
            }


        }
    }
}
