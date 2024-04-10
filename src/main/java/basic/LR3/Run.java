package basic.LR3;

import basic.LR3.controller.Creator;
import basic.LR3.controller.DepartmentCreator;
import basic.LR3.controller.FacultyCreator;
import basic.LR3.controller.GroupCreator;
import basic.LR3.model.*;
import java.util.Scanner;


public class Run {
    public static void main(String[] args) {;
        Run.start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Виберіть звичайний університет чи НТУ: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Вибрано: НТУ");
            createNTU();
        } else if (choice == 2) {
            System.out.println("Вибрано: звичайний університет");
            createTypicalUniversity();
        }
    }

    public static void createNTU() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть назву університету: ");
        String universityName = scanner.nextLine();

        University university = new University(universityName);

        System.out.println("Введіть імя ректору: ");
        String rectorFirstName = scanner.nextLine();
        System.out.println("Введіть прізвище ректору: ");
        String rectorLastName = scanner.nextLine();
        System.out.println("Введіть по-батькові ректору: ");
        String rectorMiddleName = scanner.nextLine();
        System.out.println("Введіть стать ректору (MALE/FEMALE): ");
        Sex rectorSex = Sex.valueOf(scanner.nextLine().toUpperCase());

        Human rector = new Human(rectorFirstName, rectorLastName, rectorMiddleName, rectorSex);
        university.setRector(rector);

        Faculty faculty = new Faculty();
        System.out.println("Введіть назву факультету: ");
        faculty.setName(scanner.nextLine());

        System.out.println("Введіть імя декана: ");
        String facultyHeadFirstName = scanner.nextLine();
        System.out.println("Введіть прізвище декана: ");
        String facultyHeadLastName = scanner.nextLine();
        System.out.println("Введіть по-батькові декана: ");
        String facultyHeadMiddleName = scanner.nextLine();
        System.out.println("Введіть стать декана (MALE/FEMALE): ");
        Sex facultyHeadSex = Sex.valueOf(scanner.nextLine().toUpperCase());

        Human decan = new Human(facultyHeadFirstName, facultyHeadLastName, facultyHeadMiddleName, facultyHeadSex);
        faculty.setDecan(decan);

        Department department = new Department();
        System.out.println("Введіть назву кафедри: ");
        department.setName(scanner.nextLine());

        System.out.println("Введіть імя зав.кафедри: ");
        String departmentHeadFirstName = scanner.nextLine();
        System.out.println("Введіть прізвище зав.кафедри: ");
        String departmentHeadLastName = scanner.nextLine();
        System.out.println("Введіть по-батькові зав.кафедри: ");
        String departmentHeadMiddleName = scanner.nextLine();
        System.out.println("Введіть стать зав.кафедри (MALE/FEMALE): ");
        Sex departmentHeadSex = Sex.valueOf(scanner.nextLine().toUpperCase());

        Human chair = new Human(departmentHeadFirstName, departmentHeadLastName, departmentHeadMiddleName, departmentHeadSex);
        department.setChair(chair);

        Group group = new Group();
        System.out.println("Введіть назву групи: ");
        group.setName(scanner.nextLine());

        System.out.println("Введіть ім`я керівника групи: ");
        String groupHeadFirstName = scanner.nextLine();
        System.out.println("Введіть прізвище керівника групи: ");
        String groupHeadLastName = scanner.nextLine();
        System.out.println("Введіть по-батькові керівника групи: ");
        String groupHeadMiddleName = scanner.nextLine();
        System.out.println("Введіть стать керівника групи (MALE/FEMALE): ");
        Sex groupHeadSex = Sex.valueOf(scanner.nextLine().toUpperCase());

        Human head = new Human(groupHeadFirstName, groupHeadLastName, groupHeadMiddleName, groupHeadSex);
        group.setHead(head);

        System.out.println("Назва університету: " + university.getName());
        System.out.println("Ректор: " + university.getRector().getFirstName() + " " +
                university.getRector().getLastName());
        System.out.println("Факультет: " + faculty.getName());
        System.out.println("Декан: " + faculty.getDecan().getFirstName() + " " +
                faculty.getDecan().getLastName());
        System.out.println("Кафедра: " + department.getName());
        System.out.println("Зав.кафедри: " + department.getChair().getFirstName() + " " +
                department.getChair().getLastName());
        System.out.println("Група: " + group.getName());
        System.out.println("Керівник групи: " + group.getHead().getFirstName() + " " +
                group.getHead().getLastName());

        scanner.close();
    }

    public static void createTypicalUniversity() {
        University university = new University();
        university.setName("Звичайний університет");

        Human rector = new Human("Михайло", "Михайленко", "Михайлович", Sex.MALE);
        university.setRector(rector);

        Faculty faculty = new Faculty();
        faculty.setName("Факультет Геології");
        Human decan = (new Human("Марина", "Маринович", "Артемівна", Sex.FEMALE));
        faculty.setDecan(decan);

        Department department = new Department();
        department.setName("Кафедра Гірничодобування");
        Human chair = (new Human("Наталка", "Наталович", "Сергіївна", Sex.FEMALE));
        department.setChair(chair);

        Group group = new Group();
        group.setName("103-20-2");
        Human head = (new Human("Данило", "Данілко", "Данилович", Sex.MALE));
        group.setHead(head);

//        Creator facultyCreator = new FacultyCreator();
//        facultyCreator.create();

//        Creator departmentCreator = new DepartmentCreator();
//        departmentCreator.create();

//        Creator groupCreator = new GroupCreator();
//        groupCreator.create();

        System.out.println("Назва університету: " + university.getName());
        System.out.println("Ректор: " + university.getRector().getFirstName() + " " + university.getRector().getLastName());
        System.out.println("Факультет: " + faculty.getName());
        System.out.println("Декан: " + faculty.getDecan().getFirstName() + " " + faculty.getDecan().getLastName());
        System.out.println("Кафедра: " + department.getName());
        System.out.println("Зав.кафедри: " + department.getChair().getFirstName() + " " + department.getChair().getLastName());
        System.out.println("Група: " + group.getName());
        System.out.println("Керівник групи: " + group.getHead().getFirstName() + " " + group.getHead().getLastName());
    }
}