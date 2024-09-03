
import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        return Arrays.stream(myStr.split("[a-c]+")).filter(s->!s.equals("")).toArray(String[]::new).length==0?new String[]{"EMPTY"}:Arrays.stream(myStr.split("[a-c]+")).filter(s->!s.equals("")).toArray(String[]::new);
    }
}