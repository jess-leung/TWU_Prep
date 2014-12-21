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

    /*
     * Draw right triangle
     */
    public static void drawRightTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     * Draw centred triangle
     */
    public static void drawCentredTriangle(int n){
        int maxStars = 1 + (n-1)*2;
        for(int i=1;i<=n;i++){
            int noStars = 1 + (i-1)*2;
            int noSpacesEachSide = (maxStars-noStars)/2;
            for(int j=1;j<=noSpacesEachSide+noStars;j++) {
                if (j <= noSpacesEachSide) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        easiestExerciseEver();
        drawHorizontalLine(5);
        drawVerticalLine(3);
        drawRightTriangle(4);
        drawCentredTriangle(5);
    }
}
