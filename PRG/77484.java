function solution(lottos, win_nums) {
    var lottos = lottos; //찍은 번호
    var win_nums = win_nums;
    
    
    let countZero = 0; //0개수
    let countWinNum = 0 //이길 수 있는 숫자
    lottos.forEach(lotto => {
        if (win_nums.includes(lotto)) {
            countWinNum+=1;
        }
        if (lotto == 0) {
            countZero+=1;
        }
    })
    
    let best;
    let worst;
    
    if (countWinNum < 2) {
        worst = 6;
    }
    else if (countWinNum == 2) {
        worst = 5
    }
    else if (countWinNum == 3) {
        worst = 4
    }
    else if (countWinNum == 4) {
        worst = 3
    }
    else if (countWinNum == 5) {
        worst = 2
    }
    else if (countWinNum == 6) {
        worst = 1
    }
    
    let sum = countZero + countWinNum;
    
    
    if (sum < 2) {
        best = 6;
    }
    else if (sum == 2) {
        best = 5
    }
    else if (sum == 3) {
        best = 4
    }
    else if (sum == 4) {
        best = 3
    }
    else if (sum == 5) {
        best = 2
    }
    else if (sum == 6) {
        best = 1
    }
    
    var answer = [];
    answer.push(best);
    answer.push(worst);
    return answer;
}