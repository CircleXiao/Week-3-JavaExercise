package app;
import model.Student;

public class App {
    public static void main(String[] args) {
        Student zhangsan = new Student("张三", 20, "男", 151011);
        System.out.println(zhangsan.getName());
        System.out.println(zhangsan.getAge());
        System.out.println(zhangsan.getSex());
        System.out.println(zhangsan.getStudentID());
    }    
}