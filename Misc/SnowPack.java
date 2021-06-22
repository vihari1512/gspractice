/**
 * Problem Statement:
 * Given an array of non-negative integers representing the elevations
 *   from the vertical cross section of a range of hills, determine how
 *   many units of snow could be captured between the hills.
 *
 *   See the example array and elevation map below.
 *                                 ___
 *             ___                |   |        ___
 *            |   |        ___    |   |___    |   |
 *  *        ___|   |    ___|   |   |   |   |   |   |
 *     ___|___|___|___|___|___|___|___|___|___|___|___
 *    { 0,  1,  3,  0,  1,  2,  0,  4,  2,  0,  3,  0 }
 *
 *                                 ___
 *             ___                |   |        ___
 *            |   | *   *  _*_  * |   |_*_  * |   |
 *  *        ___|   | *  _*_|   | * |   |   | * |   |
 *     ___|___|___|_*_|___|___|_*_|___|___|_*_|___|___
 *    { 0,  1,  3,  0,  1,  2,  0,  4,  2,  0,  3,  0 }
 *
 *   Solution: In this example 13 units of snow (*) could be captured.
 *
 * Signature: public static Integer computeSnowpack(Integer[] arr) {
 * }
 * Test Cases:
 * Input : {0, 1, 3, 0, 1, 2, 0, 4, 2, 0, 3, 0}
 * Output: 13
 *
 * Input : {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}
 * Output:10
 */
public class SnowPack
{
    public static Integer computeSnowpack(Integer[] arr)
    {
        int[] lmax = new int[arr.length];
        int[] rmax = new int[arr.length];
        lmax[0]=0;
        rmax[0]=0;
        lmax[arr.length-1]=0;
        rmax[arr.length-1]=0;
        int currentMax=-1;
        for(int i=1;i<arr.length-1;i++)
        {
            currentMax=currentMax<arr[i-1]?arr[i-1]:currentMax;
            lmax[i]=currentMax;
        }
        currentMax=0;
        for (int j=arr.length-2;j>0;j--)
        {
            currentMax = currentMax<arr[j+1]?arr[j+1]:currentMax;
            rmax[j]= currentMax;
        }
        int sumOfShowCollected =0;
        for(int i =1;i<arr.length-1;i++)
        {
            int collectedSnowOnHill = Math.min(lmax[i],rmax[i])-arr[i];
            if(collectedSnowOnHill<0)
            {
                continue;
            }
            sumOfShowCollected=sumOfShowCollected+collectedSnowOnHill;
        }
        return sumOfShowCollected;
    }

    public static void main(String args[])
    {
        System.out.println(computeSnowpack(new Integer[]{0, 1, 3, 0, 1, 2, 0, 4, 2, 0, 3, 0}));
        System.out.println(computeSnowpack(new Integer[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}));
    }
}
