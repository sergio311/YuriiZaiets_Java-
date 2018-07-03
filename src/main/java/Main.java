import Figures.Circle;
import Figures.Rectangle;
import Figures.Square;
import Figures.Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter type of figure:");
        String figure = null;
        try {
            figure = reader.readLine();
        } catch (IOException e) {
            System.out.print("Something went wrong:" + e);
        }
        switch (figure) {
            case "Square":
            case "Квадрат":
                System.out.print("Enter side of a square:");
                double squareSide = 0;
                try {
                    squareSide = Double.parseDouble(reader.readLine());
                } catch (IOException e) {
                    System.out.print("Something went wrong:" + e);
                }
                Square square = new Square(squareSide);
                System.out.println("Perimeter: " + square.calcPerimeter());
                System.out.println("Square: " + square.calcArea());

                break;

            case "Circle":
            case "Круг":
                System.out.print("Enter radius of a circle:");
                double radius = 0;
                try {
                    radius = Double.parseDouble(reader.readLine());
                } catch (IOException e) {
                    System.out.print("Something went wrong:" + e);
                }
                Circle circle = new Circle(radius);
                System.out.println("Perimeter: " + circle.calcPerimeter());
                System.out.println("Square: " + circle.calcArea());

                break;

            case "Triangle":
            case "Треугольник":
                String inputTriangle;
                String[] splitted = {};
                try {
                    System.out.print("Enter height, side A, side B and side C of a triangle separated by comma:");
                    inputTriangle = reader.readLine();
                    splitted = inputTriangle.split("(,\\s)|(,)");
                } catch (IOException e) {
                    System.out.print("Something went wrong:" + e);
                }
                Triangle triangle = new Triangle(Double.parseDouble(splitted[0]),
                        Double.parseDouble(splitted[1]),
                        Double.parseDouble(splitted[2]),
                        Double.parseDouble(splitted[3]));
                System.out.println("Perimeter: " + triangle.calcPerimeter());
                System.out.println("Square: " + triangle.calcArea());

                break;

            case "Rectangle":
            case "Прямоугольник":
                String inputRectangle;
                String[] splittedRectangle = {};
                try {
                    System.out.print("Enter side A and side B of a rectangle separated by comma:");
                    inputRectangle = reader.readLine();
                    splittedRectangle = inputRectangle.split("(,\\s)|(,)");
                } catch (IOException e) {
                    System.out.print("Something went wrong:" + e);
                }
                Rectangle rectangle = new Rectangle(Double.parseDouble(splittedRectangle[0]),
                        Double.parseDouble(splittedRectangle[1]));
                System.out.println("Perimeter: " + rectangle.calcPerimeter());
                System.out.println("Square: " + rectangle.calcArea());

                break;
        }
    }
}


//        boolean i = true;
//        boolean b = false;
//        float x = 10.83f;
//        int a =(int) 10.13;
//
//        int ih =0;
//        ih++;
//        int u =9;
//
//        String hello = "Hello world";
//        System.out.println(Math.sqrt(9) );
//
//        boolean qw =true;
//        boolean yu= false;
//        boolean tr = qw & yu;
//
//        System.out.println(tr);
//
//        System.out.println(qw ? 5 : 1);//условный оператор
//
//        //уловный оператор и их сравнение
//
//    //    System.out.println(ih >= u);
//
//        //операторы присвоения
//        u += 5;
//        System.out.println(u);
//
//        //условный оператор
//        if (!b ){
//            System.out.println("i am Q");
//        }else{
//            System.out.println("i am Q - else");
//        }
//// switch
//        int io = 5;
//        switch (io){
//            case 5:
//            System.out.println("i am 5");
//            break;
//            default:
//                System.out.println("i am default");
//        }
//         int [] arrayInt = {1,2,3,4,5,6,7};
//        System.out.println(arrayInt);
//
//        int arrayInt2 [][] =new int[2][2];
//
//        int [] arrey = new int [5];
//        int l =5;
//        while (l <= 15){
//            System.out.println("Hello World");
//            if(l==11){
//                break;
//            }
//            l++;
//
//            /////////////
//            int[] arrayInt4 = {1,2,3,4,5,6};
//            for (int p = 0; p <arrayInt4.length; p++){
//                System.out.println(arrayInt4[p]);
//            }
//
//
//        }

//        Homework obj = new Homework();
//        System.out.println((obj.factorialN(0)));
//        System.out.println((obj.mirrored(123456789)));
//        int[] array = {1, 2, 32, 44, 51, 46, 12, 3 ,3 ,4, 53};
//        System.out.println(java.util.Arrays.toString(obj.halfSwappedArray(array)));
//        System.out.println(java.util.Arrays.toString(obj.bubbleSort(array)));
//        System.out.println((obj.shortestWord("AAAADQWASFA AAAAA.AAAAAAAA,AAAAAAAAA, AAF. FFFF")));
//        System.out.println((obj.numberOfWords("AAAADQWASFA AAAAA.AAAAAAAA,AAAAAAAAA, AAF. FFFF")));
//
