public class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        int compare = Double.compare(o.cgpa, this.cgpa);
        if(compare == 0){
            return this.fname.compareTo(o.fname);
        }
        else {
            return compare;
        }
    }
}
