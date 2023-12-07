import java.util.Scanner;

public class arrayCreation {
    public static void main(String[] args) {
        int sampleArray[] = new int[50];
        Scanner sc =new Scanner(System.in);
        sampleArray[0]=sc.nextInt();
        sampleArray[1]=sc.nextInt();
        System.out.println("Phis = " +sampleArray[0]+'\n'+"chem = "+sampleArray[1]);
        sampleArray[1]=sampleArray[1]+1;
        System.out.println("Updated value of chem is "+sampleArray[1]);


    }
}
