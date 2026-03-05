import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DemoLeArquivo {
    public static void main(String args[]){
        String currDir = Paths.get("").toAbsolutePath().toString();
        String nameComplete = currDir+"\\"+"numeros.dat";
        Path path = Paths.get(nameComplete);

        int acum = 0;
        double media = 0.0;
        String linha = "";
         try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))){
            linha = sc.nextLine();
         }catch (IOException x){
             System.err.format("Erro de E/S: %s%n", x);
         }
         String[] numeros = linha.split(",");
         for(int i=0;i<numeros.length;i++){
             acum += Integer.parseInt(numeros[i]);
         }
         media = acum/numeros.length;
         System.out.println("Quantidade de valores lidos: "+numeros.length);
         System.out.println("Somatorio: "+acum);
         System.out.println("Media: "+media);
    }
}

