public class Estagiario extends Vendedor{

        public Estagiario(String nome) {
            super.nome = nome;
            super.PONTOS_POR_VENDA = 5;
        }

        @Override
        public int calcularPontos() {
            return this.PONTOS_POR_VENDA*this.vendas;
        }

        public String mostrarCategoria(){
            int quantidadePontos = this.calcularPontos();
            if(quantidadePontos<50){
                return "Estagiario: " + this.nome + " Pontos: " + quantidadePontos + " categoria: novato";
            }
            else{
                return "Estagiario: " + this.nome + " Pontos: " + quantidadePontos + " categoria: experiente";
            }
        }
    }
