package pl.wojjasko.gameprice.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "game")
@Getter
@Setter
@NoArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "external_id", nullable = false, unique = true, length = 50)
    private String externalId;

    @Column(nullable = false)
    private String title;

    @Column(name = "thumbnail_url", length = 500)
    private String thumbnailUrl;
}
