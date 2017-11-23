public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println(reverse(-2147483648));

    }

    public static int reverse(int x) {

        long ans = 0;
        long temp=x;

        if(temp<0)
            temp = temp*-1;

        while(temp!=0){
            ans = (ans*10) + (temp%10);
            temp = temp/10;
        }

        if(ans>=(Integer.MAX_VALUE))
            return 0;
        else if(x<0)
            ans*=-1;

        return (int)ans;
    }
}
