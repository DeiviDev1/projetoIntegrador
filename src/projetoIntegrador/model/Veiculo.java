package projetoIntegrador.model;

public class Veiculo {

    private  int id;
    private String placa;
    private String cor;
    private String modelo;
    private int ano;
    private String combostivel;

    public Veiculo(int id, String placa, String cor, String modelo, int ano, String combostivel) {
        this.id = id;
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
        this.combostivel = combostivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCombostivel() {
        return combostivel;
    }

    public void setCombostivel(String combostivel) {
        this.combostivel = combostivel;
    }

    public void listar(){

    }

}


