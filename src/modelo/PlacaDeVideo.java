package modelo;

//NetBeans Ver 25.
//Arthur Gabriel Teotonio Stellato R.A:A2766949 ADS 2025/2
public class PlacaDeVideo extends Produto {

        private int memoria; // Em GB
        private float veloVram;
        private String tipoMemoria;
        private float numPci;
        private String saidaVideo;
        private Dimensao dime;

    // Construtor default
    public PlacaDeVideo() {
            memoria = 0;
            veloVram = 0;
            tipoMemoria = "";
            numPci = 0;
            saidaVideo = "";
            dime = new Dimensao();
    }

    // Construtor sobrecarregado
    public PlacaDeVideo(int memoria, float veloVram, String tipoMemoria, float numPci, String saidaVideo, Dimensao Dime) {
            this.memoria = memoria;
            this.veloVram = veloVram;
            this.tipoMemoria = tipoMemoria;
            this.numPci = numPci;
            this.saidaVideo = saidaVideo;
            this.dime = dime;
    }
	
    //Sobreescrita
    public void sobDados(){
            System.out.println("sobDados: Classe Filha PlacaDeVideo");
    }
	
    // Getters
    public int getMemoria() {
        return memoria;
    }
	
    public float getVeloVram(){
            return veloVram;
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }
	
    public float getNumPci() {
        return numPci;
    }
	
    public String getSaidaVideo() {
        return saidaVideo;
    }

    public Dimensao getDime(){
            return dime;
    }
	
    // Setters
    public void setMemoria(int memoria) throws MemoriaInvException{
		if(memoria <= 0){
			throw new MemoriaInvException("Quantidade de memoria deve ser maior que 0");
		}
        this.memoria = memoria;
    }
	
    public void setVeloVram(float veloVram) throws VeloVramException {
            if(veloVram <= 0){
                    throw new VeloVramException("[ERRO] Velocidade Da Vram Deve ser Maior que 0.");
            }
            this.veloVram = veloVram;
    }

    public void setTipoMemoria(String tipoMemoria) throws TipoMenInvException {
		if(!tipoMemoria.equalsIgnoreCase("GDDR4") && 
		!tipoMemoria.equalsIgnoreCase("GDDR5") && 
		!tipoMemoria.equalsIgnoreCase("GDDR5X") &&
		!tipoMemoria.equalsIgnoreCase("GDDR6") && 
		!tipoMemoria.equalsIgnoreCase("GDDR6X") && 
		!tipoMemoria.equalsIgnoreCase("GDDR7")) {
			throw new TipoMenInvException("[ERRO] Memoria errada. Tipos de Memoria -> [GDDR4][GDDR5][GDDR5X][GDDR6][GDDR6X][GDDR7]");
		}else{
        this.tipoMemoria = tipoMemoria.toUpperCase();
		}
    }
	
    public void setNumPci(float numPci) throws NumPciException {
            if (numPci != 3.0f && numPci != 4.0f && numPci != 5.0f) {
                    throw new NumPciException("[ERRO] Versão do PCI deve ser maior que 0.");
            }
            this.numPci = numPci;
    }

	
     public void setSaidaVideo(String saidaVideo) {
            this.saidaVideo = saidaVideo.toUpperCase();
    }
	
    public void setDime(Dimensao dime){
            this.dime = dime;		
    }
}
