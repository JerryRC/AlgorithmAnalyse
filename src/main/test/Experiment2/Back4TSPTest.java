package Experiment2;

import org.junit.Assert;
import org.junit.Test;

public class Back4TSPTest {

    @Test
    public void testBacktrack4TSP() {
        Back4TSP back4TSP = new Back4TSP();
        int[][] b = {{-1, -1, -1, -1, -1}, {-1, -1, 9, 19, 13}, {-1, 21, -1, -1, 14}, {-1, 1, 40, -1, 17},
                {-1, 41, 80, 10, -1}};
        int n = 4;
        back4TSP.backtrack4TSP(b, n);
        Assert.assertEquals(34, back4TSP.bestc);

        b = new int[][]{{-1, -1, -1, -1, -1}, {-1, -1, 10, 6, 4}, {-1, 10, -1, 5, 10}, {-1, 6, 5, -1, 20},
                {-1, 4, 10, 20, -1}};
        n = 4;
        back4TSP.backtrack4TSP(b, n);
        Assert.assertEquals(25, back4TSP.bestc);

        b= new int[][]
                {{-1,-1,-1,-1,-1,-1},
                {-1, -1, 3, 1, 5, 8},
                {-1, 3, -1, 6, 7, 9},
                {-1, 1, 6, -1, 4, 2},
                {-1, 5, 7, 4, -1, 3},
                {-1, 8, 9, 2, 3, -1}};
        n=5;
        back4TSP.backtrack4TSP(b, n);
        Assert.assertEquals(16, back4TSP.bestc);
    }

}
