package biblioteca;




import java.util.Scanner;

/**
 *
 * @author iago leiros
 */
public class Entrada {
  public static Scanner sc = new Scanner(System.in);
    
    public static byte lerByte() {
        byte valor = 0;
        boolean repetir = true;
        
        do {
            if (sc.hasNextByte()) {
                valor = sc.nextByte();
                repetir = false;
            } else {
                System.err.println("ERRO: O dato ten que ser un byte. Volve a introducir o nº: ");
            }
            sc.nextLine();
        } while(repetir);
        return valor;
    }
    
    public static long lerLong() {
        long valor = 0;
        boolean repetir = true;
        
        do {
            if (sc.hasNextLong()) {
                valor = sc.nextLong();
                repetir = false;
            } else {
                System.err.println("ERRO: O dato ten que ser un long. Volve a introducir o nº: ");
            }
            sc.nextLine();
        } while(repetir);
        return valor;
    }
    
    public static int lerInt() {
        int valor = 0;
        boolean repetir = true;
        
        do {
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                repetir = false;
            } else {
                System.err.println("ERRO: O dato ten que ser un long. Volve a introducir o nº: ");
            }
            sc.nextLine();
        } while(repetir);
        return valor;
    }
    
    public static short lerShort() {
        short valor = 0;
        boolean repetir = true;
        
        do {
            if (sc.hasNextShort()) {
                valor = sc.nextShort();
                repetir = false;
            } else {
                System.err.println("ERRO: O dato ten que ser un long. Volve a introducir o nº: ");
            }
            sc.nextLine();
        } while(repetir);
        return valor;
    }
    
    public static String lerString() {
        String valor = "";
        
        do {
            valor = sc.nextLine();
            if(valor.isEmpty()){
                System.out.println("cadea valeira, volvao a intentar");
            }
        }while(valor.isEmpty());
        return valor;
    }
    
    public static char lerChar() {
        String valor = "";
        
        do {
            valor = sc.nextLine();
        }while(valor.isEmpty());
        return valor.charAt(0);
    }

}
