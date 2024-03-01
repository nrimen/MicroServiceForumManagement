package tn.esprit.piDev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.piDev.entities.Blog;

public interface BlogRepository extends JpaRepository<Blog,Long> {


}