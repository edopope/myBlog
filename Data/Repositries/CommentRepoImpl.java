package Data.Repositries;

import Data.Models.Comments;

import java.util.ArrayList;
import java.util.List;

public class CommentRepoImpl implements CommentRepository{
    private List<Comments>commentsbase = new ArrayList<>();
    @Override
    public Comments save(Comments comments) {
        commentsbase.add(comments);
        return comments;
    }

    @Override
    public Comments findById(int id) {
        return null;
    }

    @Override
    public List<Comments> findAll() {
        return null;
    }

    @Override
    public long count() {
        return commentsbase.size();
    }

    @Override
    public void delete(int id) {
commentsbase.remove(id-1);
    }
}
