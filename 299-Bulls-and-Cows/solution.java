/*
public class Solution {
    public String getHint(String secret, String guess) {
        Integer bull = 0;
        Integer cow = 0;
        for (int i = 0; i < secret.length();) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bull++;
                if (secret.length() == 1) {
                    break;
                }
                if (i == 0) {
                    secret = secret.substring(i + 1,secret.length() - 1);
                    guess = guess.substring(i + 1,guess.length() - 1);
                } else if (i == secret.length() - 1) {
                    secret = secret.substring(0,i - 1);
                    guess = guess.substring(0,i - 1);
                } else {
                secret = secret.substring(0,i - 1) + secret.substring(i + 1,secret.length() - 1);
                guess = guess.substring(0,i - 1) + guess.substring(i + 1,guess.length() - 1);
                }
            } else {
                i++;
            }
        }
        Map<Character,Integer> ht = new HashMap<Character,Integer>();
        for (char c : secret.toCharArray()) {
            if (!ht.containsKey(c)) {
                ht.put(c,1);
            } else {
                int i = ht.get(c);
                ht.replace(c,i,i+1);
            }
        }
        for (char c : guess.toCharArray()) {
            if (ht.containsKey(c)) {
                int i = ht.get(c);
                if (i >= 2) {
                ht.replace(c,i,i-1);
                } else {
                    ht.remove(c);
                }
                cow++;
            }
        }
        return bull.toString() + "A" + cow.toString() + "B";
    }
}

*/


// Others Solution, which is good
public class Solution {
public String getHint(String secret, String guess) {
    int bulls = 0;
    int cows = 0;
    int[] numbers = new int[10];
    for (int i = 0; i<secret.length(); i++) {
        int s = Character.getNumericValue(secret.charAt(i));
        int g = Character.getNumericValue(guess.charAt(i));
        if (s == g) bulls++;
        else {
            if (numbers[s] < 0) cows++;
            if (numbers[g] > 0) cows++;
            numbers[s] ++;
            numbers[g] --;
        }
    }
    return bulls + "A" + cows + "B";
}
}

