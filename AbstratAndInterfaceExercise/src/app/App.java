package app;

interface Solution {
    public abstract void buy(int money, int num, int a, int b, int c);
}

class Way {
    private int way = 1;

    public void listWay() {
        System.out.print("[买法" + way++ + "]    ");
    }
}

class Chook extends Way implements Solution {
    @Override
    public void buy(int money, int num, int a, int b, int c) {
        int z = 0;
        for (int x=0; x<=money/a; x++) {
            for (int y=0; y<=money/b; y++) {
                z = num - x - y;
                if ((z%c == 0) && ((a*x + b*y + z/c) == money)) {
                    listWay();
                    System.out.println("公鸡：" + x + "只， 母鸡：" + y + "只， 小鸡：" + z + "只。");
                }
            }
        }
    }
}

class Vehicle extends Way implements Solution {
    @Override
    public void buy(int money, int a, int b, int c, int d) {
        if(money >= a) {
            listWay();
            System.out.println("自驾");
        }
        if(money >= b) {
            listWay();
            System.out.println("大巴车");
        }
        if(money >= c) {
            listWay();
            System.out.println("火车");
        }
        if(money >= d) {
            listWay();
            System.out.println("飞机");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===========百钱买百鸡=============");
        Chook chook = new Chook();
        chook.buy(100, 100, 5, 3, 3);

        System.out.println("==========交通工具的选择==========");
        Vehicle vehicle = new Vehicle();
        vehicle.buy(500, 500, 300, 400, 1000);
    }
}