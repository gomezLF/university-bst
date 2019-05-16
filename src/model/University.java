package model;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String name;
    private String adress;

    private AcademicUnit root;

    public University(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public void add(String n, int c, String a) {
        AcademicUnit newUnit = new AcademicUnit(n, c, a);
        if (root == null) {
            root = newUnit;
        } else {
            AcademicUnit current = root;
            boolean added = false;
            while (!added) {
                if (newUnit.compareTo(current) > 0) {
                    if (current.getRight() == null) {
                        current.setRight(newUnit);
                        added = true;
                    } else {
                        current = current.getRight();
                    }
                }else {
                    if (current.getLeft() == null) {
                        current.setLeft(newUnit);
                        added = true;
                    } else {
                        current = current.getLeft();
                    }
                }
            }
        }
    }

    public List<AcademicUnit> preorder(){
        List<AcademicUnit> list = new ArrayList<AcademicUnit>();

        if (root != null){
            root.preOrder(list);
        }
        return list;
    }

    public List<AcademicUnit> inOrder(){
        List<AcademicUnit> list = new ArrayList<>();

        if (root != null){
            root.inOrder(list);
        }
        return list;
    }

    public List<AcademicUnit> postOrder(){
        List<AcademicUnit> list = new ArrayList<>();

        if (root != null){
            root.postOrder(list);
        }
        return list;
    }


}
