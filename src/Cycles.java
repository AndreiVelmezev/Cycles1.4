public class Cycles {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
        //Task 2
        System.out.println("Task 2");
        int x = 1;
        for (; x <= 31; x = x + 7) {
            System.out.println("Today is Friday," + x + " -th number. It is necessary to prepare a report.");
        }
        System.out.println("\n");
        //Task 3
        System.out.println("Task 3");

        int tekuchiyGod = 2017;
        int interval =79;
        int poslednie200Let = 200;
        for (int godi = tekuchiyGod - poslednie200Let;godi<=tekuchiyGod+interval;godi=godi+79){
            System.out.println(godi);

        }


    }
}
