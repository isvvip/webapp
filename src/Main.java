import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        System.out.println("Hello World!");
       // if (args.length > 0) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String str = br.readLine();
                //char str = (String)System.in.readLine();
                double id1 = Double.parseDouble(str);
                //double id2 = Double.parseDouble(args[1]);
                //double id1 = 10.5;
                double id2 = 2.5;
                double sum = id1 + id2;
                double div = id1 / id2;
                double koren = Math.sqrt(id1);
                double step = Math.pow(id1,id2);
                System.out.println("Sum=" + sum);
                System.out.println("Div=" + div);
                System.out.println("koren=" + koren);
                System.out.println("step=" + step);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка преобрабования " + e.toString());
            }
        //}
    }
}
