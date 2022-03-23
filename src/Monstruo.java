import java.util.ArrayList;

//extends NombreClasePadre
public class Monstruo extends Personaje{

    //tieneCuernos
    //tieneTentaculos
    //color
    //habilidades
    private boolean tieneCuernos;
    private boolean tieneTentaculos;
    private String color;
    private ArrayList<String> habilidades;

    //espantar
    //trabajar
    //hacerReir
    public void espantar(){
        System.out.println("Boo");
    }

    public void trabajar(){
        System.out.println("Estoy trabajando" +nombre);
    }

    public void hacerReir(){
        System.out.println("Chiste negro");
    }

    public boolean isTieneCuernos() {
        return tieneCuernos;
    }

    public void setTieneCuernos(boolean tieneCuernos) {
        this.tieneCuernos = tieneCuernos;
    }

    public boolean isTieneTentaculos() {
        return tieneTentaculos;
    }

    public void setTieneTentaculos(boolean tieneTentaculos) {
        this.tieneTentaculos = tieneTentaculos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public Monstruo(String nombre, double estatura, double peso, boolean tieneCuernos, boolean tieneTentaculos, String color, ArrayList<String> habilidades) {
        super(nombre, estatura, peso);
        this.tieneCuernos = tieneCuernos;
        this.tieneTentaculos = tieneTentaculos;
        this.color = color;
        this.habilidades = habilidades;
    }
}
