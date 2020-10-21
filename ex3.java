public class ex3
{
   public static void main(String[] args){
       int tot1=0;
       for(int i=1;i<=100;i++){
           tot1+=Math.pow(i,2);
       }
       int tot2=0;
       for(int i=1;i<=100;i++){
           tot2+=i;
       }
       tot2=(int)Math.pow(tot2,2);
       System.out.println(tot2-tot1);
}
}
