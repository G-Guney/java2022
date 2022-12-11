public class Main {
    public static void main(String[] args) {
        char harf= 'A';

        char[] sesli = new char[9];
        sesli[1]='a';
        sesli[2]='e';
        sesli[3]='i';
        sesli[4]='ı';
        sesli[5]='o';
        sesli[6]='ö';
        sesli[7]='u';
        sesli[0]='ü';
        for(int i=0;i<9;i++ ) {
            System.out.println(sesli[i]);
        }
    }
}