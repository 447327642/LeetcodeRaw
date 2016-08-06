public class Solution {
    public String reverseString(String s) {
        char[] c = s.toCharArray();
        char[] d = new char[c.length];
        for (int i = 0; i < c.length; i++) {
            d[c.length - i - 1] = c[i]; 
        }
        String t = new String(d);
        return t;
    }
}



/*
public class Solution {
    public String reverseString(String s) {
        StringBuffer buffer = new StringBuffer(s);
        s = buffer.reverse().toString();
        return s;
    }
}

*/