import java.util.*;

public class Project_task_1 {

public static void main(String[] args) {
    
 Scanner sc = new Scanner(System.in);

    double number,number1, guess;
    int n = 1;
    number1 = (Math.random() * 100);   
    number = Math.floor(number1);       
   // System.out.println(number);
    do
    {
        System.out.print("guess the number betweenn 1 to 100\n");
        guess = sc.nextInt();
        if (guess > number)
        {
            System.out.print("lower number please! \n");
        }
        else if (guess < number)
        {
            System.out.print("higher number please!\n");
        }
else
{
    System.out.print("you guess it in "+n+" attempts \n");
}
n++;
    } while (guess!=number);

}
 
}
