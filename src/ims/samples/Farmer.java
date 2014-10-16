
package ims.samples;

public class Farmer {
    
    private int id;
    private String name;
    private String nic;
    private String address;
    private String contactNo;
    private String description;
    
    
    
    public void Farmer(int id,String name,String nic,String address,String contactNo,String description){
        this.id=id;
        this.name=name;
        this.nic=nic;
        this.address=address;
        this.contactNo=contactNo;
        this.description=description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
