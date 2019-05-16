package model;

import java.util.List;

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

    public void preOrder(List<AcademicUnit> list){
        list.add(this);

        if (left != null){
            left.preOrder(list);
        }
        if (right != null){
            right.preOrder(list);
        }
    }

    public void inOrder(List<AcademicUnit> list){
        if (left != null){
            left.inOrder(list);
        }

        list.add(this);

        if (right != null){
            right.inOrder(list);
        }
    }

    public void postOrder(List<AcademicUnit> list){
        if (left != null){
            left.postOrder(list);
        }
        if (right != null){
            right.postOrder(list);
        }

        list.add(this);
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
