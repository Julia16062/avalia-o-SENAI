
package avaliacao;


public class Engenheiro extends Funcionario{
   
    private String crea;

    public Engenheiro() {
    }

    public Engenheiro(String cpf, String rg, String matricula, double salário, Setor setor, int id, String nome, int idade, Genero genero, Endereco endereco) {
        super(cpf, rg, matricula, salário, setor, id, nome, idade, genero, endereco);
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro{" + "crea=" + crea + '}';
    }

    
    
}
