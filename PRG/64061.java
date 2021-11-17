import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        int crane = 0;
        int j = 0;
        for (int i = 0; i<moves.length; i++) {
            crane = moves[i]-1;
            j=0;
            while(j<board[0].length) {
                if (board[j][crane]!=0) {
                    if (basket.size() > 0 && basket.peek()==board[j][crane]) {
                        basket.pop();
                        board[j][crane]=0;
                        answer+=2;
                    }
                    else {
                        basket.push(board[j][crane]);
                        board[j][crane]=0;
                    }
                    break;
                }
                else {
                    j++;
                }
            }
        }

        return answer;
    }
}