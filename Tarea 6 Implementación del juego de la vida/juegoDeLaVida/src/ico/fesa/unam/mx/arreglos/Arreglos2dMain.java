package ico.fesa.unam.mx.arreglos;

class Main {

    public static void main(String[] args) {
        Array2d rejilla = new Array2d(6, 6);
        rejilla.clear('0');


        rejilla.setItem(1, 2, 'M');
        rejilla.setItem(2, 2, 'M');
        rejilla.setItem(3, 2, 'M');

        System.out.println("Estado Inicial:");
        System.out.println(rejilla);


        for (int gen = 0; gen < 5; gen++) {
            rejilla = siguienteGeneracion(rejilla);
            System.out.println("Generación " + (gen + 1) + ":");
            System.out.println(rejilla);
        }
    }


    public static Array2d siguienteGeneracion(Array2d actual) {
        Array2d nueva = new Array2d(actual.getRowSize(), actual.getColSize());
        nueva.clear('0');  // Inicializamos la nueva rejilla con células muertas

        for (int i = 0; i < actual.getRowSize(); i++) {
            for (int j = 0; j < actual.getColSize(); j++) {
                int vecinosVivos = contarVecinosVivos(actual, i, j);
                char estadoActual = actual.getItem(i, j);


                if (estadoActual == 'M') {
                    if (vecinosVivos == 2 || vecinosVivos == 3) {
                        nueva.setItem(i, j, 'M');  // La célula sobrevive
                    } else {
                        nueva.setItem(i, j, '0');  // La célula muere
                    }
                } else {
                    if (vecinosVivos == 3) {
                        nueva.setItem(i, j, 'M');  // Una célula muerta revive
                    }
                }
            }
        }

        return nueva;
    }


    public static int contarVecinosVivos(Array2d rejilla, int ren, int col) {
        int vecinosVivos = 0;
        int[] direcciones = {-1, 0, 1};


        for (int i : direcciones) {
            for (int j : direcciones) {
                if (!(i == 0 && j == 0)) {
                    int vecinoRen = ren + i;
                    int vecinoCol = col + j;

                    // Verificar si el vecino está dentro de los límites de la rejilla
                    if (vecinoRen >= 0 && vecinoRen < rejilla.getRowSize() &&
                            vecinoCol >= 0 && vecinoCol < rejilla.getColSize()) {

                        if (rejilla.getItem(vecinoRen, vecinoCol) == 'M') {
                            vecinosVivos++;
                        }
                    }
                }
            }
        }

        return vecinosVivos;
    }
}
