import java.util.Arrays;

public class Question3 {
    public static void main(String [] args){
        int[] intArray = new int[]{2,3,5,4,4,7,8,10,6,9 };
        System.out.println(Arrays.toString(intArray));
        sort(intArray);
        System.out.println(Arrays.toString(intArray));



    }
    static void sort(int[] array){
        int max;
        int index = array.length;
        for(int i = 0; i < array.length-1; i++){
            max = array[i];
            for(int j = i; j < array.length; j++){
                if(max < array[j]){
                    max = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = max;
        }
    }
}
