public class lab_work_2 {

	// Вывод выровненного двумернго массива на экран 
    public static void print_arr(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.printf("%20s\t", arr[i][j]);
            System.out.printf("\n");
        }
    }

    // Подсчет и общего вывод общего числа иммигрантов
    public static void all_Imm_Quant(String[][] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i++)
            sum += Integer.parseInt(arr[i][1]);
        System.out.println("All immigrants quantity is " + sum);
    }

    // Подсчет и вывод общего процента иммигрантов
    public static void percent_Imm(String[][] arr) {
        double sum = 0;
        for (int i = 1; i < arr.length; i++)
            sum += Double.parseDouble(arr[i][2]);
        System.out.println("Persent of all immigrants is " + sum);
    }

    // Вычисление и отображение стран с самым высоким и самым низким процентом иммигрантов
    public static void percent_Max_Min(String[][] arr) {
        double max = -1, min = 101;
        String maxStr = "", minStr = "";
        for (int i = 1; i < arr.length; i++)
            if (max < Double.parseDouble(arr[i][3])) {
                max = Double.parseDouble(arr[i][3]);
                maxStr = arr[i][0];
            } else if (min > Double.parseDouble(arr[i][3])) {
                min = Double.parseDouble(arr[i][3]);
                minStr = arr[i][0];
            }
        System.out.println("Maximum immigrants in " + maxStr + " (" + Double.toString(max) + "%%"
                + ")\nMinimum immigrants in " + minStr + " (" + Double.toString(min) + "%%)");
    }

    // Вычисление и отображение общего процента иммигрантов в мире, приходящегося на эти страны
    public static void population(String[][] arr) {
        System.out.println(arr[0][0] + "\tPopulation");
        for (int i = 1; i < arr.length; i++) {
            int populat = (int) (Integer.parseInt(arr[i][1]) / Double.parseDouble(arr[i][3]) * 100);
            System.out.printf("%20s\t%10d\n", arr[i][0], populat);
        }
    }

    public static void main(String[] args) {
        String[][] arr = {  {"Country",             "Immigrants", "% total", "% population"},
                            {"United States",       "45785090", "19.8", "14.3"},
                            {"Russia",              "11048064", "4.8",  "7.7"},
                            {"Germany",             "9845244",  "4.3",  "11.9"},
                            {"Saudi Arabia",        "9060433",  "3.9",  "31.4"},
                            {"United Arab Emirates","7826981",  "3.4",  "83.7"},
                            {"United Kingdom",      "7824131",  "3.4",  "12.4"},
                            {"France",              "7439086",  "3.2",  "11.6"},
                            {"Canada",              "7284069",  "3.1",  "20.7"},
                            {"Australia",           "6468640",  "2.8",  "27.7"},
                            {"Spain",               "6466605",  "2.8",  "13.8"}};
        
        System.out.printf("1) Отображение данных таблицы:\n");
        print_arr(arr);
        
        System.out.printf("\n2) Отображение общего числа иммигрантов в этих странах:\n");
        all_Imm_Quant(arr);
        
        System.out.printf("\n3) Отображение общего процента иммигрантов в мире, приходящегося на эти страны:\n");
        percent_Imm(arr);
        
        System.out.printf("\n4) Отображение стран с самым высоким и самым низким процентом иммигрантов:\n");
        percent_Max_Min(arr);
        
        System.out.printf("\n5) Отображение оценки общей численности населения всех десяти стран:\n");
        population(arr);
    }
}