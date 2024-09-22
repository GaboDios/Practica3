public class Motherboard extends Componentes{
    String chip;
    String formato;
    public Motherboard(String nombre, double precio, String marca, String tipoDeIdentificador, String chip, String formato){
	super(nombre, precio, marca, tipoDeIdentificador);
	this.chip = chip;
	this.formato = formato;
    }
    
    public String getFormato(){
	return formato;
    }

    public String getChip(){
	return chip;
    }    

    @Override
    public String toString (){
	return "Nombre: "+ nombre + "Marca:  " + marca + "Precio:  " +precio + "Pieza" + tipoDeIdentificador + "Chip:" + chip + "Formato: " + formato;
    }
}
