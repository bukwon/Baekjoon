class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        // [직원 수][스케줄]
        // 주말엔 출근 시간 영향 x
        // 각 직원이 정한 출근 희망 시간보다 10분 초과 시, 이벤트에서 제외
        for (int i = 0; i < schedules.length; i++) {
            int startPoint = startday - 1; // 출퇴근 계산 시점
            int endPoint = 1; // 출퇴근 기록 계산 끝나는 시점
            boolean flag = true;
            for (int j = 0; j < 7; j++) {
                int targetTime = schedules[i] + 10;
                
                if (targetTime % 100 >= 60) {
                    targetTime += 40;
                }
                
                if (startPoint == 5 || startPoint == 6) {
                    startPoint++;
                    if (startPoint >= 7) startPoint = 0;
                    continue;
                }
                endPoint = timelogs[i][j];
                
                if (endPoint % 100 > 60) {
                    endPoint += 100;
                }
                
                if (targetTime - endPoint < 0) {
                    flag = false;
                    break;
                }
                
                startPoint++;
            }
            
            if (flag)
                answer ++;
        }
        
        return answer;
    }
}

// schedules = 희망 출근 시간 나열
// timelogs = 출근 기록부
// startday = 시작한 요일