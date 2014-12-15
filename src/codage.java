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


    public long pgcd (long a, long b) {
        if (b == 0) {
            return a;
        }

        return pgcd(b, a - b * (a / b));
    }


    public long[] bezout (long a, long b) {
        long[] bez;
        long x, y;

        if (a == 0 && b == 0) {
            return new long[] {0, 0};
        }

        if (b == 0) {
            return new long[] {1, 0};
        }

        if (a == 0 || a % b == 0) {
            return new long[] {0, 1};
        }

        bez = bezout(b, a % b);
        x = bez[0];
        y = bez[1];

        return new long[] {y, x - y * (a / b)};
    }


    public static void main(String[] args)
    {
        codage c=new codage();
        System.out.print(c.codage_affine("zjdcbmejcbmijefbvib",5,16));
    }
}
