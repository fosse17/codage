/**
 * Created by Stephane on 15/12/14.
 */
public class codage {


    public String codage_affine(String s,int a,int b)
    {
        s=s.toUpperCase();
        String ret="";
        int l=s.length();char[] tab=s.toCharArray();
        for (int i=0;i<l;i++)
        {
            int asc=(int) tab[i]-65;
            int res=(a*asc+b)%26+65;
            ret+=(Character)(char)res;
        }
        return ret;
    }

    public static void main(String[] args)
    {
        codage c=new codage();
        System.out.print(c.codage_affine("zjdcbmejcbmijefbvib",5,16));
    }
}
