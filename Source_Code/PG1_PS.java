import java.util.Scanner;

public class PG1_PS { //'public' and 'class' are keywords
	public static void main (String[] args) {

			//Listing and initializing variables
			int grade;
			grade = 0;
			int a_counter=0;
			int b_counter=0;
			int c_counter=0;
			int d_counter=0;
			int f_counter=0;

			//Header output
			System.out.println("\nCS103 - Patrick Staton");

			System.out.println("##     ##        ##          ##        ##  ");
			System.out.println("##     ##       ####         ##        ##  ");
			System.out.println("##     ##      ##  ##        ## ###### ##  ");
			System.out.println("##     ##      ######        ##        ##  ");
			System.out.println("  #####        ##  ##        ##        ##  ");


			//Scanner for user input
			Scanner input = new Scanner(System.in);

			//Main looping function

			while(grade >= 0){
				System.out.println("This program will determine what letter grade you have based on the number you enter!");
				System.out.println("**PSA: If you wish to exit the program, please type '-1'**\n");
				System.out.println("Please enter a number grade: ");
				grade = input.nextInt();

				//Exit strategy
				if (grade == -1){
					System.out.println("Totals: ");
					System.out.println("A: " + a_counter);
					System.out.println("B: " + b_counter);
					System.out.println("C: " + c_counter);
					System.out.println("D: " + d_counter);
					System.out.println("F: " + f_counter);
					System.exit(0);
				}


				//Grade determination

				if (grade > 100 || grade < -1){
					System.out.println("Not a valid value, please enter a value between 1 and 100!\n");
					continue;
				}

				

				if (grade >= 97 && grade <= 100){
					System.out.println("Grade: " + grade);
					System.out.println("That student earned a grade of A+\n");
					a_counter += 1;
				}
					else if (grade >= 93 && grade <= 97){
						System.out.println("Grade: " + grade);
						System.out.println("That student earned a grade of A\n");
						a_counter += 1;

				}
					else if (grade >= 90 && grade <=92){
						System.out.println("Grade: " + grade);
						System.out.println("That student earned a grade of A-\n");
						a_counter += 1;

				}
					else if (grade >= 87 && grade <= 89){
						System.out.println("Grade: " + grade);
						System.out.println("That student earned a grade of B+\n");
						b_counter += 1;

				}
					else if (grade >= 83 && grade <= 86){
						System.out.println("Grade: " + grade);
						System.out.println("That student earned a grade of B\n");
						b_counter += 1;

				}
					else if (grade >= 80 && grade <= 82){
						System.out.println("Grade: " + grade);
						System.out.println("That student earned a grade of B-\n");
						b_counter += 1;

				}
					else if (grade >= 77 && grade <= 79){
						System.out.println("Grade: " + grade);
						System.out.println("That student earned a grade of C+\n");
						c_counter += 1;

				}
					else if (grade >= 73 && grade <= 76){
						System.out.println("Grade: " + grade);
						System.out.println("That student earned a grade of C\n");
						c_counter += 1;

				}
					else if (grade >= 70 && grade <= 72){
						System.out.println("Grade: " + grade);
						System.out.println("That student earned a grade of C-\n");
						c_counter += 1;

				}
					else if (grade >= 60 && grade <= 69){
						System.out.println("Grade: " + grade);
						System.out.println("That student earned a grade of D\n");
						d_counter += 1;

				}
					else if (grade >= 0 && grade <= 59){
						System.out.println("Grade: " + grade);
						System.out.println("That student earned a grade of F\n");
						f_counter += 1;
				}

			}
		}
	}
