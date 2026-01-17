package modelo;

//NetBeans Ver 25.
//Arthur Gabriel Teotonio Stellato R.A:A2766949 ADS 2025/2
public class PlacaMae extends Produto implements Garantia{

        private int numMemoria;
	private String gerMemRam;
	private float pciCompativel;
	private String tamanho;
	
    // Construtor default
    public PlacaMae() {
            numMemoria = 0;
            gerMemRam = "";
            pciCompativel = 0;
            tamanho = "";
    }

    // Construtor sobrecarregado
    public PlacaMae(int numMemoria,String gerMemRam, float pciCompativel, String tamanho) {
            this.numMemoria = numMemoria;
            this.gerMemRam = gerMemRam;
            this.pciCompativel = pciCompativel;
            this.tamanho = tamanho;
    }
	
	// Sobreescrito
	public void sobDados(){
		System.out.println("sobDados: Classe Filha PlacaMae");
	}
	
    // Getters
    public int getNumMemoria() {
        return numMemoria;
    }
	
    public String getGerMemRam(){
            return gerMemRam;
    }
	
	public float getPciCompativel() {
        return pciCompativel;
    }
	
	public String getTamanho() {
        return tamanho;
    }
	
    // Setters
    public void setNumMemoria(int numMemoria) throws NumMemoriaException {
		if (numMemoria <= 0){
			throw new NumMemoriaException("[ERRO] A quantidade de canais tem que ser maior que 0");
		}
        this.numMemoria = numMemoria;
    }
	
    public void setGerMemRam(String gerMemRam) throws GerMemRamException {
            if(!gerMemRam.equalsIgnoreCase("DDR3") &&
            !gerMemRam.equalsIgnoreCase("DDR4") && 
            !gerMemRam.equalsIgnoreCase("DDR5")){
                    throw new GerMemRamException("[ERRO] A Geração da Memoria Ram Compativeis São [DDR3][DDR4][DDR5] Tente Novamente.");
            }
            this.gerMemRam = gerMemRam.toUpperCase();

    }

    public void setPciCompativel(float pciCompativel) throws PciCompInvException{
            if(pciCompativel != 3.0f && pciCompativel != 4.0f && pciCompativel != 5.0f){
                    throw new PciCompInvException("[ERRO] Versão do PCI Compativel deve [3.0] [4.0] [5.0]");
            }
        this.pciCompativel = pciCompativel;
    }
	
    public void setTamanho(String tamanho) throws TamanhoInvException {
            if(!tamanho.equalsIgnoreCase("EATX") && !tamanho.equalsIgnoreCase("ATX") 
                            && !tamanho.equalsIgnoreCase("MICRO-ATX") 
                            && !tamanho.equalsIgnoreCase("MINI-ATX")){
                            throw new TamanhoInvException("Tamanho Invalido Tente Novamente: [EATX][ATX][MICRO-ATX][MINI-ATX]");
                    }
        this.tamanho = tamanho.toUpperCase();
    }
	
}
