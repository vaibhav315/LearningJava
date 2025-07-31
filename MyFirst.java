import java.lang.*;
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
      String str = "programmer@gmail.com";
      int i = str.indexOf("@");
      String uname = str.substring(0,i); 
      String dname = str.substring(i+1, str.length());
      System.out.println("Username : "+uname);
      System.out.println("Domain : "+dname);
      System.out.println(dname.startsWith("gmail"));

      int b = 1000110;
      String str = String.valueOf(b);
      System.out.println(str.matches("[01]+"));
      String str = "234AB";
      System.out.println(str.matches("[0-9A-F]+"));
      String d = "16/11/2004";
      System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
      



      }
}