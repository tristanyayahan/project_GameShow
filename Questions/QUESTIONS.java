package Questions;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import gameModels.ArrayStruct;

public abstract class QUESTIONS {
    
    public abstract int questions(int key, int points);

    public ArrayList <Integer> boxMenu(ArrayList <Integer> box, int size_box, int points){
        while(true){
            clearScreen();
            System.out.print("\n\n\t=============================================================");
            System.out.print("\n\t\t\t\tGENERAL KNOWLEDGE\n");
            System.out.print("\t-------------------------------------------------------------");
        
            for (int i = 0; i < size_box; i++){
                System.out.print("\n\t\t\t\t      " + box.get(i));
            }
            
            System.out.print("\n\t-------------------------------------------------------------");
            System.out.print("\n\n\tChoose a question");
            System.out.print("\n\t[Enter the point value you want to choose]: ");
            String choice = sc.nextLine();
            
            
            if(choice.equals("100") || choice.equals("200") || choice.equals("300") ||
               choice.equals("400") || choice.equals("500")){
                int key = Integer.parseInt(choice);
                int position = obj.findElement(box, size_box, key);
                if (position == -1) {
                    System.out.print("\n\n\tQuestion not found\n\t");
                    PAUSE();
                }
                else {
                    points = questions(key, points);
                    
                    //deleting chosen box from the list
                    size_box = obj.deleteElement(box, size_box, position);
                    PAUSE();

                    value.add(size_box);
                    value.add(points);

                    return value;
                }
            }
            else{
                System.out.print("\n\n\tQuestion not found\n\t");
                PAUSE();
            }
        }
    }

    public static String Rand(int[] box, int size_box, String[] question, int n){
        for (int i = 0; i < size_box; i++) {
            if(n == box[i]){
                //selecting 3 questions to randomize with same point value
                String[] sorted_question = {"1", "2", "3"};
                int capacity = 3;
                int current_size = 0;
                    
                for (int j = i*3; j < (i*3)+3; j++) {
                    String key = question[j];
                    current_size = obj.insertSorted(sorted_question, current_size, key, capacity);
                }
                    
                //selecting 1 randomized question
                Random r = new Random();
                int rand = r.nextInt(sorted_question.length);
                RANDOM_Q = sorted_question[rand];

                System.out.print(RANDOM_Q);
                System.out.print("\n\n\t=================================================================================");
                
            }
        }
        
        return RANDOM_Q;
    }

    //clear screen
    static void clearScreen(){
        System.out.print("\033[H\033[2J");
    }

    //system PAUSE
    static void PAUSE(){
        System.out.print("\n\t\t\t\t      Press ENTER To Continue...\n\t\t\t\t\t\t  ");
        sc.nextLine();
    }
    
    ArrayList <Integer> value = new ArrayList <Integer> ();
    static Scanner sc = new Scanner(System.in);
    static ArrayStruct obj = new ArrayStruct();
    static String RANDOM_Q;
}
