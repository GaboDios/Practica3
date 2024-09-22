import java.util.LinkedList;

public abstract class ComputadoraBuilder{
    protected LinkedList<Componentes> componentes = 
					new LinkedList<Componentes>();

    public double obtenCosto(){
	float costo = 0;
      
	for (Componentes com : componentes) {
	    costo += com.getPrecio();
	}		
	return costo;
    }

    public void muestraComida(){
	for (Componentes com : componentes) {
	    System.out.print("Componente : " + com.getNombre());
	    System.out.println(", Precio : " + com.getPrecio());
	}		
    }
        
    public abstract RAM agregarRAM();
    public abstract FuenteDeAlimentacion agregarFuenteDeAlimentacion();
    public abstract CPU agregarCPU();
    public abstract DiscoDuro agregarDiscoDuro();
    public abstract GPU agregarGPU();
    public abstract Motherboard agregarMotherboard();
	
}
