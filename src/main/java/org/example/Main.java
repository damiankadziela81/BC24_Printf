package org.example;

public class Main {
    public static void main(String[] args) {

        boolean myBool = true;
        int myInt = 10;
        char myChar = '#';
        String myString = "text";
        double myDouble = 10000*Math.PI;

        System.out.printf("Format string %b %n",myBool);
        System.out.printf("%d %n",myInt);
        System.out.printf("%c %n",myChar);
        System.out.printf("%s %n",myString);
        System.out.printf("%f %n",myDouble);
        System.out.printf("%,f %n",myDouble);
        System.out.printf("%.2f %n",myDouble);

    }
}