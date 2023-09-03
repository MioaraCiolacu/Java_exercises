package Exercitii;

import java.util.Scanner;

public class exercitiiSimple {

    //  public static void main(String[] args) {
//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line. Go to the editor
////Expected Output :
////Hello
////Alexandra Abramov
//
//
//        System.out.println("Hello!");
//        System.out.println("Mioara Ciolacu");
//        System.out.print("hello, ");
//        System.out.print("I am Mioara Ciolacu.");
//        System.out.println(" ");
//        System.out.println("Hello\nMioara Ciolacu");
//        System.out.println(" ");


//    2. Write a Java program to print the sum of two numbers. Go to the editor
//Test Data:
//74 + 36
//Expected Output :
//110

//    public static void main(String[] args) {
//       int n1 = 74;
//        int n2 = 36;
//        System.out.println(n1+n2);
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("introdu primul nr.");
//        int numar1=sc.nextInt();
//        System.out.println("introdu al doilea nr.");
//        int numar2=sc.nextInt();
//        int suma=numar1+numar2;
//        System.out.println("Suma este " + suma);
//        System.out.println("suma este "+ (numar1+numar2));
//    }


//   3. Write a Java program to divide two numbers and print on the screen. Go to the editor
//Test Data :
//50/3
//Expected Output :
//16

//    public static void main(String[] args) {
//        int nr1=23;
//        int nr2=6;
//        System.out.println(23/6);
//
//        double n3=23.5;
//        double n4=6.2;
//        System.out.println(23/6);
//        System.out.println(n3/n4);
//        System.out.println(nr1%nr2);
//    }

    //4. Write a Java program to print the result of the following operations. Go to the editor
    //Test Data:
    //a. -5 + 8 * 6
    //b. (55+9) % 9
    //c. 20 + -3*5 / 8
    //d. 5 + 15 / 3 * 2 - 8 % 3
    //Expected Output :
    //43
    //1
    //19
    //13

//    public static void main(String[] args) {
//        System.out.println(5+15/3*2-8%3);
//        System.out.println(-5+8*6);
//        int a1=7;
//        int a2=9;
//        int a3=8;
//        int a4 = 5 + 15 / 3 * 2 - 8 % 3;
//        System.out.println(a4);
//        System.out.print((a1+a2)%a3);
//        System.out.println(" ");
//        System.out.printf("primul nr. este %d,al doilea nr. este %d, iar al treilea %d", a1, a2, a3);
//
//    }


    //5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
    //Test Data:
    //Input first number: 25
    //Input second number: 5
    //Expected Output :
    //25 x 5 = 125

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("introdu primul nr.:");
//        int nr1=sc.nextInt();
//        System.out.print("introdu al doilea nr.:");
//        int nr2=sc.nextInt();
//        int produs=nr1*nr2;
//        System.out.print("produsul este " + produs);
//        System.out.println("");
//        System.out.println(nr1 + "X"+nr2 +"="+(nr1*nr2) );
//
//    }

    //    6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
//    Test Data:
//    Input first number: 125
//    Input second number: 24
//    Expected Output :
//            125 + 24 = 149
//            125 - 24 = 101
//            125 x 24 = 3000
//            125 / 24 = 5
//            125 mod 24 = 5
//    public static void main(String[] args) {
//    Scanner cititor= new Scanner(System.in);
//        System.out.print("Introdu primul nr.:");
//        int n1=cititor.nextInt();
//        System.out.print("Introdu al doilea nr.:");
//        int n2=cititor.nextInt();
//        System.out.println(n1+"+"+n2+"="+(n1+n2));
//        System.out.println(n1+"-"+n2+"="+(n1-n2));
//        System.out.println(n1+"*"+n2+"="+(n1*n2));
//        System.out.println(n1+"/"+n2+"="+(n1/n2));
//        System.out.println(n1+"mod"+n2+"="+(n1%n2));
//
//    }


//    7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
//    Test Data:
//    Input a number: 8
//    Expected Output :
//            8 x 1 = 8
//            8 x 2 = 16
//            8 x 3 = 24
//            ...
//            8 x 10 = 80

//    public static void main(String[] args) {
//        Scanner citit = new Scanner(System.in);
//        System.out.print("Introdu numarul pe care vrei sa il inmultesti:");
//        int nr = citit.nextInt();
//        System.out.println(nr + "x" + "0" + "=" + (nr * 0));
//        System.out.println(nr + "x" + "1" + "=" + (nr * 1));
//        System.out.println(nr + "x" + "2" + "=" + (nr * 2));
//        System.out.println(nr + "x" + "3" + "=" + (nr * 3));
//        System.out.println(nr + "x" + "4" + "=" + (nr * 4));
//        System.out.println(nr + "x" + "5" + "=" + (nr * 5));
//        System.out.println(nr + "x" + "6" + "=" + (nr * 6));
//        System.out.println(nr + "x" + "7" + "=" + (nr * 7));
//        System.out.println(nr + "x" + "8" + "=" + (nr * 8));
//        System.out.println(nr + "x" + "9" + "=" + (nr * 9));
//        System.out.println(nr + "x" + "10" + "=" + (nr * 10));
//
//        //sau
//
//        System.out.println(" ");
//        for (int i = -1; i < 10; i++){
//            System.out.println(nr+"x"+(i+1)+"="+(nr*(i+1)));
//        }
//
//    }

