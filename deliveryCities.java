import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
class DeliveryCities {
    public static void main(String[] args) throws IOException {
        ArrayList cities = new ArrayList();
        cities.add("Kiev");
        cities.add("Kharkov");
        cities.add("Lvov");
        cities.add("Dnepr");
        cities.add("Odessa");
        System.out.println("Enter a combination. For example: 24, 41, 54");
        System.out.println("1. Kiev");
        System.out.println("2. Kharkov");
        System.out.println("3. Lvov");
        System.out.println("4. Dnepr");
        System.out.println("5. Odessa");
        String operation = new String();
        operation();
    }
    public static int operation() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(r.readLine());
        if (i==12 || i==21) {
            System.out.println("Kiev - Kharkov "+kievKharkov()+" km");
        } else if (i==13 || i==31) {
            System.out.println("Kiev - Lvov "+kievLvov()+ " km");
        } else if (i==14 || i==41){
            System.out.println("Kiev - Dnepr "+kievDnepr()+" km");
        } else if (i==15 || i==51){
            System.out.println("Kiev - Odessa "+kievOdessa()+" km");
        } else if (i==23 || i==32){
            System.out.println("Kharkov - Lvov "+kharkovLvov()+" km");
        } else if (i==24 || i==42){
            System.out.println("Kharkov - Dnepr "+kharkovDnepr()+" km");
        } else if (i==25 || i==52){
            System.out.println("Kharkov - Odessa "+kharkovOdessa()+" km");
        } else if (i==34 || i==43){
            System.out.println("Lvov - Dnepr "+lvovDnepr()+" km");
        } else if (i==35 || i==53){
            System.out.println("Lvov - Odessa "+lvovOdessa()+" km");
        } else if (i==45 || i==54){
            System.out.println("Dnepr - Odessa "+dneprOdessa()+" km");
        } else
            System.out.println("Enter the correct combination");
            return operation();
    }
    public static int kievKharkov(){
        int k = 483;
        return k;
    }
    public static int kievLvov(){
        int l = 541;
        return l;
    }
    public static int kievDnepr(){
        int d = 478;
        return d;
    }
    public static int kievOdessa(){
        int ko = 476;
        return ko;
    }
    public static int kharkovLvov(){
        int kl = 1018;
        return kl;
    }
    public static int kharkovDnepr(){
        int kd = 217;
        return kd;
    }
    public static int kharkovOdessa(){
        int ko = 674;
        return ko;
    }
    public static int lvovDnepr(){
        int ld = 1013;
        return ld;
    }
    public static int lvovOdessa(){
        int lo = 787;
        return lo;
    }
    public static int dneprOdessa(){
        int dno = 454;
        return dno;
    }
}