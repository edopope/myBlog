package Data.Models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private String title;
    private int postId;
    private LocalDateTime creationTime = LocalDateTime.now();
    private String body;
    private List<Comments>comments = new ArrayList<>();

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", postId=" + postId +
                ", creationTime=" + creationTime +
                ", body='" + body + '\'' +
                ", comments=" + comments +
                '}';
    }
}