    //8. Write a Java program to display the following pattern. Go to the editor
    //Sample Pattern :
    //
    //   J    a   v     v  a
    //   J   a a   v   v  a a
    //J  J  aaaaa   V V  aaaaa
    // JJ  a     a   V  a     a

//    public static void main(String[] args) {
//        System.out.println("   J    a   v     v  a");
//        System.out.println("   J   a a   v   v  a a");
//        System.out.println("J  J  aaaaa   V V  aaaaa");
//        System.out.println(" JJ  a     a   V  a     a");
//    }


    //9. Write a Java program to compute the specified expressions and print the output. Go to the editor
    //Test Data:
    //((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
    //Expected Output
    //2.138888888888889

//    public static void main(String[] args) {
//        double nr=((25.5*3.5-3.5*3.5)/(40.5-4.5));
//        System.out.println(nr);
//}


    //10. Write a Java program to compute a specified formula. Go to the editor
    //Specified Formula :
    //4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
    //Expected Output
    //2.9760461760461765

//    public static void main(String[] args) {
//        double a=4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
//        System.out.println(a);
//    }


    //11. Write a Java program to print the area and perimeter of a circle. Go to the editor
    //Test Data:
    //Radius = 7.5
    //Expected Output
    //Perimeter is = 47.12388980384689
    //Area is = 176.71458676442586

//    public static void main(String[] args) {
//        Scanner cititor = new Scanner(System.in);
//        System.out.println("Introdu raza cercului:");
//        double nr = cititor.nextDouble();
//        double perimetru = 2 * nr * Math.PI;
//        double arie = Math.PI * Math.pow(nr, 2);
//        System.out.println("Perimetrul este " + perimetru + "\n Aria este " + arie);
//    }


    //12. Write a Java program that takes three numbers as input to calculate and print the average
    // of the numbers.

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Introdu primul nr.:");
//        int n1=sc.nextInt();
//        System.out.println("Introdu al doilea nr.:");
//        int n2=sc.nextInt();
//        System.out.println("Introdu al treilea nr.:");
//        int n3=sc.nextInt();
//        int media=(n1+n2+n3)/3;
//        System.out.println("Media nr este " +media);
//
//    }


//    13.Write a Java program to print the area and perimeter of a rectangle. Go to the editor
//Test Data:
//Width = 5.5 Height = 8.5
//
//Expected Output
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introdu lungimea");
//        int L=sc.nextInt();
//        System.out.println("Introdu latimea");
//        int l=sc.nextInt();
//        int area=l*L;
//        int perimeter=2*(l+L);
//        System.out.printf("Perimetrul este %d, iar aria este %d",perimeter, area);

//        System.out.println("Introdu lungimea");
//        double L = sc.nextDouble();
//        System.out.println("Introdu latimea");
//        double l = sc.nextDouble();
//        double area = l * L;
//        double perimeter = 2 * (l + L);
//        System.out.printf("Perimetrul este %f, iar aria este %f", perimeter, area);
//    }

//    14. Write a Java program to print an American flag on the screen. Go to the editor
//    Expected Output
//
//        * * * * * * ==================================
//         * * * * *  ==================================
//        * * * * * * ==================================
//         * * * * *  ==================================
//        * * * * * * ==================================
//         * * * * *  ==================================
//        * * * * * * ==================================
//         * * * * *  ==================================
//        * * * * * * ==================================
//        ==============================================
//        ==============================================
//        ==============================================
//        ==============================================
//        ==============================================
//        ==============================================
//

// public static void main(String[] args) {
//        System.out.println("* * * * * * ===================================");
//        System.out.println(" * * * * *  ===================================");
//        System.out.println("* * * * * * ===================================");
//        System.out.println(" * * * * *  ===================================");
//        System.out.println("* * * * * * ===================================");
//        System.out.println(" * * * * *  ===================================");
//        System.out.println("* * * * * * ===================================");
//        System.out.println(" * * * * *  ===================================");
//        System.out.println("* * * * * * ===================================");
//        System.out.println("===============================================");
//        System.out.println("===============================================");
//        System.out.println("===============================================");
//        System.out.println("===============================================");
//        System.out.println("===============================================");
//        System.out.println("===============================================");


