import java.util.LinkedList;

public class ZigZagConversion {
    public static void main(String[] args) {

        System.out.println(convert("PAYPALISHIRING", 3));
    }


    public static String convert(String s, int numRows) {
        String ans="";
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; ++i) {
            sb[i] = new StringBuilder();
        }

        if(numRows==1)
            return s;

        int k=0;
        while(k<s.length()){
            for(int j=0;j<numRows && k<s.length();++j,++k){
                sb[j].append(s.charAt(k));
            }
            for(int j=numRows-2;j>0 && k<s.length();--j,++k){
                sb[j].append(s.charAt(k));
            }
        }

        for(int i=0;i<sb.length;i++){
            ans+=sb[i];
        }
        return ans;
    }
}