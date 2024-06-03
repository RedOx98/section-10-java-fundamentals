import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Code implements Comparable<Code>{
    private String sectionNo;
    private String lectureNo;

    public Code(String sectionNo, String lectureNo) {
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public String getLectureNo() {
        return lectureNo;
    }

    @Override
    public String toString() {
        return "Code{" +
                "sectionNo='" + sectionNo + '\'' +
                ", lectureNo='" + lectureNo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Code o) {
        String code1 = sectionNo.concat(lectureNo);
        String code2 = o.getSectionNo().concat(o.getLectureNo());
        return code1.compareTo(code2);
    }
}

public class Main {
    public static void main(String[] args) {

        Map<Code, String> map = new TreeMap<>();
        map.put(new Code("S11", "10"), "Olaide");
        map.put(new Code("S11", "11"), "Hammed");
        map.put(new Code("S11", "22"), "Ridwan");
        map.put(new Code("S11", "00"), "Abolore");
        map.put(new Code("S11", "05"), "Aafiyah");
        map.put(new Code("S10", "10"), "Barakat");
        map.put(new Code("S11", "10"), "Tarem");
        System.out.println(map);

    }
}
