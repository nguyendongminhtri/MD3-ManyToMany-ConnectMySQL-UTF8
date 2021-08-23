package com.chinhanh.service.category;

import com.chinhanh.model.Category;
import com.chinhanh.service.IService;

import java.util.List;

public interface ICategoryService extends IService<Category> {
    List<Category> findAllByBookId(int book_id);
}
