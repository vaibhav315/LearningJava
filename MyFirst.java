import java.lang.*;
import java.util.Scanner;
class MyFirst 
{
      public static void main (String args[])
      {
            // System.out.println("Int Min : " + Integer.MIN_VALUE);
            // System.out.println("Int Max : " + Integer.MAX_VALUE);
            // System.out.println("Int Bytes : " + Integer.BYTES);
            

            //    String name;
            // Scanner sc=new Scanner(System.in);
            // System.out.println("May I know your name ?");
            // name=sc.nextLine();

            // System.out.println("Welcome "+name);
            // byte b = 5;
            // System.out.println(b);
            // b = 127;
            // System.out.println(b);
            // short s = 300;
            // int i = 100;
            // float f = 25.3F;
            // char c = 'V';/
            // byte b1 = 10;
            // byte b2 = 0b1010;
            // byte b3 = 012;
            // byte b4 = 0XA;
            // long l = 345345_345345L;
            // int x=-5;
            // System.out.println(x);
            // System.out.println(l);
            // System.out.println(b1);
            // System.out.println(b2);
            // System.out.println(b3);
            // System.out.println(b4);

            // System.out.println(s);
            // System.out.println(i);
            // System.out.println(f);
            // System.out.println(c);

            // int x=5,y;
            // y=++x;
            // System.out.println(x+" "+y);


            // int x=10, y=15;
            // x=x^y;
            // y=x^y;
            // x=x^y;
            // System.out.println("The values after swapping are x = " + x + " and y = " + y);
            // int x=10, y=20;
            // System.out.println("The sum of "+x+" and "+y+" is "+(x+y)) ;  
            
      //       int x=10;
      //       float y=12.56f;
      //       char z ='A';
      //       String str = "Java Programming";
            
      // System.out.printf("%3$s %2$f %1$d",x,y,str);

      // String str = "Java";
      // System.out.printf("%-20s",str);

      // String str1 = "Java Program";
      // String str2 = "JAVA";
      // System.out.println(str2);
      // char c[]={'H','e','l','l','o'};
      // String str3 = new String(c);
      // System.out.println(c);
      // byte b[]={65,66,67,68};
      // String str4 = new String(b,2,2);
      // System.out.println(str4);
      
      // String str1 = "Pyramid";
      // String str2 = "Pyramid";
      // System.out.println(str1==str2);
      // String str3 = new String("Pyramid");
      // System.out.println(str1.equals(str3));
      // System.out.println(str1==str3);
      // String str4 = "JAVA";
      // System.out.println(str1.compareTo(str4));
      // String str5 = "uX7";
      // System.out.println(str5.matches("[a-z][A-Z][0-9]"));
      // String str = "programmer@gmail.com";
      // int i = str.indexOf("@");
      // String uname = str.substring(0,i); 
      // String dname = str.substring(i+1, str.length());
      // System.out.println("Username : "+uname);
      // System.out.println("Domain : "+dname);
      // System.out.println(dname.startsWith("gmail"));

      // int b = 1000110;
      // String str = String.valueOf(b);
      // System.out.println(str.matches("[01]+"));
      // String str = "234AB";
      // System.out.println(str.matches("[0-9A-F]+"));
      // String d = "16/11/2004";
      // System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));

      // int a= 5;
      // int b = 10;
      // int c = 15;
      // if (a>b && a>c)
      // {
      //       System.out.println(a);
      // }
      // else if(b>c){
      //             System.out.println(b);
      //       }
      //       else{
      //             System.out.println(c);
      //       }
      
      // int a = 5;                                                        Checking if an integer is odd or even.
      // int b = 16;
      // if(a%2==0){
      //       System.out.println("a=5 is an even number.");                                               
      // }
      // else{
      //       System.out.println("a=5 is an odd number.");
      // }
// int n;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a number : ");
// n=sc.nextInt();
// if(n%2==0){
//       System.out.println("It is an even number");
// }
// else{
//       System.out.println("It is an odd number.");
// }

// int a;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the age of the person :");
// a=sc.nextInt();
// if(a>=14 && a<=50){
//       System.out.println("The person is young.");
// }
// else{
//       System.out.print("The person is not young anymore.");
// }

// int m1;
// int m2;
// int m3;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the marks of Maths :");
// m1=sc.nextInt();
// System.out.println("Enter the marks of Science :");
// m2=sc.nextInt();
// System.out.println("Enter the marks of SST :");
// m3=sc.nextInt();
// int t=m1+m2+m3;
// System.out.println("The total marks is : "+t );
// int a = t/3;
// System.out.println("The average marks is : "+a);
// if (a>70){
//       System.out.println("A GRADE");
// }
// else if(a>=60 && a<70){
//       System.out.println("B GRADE");
// }
// else if (a>=50 && a<60){
//       System.out.println("C GRADE");
// }      
// else{
//       System.out.println("F GRADE");
// }

// int d;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the day number :");
// d = sc.nextInt();
// if (d==1){
//       System.out.println("Today is Monday.");
// }
// else if(d==2){
//       System.out.println("Today is Tuesday.");
// }
// else if(d==3){
//       System.out.println("Today is Wednesday.");

// }
// else if(d ==4){
//       System.out.println("Today is thursday.");
// }
// else {
//       System.out.println("It is a invalid number.");
// }

// int n ;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number :");
// n=sc.nextInt();
// switch (n){
//       case 1 : System.out.print("It is Monday");
//                break;
//       case 2 : System.out.println("Today is TUESDAY");
//                break;
//       case 3 : System.out.println("Today is Wednesday");
//                break;
//       case 4 : System.out.println("Today is Thursday");
//                break;
//       case 5 : System.out.println("Today is friday");
//                break;
//       case 6 : System.out.println("Today is saturday.");
//                break;
//       case 7 : System.out.println("Today is sunday.");
//                break;
//       default : System.out.println("Invalid number.");
//                 break;

// }

Scanner sc=new Scanner(System.in);
       
       System.out.println("Menu");
       System.out.println("====");
       System.out.println("ADD");
       System.out.println("SUB");
       System.out.println("MUL");
       System.out.println("DIV");
       
       System.out.println("Enter 2 Numbers");
       int x=sc.nextInt();
       int y=sc.nextInt();
       sc.nextLine();
       System.out.println("Enter Option in Words ");
       String option=sc.nextLine();
       option=option.toUpperCase();
       
       switch(option)
       {
           case "ADD": System.out.println("Sum is "+(x+y));
                        break;
           case "SUB": System.out.println("Difference is "+(x-y));
                        break;
           case "MUL": System.out.println("Product is "+(x*y));
                        break;
           case "DIV": System.out.println("Ratio is "+(x/y));
                        break;
           default:     System.out.println("Invalid Option");
                        break;             
       }





      }
}