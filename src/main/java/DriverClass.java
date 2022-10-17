import org.checkerframework.checker.units.qual.A;
import org.joda.time.LocalDate;
import java.util.ArrayList;

public class DriverClass {
    public static void main(String[] args) {
        CourseProgramme BCT = new CourseProgramme("Computer Science", LocalDate.parse("2022-08-15"), LocalDate.parse("2023-05-15"));
        CourseProgramme commerce = new CourseProgramme("Commerce", LocalDate.parse("2022-08-15"), LocalDate.parse("2023-05-15"));
        ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
        courses.add(BCT);
        courses.add(commerce);

        Lecturer barryMulhern = new Lecturer(4815, "Barry Mulhern", 27, LocalDate.parse("1980-10-27"));
        Lecturer alexJones = new Lecturer(4815, "Alex Jones", 27, LocalDate.parse("1980-10-27"));
        Lecturer jimMcGuinness = new Lecturer(4815, "Jim McGuinness", 27, LocalDate.parse("1980-10-27"));
        Lecturer maryBerry = new Lecturer(4815, "Mary Berry", 27, LocalDate.parse("1980-10-27"));

        Module disMath = new Module("Discrete Mathematics", 3456, barryMulhern);
        BCT.addModule(disMath);
        commerce.addModule(disMath);
        Module forensicComp = new Module("Forensic Computing", 12768, barryMulhern);
        BCT.addModule(forensicComp);
        Module cyberSec = new Module("Cyber Security", 974628, alexJones);
        BCT.addModule(cyberSec);
        Module macroEc = new Module("Macro Economics", 55647, jimMcGuinness);
        commerce.addModule(macroEc);
        Module microEc = new Module("Micro Economics", 84513, maryBerry);
        commerce.addModule(microEc);

        //init some students
        Student student1 = new Student("Alex",20, 51545, LocalDate.parse("2002-05-23"), BCT);
        Student student2 = new Student("Jason",24, 5674, LocalDate.parse("1998-09-23"), BCT);
        Student student3 = new Student("Paul",22, 9987, LocalDate.parse("1999-12-31"), commerce);
        Student student4 = new Student("Gary",22, 9987, LocalDate.parse("1999-12-31"), commerce);
        Student student5 = new Student("Alan",22, 9987, LocalDate.parse("1999-12-31"), BCT);
        Student student6 = new Student("Laura", 22, 9987, LocalDate.parse("1999-12-31"), commerce);

        for(CourseProgramme course: courses) {
            System.out.println(course);
        }
    }
}
