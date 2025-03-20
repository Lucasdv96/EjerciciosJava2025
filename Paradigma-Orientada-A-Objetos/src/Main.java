import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String user = "lucas";
        String pass = "1234";
        int intentosMaximos = 3;
        int intentos = 0;
        boolean estaLogeado= false;
        Scanner scanner = new Scanner(System.in);

        while(intentos < intentosMaximos){
            System.out.println("Ingrese usuario: ");
            String userName = scanner.nextLine();
            System.out.println("Ingrese contraseña: ");
            String userPass = scanner.nextLine();

            if(userName.equals(user) && userPass.equals(pass) ){
                System.out.println("Bienvenido: " + user);
                estaLogeado = true;
                break;
            }else{
                intentos++;
                System.out.println("Usuario/Contraseña incorrectos, intente de nuevo, numero de intentos restantes: " + (intentosMaximos - intentos) );

            }
        }
        if(!estaLogeado){
            System.out.println("Demasiados intentos fallidos. Sistema cerrado");
        }

    }
}