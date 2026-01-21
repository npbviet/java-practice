package Day21_1.Parameters;

public class BoxOfStars1 {
    public static void main(String[] args){
        boxOfStars(8, 5);
    }
    public static void boxOfStars(int width, int height){
        for(int i = 0; i < height; i++){
            if (i == 0 || i == (height - 1)){
                for(int j = 0; j < width; j++){
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for(int a = 1; a < (width - 1); a++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
