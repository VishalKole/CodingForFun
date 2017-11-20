import java.util.*;

public class LongestSubstring {

    public static void main(String[] args){

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }


    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> hash = new HashMap<>();
        int max = 1;
        int curr=1;
        hash.put(s.charAt(0),0);

        for(int i=1; i<s.length();i++){
            if(hash.containsKey(s.charAt(i))){
                curr = curr - hash.get(s.charAt(i));
            }
            else{
                ++curr;
            }
            hash.put(s.charAt(i), i);
            if(curr>max)
                max=curr;


        }
        return max;
    }
}
