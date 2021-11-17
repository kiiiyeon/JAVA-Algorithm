import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = ;
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; icompletion.length; i++) {
            if (!participant[i].equals(completion[i]))
                return participant[i];
        }
        return participant[i];
    }
}