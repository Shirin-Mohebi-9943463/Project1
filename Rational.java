
public class Rational {
    private int numerator;
    private int denominator;

    public int getNumerator() {
    return numerator;
    }

    public int getDenominator() {
    return denominator;
    }

    public Rational() {
        this(0,1);
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        int bmm,max;
        if(numerator>denominator){
            max=numerator;
        }
        else {
            max=denominator;
        }
        for(int i=1;i<=max;i++){
            if(denominator%i==0 && numerator%i==0){
                bmm=i;
                this.numerator=(numerator/bmm);
                this.denominator=(denominator/bmm);

            }
        }
    }
    public void print (){
        System.out.println(this.numerator+"/"+this.denominator);
    }
    public Rational add (Rational num){
        int numerator = this.numerator*num.getDenominator()+this.denominator*num.getNumerator();
        int denominator = num.getDenominator()*this.denominator;
        Rational k = new Rational(numerator,denominator);
        k.print();
        return k;
    }
    public Rational sub (Rational num){
        int numerator = this.numerator*num.getDenominator()-this.denominator*num.getNumerator();
        int denominator = num.getDenominator()*this.denominator;
        Rational k = new Rational(numerator,denominator);
        k.print();
        return k;
    }
    public Rational mul (Rational num){
        int numerator = this.numerator*num.getNumerator();
        int denominator = this.denominator*num.getDenominator();
        Rational k = new Rational(numerator,denominator);
        k.print();
        return k;
    }
    public Rational div (Rational num){
        int numerator = this.numerator*num.getDenominator();
        int denominator = this.denominator*num.getNumerator();
        Rational k = new Rational(numerator,denominator);
        k.print();
        return k;
    }
    public Rational reverse () {
        int temp = 0;
        while (true) {
            if (this.numerator != 0) {
                temp = this.denominator;
                this.denominator = this.numerator;
                this.numerator = temp;
                Rational k = new Rational(this.numerator, this.denominator);
                k.print();
                return k;
            } else {
                System.out.println("it is not possible");
                break;
            }
        }
        return null;
    }
}