public class smallestArray {
    public static int getSmallest(int[] number){
        int smallest = Integer.MAX_VALUE; //+infinity
        for (int j : number) {
            if (smallest > j) {
                smallest = j;
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] numbers={1,3,2,6,4,7,10,9};
        System.out.println("Smallest Element is "+getSmallest(numbers));
    }
}