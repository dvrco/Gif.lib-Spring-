package com.vellyezz.giflib.data;

import com.vellyezz.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by vellyezz on 05.05.2017.
 */
@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "Technology"),
            new Category(2, "People"),
            new Category(3, "Destruction")
    );

    public static List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public Category findById(int id) {
        for (Category category : ALL_CATEGORIES) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }
}
