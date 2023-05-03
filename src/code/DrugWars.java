package code;

import java.util.Scanner;

public class DrugWars {

	/*
	case 9:
case 10:
case 11:
	System.out.println("| Action-packed police  |\n"
			 	   	 + "| chase sequence!!!     |");
	System.out.println("--------------------------");
	//TODO: make police chase or whatever
	int D = event - 8;
	if(D >= 2)
		D++;
	System.out.printf("%s %d %s%n","OFFICER HARDASS AND", D, "OF HIS DEPPUTIES ARE AFTER YOU!");
	prompt(input);
	
	int action;
	
	while(D > 0) {
		
		System.out.println("Being Chased!!:");
		System.out.println("\n--------------------------");
		System.out.printf(" %-1d. %21s%n", 1, "View Guns");
		System.out.printf(" %-1d. %21s%n", 2, "View Dammage");
		System.out.printf(" %-1d. %21s%n", 3, "Number of Pigs");
		System.out.printf(" %-1d. %21s%n", 4, "Run");
		System.out.printf(" %-1d. %21s%n", 5, "Fight");
		System.out.println("--------------------------");
		
		action = choice(input, 1, 5);
	
		switch(action) {
		case 1:
			System.out.println("\n--------------------------");
			System.out.printf(" %-12s %11d%n", "No. of Guns:", guns);
			System.out.println("--------------------------");
			prompt(input);
			break;
		case 2:
			System.out.println("\n--------------------------");
			System.out.printf(" %-13s %10d%n", "Your dammage:", damage);
			System.out.println("--------------------------");
			System.out.println("(50 DAMMAGE AND\nYOU DIE!)");
			prompt(input);
			break;
		case 3:
			System.out.printf(" %s %d %s%n", "There are", D, "Pigs still chasing you!");
			prompt(input);
			break;
		case 4:
			System.out.println("\tRunning...!");
			prompt(input);
			int lost = random(0, D);
			D -= random(0, D);
			if(lost > 0)
				System.out.printf(" %s %d %s%n", "You lost", lost, "in an alley!!");
			else
				System.out.println("You can't shake them!!");
			prompt(input);
			break;
		case 5:
			if(guns < 1) {
				System.out.println("You don't have any guns!\nYou have to run!");
				prompt(input);
				break;
			}
			
			int hit = random(0, 1);
			D -= random(0, guns);
			if(hit > 1)
				System.out.printf("You missed!!!");
			else {
				System.out.println("You killed one!!");
				D--;
			}
			prompt(input);
			break;
		}
		
		int injure = random(0, 3);
		
		System.out.println("They're firing at you!!");
		damage += injure;
		
		if(injure < 1)
			System.out.println("They missed!!");
		else {
			System.out.println("You've been hit!");
		}
		
		if(damage >= 50) {
			System.out.println("You've been killed!");
			exit = true;
			break;
		}
		
	}
	
	System.out.println("You did not go to jail today!");
	System.out.println("You found: " + (wallet += random(750, 50000)) + " money");
	
	*/

	public static int space(int[] coat, int maximum) {
		int result = maximum;
		
		for(int i = 0; i < coat.length; i++) {
			result -= coat[i];
		}
		
		return result;
	}
	
	public static void prompt(Scanner input) {
		System.out.println("Press Enter to Continue...");
		if (!input.hasNextLine()) {
			input.nextLine();
		}
		input.nextLine();
	}
	
	public static int random(int MIN, int MAX) {
		return (int) (Math.random() * (MAX - MIN + 1)) + MIN;
	}
	
//	public static boolean confirm(Scanner input) {
//		return (choice(input, 0, 1) == 1);
//	}
	
	public static boolean confirm(Scanner input) {
		int choice;
		
		do {
		
			System.out.print(" > ");
			
			if(!input.hasNextInt()) {
				choice = input.next().toLowerCase().charAt(0);
			} else
				choice = input.nextInt();
			
			
			if(choice == 0 || choice == 'n')
				choice = 0;
			else if(choice == 1 || choice == 'y')
				choice = 1;
			
			input.nextLine();
			
		} while(choice < 0 || choice > 1);
		
		return choice == 1;
	}
	
