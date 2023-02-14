package com.sales.salesapi.controllers;

import com.sales.salesapi.entities.Category;
import com.sales.salesapi.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public ResponseEntity<Object> findAll(){
        List<Category> categories = categoryService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(categories);
    }

}
