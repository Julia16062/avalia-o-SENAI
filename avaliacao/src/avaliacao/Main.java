
package avaliacao;


public class Main {
    
    public static void main(String[] args) {
        
    Advogado advogado = new Advogado("123456", "124565", "78594", 1, Setor.JURIDICO, 2, julia, 3, Genero.FEMININO, new Endereco(logradouro, numero, complemento, cep, cidade, UnidadeFederativa.ACRE));
    Medico medico = new Medico("23", "7484", "6564", "84594", 0, Setor.SAUDE, 0, julia, 0, Genero.FEMININO, new Endereco(logradouro, numero, complemento, cep, cidade, UnidadeFederativa.ACRE));
    Engenheiro engenheiro = new Engenheiro("493635", "743743", "784373", 0, Setor.ENGENHARIA, 0, nome, 0, Genero.FEMININO, new Endereco(logradouro, numero, complemento, cep, cidade, UnidadeFederativa.ACRE));   
    
    
    
    }
    
   
    
}
