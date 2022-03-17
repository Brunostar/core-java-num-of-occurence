public class NumOfOccurrence {

    public static void main(String args[]) {
        int givenArray[] = {1, 3, 2, 3, 4, 2, 5, 3, 7, 2, 8, 3};
        int example = solution(2, givenArray);
        System.out.println(example);
    }

    static int solution(int num, int array[]) {
        int count = 0;
        for (int digit:array) {
            if(digit == num) count++;
        }
        return count;
    }

}
