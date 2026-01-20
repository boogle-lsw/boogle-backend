package domain;

import jakarta.persistence.*;

@Entity
@Table(
        name = "ADMIN",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_admin_user_id", columnNames = "user_id"),
                @UniqueConstraint(name = "uk_admin_nickname", columnNames = "nickname")
        }
)
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false, length = 50)
    private String userId;

    @Column(nullable = false, length = 50)
    private String nickname;

    @Column(nullable = false, length = 255)
    private String password;
}

