package okay;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        boolean exitBool = false;

        while(!exitBool){
            int selection;
            selection = menu();
            if(selection == 1){
                EncAlg q = getRandomAlgo();
                System.out.println(q.getDescription());
                Scanner userInput = new Scanner(System.in);
                System.out.println("Please enter s for sym a for asym:");
                String input = userInput.next();

                if(input.equals(q.getaOrS())){
                    System.out.println("correct");
                    System.out.println();
                    System.out.println();
                }else{
                    System.out.println("not correct");
                    System.out.println();
                    System.out.println();
                }

            }else{
                exitBool = true;
            }

        }


    }

    public static int menu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println();
        System.out.println();
        System.out.println("a or s for encryption algorithms");
        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - see an algorithm");
        System.out.println("2 - quit");

        selection = input.nextInt();
        return selection;
    }

    public static EncAlg getRandomAlgo() {
        List<EncAlg> list = new ArrayList<>();
        EncAlg des = new EncAlg("DES old 64bit", "s");
        list.add(des);
        EncAlg threeDes = new EncAlg("3DES 112bit", "s");
        list.add(threeDes);
        EncAlg idea = new EncAlg("IDEA 64bit", "s");
        list.add(idea);
        EncAlg aes = new EncAlg("AES 128bit 192bit 256bit", "s");
        list.add(aes);
        EncAlg blowFish = new EncAlg("Blowfish 64bit", "s");
        list.add(blowFish);
        EncAlg twoFish = new EncAlg("Twofish 128bit 128 192 256key", "s");
        list.add(twoFish);
        EncAlg rc4 = new EncAlg("RC4 stream", "s");
        list.add(rc4);
        EncAlg rc5 = new EncAlg("RC5", "s");
        list.add(rc5);
        EncAlg rc6 = new EncAlg("RC6", "s");
        list.add(rc6);

        EncAlg diffieHellman = new EncAlg("Diffie-Hellman vpn ipsec", "a");
        list.add(diffieHellman);
        EncAlg rsa = new EncAlg("RSA 1024-4096bit", "a");
        list.add(rsa);
        EncAlg ecc = new EncAlg("ECC mobile devices", "a");
        list.add(ecc);

        Random random = new Random();

        return list.get(random.nextInt(list.size()));
    }
}
