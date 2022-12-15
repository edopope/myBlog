package Data.Repositries;

import Data.Models.Post;

import java.util.List;

public interface PostRepo {
    Post save(Post post);
    Post findById(int id);
    List<Post>findAll();
    long count();
    void delete(Post post);
    void delete(int id);
}
