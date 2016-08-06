public class Solution {
    public int titleToNumber(String s) {
        int l = s.length();
        char[] c = new char[l];
        char a = 'A';
        int columnNumber = 0;
        for (int i = 0; i < l - 1; i++) {
            c[i] = s.charAt(i);
            columnNumber += (int)(c[i] - a) + 1;
            columnNumber *= 26;
        }
        c[l-1] = s.charAt(l-1);
        columnNumber += (int)(c[l-1] - a) + 1;
        
        return columnNumber;
           }
}