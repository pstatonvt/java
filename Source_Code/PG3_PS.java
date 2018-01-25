import java.util.*;

public class PG3_PS{

  //standard output
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("------------------------------");
    System.out.println("|       Patrick Staton       |");
    System.out.println("|          CS103-01          |");
    System.out.println("|  Programming Assignment #3 |");
    System.out.println("------------------------------");
    System.out.println();
    System.out.println("[Brief description and rules below:]\n");
    System.out.println("     For those unfamiliar with hangman, it is a common word guessing game where a person (or in this case, the computer) chooses a random word, and the player has to try to determine which word was chosen. The player guesses one letter at a time. For each guessed letter which appears in the randomly chosen word, the computer fills in the letter in the correct place on the word.\n\n     For each incorrectly guessed letter, the letter is added to a list of wrong guesses.If this list grows to length 6, the player loses (i.e., the player must determine the word with fewer than 6 incorrect letter guesses).");
    System.out.println();

    //word bank
    final String[] words = {"mathematics","cat","yesterday","java","truck","coffee","fish","token","transit","bottom","apple","cake","remote","pocket","class","arm","cranberry","tool","caterpillar","spoon", "watermelon","laptop","toe","toad","fundamental", "capitol","capital","anticipate","cherry"};

    //chooses a random word, converts it to a character array, then creates a
    //mask of '*' the same length as the random word
    String rand_word = words[new Random().nextInt(words.length)];
    char[] char_array = rand_word.toCharArray();
    char[] mask = new char[rand_word.length()];
    for(int i=0; i<char_array.length; i++){
      mask[i]='*';
    }

    //prompts the user to start guessing
    System.out.print("Guess what this word is: ");
    System.out.println(mask);


    //initialized loopers
    int looper = 1;
    int misses = 0;
    while(looper>0){

    //gets values of the random word and mask
    String mask_value = String.valueOf(mask);
    String word_value = String.valueOf(char_array);

    //win condition
    if(mask_value.equals(word_value)){
      congrats();
    }

    //losing condition
    if(misses>=char_array.length){
      lose();
    }

    //reads in a chosen letter
    System.out.print("Please guess a letter: ");
    char letter_choice = input.next().toLowerCase().charAt(0);
    boolean found = false;

    /*loops through the chosen word array / mask array searching for
    the character in the character array and mask array. if a matching
    letter is found, the 'true' value sections are executed. if not, then
    the 'false' sections are executed.*/
    for(int i=0; i<char_array.length; i++){
      if(letter_choice==char_array[i]){
        mask[i]=char_array[i];
        found = true;
        System.out.println(mask);
        System.out.println("Misses: " + misses);
      }
    }

    if(found == true)
      System.out.println("Nice!\n");
    else{
      misses++;
      System.out.println("Try again...\n");
     }
    }
  }

  //when the user wins the game, they are congratulated with the surviving hangman character
  public static void congrats(){
      Scanner input = new Scanner(System.in);
      System.out.println("--------------------");
      System.out.println("|Congrats! You win!|");
      System.out.println("--------------------");
      System.out.println("      \\ O / ");
      System.out.println("        |   ");
      System.out.println("       / \\ ");
      System.exit(0);
      }

  //if the user loses, and skull is shown representing his demise...
  public static void lose(){
    System.out.println("Well this is awkward...");
    System.out.println("--------------------");
    System.out.println("|    L O S E R     |");
    System.out.println("--------------------");
    System.out.println("      /     \\");
    System.out.println("     | () () |");
    System.out.println("      \\  ^  /");
    System.out.println("       |||||");
    System.out.println("       |||||");
    System.exit(0);
  }
}
