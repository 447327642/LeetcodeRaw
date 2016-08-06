public class Solution {
    public String convertToTitle(int n) {
        ArrayList<Character> s= new ArrayList<Character>();
        for (int i = 0; n > 0; i++) {
            s.add((char)('A' + ((n - 1) % 26))); // prevent n = 26 bug
            n = (n - 1) / 26; // prevent n = 26 bug
        }
        int l = s.size();
        char[] c = new char[l];
        for (int j = l - 1; j >= 0; j--) {
            c[l-j-1] = s.get(j); 
            
        }
        String t = new String(c); 
        return t;
    }
}



