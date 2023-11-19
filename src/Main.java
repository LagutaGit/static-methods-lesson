public class Main {

    public static void printSeparator() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    }

    public static void printIssues(int issuesCount) {
        System.out.println(issuesCount);
    }

    public static int sum(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] issuesByMounths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMounths.length; i++) {
            printIssues(issuesByMounths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
//        Пишем переменные которые хотим передать в метод
        int total = sum(issuesByMounths);
        printIssues(total);
    }
}