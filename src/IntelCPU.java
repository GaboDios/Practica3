public class IntelCPU implements CPU, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "CPU";
    private String socket;
    private double frecuencia;  // Frecuencia específica de la CPU

    public IntelCPU(String nombre, double precio, String marca, String socket, double frecuencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.socket = socket;
        this.frecuencia = frecuencia;
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
    public String getSocketType() {
        return socket;
    }

    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Frecuencia: " + frecuencia + " GHz - Precio: $" + precio;
    }
}
