public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Main Compulsory = new Main();
        Compulsory.compulsory();
    }

    void compulsory(){

        String languages[] = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);

        n *= 3;
        n += 0b10101;
        n += 0xFF;
        n *= 6;

        int result = 0;
        while(n > 9){

            while(n != 0){

                result += n % 10;
                n /= 10;

            }
            n = result;
            result = 0;
        }

        result = n;

        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);

    }
}