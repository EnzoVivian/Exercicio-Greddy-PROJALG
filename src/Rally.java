package src;

import java.util.ArrayList;
import java.util.List;

public class Rally {

    public static void main (String[] args) {
        int d = 5;
        int L = 21;
        int[] n = {4, 9, 14, 18};


        var result = bestRallyPoint(d, L, n);
        System.out.println(result);
    }

    public static List<Integer> bestRallyPoint(int d, int L, int[] pontosParada) {
        List<Integer> result = new ArrayList<>();
       

        int offset = d;
        int pontoAtual = 0;
        for (int i = 0; i < pontosParada.length; i++) {
            int aux = consegueChegarAte(pontoAtual, offset, pontosParada, i, L);
            if(aux != -1){
                result.add(aux);
                pontoAtual = aux;
                offset = d;
                continue;
            }
            offset--;
        }
        result.add(L);
        return result;
    }
    public static int consegueChegarAte(int posicaoAtual, int offset, int [] pontosDeParada, int start, int L){
        int resp = -1;
        
        for(int idx = start; idx < pontosDeParada.length;idx++){
            int ponto = pontosDeParada[idx];
            if(posicaoAtual + offset  >= ponto && posicaoAtual + offset  < L){
                resp = ponto;
            }
        }

        return resp;
        
    }
}