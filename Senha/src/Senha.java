import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha {
    class GFG {

        //Funcao para validação da Senha
        public static boolean
        isValidPassword(String password) {

            // Checar validade da Senha.
            String regex = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,32}$";

            // Compilaçao do REGEX
            Pattern p = Pattern.compile(regex);


            if (password == null) {
                return false;
            }

            Matcher m = p.matcher(password);

            return m.matches();
        }


    }
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua Senha: ");
        String senha = entrada.nextLine();

        entrada.close();

        if(GFG.isValidPassword(senha) == true){
            System.out.println("Senha Valida");
        }else {

            if (senha.length() < 6) {
                int r = 6 - senha.length();
                System.out.println("A senha não atende ao critérios de senha segura. Adicione mais " + r + " caracteres");
            } else {
                System.out.println("A senha não atende ao critérios de senha segura. Tente novamente");
            }
        }


    }
}
