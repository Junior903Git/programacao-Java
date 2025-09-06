import exe0.Departamento;
import exe0.Professor;


public class MainProf {
    public static void main(String[] args) {
        Departamento dep1 = new Departamento("Recursos Humanos","RH");
        Professor prof1 = new Professor("Daniel",dep1);
        System.out.println(prof1.toString());
        Departamento dep2 = new Departamento("Analise Desenvolvimento de Sistemas","ADS");
        Professor prof2 = new Professor("Daniel",dep2);
        System.out.println(prof2.toString());

        }
    }
