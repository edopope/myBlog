package Services;

import Data.Models.Post;
import Dtos.Request.CreatePostRequest;

import java.util.Collection;
import java.util.List;

public interface PostServices {
    void createPost(CreatePostRequest createPostRequest);

    void updatePost(int id,String title, String body);
    void deletePost(int id);
    Post viewPost(int id);

    List<Post> viewAllPost();
}
