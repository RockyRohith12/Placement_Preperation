package Java.datatypes;

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

        char grade = 'A';
        System.out.println("Character is: "+grade);
        System.out.println("Character Minimum value: "+(int)Character.MIN_VALUE);
        System.out.println("Character Maximum value: "+(int)Character.MAX_VALUE);



    }
}
