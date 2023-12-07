import java.util.Arrays;

public class passingArrayAsArgument {
    public static void update(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int[] marks = {
                23,
                24,
                25,
                26
        };
        System.out.println("Old Value = " + Arrays.toString(marks));
        update(marks);
        System.out.println("New Value = " + Arrays.toString(marks));
    }



}