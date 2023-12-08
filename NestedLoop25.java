import java.util.Scanner;

public class NestedLoop25 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double temps [][] = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + (i+1));
            for (double temp : temps[i]) {
                System.out.println(temp + " ");
            }
            System.out.println();
         
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.println("City: " + (i+1));
            double totaltemp=0;
            for (int j = 0; j < temps[0].length; j++) {
               totaltemp += temps[i][j];
            }
           
            double rata = totaltemp / temps[0].length;
            System.out.println("Rata-rata temperatur kota : "+rata);

        }
    }
}
