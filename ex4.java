public class ex4
{
public static void main(String[] args){
    int num=0;
    for(int i=1;i<1000;i++){
        for(int j=1;j<i;j++){
            
            for(int k=1;k<1000;k++){
                if(i+j+k==1000 && ((int)Math.pow(i,2)+(int)Math.pow(j,2))==(int)Math.pow(k,2))
                    System.out.println(i*j*k);
}
}
}
}
}