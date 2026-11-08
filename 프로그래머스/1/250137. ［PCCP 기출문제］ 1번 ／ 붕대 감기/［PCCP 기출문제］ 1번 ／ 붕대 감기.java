class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // t : 기술 시간
        // x : 붕대 감으면 채워지는 체력
        // y : 추가 체력 회복
        // bandage -> 정수 배열 3개 존재 (첫 번째 : 기술 시간, 두 번째 : 초당 회복량, 세 번째 : 기술 시간 도달했을 때의 추가 체력 회복)
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        // 최대 회복량 체크용
        int max_health = health;
        int end_time = attacks[attacks.length - 1][0];
        
        // 연속 성공 횟수
        int success_check = 0;
        // 공격 순번
        int attack_num = 0;
        
        // health : 기본 체력에서 그 이상으로 체력 회복 불가능
        // attacks : 한 행 마다 공격할 시간 및 공격 데미지 표시
        for (int i = 1; i <= end_time; i ++) {
            // 몬스터의 공격 시간이 되었을 때
            if (i == attacks[attack_num][0]) {
                health -= attacks[attack_num ++][1];
                success_check = 0;
                if (health <= 0) {
                    return -1;
                }
            } else {
                int recovery = x;
                success_check ++;
                
                // 추가 회복 쿨 타임
                if (t == success_check) {
                    recovery += y;
                    success_check = 0;
                }
                
                // 체력 회복 될 때 기본 체력보다 초과되면 아니된다.
                health = Math.min(health + recovery, max_health);
                // health = health + recovery >= max_health ? max_health : health + recovery;
            }
        }
        
        return health;
    }
}