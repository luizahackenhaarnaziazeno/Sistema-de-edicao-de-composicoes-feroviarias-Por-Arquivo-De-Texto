import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class CadastroLocomotiva {
private ArrayList<Locomotiva>locomotiva;
private int contloc;
private static final String fname="locomotiva.txt";

public CadastroLocomotiva(){
locomotiva=new ArrayList<>();
contloc=0;    
}

// Método para adicionar uma locomotiva ao cadastro
public void adicionarLocomotiva(Locomotiva loc) {
    locomotiva.add(loc);
}


public void carregaLocomotiva() throws IOException{
String currDir=Paths.get("").toAbsolutePath().toString();
String nameComplete = currDir+"\\"+fname;
Path path = Paths.get(nameComplete);

try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))){
    while (sc.hasNext()){
        String linha = sc.nextLine();
        //System.out.println(linha);
        String dados[] = linha.split(";");

        int idlocomotiva = Integer.parseInt(dados[0]);
        int peso = Integer.parseInt(dados[1]);
        int  nummaxdevagoes = Integer.parseInt(dados[2]);
        int idtrem=Integer.parseInt(dados[3]);
        Locomotiva loc = new Locomotiva(idlocomotiva, peso, nummaxdevagoes,idtrem);
        locomotiva.add(loc);
        contloc++;
}

}catch (IOException x){
    System.err.format("Erro de E/S: %s%n", x);
}

}

public void gravaLocomotiva(){
    String currDir = Paths.get("").toAbsolutePath().toString();
    String nameComplete = currDir+"\\"+fname;
    Path path = Paths.get(nameComplete);
    try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path, StandardCharsets.UTF_8))){
      for(int i=0;i<locomotiva.size();i++){
            String linha = locomotiva.get(i).getIdlocomotiva()+";"+
                           locomotiva.get(i).getPeso()+";"+
                           locomotiva.get(i).getNummaxdevagoes()+";"+
                           locomotiva.get(i).getIdtrem();

            System.out.println(">"+linha);
            writer.println(linha);
        }
    }catch (IOException x){
      System.err.format("Erro de E/S: %s%n", x);
  }    
}

public String toString(){
    String str = "";
    for(int i=0;i<contloc;i++){
        str = str + locomotiva.get(i)+"\n";
    }
    return str;
}
}

