public class ListaArray implements EstruturaDeDados{

     private int[] elementos;
     private int contador;

    public ListaArray(){
        elementos = new int[1000];
        contador = 0;
    }

    public int get (int chave) {
        return elementos[chave];
    }

    public void printar (){
        boolean a = true;
        int i = 0;
        while (a){
            System.out.println(elementos[i] );
            if (elementos[i+1]==0 && elementos[i+2]==0){
                a=false;
            }
            i++;
	    }
    }


    @Override
    public boolean insert(int chave) {
        if (contador==1000){
            System.out.println("Não há mais espaços disponíveis");
            return false;
        } 
        else{
            elementos[contador] = chave;
            contador = contador+1;
            return true;
        }
    }

    @Override
    public boolean delete(int chave) {
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] == chave){
                elementos [i] = 0;
                for (int j = i; j < elementos.length-1; j++){
                    elementos[j] = elementos [j+1];
                }
                contador = contador-1;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean search(int chave) {
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] == chave){
                return true;
            }
        }
        return false;
    }


    @Override
    public int minimum() {
        int parametro = 100000;
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] < parametro){
                parametro = elementos[i];
            }
            if (elementos[i+1]==0 && elementos[i+2]==0){
                return parametro;
            }
        }
        return 0;
    }

    @Override
    public int maximum() {
        int parametro = 0;
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i]>parametro){
                parametro = elementos[i];
            }
            if (elementos[i+1]==0 && elementos[i+2]==0){
                return parametro;
            }
        }
        return 0;
    }

    @Override
    public int sucessor(int chave) {
         for (int i = 0; i < elementos.length; i++){
            if (elementos[i] == chave){
                return elementos[i+1];
            }
        }
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        for (int i = 0; i < elementos.length; i++){
            if (elementos[i] == chave){
                return elementos[i-1];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(19);
        r.insert(29);
        r.insert(34);
        r.insert(8);
        System.out.println(r.get(2) + " esse é o get ");

        r.printar();

        System.out.println ("mínimo:");
        System.out.println (r.minimum());
        System.out.println ("máximo:");
        System.out.println (r.maximum());

        System.out.println ("resultado da busca:");
        System.out.println (r.search(29));

        System.out.println ("deletando o numero 29:");
        System.out.println (r.delete(29));

        System.out.println ("sucessor de 34:");
        System.out.println (r.sucessor(34));
        
        System.out.println ("antecessor de 34:");
        System.out.println (r.prodessor(34));

        r.printar();


    }
}
