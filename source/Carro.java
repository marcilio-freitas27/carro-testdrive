
public class Carro{
    // atributos
    protected String placa, cor;
    protected int qtdPortas,velocidadeMaxima, velocidadeAtual;
    protected boolean ligado;

    //construtores
    public Carro(String placa, String cor, int qtdPortas, int velocidadeMaxima, int velocidadeAtual,boolean ligado){
        this.placa = placa;
        this.cor = cor;
        this.qtdPortas = qtdPortas;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }

    //metodos void
    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        if(this.velocidadeAtual == 0)
            this.ligado = false;
    }
    
    public void acelerar(){
        if (this.ligado == true){
            this.velocidadeAtual += 3;
        }
    }

    public void acelerar(int umaVelocidade){
        if (this.ligado == true){
            if(this.velocidadeAtual <= this.velocidadeMaxima){
                this.velocidadeAtual += umaVelocidade;
            }
        }
    }

    public void frear(){
        if(this.ligado == true){
            if (this.velocidadeAtual >= 10 ){
                this.velocidadeAtual -= 10;
            }else{
                this.velocidadeAtual -= this.velocidadeAtual; 
            }
        }
    }

    //metodos com identificado
    public boolean estaLigado(){
        return this.ligado;
    }
    
    public boolean estaParado(){
        return this.ligado;
    }

    public String verPlaca(){
        return this.placa;
    }

    public String verCor(){
        return this.cor;
    }

    public int verQtdPortas() {
        return this.qtdPortas;
    }

    public int verVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public int verVelocidadeAtual() {
        return this.velocidadeAtual;
    }
}
