import java.sql.Array;
        import java.util.Scanner;
        import java.util.List;
        import java.util.ArrayList;

public class L1 {
    public static void main(String[] args)
    {
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
    }



    //Zadanie 1.1b
    {
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
    }



    //Zadanie 1.1c
    {
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
    }



    //Zadanie 1.1d
    {
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
    }





    //Zadanie 1.1e
    {
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
    }





    //Zadanie 1.1f
    {
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
    }





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
        System.out.println("Podaj ilosc liczb: ");
        int n = sc.nextInt();
        double wynik = 0;
        double h = 0;
        System.out.println("Podaj ciag " + n + " liczb: ");
        for (int i = 1; i <= n; i++){
            if(i%2 == 0){
                h = sc.nextDouble();
                wynik += h*(-1);
            }
            else {
                h = sc.nextDouble();
                wynik += h;
            }
        }
        double wynikk = wynik + Math.pow((-1), (n+1))*h - h;
        System.out.println("Wynik wynosi: " + wynikk);
    }





    //Zadanie 1.1i
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int n = sc.nextInt();
        double suma = 0;
        int silnia = 1;
        System.out.println("Podaj " + n + " liczb/y: ");
        for(int i = 1; i < n+1; i++) {
            double x = sc.nextInt();
            silnia *= i;
            x = (Math.pow(-1, i) * x) / silnia;
            suma += x;
        }
        System.out.println("Suma = " + suma);
    }




    //Zadanie 1.2
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int n = sc.nextInt();
        List<Double> ciag = new ArrayList<Double>();
        System.out.println("Podaj " + n + " liczb/y: ");
        for(int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            ciag.add(x);
        }
        ciag.add(ciag.get(0));
        ciag.remove(0);
        System.out.println(ciag);
    }



    //Zadanie 2.2
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj ilosc liczb: ");
        int n = sc.nextInt();
        double wynik = 0;
        double x = 0;
        System.out.println("Podaj ciag liczb: ");
        for(int i = 0; i < n; i++){
            x = sc.nextDouble();
            if(x>0){
                wynik += x;
            }
        }
        System.out.println("Podwojona suma liczb dodatnich wynosi: " + 2*wynik);
    }




    //Zadanie 2.3
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int n = sc.nextInt();
        int dodatnie = 0, ujemne = 0, zera = 0;
        double tab[] = new double[n];
        System.out.println("Podaj " + n + " liczb: ");
        for(int i = 0; i < n; i++){
            tab[i] = sc.nextDouble();
        }
        for(int i = 0; i < n; i++){
            if(tab[i] > 0)
            {
                dodatnie++;
            }
            else if(tab[i] < 0)
            {
                ujemne++;
            }
            else
            {
                zera++;
            }
        }
        System.out.println("Dodatnie: " + dodatnie + "\nUjemne: " + ujemne + "\nZera: " + zera);
    }





    //Zadanie 2.4
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int n = sc.nextInt();
        double tab[] = new double[n];
        double max = tab[0];
        double min = tab[0];
        System.out.println("Podaj " + n + " liczb: ");
        for(int i = 0; i < n; i++)
        {
            tab[i] = sc.nextDouble();
        }
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] > max)
            {
                max = tab[i];
            }
            if(tab[i] < min)
            {
                min = tab[i];
            }
        }
        System.out.println("Najwieksza liczba: " +max);
        System.out.println("Najmniejsza liczba: " +min);
    }

}

