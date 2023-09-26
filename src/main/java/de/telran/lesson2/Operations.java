package de.telran.lesson2;

public class Operations {
    public static void main(String[] args) {
        int arg1 =25, arg2 =4;
        int sum =arg1 + arg2;
        int dif =arg1 - arg2;
        int mult =arg1 * arg2;
        int div =arg1 / arg2;
        int ost =arg1 % arg2;

        System.out.println("sum =arg1 + arg2 =" +sum);
        System.out.println("dif =arg1 - arg2 =" +dif);
        System.out.println("mult =arg1 * arg2 =" +mult);
        System.out.println("div =arg1 / arg2 =" +div);
        System.out.println("ost =arg1 % arg2 =" +ost);

        float argF1 =25, argF2 =4;
        float divF =argF1 / argF2;
        float ostF =argF1 % argF2;

        System.out.println("divF =argF1 / argF2 =" +divF);
        System.out.println("ostF =argF1 % argF2 =" +ostF);

        String str1= "Mama", str2=" мыла";
        String res1= str1 + str2;
        System.out.println("res = str1 + str2 - " +res1);
    }
}
