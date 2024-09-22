public class CPUAdapter implements CPU {
    private CPU incompatibleCPU;
    private String targetSocket;  // El socket al que se adapta la CPU

    public CPUAdapter(CPU incompatibleCPU, String targetSocket) {
        this.incompatibleCPU = incompatibleCPU;
        this.targetSocket = targetSocket;
    }

    @Override
    public String getSocketType() {
        return targetSocket;  // Adaptar el socket para que sea compatible
    }

    @Override
    public String getDescription() {
        return incompatibleCPU.getDescription() + " (Adaptado a socket: " + targetSocket + ")";
    }

    @Override
    public double getPrecio() {
        // Delegar el método getPrecio al objeto CPU que está siendo adaptado
        return incompatibleCPU.getPrecio();
    }
}
