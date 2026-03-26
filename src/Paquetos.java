public abstract class Paquetos{
    protected int size;
    protected String marca;

    public Paquetos(int size, String marca) {
        this.size = size;
        this.marca = marca;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Paquetos{" +
                "size=" + size +
                ", marca='" + marca + '\'' +
                '}';
    }

    public abstract void sabor();

    public void sacar() {
        System.out.println("Sacaste un/una " + marca);
    }

}
