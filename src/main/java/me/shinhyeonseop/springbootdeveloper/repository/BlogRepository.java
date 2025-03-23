package me.shinhyeonseop.springbootdeveloper.repository;

import me.shinhyeonseop.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
