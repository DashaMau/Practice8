public class Practice8 {
    public static void main(String[] args) {
        Solution.recursion(10);
    }
    public class Solution{
        static int count = 0;
        public static int recursion(int n){
            if (n == 0){
                return 1;
            }
            count++;
            System.out.printf("%d, ", count);
            return recursion(n - 1);
        }
    }
}