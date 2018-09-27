package myInterpritation._7cycles;

public class CyclecExample {

    public static void main(String[] args) {
        int i = 1;
        while (i < 5) {
            System.out.println(i + " ");
            i++;
        }
        System.out.println("***********************************");

        int j = 2;
        do {
            j++;
            System.out.println("first J is: " + j); //will exiceute at least once
        } while (j < 1); {

        }
    }

}
