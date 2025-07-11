public class Main {

    public static int comparator(float marksarray[][], int index1, int index2) {
        double rms1 = Math.sqrt(0.5 * (marksarray[index1][0] * marksarray[index1][0] + marksarray[index1][1] * marksarray[index1][1]));
        double rms2 = Math.sqrt(0.5 * (marksarray[index2][0] * marksarray[index2][0] + marksarray[index2][1] * marksarray[index2][1]));

        if (rms1 > rms2)
            return -1;
        else if (rms1 < rms2)
            return 1;
        else {
            if (marksarray[index1][1] > marksarray[index2][1])
                return -1;
            else if (marksarray[index1][1] < marksarray[index2][1])
                return 1;
            else
                return 0;
        }
    }

    public static int selectionSort2(float array[][], int numElements) {
        int break_point = numElements - 1;
        while (break_point > 0 && comparator(array, break_point - 1, break_point) <= 0) {
            break_point--;
        }

        for (int i = 0; i < break_point; i++) {
            int min = i;
            for (int j = i + 1; j < break_point; j++) {
                if (comparator(array, j, min) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                float temp0 = array[i][0], temp1 = array[i][1];
                array[i][0] = array[min][0]; array[i][1] = array[min][1];
                array[min][0] = temp0; array[min][1] = temp1;
            }
        }
        return break_point;
    }

    public static int merge(float sortedarray[][], float mergedarray[][], int break_point, int numElements) {
        int i = 0, j = break_point, k = 0;

        while (i < break_point && j < numElements) {
            int cmp = comparator(sortedarray, i, j);
            if (cmp == 0) {
                mergedarray[k][0] = sortedarray[i][0];
                mergedarray[k][1] = sortedarray[i][1];
                k++; i++; j++;
            } else if (cmp < 0) {
                mergedarray[k][0] = sortedarray[i][0];
                mergedarray[k][1] = sortedarray[i][1];
                k++; i++;
            } else {
                mergedarray[k][0] = sortedarray[j][0];
                mergedarray[k][1] = sortedarray[j][1];
                k++; j++;
            }
        }

        while (i < break_point) {
            mergedarray[k][0] = sortedarray[i][0];
            mergedarray[k][1] = sortedarray[i][1];
            k++; i++;
        }

        while (j < numElements) {
            mergedarray[k][0] = sortedarray[j][0];
            mergedarray[k][1] = sortedarray[j][1];
            k++; j++;
        }

        return k;
    }

    public static void main(String[] args) {
        float studentmarks[][] = {
            {90, 30},   
            {60, 20},   
            {30, 40},   
            {60, 20},   
            {10, 90},   
            {0, 100}    
        };

        int numStudents = studentmarks.length;
        int break_point = selectionSort2(studentmarks, numStudents);

        System.out.println("After partial sort:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println(studentmarks[i][0] + "\t" + studentmarks[i][1]);
        }

        float merged[][] = new float[numStudents][2];
        int mergedCount = merge(studentmarks, merged, break_point, numStudents);

        System.out.println("\nAfter merge (removing duplicates):");
        for (int i = 0; i < mergedCount; i++) {
            System.out.println(merged[i][0] + "\t" + merged[i][1]);
        }

        System.out.println("\nTotal unique rows after merge: " + mergedCount);
    }
}
