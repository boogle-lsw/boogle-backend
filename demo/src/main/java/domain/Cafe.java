package domain;

import jakarta.persistence.*;

@Entity
@Table(name = "CAFE_INFO")
public class Cafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long kakaoPlaceId;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(length = 100)
    private String roadAddress;

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    @Column
    private String imageName;

    @Column(length = 20)
    private String contact;
}

