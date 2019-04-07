package dao;

import connection.BookstoreDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryDaoImp implements CategoryDao {
    @Override
    public int findIdByCategoryCode(String catgoryCode) {
        String select = "select id from categories where cod = ?";
        try (Connection connection = BookstoreDataSource.getConnection();
             PreparedStatement ps = connection.prepareStatement(select
             )) {
            ps.setString(1, catgoryCode);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                return id;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
}
