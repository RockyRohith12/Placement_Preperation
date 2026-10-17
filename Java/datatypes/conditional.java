package Java.datatypes;

public class conditional {
    public static void main(String[] args){


        // if statements 


        boolean isSunny = true;
        boolean isWarm = true;
        boolean isCold = false;

        if(isSunny && isWarm)
        {
            System.out.println("Its a Beach day");
        }

        else if(isCold && isWarm)
        {
            System.out.println("Whether is colder");
        }

        else
        {
            System.out.println("Its a Rainy day");
        }


        // Switch statement  

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid day");
        
        }


        // Ternary operators = alternative of if, else if and else statements 
        

        int x = 10, y = 20;

        int result = (x > y) ? x : y;

        System.out.println("Greater number: " + result);
    }
}
