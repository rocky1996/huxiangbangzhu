package com.acat.wujinfan.other;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-06-06
 */

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * 剑指offer中提供的思路其实要更容易一些，首先分析循环结束的条件，打印第一圈左上角坐标为（0，0），第二圈左上角坐标为（1，1），
 * 以此类推每次循环的行列起始坐标都是相同的(start,start)。因此可以分析出循环继续的条件是columns > startX*2并且rows > startY*2。
 * 有了循环继续的条件后，我们要分析每次循环那4步的前提条件。第一步肯定是必定会经过的，因为打印一圈至少有一步。第二步的前提是终止行号大于起始行号，
 * 第三步的前提是终止行号大于起始行号，终止列号大于起始列号，因为圈内至少有2行2列，第四步的前提条件是终止行号比起始行号至少大2，终止列号大于起始行号，
 * 即至少有3行2列。代码如下：
 * ————————————————
 * 版权声明：本文为CSDN博主「yyyyyhu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/huyang0304/java/article/details/82314837
 */
public class Test1 {

    /**
     * 1,  2,  3,  4,
     * 5,  6,  7,  8,
     * 9,  10, 11, 12,
     * 13, 14, 15, 16,
     *
     * @param matrix
     * @return
     */
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix == null)
            return list;
        int start = 0;
        while (matrix[0].length > start * 2 && matrix.length > start * 2) {
            printMatrixInCircle(matrix, start, list);
            start++;
        }
        return list;
    }

    private void printMatrixInCircle(int[][] matrix, int start, ArrayList<Integer> list) {
        int endX = matrix[0].length - 1 - start;  //列
        int endY = matrix.length - 1 - start;  //行
        //从左往右
        for (int i = start; i <= endX; i++) {
            list.add(matrix[start][i]);
        }
        //从上往下
        if (start < endY) {
            for (int i = start + 1; i <= endY; i++) {
                list.add(matrix[i][endY]);
            }
        }
        // 从右往左（判断是否会重复打印）
        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; i--)
                list.add(matrix[endY][i]);
        }
        // 从下往上（判断是否会重复打印）
        if (start < endX && start < endY - 1) {
            for (int i = endY - 1; i >= start + 1; i--)
                list.add(matrix[i][start]);
        }

    }
}
