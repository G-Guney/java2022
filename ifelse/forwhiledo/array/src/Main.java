public class Main {
    public static void main(String[] args) {
        String[] ogrenci = new String[3];
        ogrenci[0]="ahmet";
        ogrenci[1]="mehmet";
        ogrenci[2]="ayse";

        for(int i=0;i<ogrenci.length;i++){
            System.out.println(ogrenci[i]);
        }
        System.out.println("---------------------------");

        for(String ogrenciler:ogrenci){
            System.out.println(ogrenciler);
        }

    }
}