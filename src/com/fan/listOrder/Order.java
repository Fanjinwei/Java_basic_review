package com.fan.listOrder;

/**
 * @author fjw
 * @create 2020-11-25
 */
public class Order {
    public static void main(String[] args) {
        int[] data = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
//        bubbleOrder(data);
        int high = data.length - 1;
        quickSort(data,0,high);
    }

    /**
     * 冒泡排序
     *
     * @param array
     * @return
     */
    public static void bubbleOrder(int[] array) {

        int length = array.length;
        int temp = 0;
        //排序次数
        long leftTime = System.currentTimeMillis();
        for (int i = 1; i < length; i++) {
            //每次排序会有一个数字有序
            for (int j = 0; j < length - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        long rightTime = System.currentTimeMillis();
        System.out.println("完成排序消耗时间为：" + (rightTime - leftTime));
        for (int j = 0; j < length; j++) {
            System.out.print(array[j] + "  ");
        }
    }

    /**
     * 快速排序算法
     *
     * @param data
     */
    public static void quickSort(int[] data, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        //temp 就是基准位
        temp = data[low];
        System.out.println("基准位：" + temp);
        long leftTime = System.currentTimeMillis();
        while (i < j) {
            //先看右边，依次往左递减
            while (temp <= data[j] && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp >= data[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                System.out.println("交换：" + data[i] + "和" + data[j]);
                t = data[j];
                data[j] = data[i];
                data[i] = t;
                System.out.println(java.util.Arrays.toString(data));

            }
        }
        //最后将基准位与 i 和 j 相等位置的数字交换
        System.out.println("基准位" + temp + "和 i、j 相遇的位置" + data[i] + "交换");
        data[low] = data[i];
        data[i] = temp;
        System.out.println(java.util.Arrays.toString(data));

        //递归调用左半数组
        quickSort(data, low, j - 1);
        //递归调用右半数组
        quickSort(data, j + 1, high);
        long rightTime = System.currentTimeMillis();
        System.out.println("完成排序消耗时间为：" + (rightTime - leftTime));
    }
}
