package tn.esprit.piDev.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.piDev.entities.Blog;
import tn.esprit.piDev.repositories.BlogRepository;

import java.util.List;

@Slf4j
@Service
public class BlogService implements IBlogService{

    @Autowired
    private BlogRepository repo;
    @Override
    public List<Blog> findAll() {
        return (repo.findAll() != null)? repo.findAll() : null;
    }

    @Override
    public void deleteBlog(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void UpdateBlog(Blog blog) {
        repo.save(blog);
    }

    @Override
    public List<Blog> findById(Long id) {
        return (List<Blog>) repo.findById(id).orElse(null);
    }

    @Override
    public void AddBlog(Blog blog) {
        repo.save(blog);
    }
}