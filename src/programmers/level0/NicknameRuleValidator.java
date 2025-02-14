package programmers.level0;

public class NicknameRuleValidator {

    public static void main(String[] args) {
        NicknameRuleValidator nicknameRuleValidator = new NicknameRuleValidator();

        String nickname1 = "WORLDworld";
        String nickname2 = "GO";

        String result1 = nicknameRuleValidator.solution(nickname1);
        String result2 = nicknameRuleValidator.solution(nickname2);

        System.out.println("result1:" + result1);
        System.out.println("result2:" + result2);
    }

    public String solution(String nickname) {
        String answer = "";
        for(int i=0; i<nickname.length(); i++){
            if(nickname.charAt(i) == 'l'){
                answer += "I";
            }
            else if(nickname.charAt(i) == 'w'){
                answer += "vv";
            }
            else if(nickname.charAt(i) == 'W'){
                answer += "VV";
            }
            else if(nickname.charAt(i) == 'O'){
                answer += "0";
            }
            else{
                answer += nickname.charAt(i);
            }
        }
        while (answer.length() < 4){
            answer += "o";
        }
        if(answer.length() > 8){
            answer = answer.substring(0, 8);
        }
        return answer;
    }
}
