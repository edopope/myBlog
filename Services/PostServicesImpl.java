package Services;

import Data.Models.Post;
import Data.Repositries.PostRepo;
import Data.Repositries.PostRepoImpl;
import Dtos.Request.CreatePostRequest;

import java.util.List;

public class PostServicesImpl implements PostServices{
    private PostRepo postRepo = new PostRepoImpl();
    @Override
    public void createPost(CreatePostRequest createPostRequest) {
        Post post = new Post();
        post.setBody(createPostRequest.getBody());
        post.setTitle(createPostRequest.getTitle());
        postRepo.save(post);
    }

    @Override
    public void updatePost(int id, String title, String body) {

    }

    @Override
    public void deletePost(int id) {

    }

    @Override
    public Post viewPost(int id) {
        return postRepo.findById(id);
    }
    @Override
    public List<Post> viewAllPost() {
        return postRepo.findAll();
    }
}
