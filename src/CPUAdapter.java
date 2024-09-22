public class CPUAdapter implements CPU {
    private CPU incompatibleCPU;  // La CPU incompatible que queremos adaptar
    private String targetSocket;  // El socket de destino con el que queremos hacerla compatible

    public CPUAdapter(CPU incompatibleCPU, String targetSocket) {
        this.incompatibleCPU = incompatibleCPU;
        this.targetSocket = targetSocket;
    }

    @Override
    public String getSocketType() {
        return targetSocket;  // Adaptamos el tipo de socket para que sea compatible
    }

    @Override
    public String getDescription() {
        // Retornamos la descripción de la CPU adaptada, indicando que fue adaptada
        return incompatibleCPU.getDescription() + " (Adaptada a socket: " + targetSocket + ")";
    }
}
