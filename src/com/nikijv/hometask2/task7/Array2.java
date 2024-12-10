package com.nikijv.hometask2.task7;

import java.util.Random;

public class Array2 implements ISort{
    private final int _size;
    private final int [] _array;
    public Array2(int size) {
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
    public void sortAsc() {
        for(int i = 0; i < _size - 1; i++){
            for(int j = 0; j < _size - i - 1; j++){
                if(_array[j] > _array[j + 1]){
                    int temp = _array[j];
                    _array[j] = _array[j + 1];
                    _array[j + 1] = temp;
                }
            }
        }
    }
    @Override
    public void sortDesc() {
        for(int i = 0; i < _size - 1; i++){
            for(int j = 0; j < _size - i - 1; j++){
                if(_array[j] < _array[j + 1]){
                    int temp = _array[j];
                    _array[j] = _array[j + 1];
                    _array[j + 1] = temp;
                }
            }
        }
    }
}
