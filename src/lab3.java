import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String str = sc.nextLine();
        System.out.println("Podaj drugi wyraz: ");
        String subStr = sc.nextLine();
        System.out.println("Podaj znak: ");
        char c = sc.next().charAt(0);

        System.out.println("Ilosc znaku "+c+" w slowie "+str+ " wynosi: "+countChar(str, c));

        System.out.println("Slowo "+subStr+ " wystepuje "+countSubStr(str, subStr)+" razy");

    }

    public static int countChar(String str, char c){
        int iloscc = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c){
                iloscc++;
            }
        }
        return iloscc;
    }

    public static int countSubStr(String str, String subStr){
        int counter = 0;
        int pos=0;
        while(str.indexOf(subStr, pos) != -1){
            counter++;
            pos += str.indexOf(subStr, pos) + subStr.length();
        }
        return counter;
    }
}
