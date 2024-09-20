package es.iescastillodeluna;

import java.util.ArrayList;

public class dado {
    /*registro de puntuaciones */
    private ArrayList<Integer> registro;
    private int caras;

    public static int AleatorioEntre(int min, int max){
        return (int) (Math.random()*(max+1-min)+min);
    }

    public dado(int caras) {
        setCaras(caras);
        registro=new ArrayList<>();
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    public Integer[] getRegistro() {
        return registro.toArray(Integer[]::new);
    }

    public int getUltimo(){
        return registro.isEmpty()?null:registro.get(registro.size()-1);
    }

    public void reset(){
        registro.clear();
    }

    public int lanzar(){
        registro.add(AleatorioEntre(1, 6)) ;
        return getUltimo();
    }
}
