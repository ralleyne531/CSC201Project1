public class Question2 {
    public static void main(String[] args) {
        long StartTime = System.nanoTime();
        int n = 5;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + i;
        }
        long EndTime = System.nanoTime();
        Long RT = EndTime - StartTime;
        System.out.println(RT);


    }
}
