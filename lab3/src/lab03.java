
public class lab03 {            //thao tac voi so nguyen
    public int findGCD (int a, int b){
        a=Math.abs(a);                              //Lay gia tri tuyet doi cua a va b de xu ly
        b=Math.abs(b);
        if (a==0||b==0){                            //Neu mot trong hai so bang 0 thi ket qua la so con lai
            System.out.println(a+b);
        }
        while (a!=b){                               //Tru hai so cho nhau den khi hai so bang nhau
            if (a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    public void printFibonaci (int n){              //in day Fibonaci
        if (n==0)                                   //xet truong hop dac biet
            System.out.println("0");
        if (n==1)
            System.out.println("0 1");
        if (n>1){
            int a=0;
            int b=1;
            System.out.print("0 1 ");
            for (int temp=2;temp<=n;temp++){
                b=b+a;                              //b moi la tong hai so a va b
                System.out.print(b+" ");            //in ra b moi
                a=b-a;                              //a moi la b cu
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        lab03 test= new lab03();
        System.out.println(test.findGCD(-15,10));
        test.printFibonaci(9);
        Fraction f1 = new Fraction(1,5);
        Fraction f2 = new Fraction(1,4);
        Fraction f3 = new Fraction(1,5);
        f2=f1.divideFraction(f1, f2);
        System.out.println(f1.equals(f3));
        System.out.println(f2.numerator+"/"+f2.denominator);
    }
    
}
