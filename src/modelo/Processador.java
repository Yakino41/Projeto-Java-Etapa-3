package modelo;

//NetBeans Ver 25.
//Arthur Gabriel Teotonio Stellato R.A:A2766949 ADS 2025/2
public class Processador extends Produto {
	
	private String socketCompativel;
	private int nucleo; //--> Threads = Nucleos Simulados
	private int threads; //--> Threads = Nucleos Simulados
	private float freqBase;
	private float freqMax;
	
	
	// Construtor
	public Processador(){
		socketCompativel = "";
		nucleo = 0;
		threads = 0;
		freqBase = 0;
		freqMax = 0;
	}
	
	// Sobrecarga
	public Processador(String socketCompativel, int nucleo, int threads, float freqBase, float freqMax){ 
		this.socketCompativel = socketCompativel;
		this.nucleo = nucleo;
		this.threads = threads;
		this.freqBase = freqBase;
		this.freqMax = freqMax;
	}
	
	// Sobrescrita
	public void sobDados(){
		System.out.println("sobDados: Classe Filha Processador");
	}
	
	//Getters
	public String getSocketCompativel(){
		return socketCompativel;		
	}
	
	public int getNucleo(){
		return nucleo;
	}
	
	public int getThreads(){
		return threads;		
	}
	
	public float getFreqBase(){
		return freqBase;		
	}
	
	public float getFreqMax(){
		return freqMax;		
	}
	
	//Setters
	public void setSocketCompativel(String socketCompativel) throws SocketCompInvException {
    if (getMarca().equalsIgnoreCase("Intel")) {
        if (!socketCompativel.equalsIgnoreCase("LGA 1151") && 
              !socketCompativel.equalsIgnoreCase("LGA 1155") && 
			  !socketCompativel.equalsIgnoreCase("LGA 1200") && 
              !socketCompativel.equalsIgnoreCase("LGA 1700")) {
            throw new SocketCompInvException("[ERRO]Socket inválido para Intel! Sockets Intel: [LGA 1151] [LGA 1155] [LGA 1200] [LGA 1700].");
        }
    } else if (getMarca().equalsIgnoreCase("Amd")) {
        if (!socketCompativel.toUpperCase().equalsIgnoreCase("AM4") && !socketCompativel.toUpperCase().equalsIgnoreCase("AM5")) {
            throw new SocketCompInvException("[ERRO]Socket inválido para AMD! Sockets AMD : [AM4] [AM5].");
        }
    }
	this.socketCompativel = socketCompativel.toUpperCase();
	}
	
	public void setNucleo(int nucleo) throws NucleoInvException{
		if(nucleo <= 0){
			throw new NucleoInvException("Por Favor Digite um numero positivo.");
		}
		this.nucleo = nucleo;
	}
	
	public void setThreads(int threads) throws ThreadsInvException{
		if (threads <= 0){
			throw new ThreadsInvException("[ERRO]Threads Deve Ser Maior que 0");
		} else if (threads < nucleo){
			throw new ThreadsInvException("[ERRO]Quantidade de Threads devem ser maiores que a do nucleo");
		}
		this.threads = threads;
	}
	
	public void setFreqBase(float freqBase) throws FreqBaseInvException {
		if(freqBase <= 0){
			throw new FreqBaseInvException("[ERRO] Por Favor Digite Numeros Como (5.1)");
		}
		this.freqBase = freqBase;
	}
	
	public void setFreqMax(float freqMax) throws FreqMaxInvException {
		if (freqMax <= 0) {
			throw new FreqMaxInvException("[ERRO]Frequencia Maxima Deve Ser Maior Que 0");
		} else if (freqMax < freqBase) {
			throw new FreqMaxInvException("[ERRO]Frequencia Maxima Deve Ser Maior Que A Frequencia Base.");
		}
		this.freqMax = freqMax;
	}

}