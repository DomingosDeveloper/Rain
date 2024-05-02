package com.Rain.exercises.controller.API;

import org.springframework.web.bind.annotation.RestController;

import com.Rain.exercises.model.entity.Post.Post;
import com.Rain.exercises.service.APIService;

import java.io.IOException;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api")
public class APIController {
    @Autowired
    private APIService aService;

    @SuppressWarnings("rawtypes")
    @GetMapping(value = "/posts/{diaEscolhido}")
    public ResponseEntity getMassaDia (@PathVariable("diaEscolhido") String diaEscolhido) throws IOException {
        ArrayList<Post> posts = aService.getPostDoDia(diaEscolhido);
        return ResponseEntity.ok(posts);
    }
    
    @SuppressWarnings("rawtypes")
    @GetMapping(value = "/posts/page/{diaEscolhido}")
    public ResponseEntity getMassaPage (@PathVariable("diaEscolhido") String diaEscolhido, @RequestParam("page") int page, @RequestParam("size") int size) throws IOException {
        Page<Post> posts = aService.getPostDoDiaPaginado(diaEscolhido, page, size);
        return ResponseEntity.ok(posts);
    }

    @SuppressWarnings("rawtypes")
    @GetMapping(value = "/SIM")
    public ResponseEntity getMassa() throws IOException {
        return ResponseEntity.ok(aService.getData());
    }
    
    
}
