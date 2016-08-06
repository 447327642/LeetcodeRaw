public class Solution {
    public String addBinary(String a, String b) {
    char[] aa = a.toCharArray();
    char[] bb = b.toCharArray();
    char[] c = new char[aa.length >= bb.length ? aa.length + 1 : bb.length + 1];
    for (int i = c.length - 1; i >= 0; i--) {
        c[i] = '0';
    }
    for (int i = aa.length - 1; i >= 0; i--) {
        c[c.length + i - aa.length] += (aa[i] - '0');
    }
    for (int i = bb.length - 1; i >= 0; i--) {
        c[c.length + i - bb.length] += (bb[i] - '0');
    }
    for (int i = c.length - 1; i >= 0; i--) {
        while (c[i] > '1') {
            c[i] -= 2;
            c[i-1] += 1;
        }
    }
    String s = new String(c);
    if (c[0] == '0') {
        char [] d = new char[c.length - 1];
        System.arraycopy(c,1,d,0,c.length - 1);
        s = new String(d);
    }
    return s;
    }
}