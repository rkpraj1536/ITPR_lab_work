
import java.util.Scanner; //importing Scanner class for user input
/*----- Defining a class for greatest number ----*/
class GreatestNum {

    int[] numbers;// declaration of array to store numbers
    //Constructor

    public GreatestNum() {
        //initializing number of elements to be stored
        numbers = new int[20];

        //Creating object of Scanner class to initialize elements into the array
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any 20 number : ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = sc.nextInt(); //Reading input and storing number at given index in array
        }
        System.out.println("--------------------------------------------");
        sc.close();//closing scanner object to avoid resource leak
    }

    //method to Calculate greater number elements of the array
    public int greatestNumber() {
        int Max = numbers[0]; // I have assume that the first number is greates number so that it can be compared
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > Max) {
                Max = numbers[i];

            }
        }
        return Max; // returning of the maximum number
    }
    //method to display data

    public void displayData() {
        //Displaying numbers to the user
        System.out.println("Greatest Numbers is : "+greatestNumber());
        System.out.println("\n ----------------------------------");

    }
}

/*------------------------*/
// Creating the main class
public class GreaterNumber {

    public static void main(String[] args) {
        // Creating object
        GreatestNum obj = new GreatestNum();
        obj.displayData();

    }

}
