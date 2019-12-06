package com.acat.lijingwen.December;

public class Bubble_sort {
    //八大排序之冒泡
    //这里引入判别变量  这样可以节省时间 资源    （判别的依据是判别这个数组的顺序是是不是还继续进行了交换   停止改变则表示排序ok了）
    public static void bubbleJian(int temp[]){
        int count=0;
        for (int i=0;i<temp.length;i++){
            int isChange=0;
            for(int j=i;j<temp.length-i-1;j++){
                if(temp[j]>temp[j+1]){
                    int var = 0;
                    var = temp[j];
                    temp[j]=temp[j+1];
                    temp[j+1]=var;
                    isChange=1;
                }
            }
            if(isChange == 0 ){
                 break;
            }
            count++;
            System.out.println("交换排序了"+count+"次");
        }
        for (int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    }

//归并


    public static void main(String args[]){
        int temp []={2, 3, 4, 511, 66, 777, 444, 555, 9999};
        bubbleJian(temp);


    }
}
