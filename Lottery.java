import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {

        int[] trueTicket = new int[7];
        for(int i = 0; i < trueTicket.length; i++) {
            trueTicket[i] = (int)(Math.random() * 10);
        }
        Arrays.sort(trueTicket);

        int[] guessedTicket = new int[7];
        for(int i = 0; i < guessedTicket.length; i++) {
            guessedTicket[i] = (int)(Math.random() * 10);
        }
        Arrays.sort(guessedTicket);

        int count = 0;
        for (int i=0; i < guessedTicket.length; i++){
            if (trueTicket[i] == guessedTicket[i]) {
                count++;
            }
        }

        System.out.println(Arrays.toString(trueTicket));
        System.out.println(Arrays.toString(guessedTicket));
        System.out.println("Количество совпадений: " + count);
    }
}
