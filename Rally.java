public class Rally {

    public static void main (String[] args) {
        int d = 5;
        int L = 20;
        int[] n = {7, 9, 12, 14, 18};

        int[] result = bestRallyPoint(d, L, n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] bestRallyPoint(int d, int L, int[] pontosParada) {
        int[] result = new int[pontosParada.length];
        int indexPontosParada = 0;
        int indexResult = 0;
        int offSet = 0;
        for (int posicaoAtual = 0; posicaoAtual < L; posicaoAtual++) {
            if(posicaoAtual == pontosParada[indexPontosParada]){
                if(posicaoAtual + offSet)         
            }           
        }
        return result;
    }
}