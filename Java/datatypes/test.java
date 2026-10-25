

public class test {
    public static void main(String[] args) {
        System.out.println("Hello, Rohith");

        int a = 1;
        byte b = 1;
        short c = 1;
        long d = 1;


        // Integer 


        // byte a = 128;    This gives error as max value of byte = 127  //1 byte
        System.out.println("Minimum Byte value: "+ Byte.MIN_VALUE);
        System.out.println("Maximum Byte value: "+ Byte.MAX_VALUE);

        System.out.println("Minimum Short value: "+ Short.MIN_VALUE);  //2 bytes
        System.out.println("Maximum Short value: "+ Short.MAX_VALUE);

        System.out.println("Minimum Integer value: "+ Integer.MIN_VALUE);  //4 bytes
        System.out.println("Maximum Integer value: "+ Integer.MAX_VALUE);

        System.out.println("Minimum Long value: "+ Long.MIN_VALUE);  // 8 bytes
        System.out.println("Maximum Long value: "+ Long.MAX_VALUE);

        // By default its integer 


        // Float = can contain upto 7 significant digits 

        float e = 123.45968f;  //4 bytes
        System.out.println("Minimum +ve Float value: "+ Float.MIN_VALUE);
        System.out.println("Maximum +ve Float value: "+ Float.MAX_VALUE);
        System.out.println("Minimum -ve Float value: -"+ Float.MIN_VALUE);
        System.out.println("Maximum -ve Float value: -"+ Float.MAX_VALUE);

        //Double = can contain upto 15 significant digits    

        System.out.println("Minimum +ve Double value: "+ Double.MIN_VALUE);
        System.out.println("Maximum +ve Double value: "+ Double.MAX_VALUE);
        System.out.println("Minimum -ve Double value: -"+ Double.MIN_VALUE);
        System.out.println("Maximum -ve Double value: -"+ Double.MAX_VALUE);


        //Boolean = 1 bit

        boolean isAdult = false;  //0
        boolean isR = true; //1
        System.out.println("Is Adult: "+ isAdult);
        System.out.println("Is R: " +isR);
        

        // Character = 2 bytes 

        char grade = 'n';
        System.out.println("Character is: "+grade);
        System.out.println("Character Minimum value: "+(int)Character.MIN_VALUE);
        System.out.println("Character Maximum value: "+(int)Character.MAX_VALUE); //65535 char are present


        //Typecasting = conversion of one datatype to another

        System.out.println("Integer value of grade: "+(int)grade);
        System.out.println("Integer to char: "+ (char)10084);
        System.out.println();

        //ASCII = 0 to 127 is its range, contains English language alphabets 


        //Widening conversion or implicit = storing a small data into bigger datatypes 

        byte A = 10;
        short B = A;
        int C = B;
        long D = C;
        float E = D;
        double F = E;
        
        System.out.println("Widening Example : ");
        System.out.println("byte: "+A);
        System.out.println("short : "+B);
        System.out.println("int: "+C);
        System.out.println("long : "+D);
        System.out.println("float : "+E);
        System.out.println("double : "+F);
        System.out.println();

        // Narrowing conversion or explicit = opposite of widening 

        double p = 123.4561234567894556;
        float q = (float)p;
        long r = (long)q;
        int s = (int)r;

        System.out.println("Narrowing Example : ");
        System.out.println("double: "+p);
        System.out.println("float: "+q);
        System.out.println("long: "+r);
        System.out.println("int: "+s);
        System.out.println();

        // Strings = created by 2 methods
        //String is immutable

        // 1. Literals and 2. Using constructors

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        // jvm uses heap memory to create objects, pools same data
        //single values are stored in stack

        System.out.println(s1 == s2); // same reference in pool
        System.out.println(s2 == s3); // different objects
        System.out.println(s1.equals(s3));  // same content

        System.out.println();
    
        // uppercase and lowercase
        String S = "Hello";
        String T = S.toUpperCase();  //we need to store it into another variable
        System.out.println(S);
        System.out.println(T);
        System.out.println(T.toLowerCase());

        System.out.println();
        // Common String operations

        String text = "Hello World";

        // 1.Length

        System.out.println(text.length());

        // 2. Accessing characters

        System.out.println(text.charAt(6));

        // 3. Substring

        System.out.println(text.substring(0,5));

        //4. Contains, startsWith, endsWith

        System.out.println(text.contains("World"));
        System.out.println(text.endsWith("World"));
        System.out.println(text.startsWith("World"));

        // 5. Replace
        
        String newtext = text.replace("World", "Java");
        System.out.println(newtext);
    }
}
