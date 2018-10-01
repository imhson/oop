import java.util.Comparator;
import java.util.HashSet;
public class Fraction {         //khoi tao va thao tac tren phan so
     int numerator;             //tu so
     int denominator;           //mau so

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction(int numerator, int denominator) {       //khoi tao co tham so
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction addFraction (Fraction f1, Fraction f2){ //cong hai phan so
        lab03 findGCD = new lab03();
        int LCMOfTwoDenominator;
        LCMOfTwoDenominator=(f1.denominator*f2.denominator)/(findGCD.findGCD(f1.denominator, f2.denominator));      //tim boi chung nho nhat cua hai mau so
        int numeratorResult,denominatorResult;
        numeratorResult=(f1.numerator)*(LCMOfTwoDenominator/f1.denominator)+(f2.numerator)*(LCMOfTwoDenominator/f2.denominator);        //tu so cua ket qua
        denominatorResult=LCMOfTwoDenominator;                                                                                          //mau so cua ket qua
        int GCD=findGCD.findGCD(numeratorResult,denominatorResult);             //toi gian ket qua
        numeratorResult=numeratorResult/GCD;
        denominatorResult=denominatorResult/GCD;
        Fraction result= new Fraction(numeratorResult, denominatorResult);          //tra ve ket qua toi gian
        return result;
    }
    public Fraction subtractFraction (Fraction f1, Fraction f2){ //tru hai phan so
        lab03 findGCD = new lab03();
        int LCMOfTwoDenominator;
        LCMOfTwoDenominator=(f1.denominator*f2.denominator)/(findGCD.findGCD(f1.denominator, f2.denominator));      //tim boi chung nho nhat cua hai mau so
        int numeratorResult,denominatorResult;
        numeratorResult=(f1.numerator)*(LCMOfTwoDenominator/f1.denominator)-(f2.numerator)*(LCMOfTwoDenominator/f2.denominator);        //tu so cua ket qua
        denominatorResult=LCMOfTwoDenominator;                                                                                          //mau so cua ket qua
        int GCD=findGCD.findGCD(numeratorResult,denominatorResult);             //toi gian ket qua
        numeratorResult=numeratorResult/GCD;
        denominatorResult=denominatorResult/GCD;
        Fraction result= new Fraction(numeratorResult, denominatorResult);          //tra ve ket qua toi gian
        return result;
    }
    public Fraction multiplyFraction (Fraction f1, Fraction f2){  //Nhan hai phan so
        lab03 findGCD = new lab03();
        int numeratorResult,denominatorResult;
        numeratorResult=(f1.numerator)*(f2.numerator);
        denominatorResult=f1.denominator*f2.denominator;                                                                                          //mau so cua ket qua
        int GCD=findGCD.findGCD(numeratorResult,denominatorResult);             //toi gian ket qua
        numeratorResult=numeratorResult/GCD;
        denominatorResult=denominatorResult/GCD;
        Fraction result= new Fraction(numeratorResult, denominatorResult);          //tra ve ket qua toi gian
        return result;
    }
    public Fraction divideFraction (Fraction f1, Fraction f2){          //Chia hai phan so
        int temp=f2.numerator;                                          //nghich dao phan so
        f2.numerator=f2.denominator;                                    
        f2.denominator=temp;
        Fraction result= new Fraction(0,0);
        return result.multiplyFraction(f1, f2);                         //tra ve la phep nhan phan so 1 voi nghich dao phan so 2
    }
    public boolean equals(Object obj){                                  //so sanh hai phan so
        Fraction temp = new Fraction(0,0);
        temp=temp.divideFraction((Fraction)obj, this);
        if(obj instanceof Fraction){
            if(temp.numerator==temp.denominator){
                    return true;
                }
            }
                return false;
    }

}
