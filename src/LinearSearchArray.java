import java.util.List;

public class LinearSearchArray {

    public static int linearSearch(int numbers[], int key){

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,8,10,10,8,9};
        int key = 10;
        int IndexOfKeyElements=linearSearch(numbers,key);
        System.out.println(IndexOfKeyElements);

    }
}
