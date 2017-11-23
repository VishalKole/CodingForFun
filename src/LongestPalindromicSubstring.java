public class LongestPalindromicSubstring {
    public static void main(String[] args) {

        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
        String ans=s.substring(0,1);

        for(int i=0;i<s.length();i++){
            int j=1;
            while( ((i-j)>=0 && (i+j)<s.length()) &&(s.charAt(i-j)==s.charAt(i+j))) {
                if(((i+j)-(i-j))>=ans.length())
                    ans = s.substring(i - j, i + j+1);
                ++j;
            }
                j=0;
                while( i+1<s.length() && ((i-j)>=0 && (i+j+1)<s.length()) &&(s.charAt(i-j)==s.charAt(i+j+1))) {
                    if(((i+j+1)-(i-j))>=ans.length())
                        ans = s.substring(i - j, i + j+2);
                    ++j;
                }
            }

        return ans;
    }

}
