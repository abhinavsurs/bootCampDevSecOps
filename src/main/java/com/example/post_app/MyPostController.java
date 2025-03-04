package com.example.post_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.sql.SQLOutput;

@RestController
public class MyPostController {

    @GetMapping("myposts/{id}")
    public Post getMyPost(@PathVariable  String id){

        String url ="https://jsonplaceholder.typicode.com/posts"+id;

        RestClient rc = RestClient.create();
       Post response= rc.get().uri(url).retrieve().body(Post.class);
        System.out.println("response is "+response.getBody());
        return response;
    }
}
