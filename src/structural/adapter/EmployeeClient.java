package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployees(){
        List<Employee> list = new ArrayList<>();

        list.add(new EmployeeDB("43","Ahmed","Ganna","andy.ahmedg@gmail.com"));

        list.add(new EmployeeLdapAdapter(new EmployeeLdap("43","Mohamed","Ganna","dev.ahmedg@gmail.com")));

        list.add(new EmployeeCSVAdapter(new EmployeeCSV("23,Ali,Ganna,dev.ahmedg@gmail.com")));


        return list;
    }
}
