public class CPU extends Componentes{
    String frecuencia;
    public CPU(String nombre, double precio, String marca, String tipoDeIdentificador, String frecuencia){
	super(nombre, precio, marca, tipoDeIdentificador);
	this.frecuencia = frecuencia; 
    }
    public String getFrecuencia(){
	return frecuencia;
    }

    @Override
    public String toString (){
	return "Nombre: "+ nombre + "Marca:  " + marca + "Precio:  " +precio + "Pieza" + tipoDeIdentificador + "Frecuencia:" + frecuencia;
    }
}
