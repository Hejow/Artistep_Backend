package artistep.version1.domain.comment;

import artistep.version1.domain.avatar.Avatar;
import artistep.version1.domain.post.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "avatar_id")
    @OneToOne
    private Avatar avatar;

    @JoinColumn(name = "post_id")
    @OneToOne
    private Post post;

    @Column
    private String content;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Column
    private int status;
}