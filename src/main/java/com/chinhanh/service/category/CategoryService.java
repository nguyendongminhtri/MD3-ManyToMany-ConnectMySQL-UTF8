package com.chinhanh.service.category;

import com.chinhanh.config.ConnectionJDBC;
import com.chinhanh.model.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryService implements ICategoryService {
    Connection connection = ConnectionJDBC.getConnect();
    public static final String SELECT_ALL_BOOK = "select * from category;";
    public static final String SELECT_CATEGORY_BY_B_ID = "select c.id, c.name, c.description from category c join book_category bc on c.id = bc.category_id and bc.book_id=?";


    @Override
    public List<Category> findAll() {
        List<Category> categories = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_BOOK);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                Category category = new Category(id, name, description);
                categories.add(category);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return categories;
    }

    @Override
    public List<Category> findAllByBookId(int book_id) {
        System.out.println("Goi ham nay khong?");
        System.out.println("book_id = "+book_id);
        List<Category> categories = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_CATEGORY_BY_B_ID);
            statement.setInt(1,book_id);
            System.out.println("xuong day khong");
            ResultSet resultSet = statement.executeQuery();
            System.out.println("ressultSet"+resultSet);
//            ResultSet resultSet1 = statement.getGeneratedKeys();
            while (resultSet.next()){
                System.out.println("vao WHILE");
                int id = resultSet.getInt("id");
                System.out.println("id category = ");
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                Category category = new Category(id, name, description);
                categories.add(category);
                System.out.println("categoryies size = "+ categories.size());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return categories;
    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public void save(Category p) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void edit(int id, Category category) {

    }
}
