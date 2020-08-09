import java.util.Scanner;

public class basics{
    public static void sopln(String str){
        System.out.println(str);

    }
    public static  void main(String args[]) {
            
            Scanner sc = new Scanner(System.in);
            basics obj = new basics();
            obj.sopln("Input the number of minutes:");
            int a = sc.nextInt();
            int years = a / (365 * 1440);
            int days = (a / 1440);
            obj.sopln(a + " minutes is approximately " + years + " years and " + days + " days");

    }

}
