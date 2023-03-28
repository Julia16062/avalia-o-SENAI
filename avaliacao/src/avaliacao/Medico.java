
package avaliacao;

public class Medico extends Funcionario{
  
    private String crm;

    public Medico() {
    }

    public Medico(String crm, String cpf, String rg, String matricula, double salário, Setor setor, int id, String nome, int idade, Genero genero, Endereco endereco) {
        super(cpf, rg, matricula, salário, setor, id, nome, idade, genero, endereco);
        this.crm = crm;
    }

 

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico{" + "crm=" + crm + '}';
    }

  


    
}