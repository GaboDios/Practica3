public class FuenteDeAlimentacion extends Componentes{
    String potenciaMaxima;
    String eficiencia;
    public FuenteDeAlimentacion(String nombre, double precio, String marca, String tipoDeIdentificador, String potenciaMaxima, String eficiencia){
	super(nombre, precio, marca, tipoDeIdentificador);
	this.eficiencia = eficiencia;
	this.potenciaMaxima = potenciaMaxima;
    }
    
    public String getPotenciaMaxima(){
	return potenciaMaxima;
    }

    public String geteficiencia(){
	return eficiencia;
    }


    @Override
    public String toString (){
	return "Nombre: "+ nombre + "Marca:  " + marca + "Precio:  " +precio + "Pieza" + tipoDeIdentificador + "Eficiencia: " + eficiencia + "Potencia Maxima: " + potenciaMaxima;
    }
}
