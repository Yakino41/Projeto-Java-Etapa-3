package modelo;

//NetBeans Ver 25.
//Arthur Gabriel Teotonio Stellato R.A:A2766949 ADS 2025/2
public abstract class Produto implements Garantia{
	
	private String marca;
	private String modelo;
	private int ano;
	private float preco;
	private String dataGarantia;
	
//<=========================================================
		//Polimorfismo por Sobrecarga
	
	public Produto(){ //<-- DEFAULT
		marca = "";
		modelo = "";
		ano = 0;	
		preco = 0;
	}
	
	//Sobrecarga
	public Produto(int id, String marca, String modelo, int ano, float preco){
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	}
	
//<==========================================================
	public abstract void sobDados();

	//Sobrecarga
	public int sobDados(String var){
		System.out.println("sobDados: Sobrecarga -1 " +var);
		return 1;
	}

//<=========================================================

	//Getters
	public String getMarca(){
		return marca;
	}
	
	public String getModelo(){
		return modelo;
	}
	
	public int getAno(){
		return ano;
	}
	
	public float getPreco(){
		return preco;
	}
	
	public String getDataGarantia(){
		return dataGarantia;
	}
	
	//Setters
	public void setMarca(String marca) throws ProcInvException, PlacaVidInvException, PlacaMaeInvException {
            if (this instanceof Processador) {
                if (!marca.equalsIgnoreCase("AMD") && 
                        !marca.equalsIgnoreCase("INTEL")) {
                    throw new ProcInvException("[ERRO] Marca De processador Invalida. Marcas Validas -> [INTEL] OU [AMD].");
                }
    } else if (this instanceof PlacaDeVideo) {
        if (!marca.equalsIgnoreCase("AMD") && 
            !marca.equalsIgnoreCase("INTEL") && 
            !marca.equalsIgnoreCase("NVIDIA") &&
			!marca.equalsIgnoreCase("MSI") &&
			!marca.equalsIgnoreCase("AFOX") &&
			!marca.equalsIgnoreCase("GIGABYTE") &&
			!marca.equalsIgnoreCase("ASUS") &&
			!marca.equalsIgnoreCase("XFX") &&
			!marca.equalsIgnoreCase("GALAX") &&
			!marca.equalsIgnoreCase("ROG") &&
			!marca.equalsIgnoreCase("ZOTAC") &&
			!marca.equalsIgnoreCase("MANCER")){
            throw new PlacaVidInvException("[ERRO] Marca Invalida. Marcas Validas -> [AMD][INTEL][NVIDIA][MSI][AFOX][GIGABYTE][ASUS][XFX][GALAX][ROG][ZOTAC][MANCER]");
        }
    } else if (this instanceof PlacaMae){
		if (!marca.equalsIgnoreCase("INTEL") &&
			!marca.equalsIgnoreCase("GIGABYTE") &&
			!marca.equalsIgnoreCase("MSI") && 
			!marca.equalsIgnoreCase("ASROCK") &&
			!marca.equalsIgnoreCase("BIOSTAR") &&
			!marca.equalsIgnoreCase("EVGA") &&
			!marca.equalsIgnoreCase("NZXT") &&
			!marca.equalsIgnoreCase("COLORFUL") &&
			!marca.equalsIgnoreCase("AFOX") &&
			!marca.equalsIgnoreCase("FOXCONN"))
			throw new PlacaMaeInvException("[ERRO] Marca Invalida. Marcas Validas -> [INTEL][GIGABYTE][ASROCK][BIOSTAR][EVGA][NZXT][COLORFUL][AFOX][FOXCOON][MSI]");
	}
		this.marca = marca.toUpperCase();
	}
	
	public void setModelo(String modelo) throws ProcModInvException{
		if (this instanceof Processador){
			if (marca.equalsIgnoreCase("AMD")){
				if (!modelo.toUpperCase().startsWith("RYZEN") && 
				!modelo.toUpperCase().startsWith("ATHLON") &&
				!modelo.toUpperCase().startsWith("A12") &&
				!modelo.toUpperCase().startsWith("A10") &&
				!modelo.toUpperCase().startsWith("A9") &&
				!modelo.toUpperCase().startsWith("A8") &&
				!modelo.toUpperCase().startsWith("A6") &&
				!modelo.toUpperCase().startsWith("A4")){
					throw new ProcModInvException("Modelo De Processador Errado! Modelos AMD [RYZEN] [ATHLON] [A12] [A10] [A9] [A8] [A6] [A4]");
				}
			}
		} if (this instanceof Processador){
			if (marca.equalsIgnoreCase("INTEL")){
				if (!modelo.toUpperCase().startsWith("INTEL") && 
				!modelo.toUpperCase().startsWith("CORE") &&
				!modelo.toUpperCase().startsWith("PENTIUM") &&
				!modelo.toUpperCase().startsWith("CELERON")){
					throw new ProcModInvException("Modelo De Processador Errado! Modelos INTEL [INTEL] [CORE] [PENTIUM] [CELEROM]");
				}
			}
		}
		this.modelo = modelo.toUpperCase();
	}
	
	public void setAno(int ano) throws AnoInvException {
    if (ano < 2015) {
        throw new AnoInvException("Produto Muito Velho, Só Comercializamos Produtos A Partir De 2015");
		}
		this.ano = ano;
	}
	
	public void setPreco(float preco) throws PrecoInvException{
		if (preco <= 0) {
			throw new PrecoInvException("[ERRO] Preço não pode ser igual a 0 ou negativo.");
		}
		this.preco = preco;
	}
	
	public void setDataGarantia(String dataGarantia){
		this.dataGarantia = dataGarantia.toUpperCase();
	}
}