public class AMDDiscoDuro implements DiscoDuro, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "Disco Duro";
    private int capacidad;
    private String tipoAlmacenamiento; // HDD o SSD
    private String gama;  // Atributo para la gama

    public AMDDiscoDuro(String nombre, double precio, String marca, int capacidad, String tipoAlmacenamiento, String gama) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.capacidad = capacidad;
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        this.gama = gama;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getTipoComponente() {
        return tipoComponente;
    }

    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Capacidad: " + capacidad + "GB - Tipo: " + tipoAlmacenamiento + " - Precio: $" + precio;
    }

    @Override
    public  String getGama(){
        return gama;
    }
}
