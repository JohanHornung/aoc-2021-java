import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
// import java.lang.reflect.Array;

public class DayTwo {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("input/input2.txt");
        // using Scanner
        Scanner sc = new Scanner(input);

        System.out.println(partOne(sc)); // 1692075
        System.out.println(partTwo(sc)); // 1749524700
    };
    public static int partOne(Scanner sc) throws FileNotFoundException{
        // horizontal position and depth
        int x = 0;
        int y = 0;
        int aim = 0;
        ArrayList<String> instructions = new ArrayList<>();

        while (sc.hasNextLine()) {
            instructions.add(sc.nextLine());
        }
        for (String e: instructions) {
            String instruction = e.split(" ")[0];
            int move = Integer.parseInt(e.split(" ")[1]);
            // Instruction set for Part 2
            switch (instruction) {
                case "down":
                    aim += move;
                    break;
                case "forward":
                    x += move;
                    y += aim * move;
                    break;
                default: // up
                    aim -= move;
                    break;
            };
        };
        return x * y;    
    };
    public static int partTwo(Scanner sc) throws FileNotFoundException{
        return 0;    
    }
}
