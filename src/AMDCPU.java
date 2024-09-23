public class AMDCPU implements CPU, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "CPU";
    private String socket;
    private double frecuencia;  // Frecuencia específica de la CPU
    private String gama;  // Atributo para la gama

    public AMDCPU(String nombre, double precio, String marca, String socket, double frecuencia, String gama) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.socket = socket;
        this.frecuencia = frecuencia;
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
    public String getSocketType() {
        return socket;
    }

    @Override
    public String getDescription() {
        return nombre + " - " + marca + " - Frecuencia: " + frecuencia + " GHz - Precio: $" + precio;
    }

    @Override
    public  String getGama(){
        return gama;
    }
}
