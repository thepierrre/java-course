public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world again");

        String[] splitStrings = "Hello world again".split(" ");
        printText(splitStrings);
    }

    private static void printText(String... textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
}