import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 선수들 나열 players
        // 선수들 부른 이름 callings
        
        HashMap<String, Integer> player_list = new HashMap<>();
        for (int i = 0; i < players.length; i ++) {
            player_list.put(players[i], i);
        }
        
        for (String calledPlayer : callings) {
            int currentIndex = player_list.get(calledPlayer);
            String frontPlayer = players[currentIndex - 1];
            
            players[currentIndex - 1] = calledPlayer;
            players[currentIndex] = frontPlayer;
            
            player_list.put(calledPlayer, currentIndex - 1);
            player_list.put(frontPlayer, currentIndex);
        }

        return players;
    }
}