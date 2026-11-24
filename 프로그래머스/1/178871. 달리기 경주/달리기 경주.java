import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 선수들 나열 players
        // 선수들 부른 이름 callings
        
        
        int players_num = players.length;
        
        
        HashMap<String, Integer> player_list = new HashMap<>();
        for (int i = 0; i < players_num; i ++) {
            player_list.put(players[i], i);
        }
        
        for (String s : callings) {
            int rank = player_list.get(s);
            
            if (rank <= 0) {
                continue;
            }
            
            String current = players[rank];
            String front = players[rank - 1];
            
            players[rank] = front;
            players[rank - 1] = current;
            
            player_list.put(current, rank - 1);
            player_list.put(front, rank);
        }
        
        List<String> keySet = new ArrayList<>(player_list.keySet());
        
        keySet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return player_list.get(o1).compareTo(player_list.get(o2));
            }
        });
        
        String[] answer = new String[players_num];
        
        for(int i = 0; i < players_num; i ++) {
            answer[i] = keySet.get(i);
        }
        
        return answer;
    }
}