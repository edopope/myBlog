package Controllers;

import Data.Models.Post;
import Dtos.Request.CreatePostRequest;
import Services.PostServices;
import Services.PostServicesImpl;

public class PostController {
    private PostServices postServices = new PostServicesImpl();
    public String createPost(CreatePostRequest createPostRequest){
    postServices.createPost(createPostRequest);
    return "successful";
    }
    public Post viewPost(int postId){
        return postServices.viewPost(postId);
    }
}
