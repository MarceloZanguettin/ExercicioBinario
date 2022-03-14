public class IdadeBinario{

    public static void main(String[] args){


        int idade=20;
        int vetor[] =new int[15];
        int count=0;

        while (idade>=2){
        vetor[count]=idade%2;
        idade=idade/2;
        count++;
        }
        vetor[count]=idade;
        for (int indice = count; indice>=0; indice--){
            System.out.print(vetor[indice]);
        }
    }
}