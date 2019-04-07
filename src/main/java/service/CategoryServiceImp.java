package service;

import dao.CategoryDao;

public class CategoryServiceImp implements CategoryService {


    private CategoryDao categoryDao;

    public CategoryServiceImp(CategoryService categoryService) {
        this.categoryDao = categoryDao;
    }

    @Override
    public int getCategoryIdByCode(String code) {
        return 0;
    }
}
