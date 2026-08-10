class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        String[] video_lenToString = video_len.split(":");
        String[] posToString = pos.split(":");
        String[] op_startToString = op_start.split(":");
        String[] op_endToString = op_end.split(":");
        
        int posToCalc = (Integer.valueOf(posToString[0]) * 60) + Integer.valueOf(posToString[1]);
        
        int video_lenToCalc = (Integer.valueOf(video_lenToString[0]) * 60) + Integer.valueOf(video_lenToString[1]);
        
        int op_startToCalc = (Integer.valueOf(op_startToString[0]) * 60) + Integer.valueOf(op_startToString[1]);
        
        int op_endToCalc = (Integer.valueOf(op_endToString[0]) * 60) + Integer.valueOf(op_endToString[1]);
        
        for (String c : commands) {
            if (op_startToCalc <= posToCalc && posToCalc <= op_endToCalc) {
                posToCalc=op_endToCalc;
            }
            
            if (c.equals("next")) {
                posToCalc += 10;
                if (posToCalc >= video_lenToCalc)
                    posToCalc = video_lenToCalc;
                    
            } else {
                posToCalc -= 10;
                if (posToCalc - 10 <= 0)
                    posToCalc = 0;
            }
        }
        
        if (op_startToCalc <= posToCalc && posToCalc <= op_endToCalc) {
                posToCalc=op_endToCalc;
        }
        
        String min = posToCalc / 60 < 10 ? "0" + String.valueOf(posToCalc / 60) :
            String.valueOf(posToCalc / 60);
        String sec = posToCalc % 60 < 10 ? "0" + String.valueOf(posToCalc % 60) :
            String.valueOf(posToCalc % 60);
        
        answer = min + ":" + sec;
        
        return answer;
    }
}