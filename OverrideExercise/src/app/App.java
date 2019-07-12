package app;

class Printer {
    public void print() {
        System.out.println("基本功能：打印");
    }
}

class ColorPrinter extends Printer{
    @Override
    public void print() {
        System.out.println("可以打印彩色纸");
    }
}

class OldPrinter extends Printer {
    @Override
    public void print() {
        System.out.println("只能打印黑色纸");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Printer printer = new Printer();
        printer.print();

        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.print();

        OldPrinter oldPrinter = new OldPrinter();
        oldPrinter.print();
    }
}