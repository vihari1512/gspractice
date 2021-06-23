import java.util.*;

/**
 * Problem Statement:
 * You are an avid rock collector who lives in southern California. Some rare
 * and desirable rocks just became available in New York, so you are planning
 * a cross-country road trip. There are several other rare rocks that you could
 * pick up along the way.
 * <p>
 * You have been given a grid filled with numbers, representing the number of
 * rare rocks available in various cities across the country. Your objective
 * is to find the optimal path from So_Cal to New_York that would allow you to
 * accumulate the most rocks along the way.
 * <p>
 * Note: You can only travel either north (up) or east (right).
 * 2) Consider adding some additional tests in doTestsPass().
 * 3) Implement optimalPath() correctly.
 * 4) Here is an example:
 * ^
 * {{0, 0, 0, 0, 5}, New_York (finish)       N
 * {0, 1, 1, 1, 0},                     < W    E >
 * So_Cal (start)  {2, 0, 0, 0, 0}}                          S
 * v
 * The total for this example would be 10 (2 + 0 + 1 + 1 + 1 + 0 + 5).
 * <p>
 * Signature:
 * public static Integer optimalPath(Integer[][] grid) {
 * }
 * <p>
 * Test Cases:
 * Input :
 * {{0, 0, 0, 0, 5},
 * {0, 1, 1, 1, 0},
 * {2, 0, 0, 0, 0}};
 * Output: 10
 */
public class OptimalPath {



    static class Position {
        int row, col;

        public Position(int x, int y) {
            row = x;
            col = y;
        }
    }
    static Map<Position,Integer> cache = new HashMap<>();

    public static Integer optimalPath(Integer[][] grid) {
        return countOfStones(grid, new Position(0, 0), 0);
    }

    static boolean isValid(Position currentPosition, Integer[][] grid) {
        if (currentPosition.row < 0
                || currentPosition.row > grid.length-1
                || currentPosition.col < 0
                || currentPosition.col > grid[0].length-1 ) {
            return false;
        }
        return true;
    }

    public static int countOfStones(Integer[][] grid, Position currentPosition, int count) {
        if (isValid(currentPosition, grid)) {
            if(cache.get(currentPosition)!=null)
            {
                return cache.get(currentPosition);
            }
            if (currentPosition.row == grid.length-1 && currentPosition.col == grid[0].length-1) {
                return count + grid[currentPosition.row][currentPosition.col];
            }

            int countOfPath1 = countOfStones(grid, new Position(currentPosition.row, currentPosition.col + 1)
                    , count+ grid[currentPosition.row][currentPosition.col]);
            int countOfPath2 = countOfStones(grid, new Position(currentPosition.row + 1, currentPosition.col), count+ grid[currentPosition.row][currentPosition.col]);
            cache.put(currentPosition,Math.max(countOfPath1, countOfPath2));
            return cache.get(currentPosition);
        }
        return count;
    }

    public static void main(String args[]) {
        Integer[][] grid = new Integer[][]{
                {2, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 5}
        };
        Integer [][] grid1 = new Integer[][]{
                {1,2},
                {1,5}
        };
        System.out.println(optimalPath(grid));
        System.out.println("");

    }
}
