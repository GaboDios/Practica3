public class RAM extends Componentes{
    String tipoDeMemoria;
    int capacidad;
    public RAM(String nombre, double precio, String marca, String tipoDeIdentificador, String tipoDeMemoria, int capacidad){
	super(nombre, precio, marca, tipoDeIdentificador);
	this.tipoDeMemoria = tipoDeMemoria;
	this.capacidad = capacidad;
    }
    
    public String getTipoDeMemoria(){
	return tipoDeMemoria;
    }

    public int getCapacidad(){
	return capacidad;
    }

    @Override
    public String toString (){
	return "Nombre: "+ nombre + "Marca:  " + marca + "Precio:  " +precio + "Pieza" + tipoDeIdentificador + "Tipo de Memoria:" + tipoDeMemoria + "Capacidad:" + capacidad;
    }
}
