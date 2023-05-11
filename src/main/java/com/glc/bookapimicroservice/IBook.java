package com.glc.bookapimicroservice;

public interface IBook<T> {
    public void saveBook(T t);
}
