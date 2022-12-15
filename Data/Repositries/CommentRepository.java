package Data.Repositries;

import Data.Models.Comments;


import java.util.List;

public interface CommentRepository {
Comments save(Comments comments);
    Comments findById(int id);
    List<Comments> findAll();
    long count();
    void delete(int id);
}
