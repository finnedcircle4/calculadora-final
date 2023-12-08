/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionunidad2;

public class CalculadoraNotas {

    float notas[];

    public CalculadoraNotas(float notas[]) {
        this.notas = notas;
    }

    public float sumatoriaNotas() {
        float suma = 0;
        for (int i = 0; i < this.notas.length; i++) {
            suma = suma + this.notas[i];
        }
        return suma;
    }

    public float promedioNotas() {
        float promedio = 0;
        for (int i = 0; i < this.notas.length; i++) {
            promedio = promedio + this.notas[i];
        }
        promedio = promedio / this.notas.length;
        return promedio;
    }

    public float notaMasAlta() {
        float mayor = this.notas[0];
        for (int i = 0; i < this.notas.length; i++) {
            if (this.notas[i] > mayor) {
                mayor = this.notas[i];
            }
        }
        return mayor;
    }

    public float notaMasBaja() {
        float menor = this.notas[0];
        for (int i = 0; i < this.notas.length; i++) {
            if (this.notas[i] < menor) {
                menor = this.notas[i];
            }
        }
        return menor;
    }

    public float moda() {
        int frecuencia = 0;
        int frecuenciaMasRepetido = 0;
        float masRepetida = this.notas[0];
        float auxiliar = this.notas[0];
        for (int i = 0; i < this.notas.length; i++) {
            auxiliar = this.notas[i];
            frecuencia = 0;
            for (int j = i; j < this.notas.length; j++) {
                if (auxiliar == this.notas[j]) {
                    frecuencia = frecuencia + 1;
                }
            }
            if (frecuencia > frecuenciaMasRepetido) {
                frecuenciaMasRepetido = frecuencia;
                masRepetida = auxiliar;
            }
        }
        return masRepetida;
    }

    public float[] ordenarCreciente() {
        float auxiliar = 0;
        for (int i = 0; i < this.notas.length; i++) {
            for (int j = i + 1; j < this.notas.length; j++) {
                if (this.notas[i] > this.notas[j]) {
                    auxiliar = this.notas[j];
                    this.notas[j] = this.notas[i];
                    this.notas[i] = auxiliar;
                }
            }
        }
        return this.notas;
    }

    public float[] ordenarDecreciente() {
        float auxiliar = 0;
        for (int i = 0; i < this.notas.length; i++) {
            for (int j = i + 1; j < this.notas.length; j++) {
                if (this.notas[i] < this.notas[j]) {
                    auxiliar = this.notas[j];
                    this.notas[j] = this.notas[i];
                    this.notas[i] = auxiliar;
                }
            }
        }
        return this.notas;
    }

    public String aprobacion() {
        float auxiliar = promedioNotas();
        if (auxiliar >= 3.94) {
            return "Aprobado";
        }
        return "Reprobado";
    }

    public void mostrarNotas() {
        for (int i = 0; i < this.notas.length; i++) {
            System.out.print(this.notas[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

}
