package Data.Repositries;

import Data.Models.Comments;
import Data.Models.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepoImpl implements PostRepo {
    private List<Post>postDb = new ArrayList<>();
    @Override
    public Post save(Post post) {
        if (post.getPostId() != 0) update(post);
        else {
            post.setPostId(postDb.size() + 1);
            postDb.add(post);

        }
        return post;
    }

    private  void update(Post post){
        //find the original
        Post savedPost = findById(post.getPostId());
        savedPost.setTitle(post.getTitle());
        savedPost.setBody(post.getBody());
        //set with new details
    }
    @Override
    public Post findById(int id) {
        for(Post post : postDb){
            if (post.getPostId() == id)return post;
                    }
        return null ;
    }

    @Override
    public List<Post> findAll() {
        return postDb;
    }

    @Override
    public long count() {
        return postDb.size();
    }

    @Override
    public void delete(Post post) {

    }

    @Override
    public void delete(int id) {
    postDb.indexOf(findById(-1));           //postDb.remove(id-1);
    }
}
