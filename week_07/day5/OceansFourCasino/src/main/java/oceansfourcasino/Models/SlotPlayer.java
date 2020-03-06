package oceansfourcasino.Models;

import javax.persistence.*;

@Entity
@Table(name="slot_players")
public class SlotPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private double wallet;



    public SlotPlayer(String name, int age, double wallet) {
        this.name = name;
        this.age = age;
        this.wallet = wallet;

    }

    public SlotPlayer(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

}
