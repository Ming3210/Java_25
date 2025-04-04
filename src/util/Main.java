package util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int interger = Validator.checkInt("Nhập vào 1 số nguyên",scanner);
        System.out.println("Số bạn vừa nhập là: " + interger);
        System.out.println();
        float floatNumber = Validator.checkFloat("Nhập vào 1 số thực float", scanner);
        System.out.println("Số bạn vừa nhập là: " + floatNumber);
        System.out.println();
        double doubleNumber = Validator.checkDouble("Nhập vào 1 số thực double", scanner);
        System.out.println("Số bạn vừa nhập là: " + doubleNumber);
        System.out.println();
        String string = Validator.checkString("Nhập vào 1 chuỗi", scanner,2,4);
        System.out.println("Chuỗi bạn vừa nhập là: " + string);
        System.out.println();
        boolean booleanValue = Validator.checkBoolean("Nhập vào 1 giá trị true/false", scanner);
        System.out.println("Giá trị bạn vừa nhập là: " + booleanValue);
        System.out.println();
        String email = Validator.checkEmail("Nhập vào 1 email bất kì", scanner);
        System.out.println("Email bạn vừa nhập là: " + email);
        System.out.println();
        String phoneNumber = Validator.checkPhone("Nhập vào 1 số điện thoại", scanner);
        System.out.println("Số điện thoại bạn vừa nhập là: " + phoneNumber);
        System.out.println();

    }
}
