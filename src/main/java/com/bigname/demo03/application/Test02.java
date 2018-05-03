package com.bigname.demo03.application;

public class Test02 {
    public static void main(String arg[]) {
        System.out.println("kk");
        drawF();
    }

    // 话三角形
    private static void drawTrign() {
        for (int i = 0;i<4;i++){
            for (int y=0;y<i;y++){
                System.out.print("*");
            }
            System.out.println();        }
    }

    private static void drawF () {
        // 画上半三角形
        int h = 5 / 2 + 1;
        for (int i = 0; i < h; i++) {
            for(int j=0; j< h + i ; j++) {
                if( j < h - 1 - i ){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        // 画下班三角半
        for (int i = 0; i < h -1; i++) {
            for(int j= 5 - i - 2; j > -1  ; j--) {
                if(j <= i+1){
                    System.out.print("-");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
