package com.nikijv.hometask2.task6;
import java.util.Random;
public class Array implements IMath{
    private final int _size;
    private final int [] _array;
    public Array(int size) {
        _size = size;
        _array = new int[size];
        Random _random = new Random();
        for(int i = 0; i < _size; i++){
            _array[i] = _random.nextInt(-9,10);
        }
    }
    public void show(){
        for(int i = 0; i < _size; i++){
            System.out.print(_array[i] + " ");
        }
        System.out.println();
    }
    @Override
    public int max() {
        int max = _array[0];
        for(int i = 0; i < _size - 1; i++){
            if(max < _array[i + 1]){
                max = _array[i + 1];
            }
        }
        return max;
    }
    @Override
    public int min() {
        int min = _array[0];
        for(int i = 0; i < _size - 1; i++){
            if(min > _array[i + 1]){
                min = _array[i + 1];
            }
        }
        return min;
    }
    @Override
    public float avg() {
        float sum = 0;
        for(int i = 0; i < _size; i++){
            sum += _array[i];
        }
        return (float)sum / _size;
    }
}
