public class AMDRAM implements RAM, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "RAM";
    private int capacidad; // Capacidad de RAM en GB
    private String tipoMemoria; // DDR4, DDR5, etc.

    public AMDRAM(String nombre, double precio, String marca, int capacidad, String tipoMemoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.capacidad = capacidad;
        this.tipoMemoria = tipoMemoria;
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
        return nombre + " - " + marca + " - Capacidad: " + capacidad + "GB - Tipo: " + tipoMemoria + " - Precio: $" + precio;
    }
}
