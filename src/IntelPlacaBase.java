public class IntelPlacaBase implements PlacaBase, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "Placa Base";
    private String formato;
    private String chipset;
    private String compatibleSocket; // Añadimos el socket compatible

    public IntelPlacaBase(String nombre, double precio, String marca, String formato, String chipset, String compatibleSocket) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.formato = formato;
        this.chipset = chipset;
        this.compatibleSocket = compatibleSocket; // Inicializamos el socket compatible
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
    public String getCompatibleSocket() {
        return compatibleSocket;  // Retorna el socket compatible (ej: AM4)
    }

    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Formato: " + formato + " - Chipset: " + chipset + " - Socket: " + compatibleSocket + " - Precio: $" + precio;
    }
}
