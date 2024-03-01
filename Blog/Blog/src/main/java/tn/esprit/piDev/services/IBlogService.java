package tn.esprit.piDev.services;

import tn.esprit.piDev.entities.Blog;

import java.util.List;

public interface IBlogService {
    public List<Blog> findAll();
    public void deleteBlog(Long id);
    public void UpdateBlog(Blog blog);
    public List<Blog> findById (Long id);
    public void AddBlog (Blog blog);
}