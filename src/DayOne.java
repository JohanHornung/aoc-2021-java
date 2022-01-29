import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class DayOne {
    public static void main(String[] args) throws Exception {
        String path = "input/input1.txt";
        System.out.println(PartOne(path)); // 1713
        System.out.println(PartTwo(path)); // 1734
    };
    public static int PartOne(String path) throws FileNotFoundException {
        // PART - 1
        // file instance
        File input = new File(path);
        // using Scanner.read()
        Scanner sc = new Scanner(input);
        // reading until whole content is read
        ArrayList<Integer> measurements = new ArrayList<>();
        int increase = 0;
        while (sc.hasNextInt()) {
            measurements.add(sc.nextInt());
        }    
        for (int i = 1; i < measurements.size(); i++) {
            if (measurements.get(i-1) < measurements.get(i)) increase++;
            
        }
        sc.close();
        return increase;
    };
    public static int PartTwo(String path) throws FileNotFoundException {
        // file instance
        File input = new File(path);
        // using Scanner.read()
        Scanner sc = new Scanner(input);
        // reading until whole content is read
        ArrayList<Integer> measurements = new ArrayList<>();
        int increase = 0;
        while (sc.hasNextInt()) {
            measurements.add(sc.nextInt());
        }
        sc.close();
        
        final int n = measurements.size();
        increase = 0;
        int firstWindow = 0;
        int secondWindow = 0;
        for (int i = 0; i < n; i++) {
            if (i + 3 < n) {
                // Windows of size 3 shifted by 1
                firstWindow = measurements.get(i) + measurements.get(i + 1) + measurements.get(i + 2) ;
                secondWindow = measurements.get(i + 1) + measurements.get(i + 2) + measurements.get(i + 3); 
                
                if (firstWindow < secondWindow) increase++;
            }
        }
        return increase;
    }

}
