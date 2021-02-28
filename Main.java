package com.javahw;

public class Main {

    private static final int MAXSUMOFTHREENUMBERS = 28;

    public static void main(String[] args) {
	    /*
	        2) Найти количество счастливых билетиков на трамвай
	        от 000001 до 999999 (те у которых сумма первых 3 цифр равна сумме последних)
	    */

        int[] arr = new int[MAXSUMOFTHREENUMBERS];
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                for(int k = 0; k < 10; k++) {
                    arr[i + j + k]++;
                }
            }
        }
        int count = 0;
        for(int i = 1; i < MAXSUMOFTHREENUMBERS; i++) {
            count += arr[i] * arr[i];
        }
        System.out.println("Количество счастливых билетиков на трамвай = " + count);
    }
}