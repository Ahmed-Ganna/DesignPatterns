package structural.facade;

import creational.singleton.DBSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {
    private DBSingleton instance;

    public JdbcFacade() {
        this.instance = DBSingleton.getInstance();
    }

    public int createTable(){
        int count = 0;
        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertData(){
        int count = 0;
        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City) values (1, '1234 Some street', 'Layton')");
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddresses(){
        List<Address> addresses = new ArrayList<>();

        try {
            Connection conn = instance.getConnection();
            Statement sta = conn.createStatement();
            ResultSet rs = sta.executeQuery("SELECT * FROM Address");

            while(rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            rs.close();
            sta.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return addresses;
    }

    class Address {
        private String id;
        private String streetName;
        private String city;

        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }
        public String getStreetName() {
            return streetName;
        }
        public void setStreetName(String streetName) {
            this.streetName = streetName;
        }
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }
    }


}

