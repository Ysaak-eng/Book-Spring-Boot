package com.example.ysaak.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ysaak.api.model.BookModel;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class BookController {

    @PostMapping(value = "create/book/v1", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String createBook(@RequestBody BookModel entity) {
        return new String();
    }

    @GetMapping(value = "/{id}/book/v1")
    public BookModel idBook(@PathVariable(value = "id") Long id) {
        return null;
    }

    @GetMapping(value = "/list/book/v1")
    public List BookModel() {
        return null;
    }

    @PutMapping("/update/v1")
    public BookModel UpdateBook(@RequestBody BookModel entity) {
        return null;
    }

    @DeleteMapping("/{id}/book/v1")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        return ResponseEntity.noContent().build();
    }

}
