package programmers.level0;

public class WaterShortage {

    public int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage = usage + (usage * change[i]) / 100;
            System.out.println("usage:" + usage);
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        WaterShortage waterShortage = new WaterShortage();

        int storage = 5141;
        int usage = 500;
        int[] change = {10, -10, 10, -10, 10, -10, 10, -10, 10, -10};
        int result = waterShortage.solution(storage, usage, change);

        System.out.println(result);


    }
}
