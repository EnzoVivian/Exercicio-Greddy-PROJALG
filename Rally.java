import java.util.Arrays;

public class Rally {

    public static void main (String[] args) {
        int d = 5;
        int L = 21;
        int[] n = {4, 9, 12, 14, 18, 20};

        int[] result = bestRallyPoint(d, L, n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] bestRallyPoint(int d, int L, int[] pontosParada) {
        int[] result = new int[pontosParada.length];
        int indexPontosParada = 0;
        int indexResult = 0;
        int offSet = d;
        for (int posicaoAtual = 0; posicaoAtual < L; posicaoAtual++) {
            offSet--;
            System.out.println("Ponto de parada: " + pontosParada[indexPontosParada]);
            if(posicaoAtual == pontosParada[indexPontosParada]){
                if(posicaoAtual + offSet == pontosParada[indexPontosParada+1]){
                    result[indexResult] = pontosParada[indexPontosParada+1];
                    indexResult++;
                    indexPontosParada++;
                    offSet = d;
                    continue;
                }else if(posicaoAtual + offSet > pontosParada[indexPontosParada]){
                    continue;
                }
                result[indexResult] = pontosParada[indexPontosParada];
                offSet = d;
                indexResult++;
                indexPontosParada++;
            } 
            if(posicaoAtual == pontosParada[pontosParada.length - 1] && posicaoAtual + offSet < L){
                result[indexResult] = posicaoAtual;
            }else if(posicaoAtual == pontosParada[pontosParada.length - 1] && posicaoAtual + offSet >= L){
                result[indexResult] = L;
            }
        }
        return result;
    }
}