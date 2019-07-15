package app;

interface Choices {
    int YES = 1;
    int NO = 2;
}
public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Choices.YES = " + Choices.YES);
        System.out.println("Choices.NO = " + Choices.NO);
        Choices.NO = 9;
        System.out.println("Choices.NO = " + Choices.NO);
    }
}