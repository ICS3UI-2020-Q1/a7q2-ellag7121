/**
 * create a method that asks for a number and prints the factors to the screen
 * @author Graham Ellacott
 */
public class Main {

  //a method that gets a number and finds all the factors of that number
  public static void factors(int number){
    //check all the numbers up to the given number
    for(int i = 1; i <= number; i++){
      //get the remainder of the number and "i"
      int remainder = number % i;
      if(remainder == 0){ //if it is a factor (if remainder is 0)
        System.out.println(i); //print the factor to the screen
      }
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // check a bunch of numbers
    factors(10);
    System.out.println(""); //put a gap between all the sets of factors (just for readabiliy)
    factors(18);
    System.out.println("");//put a gap between all the sets of factors (just for readabiliy)
    factors(33);
    System.out.println("");//put a gap between all the sets of factors (just for readabiliy)
    factors(72);
    System.out.println("");//put a gap between all the sets of factors (just for readabiliy)
    factors(100);
    
  }
}
