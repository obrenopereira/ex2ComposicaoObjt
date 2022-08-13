package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String content;
    private String title;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();
    public Post(){

    }

    public Post(Date moment, String content, String title, Integer likes) {
        this.moment = moment;
        this.content = content;
        this.title = title;
        this.likes = likes;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComent(Comment comment){
        comments.add(comment);
    }
    public void removeComent(Comment comment){
        comments.remove(comment);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content+ "\n");
        sb.append(" Coments: \n");
        for ( Comment c: comments) {
            sb.append(c.getText() + "\n");
        }
        return sb.toString();

    }


}
