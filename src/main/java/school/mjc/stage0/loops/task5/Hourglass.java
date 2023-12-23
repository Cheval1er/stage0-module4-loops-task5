package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < height; y++) {
                if (y <= x && x >= height - y - 1) {
                    System.out.print(8);
                } else if (y >= x && x <= height - y - 1){
                    System.out.print( 8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}