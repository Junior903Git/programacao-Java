package exe0;

public class Assistente extends Funcionario {
    private float horaExtra;
    public Assistente() {
        super();
    }
    public Assistente(String nome, String endereco, String cpf, float salario, float horaExtra) {
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }
    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public float calculaSalario() {
        return super.calculaSalario() + (50 * horaExtra);
    }

    @Override
    public String toString() {
        return "Assistente{" + "horaExtra=" + horaExtra +
                super.toString() + '}';
    }

}
