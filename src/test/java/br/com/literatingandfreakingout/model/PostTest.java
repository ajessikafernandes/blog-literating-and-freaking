package br.com.literatingandfreakingout.model;

import br.com.literatingandfreakingout.models.Post;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PostTest {

    @Test
    public void post(){
        Post post = getPostMock();
        Assert.assertEquals(Long.valueOf(1), post.getId());
        Assert.assertEquals(null, post.getImage());
        Assert.assertEquals("Lorem ipsum", post.getTitle());
        Assert.assertEquals("Lorem Ipsum is simply dummy text of the printing and typesetting industry.", post.getDescriptionCard());
        Assert.assertEquals(Long.valueOf(7), post.getMinRead());
        Assert.assertEquals(LocalDate.now(), post.getDate());
        Assert.assertEquals("Jessika F.", post.getAuthor());
        Assert.assertEquals("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.", post.getText());
    }

    private Post getPostMock(){
        Post post = new Post();
        post.setId(Long.valueOf(1));
        post.setImage(null);
        post.setTitle("Lorem ipsum");
        post.setDescriptionCard("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        post.setMinRead(Long.valueOf(7));
        post.setDate(LocalDate.now());
        post.setAuthor("Jessika F.");
        post.setText("Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
        return post;
    }
}
