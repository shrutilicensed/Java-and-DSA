import java.util.*;
public class GuessGame {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int number = (int) (Math.random() * 100) + 1;
    // System.out.println("Cheat code: " + number);
    int guessedNumber=0;
    System.out.println("Welcome to the Guess Game! \nI have a number between 1-100 in mind. Can you guess it? \nYou have 5 tries to guess the correct answer");
    int key=5;
    while(key>0){
    System.out.println("Guess the number: ");
    guessedNumber= scan.nextInt();
    if(guessedNumber<0){
      System.out.println("Number cannot be less than zero. You've lost one try !");
      key--;
    }
    else{
      if(guessedNumber>number){
        System.out.println("Too High!");
        key--;
      }
      else if(guessedNumber == number){
        System.out.println("Bingo ! Your guess was correct! You've won this challenge !");
        key = -1 ;
        break;
      }
      else{
        System.out.println("Too Low");
        key--;
      }}}
  if(key==0){
    System.out.println("Whoops! You've exhausted all your tries. Maybe another match?");
  }
  else{
    System.out.println("You're a guess genius");
  }}}