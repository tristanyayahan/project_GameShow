package gameModels;

import java.util.Scanner;

public class Game {
    public boolean box_checker(int size_box1, int size_box2, boolean playing, int points){
        //if wala na laman both box1 & box2, call game_end() function
        if(size_box1 == 0 && size_box2 == 0){
            playing = game_end(playing, points);
        }
        //if meron pa, call deal_or_nodeal() function
        else{
            playing = deal_or_nodeal(playing, points);
        }
        return playing;
    }

    public boolean game_end(boolean playing, int points){
        clearScreen();
        if(points > 0){
            System.out.print("\n\n\n\t\t================================================================");
            System.out.print("\n\n\n\t\t\t\t\tCONGRATULATIONS!!!\n\t\t\t\t      You've won " + points + " points.\n\n\n");
            System.out.print("\t\t================================================================\n\n\n\t\t");
        }
        else{
            System.out.print("\n\n\n\t\t================================================================");
            System.out.print("\n\n\n\t\t\t\t    You only scored " + points + " points.\n");
            System.out.print("\t\t\t\t       Better luck next time.\n\n\n");
            System.out.print("\t\t================================================================\n\n\n\t\t");
        }
        playing = false;
        PAUSE();
        return playing;
    }

    public boolean deal_or_nodeal(boolean playing, int points){
        while(true){
            clearScreen();
            System.out.print("\n\n\t\t\t\t    Go home with " + points + " points?\n\n");
            System.out.print("\t=================================================================================");
            System.out.print("\n\n\t\t\t\t Deal (1) \t or \t No Deal (2)\n\n");
            System.out.print("\t---------------------------------------------------------------------------------");
                
            String choice;
            System.out.print("\n\n\t\tWhat is your choice? ");
            choice = sc.nextLine();
            
            //if deal, call game_end() function
            if(choice.equals("1")){
                playing = game_end(playing, points);
                break;
            }
            //if no deal, continue...
            else if(choice.equals("2")){
                break;
            }
            else{
                System.out.print("\n\n\t\tError! Invalid Input\n\t\t");
                PAUSE();
            }
        }
        return playing;
    }


    //clear screen
    static void clearScreen(){
        System.out.print("\033[H\033[2J");
    }

    //system PAUSE
    static void PAUSE(){
        System.out.print("\n\t\t\t\t      Press ENTER To Continue...\n\t\t\t\t\t\t   ");
        sc.nextLine();
    }

    static Scanner sc = new Scanner(System.in);
}
