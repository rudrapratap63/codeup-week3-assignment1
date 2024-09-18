class Player {
    String name;
    String role;
    int number;
    int runs;
    int ballsFaced;

    public Player(String name, String role, int number) {
        this.name = name;
        this.role = role;
        this.number = number;
        this.runs = 0;
        this.ballsFaced = 0;
    }

    public void scoreRuns(int runs) {
        this.runs += runs;
        this.ballsFaced++;
    }
}