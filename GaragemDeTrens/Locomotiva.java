import java.util.ArrayList;

public class Locomotiva {
private int idlocomotiva;
private int peso=50;
private int nummaxdevagoes=50;
private int idtrem;


public Locomotiva(int idlocomotiva,int peso,int nummaxdevagoes,int idtrem){
this.idlocomotiva=idlocomotiva;
this.peso=peso;
this.nummaxdevagoes=nummaxdevagoes;
this.idtrem=idtrem;
}


public int getIdlocomotiva() {
    return idlocomotiva;
}


public void setIdlocomotiva(int idlocomotiva) {
    this.idlocomotiva = idlocomotiva;
}


public int getPeso() {
    return peso;
}


public void setPeso(int peso) {
    this.peso = peso;
}


public int getNummaxdevagoes() {
    // Verifica se nummaxdevagoes é menor que 50
    if (nummaxdevagoes < 50) {
        // Se for menor que 50, retorna o valor de nummaxdevagoes sem alterações
        return nummaxdevagoes;
    } else { // Se nummaxdevagoes não for menor que 50
        // Verifica se nummaxdevagoes é maior que 50
        if (nummaxdevagoes > 50) {
            // Se for maior que 50, reduz nummaxdevagoes em 10%
            // Note que a redução é realizada através de uma expressão aritmética
            // 10 * nummaxdevagoes / 100 é a representação de 10%
            return nummaxdevagoes - (10 * nummaxdevagoes / 100);  
        }
    }
    // Retorna nummaxdevagoes se não for menor que 50 nem maior que 50
    return nummaxdevagoes;
}


public void setNummaxdevagoes(int nummaxdevagoes) {
    this.nummaxdevagoes = nummaxdevagoes;
}


public int getIdtrem() {
    return idtrem;
}


public void setIdtrem(int idtrem) {
    this.idtrem = idtrem;
}


@Override
public String toString() {
    return "Locomotiva [idlocomotiva=" + idlocomotiva + ", peso=" + peso + ", nummaxdevagoes=" + nummaxdevagoes
            + ", idtrem=" + idtrem + "]";
}

}
