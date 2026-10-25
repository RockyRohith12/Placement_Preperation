
public class loops {
    public static void main(String[] args){


        //for loop

        for(int i = 1; i<=10; i++){
            System.out.println("2 * "+i+ " = " +i*2);
        }

         System.out.println();

        for(int i = 1; i<=10; i++){      //break discontinues all other iterations from the nearest and current loop after break is occured
            if (i == 5){
                break;
            }
            System.out.println(i);
        }

        System.out.println();

        for(int i = 1; i<=5; i++){     // continue just skips that particular value 
            if (i ==3){
                continue;
            }

            System.out.println(i);
        }


        // while loop

        int j = 1;   // first variable is declared and then the condition is checked
        
        while(j <=5){
            System.out.println("Hi");
            j++;
        }


        //do - while loop = first prints statement and then checks the condition

        int k = 1;

        do{
            System.out.println(k);
            k++;
        } while(k==20);

        

    }
}
