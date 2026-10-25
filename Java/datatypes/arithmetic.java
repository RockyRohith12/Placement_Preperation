

public class arithmetic {
    public static void main(String[] args){
        
        //Arithmetic Operators
        
        int a = 5 + 3;
        int b = 10 - 4;
        int c = 6 * 7;
        int d = 10 / 3; // just quotient i.e., integer division
        double e = 10.0/3.0; // normal divison with points in answer
        int f = 10 % 3;  // gives remainder
        float g = 10/3f;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        System.out.println();
        a += 5;
        System.out.println(a);
        a -= 5;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 8;
        System.out.println(a);
        a %= 4;
        System.out.println(a);
        System.out.println();

        // Increment Operators 

        /*
            a++ = post increment
            ++a = pre increment
            a-- = post decrement
            --a = pre decrement
        */

        System.out.println(a);
        System.out.println();

        a++;
        System.out.println(a);

        ++a;
        System.out.println(a);

        a--;
        System.out.println(a);

        --a;
        System.out.println(a);


        System.out.println();


        // Bitwise operators 

        int x = 5, y = 3;

        System.out.println("AND Operation:");
        System.out.println(x + " & " + y + " = " + (x & y));
        System.out.println("Binary: " + Integer.toBinaryString(x & y));

        System.out.println();

        System.out.println("OR Operation:");
        System.out.println(x + " | " + y + " = " + (x | y));
        System.out.println("Binary: " + Integer.toBinaryString(x | y));

        System.out.println();

        System.out.println("XOR Operation:");
        System.out.println(x + " ^ " + y + " = " + (x ^ y));
        System.out.println("Binary: " + Integer.toBinaryString(x ^ y));

        System.out.println();

        System.out.println("NOT Operation:");
        System.out.println("~" + x + " = " + (~x));
        System.out.println("Binary: " + Integer.toBinaryString(~x));

        System.out.println();

        System.out.println("Left Shift:");
        System.out.println(x + " << 1 = " + (x << 1));
        System.out.println("Binary: " + Integer.toBinaryString(x << 1));

        System.out.println();

        System.out.println("Right Shift:");
        System.out.println(x + " >> 1 = " + (x >> 1));
        System.out.println("Binary: " + Integer.toBinaryString(x >> 1));

        System.out.println();


        // Relational operators

        System.out.println(x < y);   // Less than
        System.out.println(x > y);   // Greater than
        System.out.println(x <= y);  // Less than or equal to
        System.out.println(x >= y);  // Greater than or equal to
        System.out.println(x == y);  // Equal to
        System.out.println(x != y);  // Not equal to


        // Logical Operators

        System.out.println("Logical AND (&&):");
        System.out.println((x > y) && (x > 0));

        System.out.println();

        System.out.println("Logical OR (||):");
        System.out.println((x < y) || (y > 0));

        System.out.println();

        System.out.println("Logical NOT (!):");
        System.out.println(!(x > y));        

        System.out.println();
    }
}
