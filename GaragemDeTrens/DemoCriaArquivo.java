import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class DemoCriaArquivo {
  public static void main(String[] args){
    Random sorteia = new Random();

    String currDir = Paths.get("").toAbsolutePath().toString();
    String nameComplete = currDir+"\\"+"numeros.dat";
    Path path = Paths.get(nameComplete);
    try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path, StandardCharsets.UTF_8))){
        for(int i=0;i<100;i++){
            int nro = sorteia.nextInt(1000);
            writer.print(nro+",");
        }
        int nro = sorteia.nextInt(1000);
        writer.print(nro+"\n");

    }catch (IOException x){
      System.err.format("Erro de E/S: %s%n", x);
  }
}
}    

