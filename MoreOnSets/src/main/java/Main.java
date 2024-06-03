import java.util.*;

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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Code code = (Code) object;
        return Objects.equals(sectionNo, code.sectionNo) && Objects.equals(lectureNo, code.lectureNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sectionNo, lectureNo);
    }
}

class Name implements  Comparable<Name>{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Name name1 = (Name) object;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public int compareTo(Name o) {
        return name.compareTo(o.getName());
    }
}

public class Main {
    public static void main(String[] args) {

        Set<Name> set = new HashSet<>();
        set.add(new Name("Olaide"));
        set.add(new Name("Ridwan"));
        set.add(new Name("Aafiya"));
        set.add(new Name("Mike"));
        set.add(new Name("Rachel"));
        set.add(new Name("Olaide"));

        List<Name> list = new ArrayList<>();
        list.addAll(set);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, new Name("Olaide")));
    }
}