    // sau


//        String a = "* * * * * * ===================================\n * * * * *  ===================================";
//        String b="===============================================";

//       for(int i=0; i<4; i++){
//            System.out.println(a);
//       }
//        System.out.println("* * * * * * ===================================");

//       for(int i=0; i<6; i++){
//           System.out.println(b);
//       }
//    }


    //    15. Write a Java program to swap two variables.

//    public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//        System.out.println("Introdu primul nr:");
//        int nr1=sc.nextInt();
//        System.out.println("Introdu al doilea nr:");
//        int nr2=sc.nextInt();
//        System.out.println("Primul numar este " +nr1+ " al doilea este 5"  + nr2+"\n"+
//                "dupa schimbare avem primul nr."+nr2+ " si primul numar "+nr1);
//    }


//    16. Write a Java program to print a face. Go to the editor
//Expected Output
//
// +"""""+
//[| o o |]
// |  ^  |
// | '-' |
// +-----+


//    public static void main(String[] args) {
//        System.out.println(" +\"\"\"\"\"+ ");
//        System.out.println("[| o o |]");
//        System.out.println(" |  ^  | ");
//        System.out.println(" | '-' | ");
//        System.out.println(" +-----+");

    //sau

//        String[] array = new String[5];
//        array[0] = " +\"\"\"\"\"+ ";
//        array[1] = "[| o o |]";
//        array[2] = " |  ^  | ";
//        array[3] = " | '-' | ";
//        array[4] = " +-----+";
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(array[i]);
//        }
//
//    }

//17. Write a Java program to add two binary numbers. Go to the editor
//    Input Data:
//    Input first binary number: 10
//    Input second binary number: 11
//    Expected Output
//
//    Sum of two binary numbers: 101

//    public static void main(String[] args)
//    {
//        long binary1, binary2;
//        int i = 0, remainder = 0;
//        int[] sum = new int[20];
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Input first binary number: ");
//        binary1 = in.nextLong();
//        System.out.print("Input second binary number: ");
//        binary2 = in.nextLong();
//
//        while (binary1 != 0 || binary2 != 0)
//        {
//            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
//            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
//            binary1 = binary1 / 10;
//            binary2 = binary2 / 10;
//        }
//        if (remainder != 0) {
//            sum[i++] = remainder;
//        }
//        --i;
//        System.out.print("Sum of two binary numbers: ");
//        while (i >= 0) {
//            System.out.print(sum[i--]);
//        }
//        System.out.print("\n");
//    }


//    31. Write a Java program to check whether Java is installed on your computer.
//Expected Output
//
//Java Version: 1.8.0_71
//Java Runtime Version: 1.8.0_71-b15
//Java Home: /opt/jdk/jdk1.8.0_71/jre
//Java Vendor: Oracle Corporation
//Java Vendor URL: http://Java.oracle.com/
//Java Class Path: .


//    public static void main(String[] args) {
//        System.out.println("\nJava Version: "+System.getProperty("java.version"));
//        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
//        System.out.println("Java Home: "+System.getProperty("java.home"));
//        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
//        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
//        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
//    }


//   32. Write a Java program to compare two numbers. Go to the editor
//Input Data:
//Input first integer: 25
//Input second integer: 39
//Expected Output
//
//25 != 39
//25 < 39
//25 <= 39


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introdu primul numar:");
//        int n1 = sc.nextInt();
//        System.out.println("Introdu al doilea numar:");
//        int n2 = sc.nextInt();
//        if (n1 > n2)
//            System.out.printf("%d > %d\n", n1, n2);
//        if (n1 == n2)
//            System.out.printf("%d == %d\n", n1, n2);
//        if (n1 != n2)
//            System.out.printf("%d != %d\n", n1, n2);
//        if (n1 <= n2)
//            System.out.printf("%d <= %d\n", n1, n2);
//        if (n1 >= n2)
//            System.out.printf("%d >= %d\n", n1, n2);
//        if (n1 < n2)
//            System.out.printf("%d < %d\n", n1, n2);
//
//    }


//33. Write a Java program and compute the sum of the digits of an integer. Go to the editor
//Input Data:
//Input an integer: 25
//Expected Output
//
//The sum of the digits is: 7

//    public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//            System.out.print("Introdu un numar: ");
//            int n = input.nextInt();
//            System.out.println("Suma cifrelor este: " + suma(n));
//
//        }
//
//        public static int suma(int n) {
//            int sum = 0;
//            while (n != 0) {
//                sum += n % 10;
//                n /= 10;
//            }
//            return sum;
//        }


//    34. Write a Java program to compute the area of a hexagon. Go to the editor
//    Area of a hexagon = (6 * s^2)/(4*tan(π/6))
//    where s is the length of a side
//    Input Data:
//    Input the length of a side of the hexagon: 6
//    Expected Output
//
//    The area of the hexagon is: 93.53074360871938

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Introdu lungimea laturii hexagonului:");
//        double nr=sc.nextDouble();
//        double area=(6*Math.pow(nr,2)/(4*Math.tan(Math.PI/6)));
//        System.out.println("Aria este "+ area);
//      }


