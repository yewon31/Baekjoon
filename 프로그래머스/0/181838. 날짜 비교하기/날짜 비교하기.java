import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class Solution {
    public int solution(int[] date1, int[] date2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateA = sdf.parse(""+date1[0]+"-"+date1[1]+"-"+date1[2]);
        Date dateB = sdf.parse(""+date2[0]+"-"+date2[1]+"-"+date2[2]);
        return dateA.before(dateB) ? 1 : 0;
    }
}