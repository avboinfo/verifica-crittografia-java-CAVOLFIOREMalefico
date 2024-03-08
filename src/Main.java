

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Main extends Crypto{
    public static void main(String[] args) {
        String testo= "";
        try{
            File file = new File("static/data.txt"); 
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
             String s = scanner.nextLine();
             testo=testo +s;
            }
            scanner.close();
        }catch (FileNotFoundException e){
            System.out.println("NON ESISTE FILE.");
            e.printStackTrace();
        }
    System.out.println("1 cripta, 2 decripta,3 stampa");
      Scanner scan = new Scanner(System.in);
      String scelta1 = scan.nextLine();
      scan.close();
      switch(scelta1){
        case "1":
        System.out.println("gg");
        break;
        case "2":
        System.out.println("pp");
        case "3":
        System.out.println(testo);
      }
    }
}