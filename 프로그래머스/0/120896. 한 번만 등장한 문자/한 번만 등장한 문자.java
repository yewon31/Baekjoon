import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split(""))                   //1.stream으로 변환
                .collect(Collectors.groupingBy(s1 -> s1))   //2.map 구조로 grouping(문자별로 그룹화, "a"->"a,a")
                .entrySet().stream()                        //3.map을 entrySet stream으로 변환
                .filter(entry -> entry.getValue().size() == 1) //4.getValue().size() 이용, 한번만 등장한 문자그룹 필터링
                .map(Map.Entry::getKey)                     //5.해당 문자만 추출
                .sorted().collect(Collectors.joining());    //6.정렬 후 문자열로 변환
    }
}