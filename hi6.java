public class hi6 {
    public static void main(String[] args) {
        int ar1[]={10,30,50,70,90};
        int ar2[]={20,40,60,80,100};
        int ar3[]= new int[10];
        int j=0;
        for(int i=0;i<5;i++)
        {
            ar3[j]=ar1[i];
            j++;
            ar3[j]=ar2[i];
            j++;
        }
        for(int k=0;k<10;k++)
        System.out.println(ar3[k]);
    }
}
