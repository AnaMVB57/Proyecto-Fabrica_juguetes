package paquete;

/*
    Los atributos separados.
    Los atributos deberian ser private.
 */

public class Peluche implements Juguete, Cloneable {

    private String materialExterior;
    private String relleno;
    private String color;
    private int id;

    //Funciones getters y setters de los atributos de Peluche
    public String getMaterialExterior() {
        return materialExterior;
    }

    public void setMaterialExterior(String materialExterior) {
        this.materialExterior = materialExterior;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(int id) {this.id = id;}

    @Override
    public int getId() {
        return this.id;
    }

    //Método toString sobreescrito para mostrar los atributos del objeto Peluche
    @Override
    public String toString() {
        return "Peluche - id: " + getId() +
                " | Material: " + getMaterialExterior() +
                " | Relleno: " + getRelleno() +
                " | Color: " + getColor();
    }

    @Override
    public Juguete clonar() throws CloneNotSupportedException {
        return (Peluche) super.clone();
    }

    public static PelucheBuilder builder() {
        return new PelucheBuilder();
    }

    //______________________________________________________________________________________________________________________
     public static class PelucheBuilder {

        private Peluche peluche;

        private PelucheBuilder(){
            this.peluche = new Peluche();
        }

        public PelucheBuilder id(int id) {
            this.peluche.id = id;
            return this;
        }

        public PelucheBuilder materialExterior(String materialExterior){
            this.peluche.materialExterior = materialExterior;
            return this;
        }

         public PelucheBuilder relleno(String relleno){
            this.peluche.relleno = relleno;
            return this;
        }

        public PelucheBuilder color(String color){
            this.peluche.color = color;
            return this;
        }

        public Peluche build(){
            return this.peluche;
        }

    }

}