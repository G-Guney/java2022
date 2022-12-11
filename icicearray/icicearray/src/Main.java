public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];

        sehirler[0][0]= "İstanbul";
        sehirler[0][1]= "Bursa";
        sehirler[0][2]= "Çanakkale";
        sehirler[1][0]= "Samsun";
        sehirler[1][1]= "Sinop";
        sehirler[1][2]= "Ordu";
        sehirler[2][0]= "Ankara";
        sehirler[2][1]= "Eskişehir";
        sehirler[2][2]= "Çorum";

        for(int i=0;i<=2;i++){
            System.out.println("---------------");
            for(int j = 0 ;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }

        }
    }
}