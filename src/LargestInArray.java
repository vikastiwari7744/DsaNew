public class LargestInArray {
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE; //-infinity
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,3,2,6,4,7,10,9};
        System.out.println("Largest Element is "+getLargest(numbers));
    }
}
