package programmers.level1;

public class VideoPlayer {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();

        String video_len1 = "34:33";
        String pos1 = "13:00";
        String op_start1 = "00:55";
        String op_end1 = "02:55";
        String[] commands1 = {"next", "prev"};

        String result1 = videoPlayer.solution(video_len1, pos1, op_start1, op_end1, commands1);
        System.out.println("result1:" + result1);

        String video_len2 = "10:55";
        String pos2 = "00:05";
        String op_start2 = "00:15";
        String op_end2 = "06:55";
        String[] commands2 = {"prev", "next", "next"};

        String result2 = videoPlayer.solution(video_len2, pos2, op_start2, op_end2, commands2);
        System.out.println("result2:" + result2);

        String video_len3 = "07:22";
        String pos3 = "04:05";
        String op_start3 = "00:15";
        String op_end3 = "04:07";
        String[] commands3 = {"next"};

        String result3 = videoPlayer.solution(video_len3, pos3, op_start3, op_end3, commands3);
        System.out.println("result3:" + result3);

    }
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 시간들을 int로 변환
        int video_len_second = toSecond(video_len);
        int pos_second = toSecond(pos);
        int op_start_second = toSecond(op_start);
        int op_end_second = toSecond(op_end);

        // 현재 재생 위치가 오프닝 구간(op_start ≤ 현재 재생 위치 ≤ op_end)인 경우 자동으로 오프닝이 끝나는 위치로 이동
        if (pos_second >= op_start_second && pos_second <= op_end_second) {
            pos_second = op_end_second;
        }

        for(String command : commands) {
            if (command.equals("prev")) {
                // 동영상의 재생 위치를 현재 위치에서 10초 전으로 이동
                // 현재 위치가 10초 미만인 경우 영상의 처음 위치로 이동 (0분 0초)
                if(pos_second < 10){
                    pos_second = 0;
                }else{
                    pos_second -= 10;
                }
            } else {
                // 동영상의 재생 위치를 현재 위치에서 10초 후로 이동
                // 동영상의 남은 시간이 10초 미만일 경우 영상의 마지막 위치로 이동
                if(video_len_second - pos_second < 10){
                    pos_second = video_len_second;
                }else{
                    pos_second += 10;
                }
            }
        }

        if (pos_second >= op_start_second && pos_second <= op_end_second) {
            pos_second = op_end_second;
        }

        return String.format("%02d:%02d", pos_second/60, pos_second%60);
    }

    public static int toSecond(String time) {
        String[] splitTime = time.split(":");
        return (Integer.parseInt(splitTime[0])  * 60) + Integer.parseInt(splitTime[1]);
    }
}
