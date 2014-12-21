/**
 * Created by jessieleung on 21/12/14.
 */

public class intro_exercises {

    /*
     * Print one asterisk
     */
    public static void easiestExerciseEver(){
        drawHorizontalLine(1);
    }

    /*
     * Print horizontal line of n asterisks
     */
    public static void drawHorizontalLine(int n){
        String s = "";
        for(int i=0;i<n;i++){
            s+="*";
        }
        System.out.println(s);
    }

    /*
     * Print vertical line of n asterisks, 1 on each line
     */
    public static void drawVerticalLine(int n){
        for(int i=0;i<n;i++){
            System.out.println("*");
        }
    }

    public static void main(String args[]){
        easiestExerciseEver();
        drawHorizontalLine(5);
        drawVerticalLine(3);
    }
}
