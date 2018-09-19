/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telatriangulo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author leonardo
 */
public class Triangulo {

    private double hipotenusa;
    private Scanner scan;
    private Set<String> propriedades;
    private double a, b, c;

    public Triangulo make() {
        // Dividido em make a parte na qual é responsável pela interação com o usuario.
        this.scan = new Scanner(System.in);
        this.propriedades = new HashSet<>();

        System.out.println("Informa o tipo do triangulo");
        System.out.println("Informa o valor do lado a:");
        this.a = this.scan.nextDouble();
        System.out.println("Informa o valor do lado b:");
        this.b = this.scan.nextDouble();
        System.out.println("Informa o valor do lado c:");
        this.c = this.scan.nextDouble();

        return this;
    }

    public Triangulo make(double a, double b, double c) {
        //Parte na qual foi utilizado o HashSet para setar as propriedades inseridas anteriormente.
        this.propriedades = new HashSet<>();

        this.a = a;
        this.b = b;
        this.c = c;

        return this;
    }

    public Triangulo setHipotenusa() {
        // Parte na qual forma o triangulo com os valores digitados.
        this.hipotenusa = this.a;
        if (this.hipotenusa < this.b) {
            this.hipotenusa = this.b;
        }
        if (this.hipotenusa < this.c) {
            this.hipotenusa = this.c;
        }

        return this;
    }

    public Triangulo setResultado() {
        // Parte de verificação do triangulo na qual retorna se é valido ou não e seu modelo.
        if ((this.a + this.b + this.c - this.hipotenusa) > this.hipotenusa) {
            this.propriedades.add("Válido");
            if (this.a == this.b || this.b == this.c || this.c == this.a) {
                if (this.a == this.b && this.b == this.c) {
                    this.propriedades.add("Equilátero");
                } else {
                    this.propriedades.add("Isósceles");
                }
            }
            if (this.a != this.b && this.b != this.c && this.c != this.a) {
                this.propriedades.add("Escaleno");
            }
        } else {
            this.propriedades.add("Inválido");
        }

        return this;
    }

    public void printResultado() {
        //Parte na qual imprime na tela o resultado obtido no metodo anterior.
        System.out.println("Propriedades do triangulo ->");
        this.propriedades.forEach((valor) -> {
            System.out.println(valor);
        });
    }

    public Set<String> getResultado() {
        return this.propriedades;
    }
}
