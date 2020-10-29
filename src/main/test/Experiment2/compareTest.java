package Experiment2;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class compareTest {

    final private static int vertex = 30;         //点数
    final private static double threshold = 0.2;   //断边概率
    final private static int MAX = 100;            //权值最大值
    final private static int MIN = 1;              //权值最小值
    final private static int[][] b = new int[vertex + 1][vertex + 1];    //邻接矩阵

    Back4TSP back4TSP = new Back4TSP();
    BB4TSP bb4TSP = new BB4TSP();

    @BeforeClass
    public static void initialize() {   //初始化一次邻接矩阵

        for (int j : IntStream.range(0, vertex + 1).toArray()) {
            b[0][j] = -1;
        }

        for (int i : IntStream.range(1, vertex + 1).toArray()) {
            for (int j : IntStream.range(0, vertex + 1).toArray()) {
                if (j == 0 || Math.random() < threshold || i == j) {    //一定概率无边
                    b[i][j] = -1;
                } else {
                    b[i][j] = (int) (Math.random() * (MAX - MIN) + MIN);    //其他情况随机权值
                }
            }
        }

//        for (int i : IntStream.range(0, vertex + 1).toArray()) {
//            System.out.println(Arrays.toString(b[i]));              //检查
//        }
    }

    @Test(timeout = 10000)
    public void testBack4TSP() {
        back4TSP.backtrack4TSP(b, vertex);
    }

    @Test(timeout = 10000)
    public void testBb4TSP() {
        bb4TSP.bb4TSP(b, vertex);
    }

}
