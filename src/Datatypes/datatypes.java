package Datatypes;
//primitive - (pre defined) byte 1, short 2, int 4, long 8, float 4, double 8, char 2, boolean 1
//non primitive - user defined
public class datatypes {
    public static void main(String[] args) {
    int n=5;
    int row=0;
    int star=0;
    while(row<n)
    { int j=0;
        int val=1;
        while(j<=star)
    { System.out.print(val+"");
        val=(val*(row-j))/(j+1);
        j++;}
        row++;
        star++;
        System.out.println();
    }

    }

}
