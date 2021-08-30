import java.util.Scanner;

public class TestRational {
    public static void main(String args[]){
//        Rational x=new Rational(0,6);
//        Rational y=new Rational(4,10);
////        System.out.print("x=");
////        x.print();
//        System.out.print("1/x=");
//        x.reverse();
////        System.out.print("y=");
////        y.print();
//        System.out.print("1/y=");
//        y.reverse();
//        System.out.print("x*y=");
//        Rational z=x.mul(y);
//        System.out.print("x+y=");
//        Rational c=x.add(y);
//        System.out.print("x-y=");
//        Rational d=x.sub(y);
//        System.out.print("x:y=");
//        Rational f=x.div(y);
//        System.out.print("5/4+1/2*3/2=");
        convert("5/4+1/2*3/2");
//        System.out.print("3/4+(1/2*3/2)=");
//        convertP("3/4+(1/2*3/2)");
    }
    public static Rational convert(String str) {
        String deduction1 = "";
        String deduction2 = "";
        int q = -1, w = 0;
        char opr = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' || str.charAt(i) == ':' || str.charAt(i) == '+' || str.charAt(i) == '-') {
                opr = str.charAt(i);
            }
            if (opr == '*') {
                deduction1 = str.substring(i - 3, i);
                deduction2 = str.substring(i + 1, i + 4);
                String x[] = deduction1.split("/");
                int num1 = Integer.parseInt(deduction1);
                int denom1 = Integer.parseInt(deduction2);
                Rational a = new Rational(num1, denom1);
                String y[] = deduction2.split("/");
                int num2 = Integer.parseInt(y[0]);
                int denom2 = Integer.parseInt(y[1]);
                Rational b = new Rational(num2, denom2);
                Rational mul = a.mul(b);
                String str1 = str.substring(i - 3, i + 4);
                str = str.replace(str1, mul.toString());
                i = -1;
                return mul;
            }
            if (opr == ':') {
                deduction1 = str.substring(i - 3, i);
                deduction2 = str.substring(i + 1, i + 4);
                String x[] = deduction1.split("/");
                int num1 = Integer.parseInt(x[0]);
                int denom1 = Integer.parseInt(x[1]);
                Rational a = new Rational(num1, denom1);
                String y[] = deduction2.split("/");
                int num2 = Integer.parseInt(y[0]);
                int denom2 = Integer.parseInt(y[1]);
                Rational b = new Rational(num2, denom2);
                Rational div = a.div(b);
                String str1 = str.substring(i - 3, i + 4);
                str = str.replace(str1, div.toString());
                i = -1;
                return div;
            }
            if (opr == '+') {
                deduction1 = str.substring(i - 3, i);
                deduction2 = str.substring(i + 1, i + 4);
                String x[] = deduction1.split("/");
                int num1 = Integer.parseInt(x[0]);
                int denom1 = Integer.parseInt(x[1]);
                Rational a = new Rational(num1, denom1);
                String y[] = deduction2.split("/");
                int num2 = Integer.parseInt(y[0]);
                int denom2 = Integer.parseInt(y[1]);
                Rational b = new Rational(num2, denom2);
                Rational add = a.add(b);
                String str1 = str.substring(i - 3, i + 4);
                str = str.replace(str1, add.toString());
                i = -1;
                return add;
            }
            if (opr == '-') {
                deduction1 = str.substring(i - 3, i);
                deduction2 = str.substring(i + 1, i + 4);
                String x[] = deduction1.split("/");
                int num1 = Integer.parseInt(x[0]);
                int denom1 = Integer.parseInt(x[1]);
                Rational a = new Rational(num1, denom1);
                String y[] = deduction2.split("/");
                int num2 = Integer.parseInt(y[0]);
                int denom2 = Integer.parseInt(y[1]);
                Rational b = new Rational(num2, denom2);
                Rational sub = a.sub(b);
                String str1 = str.substring(i - 3, i + 4);
                str = str.replace(str1, sub.toString());
                i = -1;
                return sub;
            }
        }
        return null;
    }
    public static Rational convertP(String str){
        int x = 0,y=0,k=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                x=i;
            }
        }
        for (int j=0;j<str.length();j++){
            if(str.charAt(j)==')'){
                y=j;
            }
        }
        convert(str.substring(x+1,y));
//        String p=String.valueOf(convert(str.substring(x+1,y)));
//        String p1=str.replace(str.substring(x+1,y),p);
//        convert(p1);
        return null;
    }
}
