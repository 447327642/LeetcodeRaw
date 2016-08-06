/*
//The naive implementation
public class Solution {
    public int addDigits(int num) {
         int temp = 0;
         while(num>=10) {
            temp = num%10;
            num = num/10;
            num += temp;
         }
         return num;
    }
}
*/

//Try o(1) version
public class Solution {
    public int addDigits(int num) {
            return num-(num-1)/9*9;
    }
}
