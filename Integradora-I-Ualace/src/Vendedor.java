
//validação que usa propriedades de subclasse apenas!!
//Classe abstrata Vendedor - aqui vai o Template Method
public abstract class Vendedor {

    protected String nome;
    protected int vendas = 0;
    protected int PONTOS_POR_VENDA;

    public void vender(int qtdVendas){
        this.vendas += qtdVendas;
        System.out.println(this.nome +" realizou "+ qtdVendas + " vendas.");
    }

    /*Método que calcula os pontos do Vendedor de acordo com seus aspectos
    a serem considerados*/
    public abstract int calcularPontos();

    /*TEMPLATE METHOD - recebe o total de pontos calculados a partir
    da subclasse e valida cada item para retornar a categoria*/
    public String mostrarCategoria(){
        int quantidadePontos = this.calcularPontos();

        if(quantidadePontos<20){
            return "Vendedor: " + this.nome + " Pontos: " + quantidadePontos + " categoria: novato";
        }
        else if(quantidadePontos<31){
            return "Vendedor: " + this.nome + " Pontos: " + quantidadePontos + " categoria: aprendiz";
        }else if(quantidadePontos<40){
            return "Vendedor: " + this.nome + " Pontos: " + quantidadePontos + " categoria: bom";
        }else {
            return "Vendedor: " + this.nome + " Pontos: " + quantidadePontos + " categoria: mestre";
        }
    }
}





