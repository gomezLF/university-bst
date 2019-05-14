package model;

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


    
    public AcademicUnit search(int c){

    }


}
