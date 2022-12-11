public class Main {
    public static void main(String[] args) {
        double[] sayilar = {1.2,2.3,3.4,4.5,6.7};
        double toplam= 0;
        double enBuyuk = 0;

        for(double kontrol:sayilar){
            toplam = toplam + kontrol;
            if(enBuyuk<kontrol){
                enBuyuk = kontrol;
            }
            System.out.println(kontrol);
        }
        System.out.println("toplam  " + toplam);
        System.out.println("En buyuk sayı  "+ enBuyuk);

    }
}