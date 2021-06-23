import java.util.Arrays;

/**
 * Problem Statement:
 * Implement the ‘walk method. This method takes in a string, path,
 * where each character in the string corresponds to a potential movement
 * of the robot. The robot can move up, down, left, and right represented
 * by the characters ‘U', 'D', L', and 'R' respectively. All other
 * characters may be ignored. Assume the robot's initial position
 * is at (0,0). The output of this method is the robot's final x and y
 * coordinates relative to the initial position
 * Signature:
 * public static Integer[] walk(String path) {
 * }
 * <p>
 * Test Cases:
 * <p>
 * Input: (Blank)
 * Output: [0,0]
 * <p>
 * <p>
 * Input: L
 * Output: [-1,0]
 * <p>
 * Input: UUU
 * Output: [0,3]
 * <p>
 * Input: ULDR
 * Output: [0,0]
 */
public class WalkingRobot {
    public static Integer[] walk(String path)
    {
        int row=0,col=0;
        for(char c:path.toCharArray())
        {
            if(c=='U')
            {
                row=row+1;
            }
            else if(c=='D')
            {
                row=row-1;
            }
            else if(c=='L')
            {
                col=col-1;
            }
            else if(c=='R')
            {
                col=col+1;
            }
        }
        return new Integer[]{col,row};
    }
    public static void main(String args[])
    {
        Arrays.stream(walk("L")).forEach(System.out::print);
        System.out.println();
        Arrays.stream(walk("UUU")).forEach(System.out::print);
        System.out.println();
        Arrays.stream(walk("ULDR")).forEach(System.out::print);
        System.out.println();
    }

}
