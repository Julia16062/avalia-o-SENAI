
package avaliacao;


public class Advogado extends Funcionario{
    
    private String oab;

    public Advogado() {
    }

    public Advogado(String cpf, String rg, String matricula, double salário, Setor setor, int id, String nome, int idade, Genero genero, Endereco endereco) {
        super(cpf, rg, matricula, salário, setor, id, nome, idade, genero, endereco);
    }

    @Override
    public String toString() {
        return "Advogado{" + "oab=" + oab + '}';
    }
    
  

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

}