import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            for (int i = 0; i < 10; i++) {
                for (int j = i; j < 10 ; j  ++){
                    System.out.print(" ");
                }
                System.out.println("// ");
                TimeUnit.MILLISECONDS.sleep(200);

            }
            for(int k = 0 ; k < 10; k++){
                System.out.print(" ");
                for(int l = 0 ; l < k ; l ++){
                    System.out.print(" ");
                }
                System.out.println("\\"+"\\");
                TimeUnit.MILLISECONDS.sleep(200);
            }
        }
    }
}