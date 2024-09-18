class Team {
    String name;
    Player[] players;
    Player[] playingXI;
    int playerCount = 0;
    int totalRuns = 0;
    int wickets = 0;
    int maxPlayers = 11;
    int ballsPlayed = 0;

    public Team(String name) {
        this.name = name;
        this.players = new Player[11];
    }

    public void addPlayer(Player player) {
        if (playerCount == players.length) {
            resizePlayerArray();
        }
        players[playerCount++] = player;
    }

    private void resizePlayerArray() {
        Player[] newArray = new Player[players.length + 5];
        for (int i = 0; i < players.length; i++) {
            newArray[i] = players[i];
        }
        players = newArray;
    }

    public double calculateRunRate() {
        return (double) totalRuns / (ballsPlayed / 6.0);
    }
}