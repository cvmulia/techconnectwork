package oceansfourcasino.Models;

import javax.persistence.*;

@Entity
@Table(name = "inputs")
public class Input {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String action;

    public Input( String action) {
        this.action = action;
    }

    public Input() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
