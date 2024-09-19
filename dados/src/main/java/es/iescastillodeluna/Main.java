package es.iescastillodeluna;

public class Main {
    public static void main(String[] args) {
        dado dado= new dado(6);
        for(int i=0;i<10;i++){
            System.out.println("Tirada: "+dado.lanzar());
        }
    }
}