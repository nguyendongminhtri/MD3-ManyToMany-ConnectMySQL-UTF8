package com.chinhanh.service.book;

import com.chinhanh.model.Book;
import com.chinhanh.service.IService;


public interface IBookService extends IService<Book> {
    public void save(Book p, int[] categories);
}
