/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */
//搞了半天是题意理解反了，my number这里指的不是做题人猜的number而是oracle内部指定的number
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int beg = 1;
        int end = n;
        int oracle = 0;
        while (beg < end) {
            oracle = guess(beg + (end - beg) / 2 );
            if (oracle == 0) {
                return beg + (end - beg) / 2;
            }
            if (oracle == -1) {
                end = beg + (end - beg) / 2 - 1;
            }
            if (oracle == 1) {
                beg = beg + (end - beg) / 2 + 1;
            }
        }
        return beg;
    }
}