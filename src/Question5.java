public class Question5 {
    public static void main(String[] args){
        int[] intArray = new int[]{2,3,5,4,4,7,8,10,6,9 };
        findNum(intArray, 7);
    }
    static int findNum(int[] array, int x){
        if(array.length == 0){
           return -1;
        }
        int low = 0;
        int high = array.length-1;
        int mid = (low + high) / 2;
        while(low <= high){
            if(array[mid] < x){
                low = mid + 1;
            }else if(array[mid] > x){
                high = mid - 1;
            }else if(x == array[mid]){
                return mid;
            }
        }
        return -1;
    }

}
