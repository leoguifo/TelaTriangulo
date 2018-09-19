package telatriangulo;

public class TelaTriangulo {

    public static void main(String args[]) {
        //Instanciando a classe Triangulo.
        Triangulo t = new Triangulo();
        
        //Foi dividido o codigo principal em metodos, aonde cada um ficou responsável
        //por executar uma função e não na main tudo junto.
        t.make().setHipotenusa().setResultado().printResultado();
    }

}
