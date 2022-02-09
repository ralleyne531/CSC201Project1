public class Question2Snippet2 {
    public static void main(String[] args){
        long StartTime = System.nanoTime();
        int n = 3;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i*i; j++) {
                sum = sum + i;
            }
        }
        long EndTime = System.nanoTime();
        Long RT = EndTime - StartTime;
        System.out.println(RT);
    }
}
