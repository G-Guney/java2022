public class Main {
    public static void main(String[] args) {
        char harf= 'e';

        char[] sesli = new char[8];
        sesli[1]='a';
        sesli[2]='e';
        sesli[3]='i';
        sesli[4]='ı';
        sesli[5]='o';
        sesli[6]='ö';
        sesli[7]='u';
        sesli[0]='ü';
        for(int i=0;i<8;i++ ) {
            System.out.println(sesli[i]);
        }

        char[] sessiz = {'q','w','r','t','y','p','ğ','s','d','f','g','h','j','k','l','ş','z','x','v','b','n','m','ç'};
        for(char hepsi:sessiz) {
            System.out.println(hepsi);
        }
        for(char a=0;a<sesli.length;a++){
            if(char a = harf)
                System.out.println("Harf seslidir");
            else
                System.out.println(("sessiz"));
        }


    }
}