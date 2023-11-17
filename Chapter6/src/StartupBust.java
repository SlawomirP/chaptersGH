import java.util.ArrayList;

public class StartupBust {
    //Declare and initialize the variables we will need
    //object GameHelper class
    //array startups fot storing startup objects
    //numOfGuess - counter
    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<>();
    private int numOfGuess = 0;


    private void setUpGame() {
        //creating startup objects to store location + naming
        //creating new method in startup class + new variable
        //make three Startups objects, give them names and stick them in the arraylist
        Startup one = new Startup();
        Startup two = new Startup();
        Startup three = new Startup();

        //seting name for objects
        one.setName("poniez");
        two.setName("hacqi");
        three.setName("cabista");

        //adding objects to main array
        startups.add(one);
        startups.add(two);
        startups.add(three);

        //notices for user - print brief instr for user
        System.out.println("Your goal is to sink three Startups.");
        System.out.println("poniez, hacqi, cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");

        //Repeat with each Startup in the list
        //forEach loop - going through startups list - each element receives new created array from
        //helper object -> method placeStartup
        for (Startup startup : startups) {
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }


    //start method
    //as long as isEmpty is false program asks user for his guess
    //checkUserGuess <- checks answers
    private void startPlaying() {
        while(!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    // depending on numOfGuess method print properly message

    private void finishGame() {
        System.out.println("All Startups are dead! Your stock is now worthless");

        if(numOfGuess <= 18) {
            System.out.println("It only took you " + numOfGuess + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough. " + numOfGuess + " guesses.");
            System.out.println("Fish are dancing with your options");
        }
    }


    //method checks user guess
    //counter is increasing by 1
    //string result is default -> miss
    //forEach checks startups list
    // result = each elemnt from startups list is checked by checkYourself method
    //output of method -> miss,hit, kill is saved in variable result
    // result is compare with "hit" and "kill" - if kill - startup is removing
    private void checkUserGuess(String userGuess) {
        numOfGuess++;
        String result = "miss";

        for (Startup startupToTest : startups) {
            result = startupToTest.checkYourself(userGuess);

            if (result.equals("hit")) {
                break;
            }

            if (result.equals("kill")) {
                startups.remove(startupToTest);
                break;
            }
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();
    }



}

