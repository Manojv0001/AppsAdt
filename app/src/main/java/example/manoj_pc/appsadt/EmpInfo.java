package example.manoj_pc.appsadt;

import android.support.annotation.NonNull;

public class EmpInfo implements Comparable<EmpInfo>{
    private String name;
    private String designation;
    private int imagepic;


    public  EmpInfo(){

    }
    


    public EmpInfo(String name,String designation,int imagepic){
        this.name = name;
        this.designation = designation;
        this.imagepic = imagepic;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getImagepic() {
        return imagepic;
    }

    public void setImagepic(int imagepic) {
        this.imagepic = imagepic;
    }

    @Override
    public int compareTo(@NonNull EmpInfo empInfo) {
        return name.compareTo(empInfo.name);
    }
}
