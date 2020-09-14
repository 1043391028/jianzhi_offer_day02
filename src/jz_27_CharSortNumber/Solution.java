package jz_27_CharSortNumber;

//      题目：数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
//            由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。

//     核心思想：通过遍历数组，用变量count 计数，num表示上一个遍历的数，如果和num一样就+1；否则-1，count为0时，
//               更新num和count值，如果存在，最后留下来的num值一定是，因为它个数大于一半；
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array){
        if(array == null || array.length == 0) return 0;
        int num = array[0];
        int count = 1 ;
        for (int i= 1;i < array.length;i++){
            if(array[i] == num){
                count++;
            }else {
                count--;
                if(count == 0){
                    num = array[i];
                    count = 1;
                }
            }
        }
        int counts = 0;
        for(int i = 0;i < array.length; i++){
            if(array[i] == num){
                counts++;
            }
        }
        return (counts > array.length/2)?num:0;

    }

}
