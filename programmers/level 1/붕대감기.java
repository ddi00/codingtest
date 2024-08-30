public class 붕대감기 {

    public static int solution(int[] bandage, int health, int[][] attacks) {
        int currentHealth = health;     //현재 체력
        int recoveryPerSec = bandage[1];    //1초당 추가되는 체력
        int timeToAddStamina = bandage[0];  //추가 체력을 얻게되는 기준 시간
        int additionalStamina = bandage[2]; //추가 체력
        int continuousTime = 0;     //연속 시간
        int idx = 0;

        for(int i=0; i<=attacks[attacks.length-1][0]; i++){
            if(i == attacks[idx][0]){       //공격시간이라면
                currentHealth -= attacks[idx][1];   //체력 데미지 차감
                if(currentHealth <= 0) return -1;   //체력이 0이하가 되면 -1리턴
                continuousTime = 0;     // 연속시간 0
                idx++;          //idx +1
            }else{          //공격시간이 아니라면
                continuousTime++;           // 연속시간 +1
                currentHealth += recoveryPerSec;        //체력 추가
                if(currentHealth > health){     //현재 체력이 최대 체력보다 커지지 않게 조정
                    currentHealth = health;
                }
            }

            if(continuousTime == timeToAddStamina){     //추가 체력 기준을 충족했을 경우
                currentHealth += additionalStamina;     //추가 체력을 더함
                if(currentHealth > health){         //현재 체력이 최대 체력보다 커지지 않게 조정
                    currentHealth = health;
                }
                continuousTime = 0;
            }
        }
        return currentHealth;
    }

    public static void main(String[] args) {
        int[] bandage = {3,2,7};
        int health = 20;
        int[][] attacks = {{1,15},{5,16},{8,6}};
        System.out.println(solution(bandage, health, attacks));
    }
}


