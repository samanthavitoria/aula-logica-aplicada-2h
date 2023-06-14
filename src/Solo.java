import Planta.Planta;
import Semente.Semente;

public class Solo {
    //Atributos
    String Tipo Solo;
    String cor;
    boolean fertil;
    //Metodo
    public Planta gerarPlanta(Semente s1){
        Planta p1 = new Planta (s1);
        return p1;

    }

}