	public static int menuChoice(Scanner input) {
		
		int choice;
		
		do {
			
			System.out.print(" > ");
			
			if(!input.hasNextInt()) {
				choice = input.next().toLowerCase().charAt(0);
			} else
				choice = input.nextInt();
			
			
			switch(choice) {
			case '0':
			case 'e':
				choice = 0;
				break;
			case '1':
			case 'p':
				choice = 1;
				break;
			case '2':
			case 't':
				choice = 2;
				break;
			case '3':
			case 'b':
				choice = 3;
				break;
			case '4':
			case 's':
				choice = 4;
				break;
			case '5':
			case 'j':
				choice = 5;
				break;
			case '6':
			case 'l':
				choice = 6;
				break;
			case '7':
			case 'v':
				choice = 7;
			}
			
			input.nextLine();
		
		} while(choice < 0 || choice > 7);
		
		return choice;
	}
	
	
	public static int jetChoice(Scanner input) {
		
		int choice;
		
		do {
		
			System.out.print(" > ");
			
			if(!input.hasNextInt()) {
				choice = input.next().toLowerCase().charAt(0);
			} else
				choice = input.nextInt();
			
			
			switch(choice) {
			case '0':
			case 's':
				choice = 0;
				break;
			case '1':
			case 'b':
				choice = 1;
				break;
			case '2':
			case 'g':
				choice = 2;
				break;
			case '3':
			case 'p':
				choice = 3;
				break;
			case '4':
			case 'm':
				choice = 4;
				break;
			case '5':
			case 'c':
				choice = 5;
				break;
			case '6':
			case 'y':
				choice = 6;
			}
			
			input.nextLine();
		
		} while(choice < 0 || choice > 6);
		
		return choice;
	}
	
	public static int drugChoice(Scanner input, int min, int max) {
		
		int choice;
		
		do {
		
			System.out.print(" > ");
			
//			while(!input.hasNext()) {
//				
//				if(input.hasNext()) {
//					String garbage = input.next();
//					System.out.println("\u001b[1;31m" + garbage + " is not recognized\u001b[0m");
////					System.out.println("\33[1;4;31mYou say that again, there will be consequences.\33[0m");
//					System.out.print(" \33[32m>\33[0m ");
//				}
//				
//			}
			
			if(!input.hasNextInt()) {
				choice = input.next().toLowerCase().charAt(0);
			} else
				choice = input.nextInt();
			
			
			switch(choice) {
			case '0':
			case 'n':
				choice = 0;
				break;
			case '1':
			case 'c':
				choice = 1;
				break;
			case '2':
			case 'h':
				choice = 2;
				break;
			case '3':
			case 'a':
				choice = 3;
				break;
			case '4':
			case 'w':
				choice = 4;
				break;
			case '5':
			case 's':
				choice = 5;
				break;
			case '6':
			case 'l':
				choice = 6;
			}
			
			input.nextLine();
		
		} while(choice < min || choice > max);
		
		return choice;
	}
	
	public static int choice(Scanner input, int min, int max) {
		
		int choice;
		
		do {
		
			choice = choice(input);
		
		} while(choice < min || choice > max);
		
		return choice;
	}
	
	public static int choice(Scanner input) {
		// get the choice of the user
		// now with string rejection!
		System.out.print(" > ");
		
		while(!input.hasNextInt()) {
			if(input.hasNext()) {
				String garbage = input.next();
				System.out.println("\u001b[1;31m" + garbage + " is not recognized\u001b[0m");
//				System.out.println("\33[1;4;31mYou say that again, there will be consequences.\33[0m");
				System.out.print(" \33[32m>\33[0m ");
			}
		}
		
		int choice = input.nextInt();
		input.nextLine();
		
		return choice;
		
	}
	
