public class GPU extends Componentes{
    String tipoDeMemoria;
    String puertosDeSalida;
    public GPU(String nombre, double precio, String marca, String tipoDeIdentificador, String tipoDeMemoria, String puertosDeSalida){
	super(nombre, precio, marca, tipoDeIdentificador);
	this.tipoDeMemoria = tipoDeMemoria;
	this.puertosDeSalida = puertosDeSalida;
    }
    public String getTipoDeMemoria(){
	return tipoDeMemoria;
    }

    public String getPuertosDeSalida(){
	return puertosDeSalida;
    }

    @Override
    public String toString (){
	return "Nombre: "+ nombre + "Marca:  " + marca + "Precio:  " +precio + "Pieza" + tipoDeIdentificador + "Tipo de Memoria:  " + tipoDeMemoria + "Puerto de Salida: " + puertosDeSalida;
    }
}
