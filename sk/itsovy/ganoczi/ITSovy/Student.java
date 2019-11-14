package sk.itsovy.ganoczi.ITSovy;

public class Student {
    private String firstName;
    private String lastName;
    private int[] birthDate;
    private String[] subjects= new String[0];

    public Student(String firstName, String lastName, int[] birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int[] getBirthDate() {

        return birthDate;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void addSubject(String subject){
        String[] tempSubjects=new String[subjects.length+1];
        tempSubjects[subjects.length]=subject;
        subjects=tempSubjects;
    }

    public void printSubjects(){
        for (int i=0; i< subjects.length ;i++){
            System.out.println(subjects[i]);
        }
    }

    public void deleteSubject(String subject) {

        int tempLength = subjects.length;
        int temp = 0;
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == subject) {
                temp = 1;
            }
            for (i = 0; i < subjects.length - 1; i++) {
                subjects[i] = subjects[i + 1];
            }
            tempLength--;
        }
    }

    public int getBirthDay(){
        return birthDate[0];
    }

    public int getBirthMonth() {
       return birthDate[1];
    }

    public int getBirthYear(){
        return birthDate[2];
    }


    public void getZodiac(Student student) {
        int day = getBirthDay();
        int month = getBirthMonth();


        if ((day >= 22 && month == 12) || (day <= 20 && month == 1)) {
            System.out.println("Vase znamenie je Kozorozec");
        } else if ((day >= 21 && month == 1) || (day <= 19 && month == 2)) {
            System.out.println("Vase znamenie je Vodnar");
        } else if ((day >= 20 && month == 2) || (day <= 20 && month == 3)) {
            System.out.println("Vase znamenie su Ryby");
        } else if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) {
            System.out.println("Vase znamenie je Baran");
        } else if ((day >= 21 && month == 4) || (day <= 21 && month == 5)) {
            System.out.println("Vase znamenie je Byk");
        } else if ((day >= 22 && month == 5) || (day <= 21 && month == 6)) {
            System.out.println("Vase znamenie su Blizenci");
        } else if ((day >= 22 && month == 6) || (day <= 22 && month == 7)) {
            System.out.println("Vase znamenie je Rak");
        } else if ((day >= 23 && month == 7) || (day <= 23 && month == 8)) {
            System.out.println("Vase znamenie je Lev");
        } else if ((day >= 24 && month == 8) || (day <= 23 && month == 9)) {
            System.out.println("Vase znamenie je Panna");
        } else if ((day >= 24 && month == 9) || (day <= 23 && month == 10)) {
            System.out.println("Vase znamenie je Vahy");
        } else if ((day >= 24 && month == 10) || (day <= 22 && month == 11)) {
            System.out.println("Vase znamenie je Skorpion");
        } else if ((day >= 23 && month == 11) || (day <= 21 && month == 12)) {
            System.out.println("Vase znamenie je Strelec");
        } else if (day == 0 || day > 31 || month == 0 || month > 12 || (month == 2 && day > 28)) {
            System.out.println("Zadali ste zly datum");
        }
    }


    @Override
    public String toString() {
        return firstName + " " + lastName + " " + getBirthMonth();
    }
}
