public class AMDGPU implements GPU, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "GPU";
    private String tipoMemoria;
    private String puertosSalida;  // HDMI, DisplayPort, etc.
    private String gama;

    public AMDGPU(String nombre, double precio, String marca, String tipoMemoria, String puertosSalida, String gama) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.tipoMemoria = tipoMemoria;
        this.puertosSalida = puertosSalida;
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
        return nombre + " - " + marca + " - Tipo Memoria: " + tipoMemoria + " - Puertos: " + puertosSalida + " - Precio: $" + precio;
    }

    @Override
    public  String getGama(){
        return gama;
    }
}
