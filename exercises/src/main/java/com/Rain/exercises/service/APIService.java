package com.Rain.exercises.service;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.Rain.exercises.model.entity.EntireBody;
import com.Rain.exercises.model.entity.Post.Post;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class APIService {
    
    @Autowired
    RestTemplate restTemplate;

    public String getData() throws IOException{
        //String url = "https://raw.githubusercontent.com/chuva-inc/exercicios-2023/master/dart/assets/activities.json";
        ObjectMapper objectMapper = new ObjectMapper();

        try {
        //String json = new String(url.openStream().readAllBytes());
        //EntireBody entireBody = objectMapper.readValue(inputStream,EntireBody.class);
        String jsonString = objectMapper.writeValueAsString(objectMapper.readValue(new URL("https://raw.githubusercontent.com/chuva-inc/exercicios-2023/master/dart/assets/activities.json"), EntireBody.class));
        
        //EntireBody entireBody = objectMapper.readValue(urlReplace, EntireBody.class);
        //String entireBodySt = objectMapper.writeValueAsString(entireBody);
       
        
        return jsonString;
    } catch (RestClientException e){
        throw new RuntimeException("Erro na API: "+ e.getMessage());
        }
    }

    public ArrayList<Post> getPosts() throws IOException{
        String massaDados = getData();
        String massaDadosString = massaDados.toString();
        ObjectMapper mapp = new ObjectMapper();

       try {
        Post[] posts = mapp.readValue(massaDadosString, Post[].class);
        ArrayList<Post> postsList = new ArrayList<Post>(Arrays.asList(posts));
        return postsList;
    } catch (JsonMappingException e) {
        throw new RuntimeException ("ERRO:" + e.getMessage());
        }
    }

    public ArrayList<Post> getPostDoDia(String diaEscolhido) throws IOException{
        
        ArrayList<Post> posts = getPosts();
    
        ArrayList<Post> postsChosen = new ArrayList<>();
        for (Post post : posts){
            if (post.getDiaInicioSubString().equals(diaEscolhido)){
                postsChosen.add(post);
        }
    }
        return postsChosen;
}

    public Page<Post> getPostDoDiaPaginado(String diaEscolhido, int page, int size) throws IOException {
        ArrayList<Post> posts = getPosts();
    
        ArrayList<Post> postsChosen = new ArrayList<>();
        for (Post post : posts){
            if (post.getDiaInicioSubString().equals(diaEscolhido)){
                postsChosen.add(post);
        }
    }
        Page<Post> postsChosenPage = new PageImpl<Post>(postsChosen, PageRequest.of(page, size), postsChosen.size());
        return postsChosenPage; 
    }
}
