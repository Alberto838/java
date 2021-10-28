import java.util.Scanner;
import java.util.Random;

public class L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = sc.nextInt();
        int tab[] = new int[n];
        generuj(tab,n,999,999);
        ileNieparzystych(tab);
        ileParzystych(tab);
        ileDodatnich(tab);
        ileUjemnych(tab);
        ileZerowych(tab);
        ileMaksymalnych(tab);
        sumaDodatnich(tab);
        sumaUjemnych(tab);
        dlugoscMCD(tab);

    }

    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc){
        Random r = new Random();
        for (int j = 0; j < n; ++j) {
            tab[j] = r.nextInt(maxWartosc+1000)-minWartosc;

        }
        System.out.println(tab.length);
    }
    public static int ileNieparzystych(int tab[]){
        int nieparzyste=0;
        for(int i=0; i < tab.length; i++){
            if(tab[i]%2!=0){
                nieparzyste++;
            }
        }
        System.out.println("Liczb nieparzystych jest: "+nieparzyste);
        return nieparzyste;
    }
    public static int ileParzystych(int tab[]){
        int parzyste=0;
        for(int i=0; i<tab.length; i++){
            if(tab[i]%2==0){
                parzyste++;
            }
        }
        System.out.println("Liczb parzystych jest: "+parzyste);
        return parzyste;
    }
    public static int ileDodatnich(int tab[]){
        int dodatnie=0;
        for(int i=0; i<tab.length; i++){
            if(tab[i]>0){
                dodatnie++;
            }
        }
        System.out.println("Liczb dodatnich jest: "+dodatnie);
        return dodatnie;
    }
    public static int ileUjemnych(int tab[]){
        int ujemne = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i]<0){
                ujemne++;
            }
        }
        System.out.println("Liczb ujemnych jest: "+ujemne);
        return ujemne;
    }
    public static int ileZerowych(int tab[]){
        int zerowe = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i]==0){
                zerowe++;
            }
        }
        System.out.println("Liczb zerowych jest: "+zerowe);
        return zerowe;
    }
    public static int ileMaksymalnych(int tab[]) {
        int maksymalne = 0;
        int max = tab[0];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == max) {
                maksymalne++;
            }
            if(tab[i]>max){
                max = tab[i];
            }
        }
        System.out.println("Liczb maksymalnych jest: " + maksymalne);
        return maksymalne;
    }
    public static int sumaDodatnich(int tab[]){
        int sumad = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i]>0){
                sumad+=tab[i];
            }
        }
        System.out.println("Suma liczb dodatnich: "+sumad);
        return sumad;
    }
    public static int sumaUjemnych(int tab[]){
        int sumau = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i]<0){
                sumau+=tab[i];
            }
        }
        System.out.println("Suma liczb ujemnych: "+sumau);
        return sumau;
    }
    public static int dlugoscMCD(int tab[]){ //dlugoscMaksymalnegoCiaguDodatnich
        int dlugosc = 0;
        int temp = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i]>0){
                dlugosc++;
            } else {
                if(temp<dlugosc){
                    temp = dlugosc;
                    dlugosc = 0;
                }
            }
        }
        System.out.println("Dlugosc maksymalnego ciagu dodatnich: "+temp);
        return temp;
    }
}