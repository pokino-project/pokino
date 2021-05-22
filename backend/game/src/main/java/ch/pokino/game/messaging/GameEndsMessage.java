package ch.pokino.game.messaging;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class GameEndsMessage {

    private final String playerId1;
    private final String playerId2;
    private final String gameId;
    private final Map<String, Integer> finalStandings;

    public GameEndsMessage(@JsonProperty("playerId1") String playerId1,
                           @JsonProperty("playerId2") String playerId2,
                           @JsonProperty("gameId") String gameId,
                           @JsonProperty("finalStandings") Map<String, Integer> finalStandings) {
        this.playerId1 = playerId1;
        this.playerId2 = playerId2;
        this.gameId = gameId;
        this.finalStandings = finalStandings;
    }

    public String getPlayerId1() {
        return playerId1;
    }

    public String getPlayerId2() {
        return playerId2;
    }

    public String getGameId() {
        return gameId;
    }

    public String toString() {
        return "GameEndsMessage(playerId1=" + playerId1 + ", " + "playerId2=" + playerId2 + ", " + "gameId=" + gameId + ")";
    }
}
