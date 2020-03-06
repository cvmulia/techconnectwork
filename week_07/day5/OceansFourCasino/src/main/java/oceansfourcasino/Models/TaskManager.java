package oceansfourcasino.Models;

import javax.persistence.*;

@Entity
@Table(name = "taskmanagers")
public class TaskManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="game_name")
    private String gameName;
    @Column
    private int input;
    @Column
    private double bets;
    @Column
    private double winnings;
    @Column
    private double losses;
    @Column
    private int inputs;

    public TaskManager(String gameName, int input, double bets, double winnings, double losses, int inputs) {
        this.gameName = gameName;
        this.input = input;
        this.bets = bets;
        this.winnings = winnings;
        this.losses = losses;
        this.inputs = inputs;
    }

    public TaskManager() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public double getBets() {
        return bets;
    }

    public void setBets(double bets) {
        this.bets = bets;
    }

    public double getWinnings() {
        return winnings;
    }

    public void setWinnings(double winnings) {
        this.winnings = winnings;
    }

    public double getLosses() {
        return losses;
    }

    public void setLosses(double losses) {
        this.losses = losses;
    }

    public int getInputs() {
        return inputs;
    }

    public void setInputs(int inputs) {
        this.inputs = inputs;
    }
}
