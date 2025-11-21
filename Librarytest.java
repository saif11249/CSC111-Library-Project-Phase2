package phase2;

import java.util.Scanner;

public class Librarytest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Member fahad = new Member(446100868, "Fahad");
		Member yazeed = new Member(446101220, "Yazeed");
		Member saif = new Member(446106919, "Saif");

		System.out.println("\t \t Welcome to library");
		String Choice1 = " ";
		char choice1 = ' ';
		do {

			System.out.println("1-sign in as member ");
			System.out.println("2-sign in as adminstritor");
			System.out.println("3-exit");
			System.out.print("Enter the number please: ");
			Choice1 = input.next();
			choice1 = Choice1.charAt(0);
			System.out.println("");
			String Choice2 = " ";
			char choice2 = ' ';
			switch (choice1) {
			case '1':

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
				Choice2 = input.next().toLowerCase();
				System.out.println("");

				Member currentMember = null;
				if (Choice2.equals("fahad") || Choice2.equals("yazeed") || Choice2.equals("saif")) {
					if (Choice2.equals("fahad")) {
						currentMember = fahad;
					}

					else if (Choice2.equals("yazeed")) {
						currentMember = yazeed;
					}

					else if (Choice2.equals("saif")) {
						currentMember = saif;
					}

					String Choice3 = " ";
					char choice3 = ' ';
					do {

						System.out.println("Choose the following service by typing its number:");
						System.out.println("1. Show how many borrowed books for " + Choice2);
						System.out.println("2. Borrow a book");
						System.out.println("3. Return a book");
						System.out.println("4. Summary for what happened");
						System.out.println("5. Go to main menu");
						Choice3 = input.next();
						choice3 = Choice3.charAt(0);

						switch (choice3) {

						case '1':
							currentMember.viewBorrowedCount();
							break;
						case '2':
							currentMember.borrowOne();
							break;
						case '3':
							currentMember.returnOne();
							break;
						case '4':
							currentMember.displayStatistics();
							break;
						case '5':
							System.out.println("you are going to exit to main menu");
							currentMember.reset();
							break;

						default:
							System.out.println("choose a number between 1 and 5!");
						}

					} 
					while (choice3 != '5');
				} 
				else {
					System.out.println("Enter a correct name");
				}

				break;

			case '2':
				System.out.print("Type the password to login: ");
				String adminpassword = input.next();
				System.out.println("");
				
				if (adminpassword.equals("123456")) {
					String Choice15 = " ";
					char choice15 = ' ';

					do {
						System.out.println("Choose one of the following services by typing its number:");
						System.out.println("1. Show the total of fees");
						System.out.println("2. Show most completed operation");
						System.out.println("3. Exit to main menu");
						Choice15 = input.next();
						choice15 = Choice15.charAt(0);
						System.out.println("");

						switch (choice15) {

						case '1':
							System.out.println("total of fees is: " + Member.TotalRevenue);
							System.out.println("");
							break;
						case '2':
							int totalborrows = Member.TotalBorrows;
							int totalreturns = Member.TotalReturns;
							if (totalborrows > totalreturns) {
								System.out.println("Most operation is borrowed");
							}
							else if (totalborrows < totalreturns) {
								System.out.println("Most operation is return");
							} 
							else {
								System.out.println("The operations are equal");
								System.out.println("Number of borrow = " + totalborrows + ", number of return = " + totalreturns);
							}
							System.out.println("");
							break;
						case '3':
							System.out.println("You are going to exit to main menu...");
							break;
						default:
							System.out.println("choose a number between 1 and 3");
						}
					} 
					while (choice15 != '3');

				}
				else {
					System.out.println("invalid password!");
				}
			case '3':
				System.out.println("you are going to leave the library \n GoodBye");
			}

		} 
		while (choice1 != '3');
	}

}
