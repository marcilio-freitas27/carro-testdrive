import java.util.Scanner;
public class TesteDrive{
    public static void main(String[] args) {
        // Ordem: PLaca, cor, portas, velMax, velAtual, ligado
        Carro carro = new Carro("QGK7022","Branco",4,120,0,false);
        Carro carro2 = new Carro("-","Verde",2,150,0,false);

        /*Para testar sua classe Carro, crie uma classe chamada TesteDrive. Nessa nova classe, 
        crie o método principal e nele instancie dois objetos do tipo Carro. Um com placa e outro sem placa. 
        Após a criação dos objetos, imprima a placa, a cor, a quantidade de portas, 
        a velocidade máxima e atual dos dois carros. Verifique se o que foi impresso está correto.
        */

        System.out.println("\nPrimeiro Carro: " + "\nCor: " + carro.verCor() + " \nPlaca: " + carro.verPlaca() + 
                           " \nPortas: " + carro.verQtdPortas() + " \nVelocidade máxima: " + carro.verVelocidadeMaxima() + 
                           " \nVelocidade atual: " + carro.verVelocidadeAtual());
        System.out.println("\nSegundo Carro: " + "\nCor: " + carro2.verCor() + " \nPlaca: " + carro2.verPlaca() + 
                           " \nPortas: " + carro2.verQtdPortas() + " \nVelocidade máxima: " + carro2.verVelocidadeMaxima() + 
                           " \nVelocidade atual: " + carro2.verVelocidadeAtual());
        
        /*Em seguida, teste frear os carros com eles desligados e imprima novamente as velocidades. 
        Verifique se as velocidades estão corretas. Depois, teste ligar os carros e novamente freá-los.
         Verifique mais uma vez as velocidades.
        */

        carro.desligar();
        carro2.desligar();

        carro.frear();
        carro.frear();
        
        System.out.println("\nPrimeiro Carro: Qual a velocidade? " + carro.verVelocidadeAtual() + "\nSegundo Carro: Qual a velocidade? " + carro2.verVelocidadeAtual());
        
        carro.ligar();
        carro2.ligar();
        carro.frear();
        carro.frear();

        System.out.println("\nPrimeiro Carro: Qual a velocidade? " + carro.verVelocidadeAtual() + "\nSegundo Carro: Qual a velocidade? " + carro2.verVelocidadeAtual());
    
        /*Ligue os carros, acelere suavemente um deles 50 vezes e abruptamente o outro.
         Verifique mais uma vez as velocidades e tente desligá-los. Verifique se estão desligados.
        */

        carro.ligar();
        carro2.ligar();

        for (int i = 0; i < 50; i++) {
            carro.acelerar();    
        }
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual a velocidade? ");
        int velocidade = teclado.nextInt();
        teclado.close();

        carro2.acelerar(velocidade);    

        System.out.println("\nPrimeiro Carro: Qual a velocidade? " + carro.verVelocidadeAtual() + "\nPrimeiro Carro: Qual a velocidade? " + carro2.verVelocidadeAtual());
        
        /*
        Por fim, reduza a velocidade dos carros até pará-los. Verifique se realmente estão parados. 
        Desligue os carros e verifique se foram desligados.
        */
        carro.desligar();
        carro2.desligar();

        System.out.println("\nPrimeiro Carro: Está ligado? " + carro.estaLigado()+ "\nSegundo Carro: Está ligado? " + carro2.estaLigado());
        
        for (int i = 0; i < 15; i++) {
            carro.frear();    
        }
        carro2.frear();

        System.out.println("\nPrimeiro Carro: Está parado? " + carro.estaParado()+ "\nSegundo Carro: Está parado? " + carro2.estaParado());
        
        carro.desligar();
        carro2.desligar();

        System.out.println("\nPrimeiro Carro: Está ligado? " + carro.estaLigado()+ "\nSegundo Carro: Está ligado? " + carro2.estaLigado());

    }
}
