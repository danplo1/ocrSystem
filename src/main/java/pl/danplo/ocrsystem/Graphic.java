package pl.danplo.ocrsystem;


import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class Graphic {

    @Id
    @GeneratedValue
    private Long id;
    private String url;
    private String content;


}
