package entidade;

public class Cliente {

	private int CODIGO;
	private String NOME;
	private String ENDERECO;
	private String CPF;
	private String RG;
	private String SEXO;
	private int DEVE;

	public Cliente(int CODIGO, String NOME, String ENDERECO, String CPF, String RG, String SEXO, int DEVE) {
		this.CODIGO = CODIGO;
		this.NOME = NOME;
		this.ENDERECO = ENDERECO;
		this.CPF = CPF;
		this.RG = RG;
		this.SEXO = SEXO;
		this.DEVE = DEVE;
	}

	public int getCODIGO() {
		return CODIGO;
	}

	public void setCODIGO(int cODIGO) {
		CODIGO = cODIGO;
	}

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String nOME) {
		NOME = nOME;
	}

	public String getENDERECO() {
		return ENDERECO;
	}

	public void setENDERECO(String eNDERECO) {
		ENDERECO = eNDERECO;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF= cPF;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getSEXO() {
		return SEXO;
	}

	public void setSEXO(String sEXO) {
		SEXO = sEXO;
	}

	public int getDEVE() {
		return DEVE;
	}

	public void setDEVE(int dEVE) {
		DEVE = dEVE;
	}

	public Cliente() {
		super();
	}

}
