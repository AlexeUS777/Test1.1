//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //13.Полезное упражнение: напишите программу, которая считает корни уравнения (ax+b)*(cx+d)=0
        int a = 2;
        int b = 4;
        int c = 4;
        int d = 8;
        int x = (b*d) / (a*c);
        System.out.println("13. " + ("-") + Math.sqrt(x)); //не получилось посчитать корень из отрицательного числа, поэтому поставил минус перед ним

    }
}
