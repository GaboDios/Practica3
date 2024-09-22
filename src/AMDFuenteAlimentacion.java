public class AMDFuenteAlimentacion implements FuenteAlimentacion, Componente {
    private String nombre;
    private double precio;
    private String marca;
    private String tipoComponente = "Fuente de Alimentación";
    private int potencia;
    private String eficiencia;  // 80 Plus, Gold, etc.

    public AMDFuenteAlimentacion(String nombre, double precio, String marca, int potencia, String eficiencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.potencia = potencia;
        this.eficiencia = eficiencia;
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
        return nombre + " - " + marca + " - Potencia: " + potencia + "W - Eficiencia: " + eficiencia + " - Precio: $" + precio;
    }
}
