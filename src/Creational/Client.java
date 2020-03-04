package Creational;

import java.util.*;

public class Client {
    public int longestIncreasingPath(int[][] matrix) {
        int row = matrix.length;
        if (row == 0){
            return 0;
        }
        int maxLen = 0;
        int col = matrix[0].length;
        int[][] longestPath = new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                maxLen = Math.max(maxLen, currentLongestPath(matrix, longestPath, i, j));
            }
        }
        return maxLen;
    }

    private int currentLongestPath(int[][] matrix, int[][] longestLen, int x, int y){
        int maxLen = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[] deltaX = {0,0,1,-1};
        int[] deltaY = {1,-1,0,0};
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{x ,y});
        int level = 0;
        while (!que.isEmpty()){
            int size = que.size();
            level++;
            for (int i = 0; i < size; i++){
                int[] coord = que.poll();
                for (int j = 0; j < 4; j++){
                    int newX = coord[0] + deltaX[j];
                    int newY = coord[1] + deltaY[j];
                    if (shouldVisit(matrix, coord[0], coord[1], newX, newY)){
                        int nextMax = longestLen[newX][newY];
                        if (nextMax > 0){
                            maxLen = Math.max(maxLen, level + nextMax);
                        }else{
                            que.offer(new int[]{newX, newY});
                        }

                    }
                }
            }
        }
        return longestLen[x][y] = maxLen;
    }

    //1. boundary check
    //2. next node larger than current one
    //3. not been visited before
    private boolean shouldVisit(int[][] matrix, int x, int y, int newX, int newY){
        int row = matrix.length;
        int col = matrix[0].length;
        if (newX < 0 || newX >= row || newY < 0 || newY >= col){
            return false;
        }
        if (matrix[newX][newY] <= matrix[x][y]){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        String[] input = {"wrt","wrf","er","ett","rftt","te"};
//        alienOrder(input);
//        int[] a = new int[]{1,2};
//        int[] b = new int[]{1,2};
//        System.out.printf(String.valueOf(Arrays.equals(a,b)));
//        Set<int[]> set = new HashSet<>();
//        set.add(a);
//        System.out.printf(String.valueOf(set.contains(b)));
//        int[][] aa = new int[10][10];

    }
}