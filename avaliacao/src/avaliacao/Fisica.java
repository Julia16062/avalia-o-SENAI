
package avaliacao;


public abstract class Fisica {
   
    protected int idade;
    protected Genero genero;

    public Fisica(int idade, Genero genero) {
        this.idade = idade;
        this.genero = genero;
    }

    
    public Fisica() {
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
 
    }

    @Override
    public String toString() {
        return "Fisica{" + "idade=" + idade + ", genero=" + genero + '}';
    }
    
    
}
