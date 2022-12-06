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
        // TODO Auto-generated method stub
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
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maximum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int sucessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(19);
        r.insert(29);
        r.insert(34);
        r.insert(8);
        System.out.println(r.get(2));

        System.out.println ("teste");

        System.out.println (r.search(29));

    }
}
