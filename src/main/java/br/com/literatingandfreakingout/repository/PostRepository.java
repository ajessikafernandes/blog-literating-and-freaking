package br.com.literatingandfreakingout.repository;

import br.com.literatingandfreakingout.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PostRepository extends JpaRepository<Post, Long> {

}
