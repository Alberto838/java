import java.util.Scanner;

public class L1 {
    public static void main(String[] args)
    /*{
        //Zadanie 1.1a
        int n, sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ile liczb ma byc sumowanych: ");
            n=sc.nextInt();
            int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Podaj "+(i+1)+" liczbe:");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        System.out.println("Suma "+n+" liczb wynosi: "+sum);
    }*/


    //Zadanie 1.1b
    /*{
        int n, iloczyn = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ile liczb ma byc mnozonych: ");
        n = sc.nextInt();
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe:");
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            iloczyn = iloczyn*b[i];
        }
        System.out.println("Iloczyn " + n + " liczb wynosi: " + iloczyn);
    }*/


    //Zadanie 1.1c
    /*{
        int n, abssum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        n = sc.nextInt();
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe:");
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            abssum+=Math.abs(c[i]);
        }
        System.out.println("Wynik wynosi: " + abssum);
    }*/


    //Zadanie 1.1d
    /*{
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int n = sc.nextInt();
        double wynik = 0;
        double d = 0;
        for (int i = 1; i <= n; i++) {
            d = sc.nextInt();
            d = Math.sqrt(Math.abs(d));
            wynik = wynik + d;
        }
        System.out.println("Wynik wynosi: " + wynik);
    }*/




    //Zadanie 1.1e
    /*{
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int n = sc.nextInt();
        double wynik=1;
        double e;
        for (int i = 1; i <= n; i++) {
            e = sc.nextInt();
            e = Math.abs(e);
            wynik*=e;
        }
        System.out.println("Wynik wynosi: " + wynik);
    }*/




    //Zadanie 1.1f
    /*{
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int n = sc.nextInt();
        double wynik=1;
        double f;
        for (int i = 1; i <= n; i++) {
            f = sc.nextInt();
            f = f*f;
            wynik*=f;
        }
        System.out.println("Wynik wynosi: " + wynik);
    }*/




    //Zadanie 1.1g
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int n = sc.nextInt();
        double wynikd = 0;
        double wynikm = 1;
        double g;
        for (int i = 1; i <= n; i++){
            g = sc.nextInt();
            wynikd += g;
            wynikm *= g;
        }
        System.out.println("Wynik dodawania: " +wynikd+ "\n" +
                "Wynik mnozenia: " + wynikm);
    }




    //Zadanie 1.1h
    {
        Scanner sc = new Scanner(System.in);

    }
}