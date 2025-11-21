		import java.util.Scanner;
																					/* project members :
																					 
																					 Fahad abdallah alanazi - 446100868
																					  Yazeed alhmoud - 446101220
																					 Saif fawaz alanazi - 446106919 
																					 
																					 */
public class LibrarySimulator {

	public static void main(String[] args) {
		
		
		    
		        Scanner in = new Scanner(System.in);

		        int borrowedFahad = 0;    // + in admin
		        int borrowedYazeed = 0;   // + in admin
		        int borrowedSaif = 0;     // + in admin
		        int returnFahad = 0;      // - in admin
		        int returnYazeed = 0;     // - in admin
		        int returnSaif = 0;       // - in admin
		        int borrowedbook = 0;     // + in user
		        int returnbook = 0;       // - in user
		        float total_Fahad = 0.0f; // SAR in user , total fees for Fahad
		        float total_Yazeed = 0.0f; // SAR in user , total fees for  Yazeed
		        float total_Saif = 0.0f;  // SAR in user , total fees for  Saif

		        System.out.println("\t Welcome To Library"); // first massage the user see in the program
		        String Choice_1 = " ";
		        char choice_1 = ' ';

		        do {  								 // start of first do-while statement 
		            System.out.println("Choose the type of login by typing its number: ");
		            System.out.println("1. Login as user account");
		            System.out.println("2. Login as administrator");
		            System.out.println("3. Exit");

		            Choice_1 = in.next();
		            choice_1 = Choice_1.charAt(0);
		            System.out.println("");

		            switch (choice_1) { 			// start of switch for statement choice_1

		                //  user login  //
		                case '1':
		                    String Choice_3 = " ";
		                    char choice_3 = ' ';

		                    borrowedbook = 0; 
		                    returnbook = 0;

		                    System.out.println("You just have three accounts available");

		                    String name1 = "fahad";
		                    int idfahad = 446100868;

		                    String name2 = "yazeed";
		                    int idyazeed = 446101220;

		                    String name3 = "saif";
		                    int idsaif = 446106919;

		                    System.out.println("1. " + name1 + "-" + idfahad);
		                    System.out.println("2. " + name2 + "-" + idyazeed);
		                    System.out.println("3. " + name3 + "-" + idsaif);
		                    System.out.print("Enter the name please: ");
		                    String choice_2 = in.next().toLowerCase();
		                    System.out.println("");

		                    if (choice_2.equals(name1) || choice_2.equals(name2) || choice_2.equals(name3)) { 		// start first if statement
		                        do {																				// start of second do-while statement
		                            System.out.println("Choose the following service by typing its number:");
		                            System.out.println("1. Show how many borrowed books for " + choice_2);
		                            System.out.println("2. Borrow a book");
		                            System.out.println("3. Return a book");
		                            System.out.println("4. Summary for what happened");
		                            System.out.println("5. Go to main menu");

		                            Choice_3 = in.next();
		                            choice_3 = Choice_3.charAt(0);
		                            float borrowed_fee = 0.5f; // fees for each book
		                            System.out.println("");

		                            switch (choice_3) { 				//start of switch statement for choice user menu
		                            	// statement of how many book borrowed
		                                case '1':
		                                    System.out.println("The number of borrowed books for " + choice_2 + " is " + borrowedbook);
		                                    break;
		                                    // statement of borrowed book
		                                case '2':
		                                    if (borrowedbook < 5) { 		// you can't borrow more than 5 books
		                                        System.out.print("Successfully borrowed book ");
		                                        borrowedbook++;
		                                        if (choice_2.equals(name1)) {
		                                            borrowedFahad++;
		                                            total_Fahad += borrowed_fee; //to have total borrowed fee
		                                        } else if (choice_2.equals(name2)) {
		                                            borrowedYazeed++;
		                                            total_Yazeed += borrowed_fee; //to have total borrowed fee
		                                        } else {
		                                            borrowedSaif++;
		                                            total_Saif += borrowed_fee; //to have total borrowed fee
		                                        }
		                                        System.out.println(borrowedbook);
		                                        System.out.println("");
		                                    } else {
		                                        System.out.println("You cannot borrow more than 5 books");
		                                    }
		                                    break;
		                                    // start statement of return book
		                                case '3':
		                                    if (borrowedbook > 0) {
		                                        System.out.print("Successfully returned book ");
		                                        borrowedbook--;
		                                        returnbook++;
		                                        if (choice_2.equals(name1)) {
		                                            borrowedFahad--;
		                                            returnFahad++;
		                                        } else if (choice_2.equals(name2)) {
		                                            borrowedYazeed--;
		                                            returnYazeed++;
		                                        } else {
		                                            borrowedSaif--;
		                                            returnSaif++;
		                                        }
		                                        System.out.println(returnbook);
		                                        System.out.println("");
		                                    } else {
		                                        System.out.println("You have no books to return");
		                                    }
		                                    break; //end statement of return book

		                                    //statement of summary section
		                                case '4':
		                                    System.out.println("Summary for what happened:");
		                                    System.out.println("Books borrowed by " + choice_2 + " : " + borrowedbook);
		                                    System.out.println("Books returned by " + choice_2 + " : " + returnbook);
		                                    if (choice_2.equals(name1))
		                                        System.out.printf("The total fees: %.2f SAR\n", total_Fahad);
		                                    else if (choice_2.equals(name2))
		                                        System.out.printf("The total fees: %.2f SAR\n", total_Yazeed);
		                                    else
		                                        System.out.printf("The total fees: %.2f SAR\n", total_Saif);
		                                    break;
		                                    // statement of back to main menu
		                                case '5':
		                                    System.out.println("You are going to exit the menu...");
		                                    break;

		                                default:
		                                    System.out.println("Invalid option, please try again");
		                            }															// end switch statement for choice user menu
		                        } while (!Choice_3.equals("5"));								// end of second do-while statement
		                    } 																	//end of first if statement
		                    else {															
		                        System.out.println("Please enter the correct name");
		                        System.out.println("");
		                    }
		                    break;  															//end of case 1

		                // admin login //
		                case '2':
		                    System.out.print("Type the password to login: ");
		                    String adminpassword = in.next();

		                    if (adminpassword.equals("123456")) {
		                        String Choice15 = " ";
		                        char choice15 = ' ';

		                        do {
		                            System.out.println("Choose one of the following services by typing its number:");
		                            System.out.println("1. Show the total of fees");
		                            System.out.println("2. Show most completed operation");
		                            System.out.println("3. Exit to main menu");
		                            Choice15 = in.next();
		                            choice15 = Choice15.charAt(0);
		                            System.out.println("");

		                            switch (choice15) {
		                                case '1':
		                                    float total_fees = total_Fahad + total_Yazeed + total_Saif;
		                                    System.out.printf("The total fees is: %.2f SAR\n", total_fees);  
		                                    System.out.println("");
		                                    break;

		                                case '2':
		                                    float total_borrow = borrowedFahad + borrowedSaif + borrowedYazeed;
		                                    float total_return = returnFahad + returnYazeed + returnSaif;
		                                    if (total_borrow > total_return)
		                                        System.out.println("Most operation is borrowed");
		                                    else if (total_borrow < total_return)
		                                        System.out.println("Most operation is return");
		                                    else {
		                                        System.out.println("The operations are equal");
		                                        System.out.println("Number of borrow = " + total_borrow + ", number of return = " + total_return);
		                                    }
		                                    break;

		                                case '3':
		                                    System.out.println("back to main menu");
		                                    break;

		                                default:
		                                    System.out.println("Invalid option, try again...");
		                                    break;
		                            }

		                        } while (!Choice15.equals("3"));

		                    } else {
		                        System.out.println("Invalid login");
		                    }
		                    break;									// end of case 2
		                    // log out
		                case '3':
		                    System.out.println("You are going to logout");
		                    break;

		                default:
		                    System.out.println("Invalid option, try again...");
		                    break; // end of case 3
		            } // end of switch for statement choice_1

		        } while (!Choice_1.equals("3")); // end of first do-while statement 

		        System.out.println("Thank you, have a nice day!!");  
		    }
		
	}


