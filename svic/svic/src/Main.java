public class Main {
    public static void main(String[] args) {
        char grade = 'H';

        switch (grade) {
            case 'A':
                System.out.println("harka geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("geçtiniz");
                break;
            case 'D':
                System.out.println("kaldınız");
                break;
            default:
                System.out.println("Geçersiz giriş");
        }
    }
}