import javax.swing.*;

class Data {
    String name;
    String address;
    String phoneNum;

//parameterized constructor
    public Data(String name, String address, String phoneNum) {
         this.name = name;
		 this.address = address;
		 this.phoneNum = phoneNum;
    }
    
//method for displaying person record on GUI
    public void print() {
        JOptionPane.showMessageDialog(null, "\nName: " + name
                + "\nAddress: " + address + "\nPhone number: " + phoneNum);
    }
}