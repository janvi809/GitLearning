package methods;

public class Intro {
    public static void main(String[] args){
        int firstNumber=34;
        int secondNumber=22;
        int result= maxOf(firstNumber,secondNumber);
        System.out.println(result);
    }
    static int maxOf(int a,int b){
        return Math.max(a, b);
    }

}
