public abstract class Componentes{
    String nombre;
    double precio;
    String marca;
    String tipoDeIdentificador;    

    public Componentes(String nombre, double precio, String marca, String tipoDeIdentificador){
	this.nombre = nombre;
	this.precio = precio;
	this.marca = marca;
	this.tipoDeIdentificador  = tipoDeIdentificador;
    }

    public String getNombre(){
	return nombre;
    }
    public double getPrecio(){
	return precio;
    }
    public String getMarca(){
	return marca;
    }
    public String getTipoDeIdentificador(){
	return tipoDeIdentificador;
    }
    public String toString(){
	return "Nombre: "+ nombre + "Marca:  " + marca + "Precio:  " +precio + "Pieza" + tipoDeIdentificador;
    }
    
}
