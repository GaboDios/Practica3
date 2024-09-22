public class DiscoDuro extends Componentes{
    int capacidad;
    String tipoDeAlmacenamiento;
    public DiscoDuro(String nombre, double precio, String marca, String tipoDeIdentificador, int capacidad, String tipoDeAlmacenamiento){
	super(nombre, precio, marca, tipoDeIdentificador);
	this.capacidad = capacidad;
	this.tipoDeAlmacenamiento = tipoDeAlmacenamiento;
    }
    
    public String getTipoDeAlmacenamiento(){
	return tipoDeAlmacenamiento;
    }

    public int getCapacidad(){
	return capacidad;
    }

    @Override
    public String toString (){
	return "Nombre: "+ nombre + "Marca:  " + marca + "Precio:  " +precio + "Pieza" + tipoDeIdentificador + "Capacidad:" + capacidad + "Tipo de almacenamiento: " + tipoDeAlmacenamiento;
    }
}