    //sau

//        public static void main(String[] args) {
//            Scanner input = new Scanner(System.in);
//            System.out.print("Input the length of a side of the hexagon: ");
//            double s = input.nextDouble();
//            System.out.print("The area of the hexagon is: " + hexagonArea(s)+"\n");
//        }
//        public static double hexagonArea(double s) {
//            return (6*(s*s))/(4*Math.tan(Math.PI/6));
//        }


//    35. Write a Java program to compute the area of a polygon. Go to the editor
//Area of a polygon = (n*s^2)/(4*tan(π/n))
//where n is n-sided polygon and s is the length of a side
//Input Data:
//Input the number of sides on the polygon: 7
//Input the length of one of the sides: 6
//Expected Output
//
//The area is: 130.82084798405722

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Introdu nr. de laturi:");
//        double nLaturi = sc.nextDouble();
//
//        System.out.println("Introdu lungimea:");
//        double lungimePoligon = sc.nextDouble();
//
//        System.out.println("Aria poligonului este " + aria(nLaturi, lungimePoligon));
//
//    }
//
//    public static double aria(double nlaturi, double lungimePoligon) {
//        return (nlaturi * (Math.pow(lungimePoligon, 2)) / (4.0 * Math.tan(Math.PI / nlaturi)));
//    }


//    36. Write a Java program to compute the distance between two points on the surface of earth. Go to the editor
//    Distance between the two points [ (x1,y1) & (x2,y2)]
//    d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//    Radius of the earth r = 6371.01 Kilometers
//    Input Data:
//    Input the latitude of coordinate 1: 25
//    Input the longitude of coordinate 1: 35
//    Input the latitude of coordinate 2: 35.5
//    Input the longitude of coordinate 2: 25.5
//    Expected Output
//
//    The distance between those points is: 1480.0848451069087 km


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double raza = 6371.01;  //km
//        System.out.println("Introdu latitudinea 1:");
//        double x1 = sc.nextDouble();
//        System.out.println("Introdu longitudinea 1:");
//        double y1 = sc.nextDouble();
//        System.out.println("Introdu latitudinea 2:");
//        double x2 = sc.nextDouble();
//        System.out.println("Introdu longitudinea 2:");
//        double y2 = sc.nextDouble();
//        System.out.println("Distanta dintre doua coordonate este " + coord(raza, x1, y1, x2, y2) + " km");
//    }
//
//    public static double coord(double raza, double x1, double y1, double x2, double y2) {
//        x1 = Math.toRadians(x1);
//        y2 = Math.toRadians(y2);
//        x2 = Math.toRadians(x2);
//        y2 = Math.toRadians(y2);
//        return (raza * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
//
//    }

//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input the latitude of coordinate 1: ");
//        double lat1 = input.nextDouble();
//        System.out.print("Input the longitude of coordinate 1: ");
//        double lon1 = input.nextDouble();
//        System.out.print("Input the latitude of coordinate 2: ");
//        double lat2 = input.nextDouble();
//        System.out.print("Input the longitude of coordinate 2: ");
//        double lon2 = input.nextDouble();
//
//        System.out.print("The distance between those points is: " + distance_Between_LatLong(lat1, lon1, lat2, lon2) + " km\n");
//    }
//
//    // Points will be converted to radians before calculation
//    public static double distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2) {
//        lat1 = Math.toRadians(lat1);
//        lon1 = Math.toRadians(lon1);
//        lat2 = Math.toRadians(lat2);
//        lon2 = Math.toRadians(lon2);
//
//        double earthRadius = 6371.01; //Kilometers
//        return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
//}


//    37. Write a Java program to reverse a string. Go to the editor
//            Input Data:
//            Input a string: The quick brown fox
//            Expected Output
//
//            Reverse string: xof nworb kciuq ehT


//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introdu un text:");
//        char[] litere = sc.nextLine().toCharArray();
//        System.out.println("Textul inversat:");

//        for (int i = litere.length-1; i >= 0; i--) {
//            System.out.print(litere[i]);
//        }
//        System.out.println(" ");
//
//    }


//    38. Write a Java program to count the letters, spaces, numbers and other characters of an input string. Go to the editor
//Expected Output
//
//The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
//letter: 23
//space: 9
//number: 10
//other: 6

//    public static void main(String[] args) {
//        String text = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
//        count(text);
//    }
//
//    public static void count(String x) {
//        char[] ch = x.toCharArray();
//        int litere = 0;
//        int spatii = 0;
//        int numere = 0;
//        int caractere = 0;
//
//        for (int i = 0; i < x.length(); i++) {
//            if (Character.isLetter(ch[i])) {
//                litere++;
//            } else if (Character.isDigit(ch[i])) {
//                numere++;
//            } else if (Character.isSpaceChar(ch[i])) {
//                spatii++;
//            } else {
//                caractere++;
//            }
//        }
//        System.out.println("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
//        System.out.println("Am " + litere + " litere.");
//        System.out.println("Am " + numere + " numere.");
//        System.out.println("Am " + caractere + " caractere.");
//        System.out.println("Am " + spatii + " spatii.");
//
//    }


//alte exercitii

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introdu un text:");
//        char[] lit = sc.nextLine().toCharArray();
//        int litere = 0;
//        int spatii = 0;
//        int numere = 0;
//        int caractere = 0;

//        for (int i = 0; i <lit.length; i++) {
//            if (Character.isLetter(lit[i])) {
//                litere++;
//            } else if (Character.isDigit(lit[i])) {
//                numere++;
//            } else if (Character.isSpaceChar(lit[i])) {
//                spatii++;
//            } else {
//                caractere++;
//            }


//        System.out.println("Am " + litere + " litere.");
//        System.out.println("Am " + numere + " numere.");
//        System.out.println("Am " + caractere + " caractere.");
//        System.out.println("Am " + spatii + " spatii.");
//
//        }


    //39. Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there. Go to the editor
    //Expected Output
    //
    //123
    //124
    //...
    //
    //431
    //432
    //Total number of the three-digit-number is 24


//        public static void main(String[] args) {
//            int amount = 0;
//            for (int i = 1; i <= 4; i++) {
//                for (int j = 1; j <= 4; j++) {
//                    for (int k = 1; k <= 4; k++) {
//                        if (k != i && k != j && i != j) {
//                            amount++;
//                            System.out.println(i + "" + j + "" + k);
//                        }
//                    }
//                }
//            }
//            System.out.println("Total number of the three-digit-number is " + amount);
//        }



}