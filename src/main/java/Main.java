public class Main {
    public static void main(String[] args) {
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

        Homework obj = new Homework();
        System.out.println((obj.factorialN(0)));
        System.out.println((obj.mirrored(123456789)));
        int[] array = {1, 2, 32, 44, 51, 46, 12, 3 ,3 ,4, 53};
        System.out.println(java.util.Arrays.toString(obj.halfSwappedArray(array)));
        System.out.println(java.util.Arrays.toString(obj.bubbleSort(array)));
        System.out.println((obj.shortestWord("AAAADQWASFA AAAAA.AAAAAAAA,AAAAAAAAA, AAF. FFFF")));
        System.out.println((obj.numberOfWords("AAAADQWASFA AAAAA.AAAAAAAA,AAAAAAAAA, AAF. FFFF")));
    }
}
