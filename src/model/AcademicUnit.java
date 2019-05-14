package model;

public class AcademicUnit implements Comparable<AcademicUnit> {

    private AcademicUnit left;
    private AcademicUnit right;

    private String name;
    private int code;
    private String director;

    public AcademicUnit(String name, int code, String director) {
        this.name = name;
        this.code = code;
        this.director = director;
    }

    public AcademicUnit getLeft() {
        return left;
    }

    public AcademicUnit getRight() {
        return right;
    }

    public void setLeft(AcademicUnit left) {
        this.left = left;
    }

    public void setRight(AcademicUnit right) {
        this.right = right;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public int compareTo(AcademicUnit o) {
        if(code > o.getCode()){
            return 1;
        }else if (code < o.getCode()){
            return -1;
        }else
            return 0;
    }
}
