import java.util.Arrays;

public class HomeWorkApp {

    public static void main(String args[]) {
        changeArray();
        createArray();
        changeArray2();
        changeArray3();
        int[] msv = returnArray(6, 8);
        System.out.println("Получился массив " + Arrays.toString(msv));
        findMinAndMax();
        int[] msv7 = new int[]{1, 1, 3, 4, 4, 3, 2};
        boolean flag1 = isСheckBalance(msv7);
        System.out.println("Сумма левой и правой части равны - " + flag1);
        shiftArray(msv7, -1);

    }

    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void changeArray() {
        System.out.println("Задание №1");
        int[] msv = new int[8];
        msv[0] = 1;
        msv[1] = 1;
        msv[2] = 0;
        msv[3] = 0;
        msv[4] = 0;
        msv[5] = 0;
        msv[6] = 1;
        msv[7] = 1;
        System.out.println("Был массив - " + Arrays.toString(msv));
        for (int i = 0; i < msv.length; i++) {
            if (msv[i] == 0) {
                msv[i] = 1;
            } else {
                msv[i] = 0;
            }
        }
        System.out.println("Получился массив - " + Arrays.toString(msv));
        System.out.println();
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    private static void createArray() {
        System.out.println("Задание №2");
        int[] msv;
        msv = new int[100];
        for (int a = 0; a < 100; a++) {
            msv[a] = (a + 1);
        }
        System.out.println("Получился массив " + Arrays.toString(msv));
        System.out.println();
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static void changeArray2() {
        System.out.println("Задание №3");
        int[] msv = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Был массив - " + Arrays.toString(msv));
        for (int i = 0; i < msv.length; i++) {
            if (msv[i] < 6) {
                msv[i] = msv[i] * 2;
            } else {
            }
        }
        System.out.println("Получился массив " + Arrays.toString(msv));
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    private static void changeArray3() {
        System.out.println();
        System.out.println("Задание №4. Исходный массив");
        int[][] doubleArr = new int[4][4];
        for (int i = 0; i < doubleArr.length; i++) {
            String text = Arrays.toString(doubleArr[i]);
            System.out.println(text);
        }
        for (int i = 0; i < doubleArr.length; i++) {
            for (int j = 0; j < doubleArr[i].length; j++) {
                if (i == j || i + j == (doubleArr.length - 1)) {
                    doubleArr[i][j] = 1;
                } else {
                }
            }
        }
        System.out.println("Полученный массив");
        for (int i = 0; i < doubleArr.length; i++) {
            String text = Arrays.toString(doubleArr[i]);
            System.out.println(text);
        }
        System.out.println();
    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
// типа int длиной len, каждая ячейка которого равна initialValue;
    private static int[] returnArray(int len, int initialValue) {
        System.out.println("Задание №5");
        int[] msv;
        msv = new int[len];
        for (int a = 0; a < msv.length; a++) {
            msv[a] = initialValue;
        }
        return msv;
    }

    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы
    private static void findMinAndMax() {
        System.out.println();
        System.out.println("Задание №6");
        int[] msv = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = msv[0];
        int min = msv[0];
        System.out.println("Есть массив - " + Arrays.toString(msv));
        for (int i = 0; i < msv.length; i++) {
            if (msv[i] > max) {
                max = msv[i];
            } else {
            }
        }
        System.out.println("Максимальное значение в массиве - " + max);
        for (int i = 0; i < msv.length; i++) {
            if (msv[i] < min) {
                min = msv[i];
            } else {
            }
        }
        System.out.println("Минимальное значение в массиве - " + min);
        System.out.println();
    }


    //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//**Примеры:
//checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
//checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
//граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

// Окончательно смог разобраться только после просмотра разбора домашки.
// Зациклился в поиске способа установить границу суммы, поскольку одним циклом считал левую сумму,
// а вторым правую сумму от конца массива. И в конце все время возвращалось TRUE суммы всего массива, естественно были равны.


//    private static boolean isСheckBalance(int [] msv7) {
//        System.out.println("Задание №7");
//        System.out.println("Есть массив - " + Arrays.toString(msv7));
//        int summl = 0;
//        for (int i = 0; i < msv7.length; i++) {
//            summl = summl + msv7[i];
//
//            int summr = 0;
//            for (int j = msv7.length - 1; j >= 0; j--) {
//                summr = summr + msv7[j];
//            }
//            if (summl == summr) {
//                return (true);
//            }
//        }return (false);
//    }
    // Да и вообще с циклами внутри цикла пока что сложно
    // потому что была и такая итерация !!!
    // Там суммы внутри циклов вообще какие то фантастические значения имели

//     private static boolean isСheckBalance(int [] msv7) {
//        System.out.println("Задание №7");
//        System.out.println("Есть массив - " + Arrays.toString(msv7));
//        int summl = 0;
//        int summr = 0;
//        for (int i = 0; i < msv7.length; i++)
//            for (int j = msv7.length - 1; j >= 0; j--) {
//            summl = summl + msv7[i];
//            summr = summr + msv7[j];
//            }
//            if (summl == summr) {
//                return (true);
//            } else {
//                return (false);
//            }
//        }

    private static boolean isСheckBalance(int [] msv7) {
        System.out.println("Задание №7");
        System.out.println("Есть массив - " + Arrays.toString(msv7));
        int summl = 0;
        for (int i = 0; i < msv7.length; i++) {
            summl = summl + msv7[i];

            int summr = 0;
            for (int j = (i + 1); j < msv7.length; j++) {
                summr = summr + msv7[j];
            }
            if (summl == summr) {
                    return (true);
            }
            }return (false);
    }


//8. *** Написать метод, которому на вход подается одномерный массив и число n
// (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
// Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
// Примеры:
// [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
// При каком n в какую сторону сдвиг можете выбирать сами.

    // В этом задании дошел до этого момента и все.
    // Сам зациклился и завис
    // 1. Получилась какая-то инверсия относительно примера. НО в задании есть такое условие "При каком n в какую сторону сдвиг можете выбирать сами"))
    // 2. Цикл внури цикла пока остается непонятной магией)))
    // Естественно ПОСЛЕ просмотра разбора домашки все стало понятно ))))

    private static void shiftArray(int[] msv7, int n) {
        System.out.println();
        System.out.println("Задание №8");
        System.out.println("Был массив - " + Arrays.toString(msv7));
        if (n > 0) {
            int buffer = msv7[0];
            System.out.println("Массив будет смещен влево на "+n+ " шаг");
            for (int i = 0; i < msv7.length; i++) {
                if (i < msv7.length - 1) {
                    msv7[i] = msv7[i + n];
                } else if (i == msv7.length - 1) {
                    msv7[i] = buffer;
                } else {
                }
            }
        } else {
            int buffer = msv7[msv7.length-1];
            System.out.println("Массив будет смещен вправо на "+n+ " шаг");
                for (int i = msv7.length-1; i >= 0; i--) {
                    if (i > 0) {
                        msv7[i] = msv7[i + n];
                    } else if (i == 0) {
                        msv7[i] = buffer;
                    } else {}
                }
        }
            System.out.println("Получился массив - " + Arrays.toString(msv7));
    }
}
