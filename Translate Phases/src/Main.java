import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("PHRASE: Hello everyone");
        System.out.println("Choose language to translate:\n1.Hindi\n2.Tamil\n3.Korean");
        Scanner ob = new Scanner(System.in);
        int c = ob.nextInt();
        switch (c) {
            case 1: {
                System.out.println("सभी को नमस्कार");
                break;
            }
            case 2: {
                System.out.println("அனைவருக்கும் வணக்கம்");
                break;
            }
            case 3: {
                System.out.println("여러분 안녕하세요 ");
                break;
            }
            default: {
                System.out.println("Invalid choice");
                break;
            }
        }
    }
}