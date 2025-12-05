import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        LinkedList<Integer> timeList = Arrays
                .stream(timetable)
                .map(s->s.split(":"))
                .map(l-> Integer.parseInt(l[0]) * 60 + Integer.parseInt(l[1]))
                .sorted()
                .collect(Collectors.toCollection(LinkedList::new));
        int time = 9 * 60;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!timeList.isEmpty() && timeList.getFirst() <= time)timeList.removeFirst();
            }
            time += t;
        }
        int finalTime = time;
        timeList = timeList.stream().filter(v -> v <= finalTime).collect(Collectors.toCollection(LinkedList::new));
        int num = time;
        if(timeList.size() >= m)num = timeList.get(m-1) - 1;
        return String.format("%02d:%02d", num/60, num%60);
    }
}