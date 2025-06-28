package stormsprid.movieservice.movie;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;
import java.util.List;

//Movie: id, title, description, year, genre, actors, posterUrl
@Entity
@Getter
@Setter
@Table(name = "movie")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private Integer year;
    private String genre;
    @ElementCollection(fetch = FetchType.EAGER)//отдельная таблица для актеров

    List<String> actors;
    String posterUrl;


    @Override
    public String toString() {
        return "MovieEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", actors=" + actors +
                ", posterUrl='" + posterUrl + '\'' +
                '}';
    }
}
