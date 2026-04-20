//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    

        public static void main(String[] args) {
            sumaElementos();
            numeroMayor();
            contarPares();
            invertirArreglo();
            eliminarDuplicados();
        }

        // 1. Suma de elementos
        public static void sumaElementos() {
            int[] numeros = {5, 10, 15, 20};
            int suma = 0;

            for (int i = 0; i < numeros.length; i++) {
                suma += numeros[i];
            }

            System.out.println("1. Suma: " + suma);
        }

        // 2. Número mayor
        public static void numeroMayor() {
            int[] numeros = {3, 8, 2, 15, 7};
            int mayor = numeros[0];

            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > mayor) {
                    mayor = numeros[i];
                }
            }

            System.out.println("2. Mayor: " + mayor);
        }

        // 3. Contar pares
        public static void contarPares() {
            int[] numeros = {1, 2, 3, 4, 5, 6};
            int contador = 0;

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 == 0) {
                    contador++;
                }
            }

            System.out.println("3. Pares: " + contador);
        }

        // 4. Invertir arreglo
        public static void invertirArreglo() {
            int[] numeros = {1, 2, 3, 4};
            int[] invertido = new int[numeros.length];

            for (int i = 0; i < numeros.length; i++) {
                invertido[i] = numeros[numeros.length - 1 - i];
            }

            System.out.print("4. Invertido: ");
            for (int i = 0; i < invertido.length; i++) {
                System.out.print(invertido[i] + " ");
            }
            System.out.println();
        }

        // 5. Eliminar duplicados
        public static void eliminarDuplicados() {
            int[] numeros = {1, 2, 2, 3, 4, 4, 5};
            int[] sinDuplicados = new int[numeros.length];
            int contador = 0;

            for (int i = 0; i < numeros.length; i++) {
                boolean repetido = false;

                for (int j = 0; j < contador; j++) {
                    if (numeros[i] == sinDuplicados[j]) {
                        repetido = true;
                        break;
                    }
                }

                if (!repetido) {
                    sinDuplicados[contador] = numeros[i];
                    contador++;
                }
            }

            System.out.print("5. Sin duplicados: ");
            for (int i = 0; i < contador; i++) {
                System.out.print(sinDuplicados[i] + " ");
            }
            System.out.println();
        }
    }