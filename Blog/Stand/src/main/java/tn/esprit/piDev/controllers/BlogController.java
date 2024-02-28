package tn.esprit.piDev.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.piDev.entities.Blog;
import tn.esprit.piDev.services.BlogService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService serv;
    @Autowired
    @GetMapping("afficheB")
    public List<Blog> findAll()
    {
        return serv.findAll();
    }

    @DeleteMapping("DeleteB")
    public String deleteBloc(@RequestParam("id") Long id) {
        serv.deleteBlog(id);
        return "Deleted Successfully";
    }

    @PutMapping("updateB/{id}")
    public String updateBloc(@PathVariable("id") Long id, @RequestBody Blog blog){
        //blog.setUserBlog(id);
        serv.UpdateBlog(blog);
        return "Updated successfully";
    }

    @GetMapping("/afficheB/{id}")
    public ResponseEntity<Blog> findById(@PathVariable Long id) {
        List<Blog> bloc = serv.findById(id);
        if (bloc != null) {
            return ResponseEntity.ok((Blog) bloc);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("addB")
    public ResponseEntity<String> AddBloc(@RequestBody Blog blog) {
        log.info("Add successful");
        serv.AddBlog(blog);
        return ResponseEntity.ok("Ajouté avec succès");
    }

}