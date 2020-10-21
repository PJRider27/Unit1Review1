
public class ex2
{
    public static void main(String[] args){
        int pre=1;
        int now=2;
        int temp=0;
        int tot=0;
        while(now<=4000000){
            if(now%2==0){
                tot+=now;
            }
            temp=pre+now;
            pre=now;
            now=temp;
        }
        System.out.println(tot);
}
}