package com.example.b_team_shopping_mall.repository;

import com.example.b_team_shopping_mall.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Repository 는 JPA를 이용해서 데이터베이스에서 데이터를 불러오거나 저장하는 용도입니다.
 * Repository는 Service 클래스에서 기능 구현할 때 사용합니다.
 *
 * @Repository 는 생략해도됨, 이유는 인터페이스가 JpaRepository 상속 받는데 안에 @Repository가 포함됨
 */

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<List<Category>> findAllByCategory(String category);
}
