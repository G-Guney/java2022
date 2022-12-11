public class Main {
    public static void main(String[] args) {

        int a = 220;
        int b = 284;
        int adankalan = 0;
        int bdenkalan = 0;


        for (int i = 1; i < a; i++) {
            if (a % i == 0)
                adankalan = adankalan + i;
        }
        for (int j = 1; j<b; j++){
            if(b % j == 0)
                bdenkalan = bdenkalan + j;
        }
        if(adankalan==b & bdenkalan==a){

            System.out.println("Sayılar Arkadaş");
        }

        else{
            System.out.println("Sayılar Arkadaş Değil");
        }


    }
}