package ra.edu.repo;

import ra.edu.model.entity.Category;

import java.util.List;

public interface CategoryRepo {
    List<Category> getAllCategory();

    boolean checkExistCategoryName(String name);

    boolean saveCategory(Category category);

    boolean updateCategory(Category category);

    boolean deleteCategory(int id);

    Category getCategoryById(int id);
}
