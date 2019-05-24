package com.evaluacion.evaluacion;
import java.util.*;


public class EnrollmentService {
    String NameCurse="";
    String[ ] ListPerson = {"Brandon", "Uzidel", "Octavio","Fernando","Jorge","Adolfo"};

    public EnrollmentService(){
     NameCurse ="Trainig Java con Marcelo";
    }

    public String getNameCurse() {
        return NameCurse;
    }

    public void setNameCurse(String nameCurse) {
        NameCurse = nameCurse;
    }

    public String[] getListPerson() {
        return ListPerson;
    }

    public void setListPerson(String[] listPerson) {
        ListPerson = listPerson;
    }
}
