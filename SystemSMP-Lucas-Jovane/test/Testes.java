/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import database.DataBase;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Testes {
    public static void main(String Args[]){
     Date d =Calendar.getInstance().getTime();
     SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");

     Scanner in = new Scanner(System.in);
     in.next();
     Date d2 = Calendar.getInstance().getTime();

     System.out.println(formato.format(getDateDiffMillis(d,d2)));
    }
    public static long getDateDiffMillis(Date inicio, Date fim) {
    return (fim.getTime() - inicio.getTime() - 21*60*60*1000);
    }
}
