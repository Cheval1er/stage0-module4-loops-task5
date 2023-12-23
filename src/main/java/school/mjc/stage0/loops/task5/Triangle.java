package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int x=cathetusLength;x>0;x--){
            for (int y=x;y<=cathetusLength;y++){
                System.out.print(8);
            }
            System.out.println("");
        }
    }
}