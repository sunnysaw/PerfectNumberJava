import java.util.Scanner;
/*
Question : Write a program to check whether the number is prefect or not.
 */
public class Main {
    public static void main(String[] args) {
        int temp,temp2, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check perfect or not :");
        int a = sc.nextInt();
        System.out.println("Now, Printing the result :");
        System.out.println("Firstly, printing the number by which it is divisible : ");
        for (int i = 1; i < a; i++){
                if (a % i == 0){
                    temp = i;
                    System.out.println(temp);
                    sum = sum + temp;
                }
        }
        System.out.println("Secondly, printing the sum of divisor number : " + sum);
        if (sum == a){
            System.out.println("Given number is perfect number : " + a);
        }else
            System.out.println("Given number is not a perfect number : " + a);
    }
}