	public static void main(String args[]) {
		System.out.println("Copyright Bennett Tingle 2023");
		System.out.println("A Java port of J.M.'S Drugwar Simulation Version 2.00");
		System.out.println("Original game for IBM by: John E. Dell");
		System.out.println("\nJUST SAY NO.");
		
		Scanner input = new Scanner(System.in);	
		
		System.out.println("\nInstructions? (1/0)");
		
		if(confirm(input)) {
			
			System.out.println("THIS IS A GAME OF BUYING AND SELLING. YOUR GOAL IS TO PAY- OFF YOUR DEBT TO THE LOAN SHARK, AND THEN MAKE AS");
			System.out.println("MUCH MONEY AS POSSIBLE IN A 1 MONTH PERIOD. WATCH-OUT FOR THE POLICE IF YOU DEAL TOO HEAVILY!");
			System.out.println("PRICES FOR DRUGS ARE: \nCOCAINE: 15000-28000 \nHEROINE: 5000-12000 \nACID: 1000-4200");
			System.out.println("WEED: 300-720 \nSPEED: 70-220 \nLUDES: 10-50");
			System.out.println("GENERALY, TYPE THE FIRST LETTER OF WHAT YOU WANT TO DO, I.E.: W=WEED, L=LUDES ETC...");
			System.out.println("BUT, 1=YES AND 2=NO");
			System.out.println("THE LAST NUMBER IN THE PRICES LIST IS YOUR WALLET. THE LAST NUMBER IN YOUR TRENCHCOAT IS FREE SPACE.");
			prompt(input);
		}
		
		boolean exit = false;
		
//		Also like the whole pricing system and event system.
//		I'll just port over variable names as-is for now, then rename them as I learn what they do.
		
		int wallet = 2000;
		int debt = 5000;
		
		int bankAccount = 0;
		int space = 100;
		int MAXSPACE = 100;
		int day = 1;
		boolean bronx = true;
		
		// currently unused TODO add corresponding features.
//		int guns = 0;
//		int damage = 0;
//		int holsters = 100;
		
		int[] prices = new int[6];
		int[] trenchcoat = new int[6];
		
		// set drug prices?
		prices[0]	= random(	16000,	28000	);
		prices[1]	= random(	5000,	12000	);
		prices[2]	= 100 * random(	34,	44	);
		prices[3]	= 10 * random(	33,	75	);
		prices[4]	= 10 * random(	7,	22	);
		prices[5]	= 10 * random(	1,	5	);
		
		// events
		int event = random(1,20);
		
		while(!exit) {
			
			if(day >= 31) {
				exit = true;
				continue;
			}
			
			// main game loop goes... here!
			System.out.println();
			
			/*
			System.out.println(""
					+ "________                        \r\n"
					+ "\\______ \\_______ __ __  ____    \r\n"
					+ " |    |  \\_  __ |  |  \\/ ___\\   \r\n"
					+ " |    `  /|  | \\|  |  / /_/  >  \r\n"
					+ "/_______/ |__|__|____/\\___  /._.\r\n"
					+ "     /  \\/   /  _____/_____/_| |\r\n"
					+ "     \\   \\/\\/   \\__  \\\\_  __ | |\r\n"
					+ "      \\        / / __ \\|  | \\/\\|\r\n"
					+ "       \\__/\\  / (____  |__|   __\r\n"
					+ "            \\/       \\/       \\/\r\n");
			
			*/
			//TODO: Make this more fun QoL-wise, like a day counter and stuff.
			
			System.out.println("\n--------------------------");
			System.out.printf(" %-4s %19d", "Day:", day);
			System.out.println("\n--------------------------");
			System.out.printf(" %-1d. %21s%n", 0, "(E)xit");
			System.out.printf(" %-1d. %21s%n", 1, "See (P)rices");
			System.out.printf(" %-1d. %21s%n", 2, "(T)renchcoat");
			System.out.printf(" %-1d. %21s%n", 3, "(B)uy");
			System.out.printf(" %-1d. %21s%n", 4, "(S)ell");
			System.out.printf(" %-1d. %21s%n", 5, "(J)et");
			
			if(bronx) {
				System.out.println("--------------------------");
				System.out.printf(" %-1d. %21s%n", 6, "See (L)oan Shark");
				System.out.printf(" %-1d. %21s%n", 7, "(V)isit Bank");
			}
			
			System.out.println("--------------------------");
			
			int choice = menuChoice(input);
			
			switch(choice) {
			
			case 0:
				// leave
				System.out.println("Are you sure? (1/0)");
				exit = confirm(input);
				break;
				
			case 1:
				// prices
				System.out.println("\n--------------------------");
				System.out.printf(" %-8s %15d%n", "cocaine", prices[0]);
				System.out.printf(" %-8s %15d%n", "heroin", prices[1]);
				System.out.printf(" %-8s %15d%n", "acid", prices[2]);
				System.out.printf(" %-8s %15d%n", "weed", prices[3]);
				System.out.printf(" %-8s %15d%n", "speed", prices[4]);
				System.out.printf(" %-8s %15d%n", "ludes", prices[5]);
				System.out.println("--------------------------");
				System.out.printf(" %-8s %15d%n", "wallet", wallet);
				System.out.println("--------------------------");
				prompt(input);
				break;
				
			case 2:
				// inventory
				System.out.println("\n--------------------------");
				System.out.printf(" %-8s %15d%n", "cocaine", trenchcoat[0]);
				System.out.printf(" %-8s %15d%n", "heroin", trenchcoat[1]);
				System.out.printf(" %-8s %15d%n", "acid", trenchcoat[2]);
				System.out.printf(" %-8s %15d%n", "weed", trenchcoat[3]);
				System.out.printf(" %-8s %15d%n", "speed", trenchcoat[4]);
				System.out.printf(" %-8s %15d%n", "ludes", trenchcoat[5]);
				System.out.println("--------------------------");
				System.out.printf(" %-10s%14d%n", "free space", space);
				System.out.println("--------------------------");
				prompt(input);
				break;
				
			case 3:
				// buy
				System.out.println("\n--------------------------");
				System.out.printf(" %-4s %19d", "Day:", day);
				System.out.println("\n--------------------------");
				System.out.println("What would you like to buy?");
				
				System.out.println("--------------------------");
				System.out.printf(" %-12s%12d%n", "0. (n)othing", 0);
				System.out.printf(" %-12s%12d%n", "1. (c)ocaine", prices[0]);
				System.out.printf(" %-12s%12d%n", "2. (h)eroin", prices[1]);
				System.out.printf(" %-12s%12d%n", "3. (a)cid", prices[2]);
				System.out.printf(" %-12s%12d%n", "4. (w)eed", prices[3]);
				System.out.printf(" %-12s%12d%n", "5. (s)peed", prices[4]);
				System.out.printf(" %-12s%12d%n", "6. (l)udes", prices[5]);
				System.out.println("--------------------------");
				System.out.printf(" %-8s %15d%n", "wallet", wallet);
				System.out.println("--------------------------");
				
				choice = drugChoice(input, 0, 6) - 1;
				
				if(choice <= -1)
					break;
				
				int quantity;
				
				do {
					
					System.out.println("How much?");
					System.out.println("\n--------------------------");
					System.out.printf(" %-15s%9d%n", "You can afford:", ((int) wallet / prices[choice]));
					System.out.printf(" %-13s%11d%n", "You can hold:", space);
					System.out.println("--------------------------");
					
					quantity = choice(input, 0, Integer.MAX_VALUE);
					
				} while(quantity > (wallet / prices[choice]) || quantity > space);
				
				wallet -= (prices[choice] * quantity);
				
				trenchcoat[choice] += quantity;
				
				space = space(trenchcoat, MAXSPACE);
				
				break;
				
			case 4:
				// sell
				System.out.println("\n--------------------------");
				System.out.printf(" %-4s %19d", "Day:", day);
				System.out.println("\n--------------------------");
				System.out.println("What would you like to sell?");
				
				
				System.out.println("--------------------------");
				System.out.printf(" %-12s%12d%n", "0. (n)othing", 0);
				System.out.printf(" %-12s%12d%n", "1. (c)ocaine", trenchcoat[0]);
				System.out.printf(" %-12s%12d%n", "2. (h)eroin", trenchcoat[1]);
				System.out.printf(" %-12s%12d%n", "3. (a)cid", trenchcoat[2]);
				System.out.printf(" %-12s%12d%n", "4. (w)eed", trenchcoat[3]);
				System.out.printf(" %-12s%12d%n", "5. (s)peed", trenchcoat[4]);
				System.out.printf(" %-12s%12d%n", "6. (l)udes", trenchcoat[5]);
				System.out.println("--------------------------");
				System.out.printf(" %-10s %13s%n", "free space", space);
				System.out.println("--------------------------");
				
				choice = drugChoice(input, 0, 6) - 1;
				
				if(choice <= -1)
					break;
				
				int sum;
				
				do {
					
					System.out.println("\nHow much?");
					System.out.println("--------------------------");
					System.out.printf(" %-9s%15d%n", "You have:", trenchcoat[choice]);
					System.out.printf(" %-13s%11d%n", "You can make:", trenchcoat[choice] * prices[choice]);
					System.out.println("--------------------------");
					
					sum = choice(input, 0, Integer.MAX_VALUE);
					
				} while(sum > (trenchcoat[choice]));
				
				wallet += (prices[choice] * sum);
				
				trenchcoat[choice] -= sum;
				
				space = space(trenchcoat, MAXSPACE);
				
				break;
				
			case 5:
				
				System.out.println("Where to, Dude?");
				System.out.println("--------------------------");
				System.out.printf(" %-1d. %21s%n", 0, "Oops... Stay!");
				System.out.printf(" %-1d. %21s%n", 1, "(B)ronx");
				System.out.printf(" %-1d. %21s%n", 2, "(G)hetto");
				System.out.printf(" %-1d. %21s%n", 3, "Central (P)ark");
				System.out.printf(" %-1d. %21s%n", 4, "(M)anhatten");
				System.out.printf(" %-1d. %21s%n", 5, "(C)oney Island");
				System.out.printf(" %-1d. %21s%n", 6, "Brookl(y)n");
				System.out.println("--------------------------");
				
				int destination;
					
				destination = jetChoice(input);
				
				if(destination == 1 && bronx) {
					System.out.println("You're already in the Bronx!");
					prompt(input);
					break;
				}
				else if(destination == 1 && !bronx)
					bronx = true;
				else if(destination == 0)
					break;
				else
					bronx = false;
				
				System.out.println("\tSubway...");
				prompt(input);
				
				day++;
				
				debt *= 1.1;
				bankAccount *= 1.06;
				
				prices[0]	= random(	16000,	28000	);
				prices[1]	= random(	5000,	12000	);
				prices[2]	= 100 * random(	34,	44	);
				prices[3]	= 10 * random(	33,	75	);
				prices[4]	= 10 * random(	7,	22	);
				prices[5]	= 10 * random(	1,	5	);
				
				// events
				event = random(1,20);
				
				// TODO force event
//				event = 9;
				
				System.out.println("--------------------------");
				System.out.println("|       !!!Event!!!      |");
				System.out.println("--------------------------");
				switch(event) {
				case 1:
				case 9:
					System.out.println("| Rival dealers are sel- |\n"
									 + "| -ling cheap ludes!!!   |\n");
					System.out.println("--------------------------");
					prices[5] = 2;
					break;
				case 2:
				case 10:
					System.out.println("| Weed prices have bott- |\n"
									 + "| -omed out!!!           |\n");
					System.out.println("--------------------------");
					prices[3] = 122;
					break;
				case 3:
				case 11:
				case 12:
					System.out.println("| Pigs are selling hero- |\n"
									 + "| -in from last week's   |\n"
									 + "| raid!!!!               |");
					System.out.println("--------------------------");
					prices[1] = random(850, 2000);
					break;
				case 4:
				case 5:
				case 20:
					System.out.println("| Addicts are buying he- |\n"
									 + "| -roin at outrageous    |\n"
									 + "| prices!!!              |");
					System.out.println("--------------------------");
					prices[1] = random(18_000, 43_000);
					break;
				case 6:
				case 7:
				case 13:
					System.out.println("| Pigs made a big coke   |\n"
									 + "| bust! Prices are outr- |\n"
									 + "| -ageous!!!!            |");
					System.out.println("--------------------------");
					prices[0] = random(80_000, 140_000);
					break;
				case 8:
					System.out.println("| You were mugged in th- |\n"
									 + "| -e subway!             |\n");
					System.out.println("--------------------------");
					wallet /= 3;
					wallet *= 2;
					break;
				case 15:
					if(wallet >= 200) {
						
						System.out.println("| Will you buy a new tr- |\n"
						 		 		 + "| -enchcoat with more    |\n"
						 		 		 + "| pockets for 200 bucks? |");
						System.out.println("--------------------------");
						
						if(confirm(input)) {
							wallet -= 200;
							MAXSPACE += 10;
							space += 10;
						}
						
					} else {
						
						System.out.println("|                        |\n"
				 		 		 		 + "|   nothing happens lol  |\n"
				 		 		 		 + "|                        |");
						System.out.println("--------------------------");
					}
					
					break;
				case 14:
					System.out.println("| There's some weed her- |\n"
									 + "| -e that smells like g- |\n"
									 + "| -ood stuff!!           |");
					System.out.println("--------------------------");
					System.out.println("Will you smoke it?");
					
					if(confirm(input)) {
						System.out.println("You hallucinate on the wildest trip of your life");
						prompt(input);
						System.out.println("Stumble on to the subway tracks and get creamed by a train.");
						prompt(input);
						System.out.println("--------------------------");
						System.out.println("Just say no to drugs.");
						prompt(input);
						exit = true;
						break;
					}
					
					break;
				case 0:
					// never happens
					if(wallet >= 400) {
						
						System.out.println("| Will you buy a:        |");
						
						String gun = "gun";
						switch(random(0,2)) {
						case 0:
							gun = "barretta";
							break;
						case 1:
							gun = "sat. night special";
							break;
						case 2:
							gun = ".44 magnum";
							break;
						}
						
						System.out.printf("|%" + ((int) (24 + gun.length()) / 2) + "s%" + ((int) (24 - gun.length()) / 2) + "s|%n", gun, "");
						System.out.println("|     for 400 dollars?   |");
						System.out.println("--------------------------");
						
						if(confirm(input)) {
							wallet -= 400;
//							guns++;
						}
						
					} else {
						
						System.out.println("|                        |\n"
								 		 + "|   nothing happens lol  |\n"
								 		 + "|                        |");
						System.out.println("--------------------------");
						
					}
					break;
				case 16:
				case 19:
					System.out.println("| You found:             |");
					
					int amount = random(1,7);
					String find = amount + " units of ";
					int which = random(0,5);
					
					switch(which) {
					case 0:
						find += "cocaine";
						break;
					case 1:
						find += "heroin";
						break;
					case 2:
						find += "acid";
						break;
					case 3:
						find += "weed";
						break;
					case 4:
						find += "speed";
						break;
					case 5:
						find += "ludes";
						break;
					}
					System.out.printf("|%" + ((int) (24 + find.length()) / 2) + "s%" + ((int) (25 - find.length()) / 2) + "s|%n", find, "");
					System.out.println("| on a dead dude in the  |\n"
									 + "| subway!!!              |");
					System.out.println("--------------------------");
					
					trenchcoat[which] += amount;
					
					break;
				case 17:
				case 18:
					System.out.println("| The market has been    |\n"
							 		 + "| flooded with cheap     |\n"
							 		 + "| home-made acid!!!!     |");
					System.out.println("--------------------------");
					prices[2] = random(250, 550);
					break;
					
				default:
					System.out.println("|                        |\n"
					 		 		 + "|   nothing happens lol  |\n"
					 		 		 + "|                        |");
					System.out.println("--------------------------");
					break;
				}
				
				prompt(input);
				
				break;
				
			case 6:
				// loan shark
				if(!bronx) {
					System.out.println("The Loan Shark only deals in the Bronx.");
					prompt(input);
					break;
				}
				
				System.out.println("Loan Shark...");
				System.out.println("--------------------------");
				System.out.printf(" %-1d. %21s%n", 0, "Exit");
				System.out.printf(" %-1d. %21s%n", 1, "Repay");
				System.out.printf(" %-1d. %21s%n", 2, "Borrow");
				System.out.println("--------------------------");
				
				choice = choice(input, 0, 2);
				
				if(choice == 0)
					break;
				
				int pay;
				
				if(choice == 1) {
					
					do {
						
						System.out.println("How much to Repay?");
						System.out.println("\n--------------------------");
						System.out.printf(" %-14s %8d%n", "You're debt is:", debt);
						System.out.printf(" %-12s %11d%n", "Your wallet=", wallet);
						System.out.println("--------------------------");
						
						pay = choice(input, 0, Integer.MAX_VALUE);
						
					} while(pay > wallet || pay > debt);
					
					debt -= pay;
					wallet -= pay;
					break;
					
				}
				else if(choice == 2) {
					
					do {
						
						System.out.println("How much to Borrow?");
						System.out.println("\n--------------------------");
						System.out.printf(" %-14s %8d%n", "You're debt is:", debt);
						System.out.printf(" %-12s %11d%n", "Your wallet=", wallet);
						System.out.println("--------------------------");
						
						pay = choice(input, 0, Integer.MAX_VALUE);
						
						if(pay > 5000) {
							System.out.println("You think he's crazy, man?!");
							prompt(input);
						}
						
					} while(pay > 5000);
					
					debt += pay;
					wallet += pay;
					break;
					
				}
				
				
				break;
				
			case 7:
				// bank
				if(!bronx) {
					System.out.println("The Bank is in the Bronx.");
					prompt(input);
					break;
				}
				
				System.out.println("Bank:");
				System.out.println("\n--------------------------");
				System.out.printf(" %-1d. %21s%n", 0, "Exit");
				System.out.printf(" %-1d. %21s%n", 1, "Deposit");
				System.out.printf(" %-1d. %21s%n", 2, "Withdraw");
				System.out.println("--------------------------");
				
				choice = choice(input, 0, 2);
				
				if(choice == 0)
					break;
				
				int money;
				
				if(choice == 1) {
					
					do {
						
						System.out.println("How much to Deposit?");
						System.out.println("\n--------------------------");
						System.out.printf(" %-8s %15d%n", "You have", wallet);
						System.out.printf(" %-13s %10d%n", "Your Account=", bankAccount);
						System.out.println("--------------------------");
						
						money = choice(input, 0, Integer.MAX_VALUE);
						
					} while(money > wallet);
					
					bankAccount += money;
					wallet -= money;
					break;
					
				}
				else if(choice == 2) {
					
					do {
						
						System.out.println("How much to Withdraw?");
						System.out.println("\n--------------------------");
						System.out.printf(" %-8s %15d%n", "You have", wallet);
						System.out.printf(" %-13s %10d%n", "Your Account=", bankAccount);
						System.out.println("--------------------------");
						
						money = choice(input, 0, Integer.MAX_VALUE);
						
					} while(money > bankAccount);
					
					bankAccount -= money;
					wallet += money;
					break;
					
				}
			
			}
			
		}
		
		System.out.println("\r\n"
				+ "\r\n"
				+ "   ___                \r\n"
				+ "  / __|__ _ _ __  ___ \r\n"
				+ " | (_ / _` | '  \\/ -_)\r\n"
				+ "  \\__________________|\r\n"
				+ "  / _ \\ V / -_| '_|   \r\n"
				+ "  \\___/\\_/\\___|_|     \r\n"
				+ "");
		
		prompt(input);
		
		System.out.println("\n--------------------------");
		System.out.println("Your score (on a scale of 1 to 100)=");
		System.out.println( (((wallet + bankAccount) - debt) <= 0) ? (int) (Math.sqrt( (wallet + bankAccount - debt) / 31.5 )) : 0);
		System.out.println("Net worth: " + ((wallet + bankAccount) - debt));
		System.out.println("\nThanks for playing!");
		System.out.println("\n\nRemember: Watch your back.");
		System.out.println("\nHave a nice day!");
		
		input.close();
		
	}
}
