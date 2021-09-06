package com.mwguerra.models;

public class Carro {
    public static String COR_PRETA = "preto espacial";
    public static String COR_BRANCA = "branco gelo";
    public static String COR_PRATA = "prata especial";
    public static String CAMBIO_AUTOMATICO = "automático";
    public static String CAMBIO_MANUAL = "manual";
    public static String DIRECAO_HIDRAULICA = "hidráulica";
    public static String DIRECAO_ELETRICA = "elétrica";
    public static String ENERGIA_ELETRICA = "elétrico";
    public static String ENERGIA_GASOLINA = "gasolina";
    public static String ENERGIA_FLEX = "flex";
    public static String ENERGIA_DIESEL = "diesel";

    // Dados gerais
    String nome;
    int portas;
    String cor;
    boolean conversivel;

    // Identificação
    String chassi;
    int anoFabricacao;

    // Direção
    String cambio;
    String direcao;

    // Motorização
    String motor;
    String energia;

    // Rodízios
    int eixos;
    int rodas;
    int pneus;
    int calotas;
    int parafusos;

    // Acessórios
    boolean cameraRe;
    boolean sensorEstacionamento;
    boolean kitMultimidia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getConversivel() {
        return conversivel ? "Sim" : "Não";
    }

    public void setConversivel(boolean conversivel) {
        this.conversivel = conversivel;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getEnergia() {
        return energia;
    }

    public void setEnergia(String energia) {
        this.energia = energia;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
        this.rodas = (eixos * 2) + 1;
        this.pneus = this.rodas;
        this.calotas = this.rodas;
        this.parafusos = eixos * 2 * 4;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public int getPneus() {
        return pneus;
    }

    public void setPneus(int pneus) {
        this.pneus = pneus;
    }

    public int getCalotas() {
        return calotas;
    }

    public void setCalotas(int calotas) {
        this.calotas = calotas;
    }

    public int getParafusos() {
        return parafusos;
    }

    public void setParafusos(int parafusos) {
        this.parafusos = parafusos;
    }

    public String getCameraRe() {
        return cameraRe ? "Sim" : "Não";
    }

    public void setCameraRe(boolean cameraRe) {
        this.cameraRe = cameraRe;
    }

    public String getSensorEstacionamento() {
        return sensorEstacionamento ? "Sim" : "Não";
    }

    public void setSensorEstacionamento(boolean sensorEstacionamento) {
        this.sensorEstacionamento = sensorEstacionamento;
    }

    public String getKitMultimidia() {
        return kitMultimidia ? "Toyota Multimedia 5.0" : "Não";
    }

    public void setKitMultimidia(boolean kitMultimidia) {
        this.kitMultimidia = kitMultimidia;
    }

    public Carro(String nome, String motor, String chassi, int anoFabricacao) {
        this.nome = nome;
        this.chassi = chassi;
        this.anoFabricacao = anoFabricacao;
        this.portas = 4;
        this.cor = COR_BRANCA;
        this.conversivel = false;
        this.cambio = CAMBIO_MANUAL;
        this.direcao = DIRECAO_ELETRICA;
        this.motor = motor;
        this.energia = ENERGIA_GASOLINA;
        setEixos(2);
        this.cameraRe = false;
        this.sensorEstacionamento = false;
        this.kitMultimidia = true;
    }

    public void imprimeValores() {
        System.out.println("\n## Dados gerais ###########################");
        System.out.println("Nome: " + nome);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.println("Chassi: " + chassi);
        System.out.println("Portas: " + portas);
        System.out.println("Cor: " + cor);
        System.out.println("Conversível: " + getConversivel());
        System.out.println("## Direção ################################");
        System.out.println("Câmbio: " + cambio);
        System.out.println("Direção: " + direcao);
        System.out.println("## Motorização ############################");
        System.out.println("Motor: " + motor);
        System.out.println("Energia: " + energia);
        System.out.println("## Eixos ##################################");
        System.out.println("Quantidade de eixos: " + eixos);
        System.out.println("Quantidade de rodas: " + rodas);
        System.out.println("Quantidade de pneus: " + pneus);
        System.out.println("Quantidade de calotas: " + calotas);
        System.out.println("Quantidade de parafusos de roda: " + parafusos);
        System.out.println("## Acessórios #############################");
        System.out.println("Câmera de ré: " + getCameraRe());
        System.out.println("Sensor de estacionamento: " + getSensorEstacionamento());
        System.out.println("Kit multimídia: " + getKitMultimidia());
    }
}
