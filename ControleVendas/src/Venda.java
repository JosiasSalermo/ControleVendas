import java.time.LocalDate;

public class Venda {
    
    String nomeCliente;
    String descricaoProduto;
    String descricaoFornecedor;
    double valor;

    Venda(String nomeCliente, String descricaoProduto,String descricaoFornecedor,double valor){
        this.nomeCliente = nomeCliente;
        this.descricaoProduto = descricaoProduto;
        this.descricaoFornecedor = descricaoFornecedor;
        this.valor = valor;
    }

    String descricao(){

        LocalDate data = LocalDate.now(); 
        String linha_01 = data + " - " + descricaoProduto + " - " + "R$ " + valor;
        String linha_02 = "Cliente:" + nomeCliente;
        String linha_03 = "Fornecedor: " + descricaoFornecedor;
        String frase = linha_01 + "\n" + linha_02 + "\n" + linha_03;
        return frase;
    }
}
