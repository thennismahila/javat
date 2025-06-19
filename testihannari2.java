import java.util.Scanner; // Calling Scanner Libraries To Take Input
import java.util.Random; // Calling Random Library To Get Random Number

public class testihannari2 {
    public static int health = 100; // Variable To Calculate Health or Int Damage
    // You Can Also Define As Public Int GetDamage
    public static int score = 0; // Variable To Calculate Score
    // You Can Also Define As Public Void SetInventory

    public static void main(String[] args) {
        System.out.println("Welcome To The Hki adventure2!"); // Printing The Heading
        System.out.println(); System.out.println(); // Getting Space
        startGame(); // Calling StartGame()
        clear(); // Calling Clear()
    }
    
    public static void confir() // Implementing New Room For Confirmation
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("1. Start The Game");
    System.out.println("2. End The Game");
    System.out.print("Enter Your Choice: ");

    int choice = scanner.nextInt(); // Taking The Choice

    if(choice == 1)
        startGame(); // Calling One Room StartGame() Function
    else
    {
        System.out.println();
        System.out.println("Game Over!");
        System.out.println("You Health Score: "+ health); // Printing Health or Any Damage
        System.out.println("You Collected Score: "+ score); // Printing Earned Score
    }
    pause();
    clear();
}

public static void startGame() {
        Scanner scanner = new Scanner(System.in); // Making Scanner Ready

        System.out.println("Goto near Ratamestarinkatu 13 A a stone: ");
        System.out.println("1. Vähäpukeinen noinen dimbbi wilq");
        System.out.println("2. Walk Through The Enchanted Forest");
        System.out.print("Enter Your Choice: ");

        int choice = scanner.nextInt(); // Taking Input From Users
        System.out.println();

        clear(); // Calling Clear() Function
        if (choice == 1) // If Choice 1 To Explore Cave
        {
            exploreCave(); // It Will Not Be A Private Room Location, Calling ExploreCave()
            // You Can Also Change & Define The Name Of Function As Public Void Setlocation()
        }
        else if (choice == 2) // If Choice 1 To Enter Forest
        {
            enterForest(); // Calling Explore Forest Function
            // You Can Also Change & Define The Name Of Function As Public Room getlocation()
        }
        else
        {
            System.out.println("Invalid Choice. Game Over!");
        }

        clear(); // Calling Clear() Function
        scanner.close();
    }

public static void exploreCave() {
        System.out.println("You Enter The Dark Cave And Discover A Treasure Chest!");
        System.out.println("1. Open The Chest");
        System.out.println("2. Leave The Cave");
        System.out.print("Enter Your Choice: ");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        System.out.println(); System.out.println();

        if (choice == 1) {
            int z = exploreRandom();
            if(z == 0)
            {
                System.out.println("A Dragon Comes Out & It Eats You Alive");
                System.out.println("Sorry! You Died.");
                System.out.println("You Collected Score: "+ score);
                pause();
            }
            else
            {
                System.out.println("You Find Out Tresure!");
                score = score + 20;
                System.out.println("Your Score: "+ score);
                System.out.println("You Are Now Good To Go Ahead");
                pause();
                clear();
                confir();
            }
        }
        else if (choice == 2)
        {
            System.out.println("You Leave The Cave And Continue Your Adventure.");
            confir();
        }
        else
        {
            System.out.println("Invalid Choice. Game Over!");
        }

        scanner.close();
    }

    public static int exploreRandom() {
        Random rand = new Random();
        int ran = rand.nextInt(2);
        return ran;
    }

    public static void enterForest() {
        System.out.println("You Walk Through The Enchanted Forest And Encounter A Dangerous Creature");
        System.out.println("1. Fight With The Creature");
        System.out.println("2. Continue Walking");
        System.out.print("Enter Your Choice: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        clear();
        if (choice == 1)
        {
            int z = exploreRandom();
            if(z == 0)
            {
                System.out.println("The Creature Wins & Ate You Alive");
                System.out.println("Sorry! You Died.");
                System.out.println("You Collected Score: "+ score);
                pause();
            }
            else
            {
                System.out.println("You Win The Battle");
                score = score + 20;
                System.out.println("Your Score: "+ score);
                System.out.println("You Are Now Good To Go Ahead");
                pause();
                clear();
                confir();
            }
        }
        else if (choice == 2)
        {
            System.out.println("You Continue Walking Through The Forest");
            confir();
        }
        else
        {
            System.out.println("Invalid Choice. Game Over!");
        }

        scanner.close();
    }
    public static void pause() {
        Scanner s = new Scanner(System.in);
        s.next();
    }
    public static void clear()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}