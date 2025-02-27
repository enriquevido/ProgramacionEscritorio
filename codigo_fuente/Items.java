import javax.swing.*;

import java.util.*;
class Items {

    boolean search, modify, delete;
    ArrayList<Data> items;
   
   //constructor
    public Items () {
        items = new ArrayList<Data>();
    }
   
    public void addRecord( ) {
	   String name = JOptionPane.showInputDialog("Enter name");
	   String address = JOptionPane.showInputDialog("Enter address");
       String phoneNum = JOptionPane.showInputDialog("Enter phone number");
     
       Data p = new Data(name, address, phoneNum);
       items.add(p);
   }

    public void searchRecord () {
         if (!items.isEmpty()) {
             String var = JOptionPane.showInputDialog("Enter name to search ");
             for (int i = 0; i < items.size(); i++) {
                 Data p = (Data)items.get(i);
                 if (var.equals(p.name)) {
                     search = true;
                     p.print();
                 }
             }
             // end for
              if (!search) {
                  JOptionPane.showMessageDialog(null, "Record not found");
              }

         } else {
             JOptionPane.showMessageDialog(null, "....Sorry there isn't any record....");
         }
    } // end searchPerson

  //Delete the specific person from the record
    
    public void deleteRecord () {
    	if (!(items.isEmpty())) {
            String var = JOptionPane.showInputDialog("Enter Name To Delete ");

            for (int i = 0; i < items.size(); i++) {
                Data p = (Data)items.get(i);
                    if (var.equals(p.name)) {
                        delete = true;
                        items.remove(i);
                        JOptionPane.showMessageDialog(null, "Record is deleted ");
                    }
                }

            if (!delete) {
                JOptionPane.showMessageDialog(null, "Record not found");
            }
        } else {
            JOptionPane.showMessageDialog(null, "....Sorry there isn't any record....");
    	}
    }
    
 // TO display all the records   
    
    public void allRecord(){
    	if(items.isEmpty()){
    		JOptionPane.showMessageDialog(null, "....Sorry no records found....");
    	}
    	
       for (int i=0; i< items.size(); i++) {
             Data p = (Data)items.get(i);
             JOptionPane.showMessageDialog(null, "Record No:"+(i+1) +"\nName: " + p.name + "\nAddress: " + p.address + "\nPhone number: " + p.phoneNum);
       }
    }
    
   // Modify records. 
    public void modifyRecord(){
    	if(!items.isEmpty()){
            String var = JOptionPane.showInputDialog("Enter name to modify ");

            for (int i = 0; i < items.size(); i++) {
                Data p = (Data)items.get(i);

                if (var.equals(p.name)) {
                     modify = true;
                     p.print();
                     items.remove(i);

                    String name = JOptionPane.showInputDialog("Enter new name, last one is: " + p.name);
                    String address = JOptionPane.showInputDialog("Enter new address, last one is: " + p.address);
                    String phoneNum = JOptionPane.showInputDialog("Enter new phone number, last one is: " + p.phoneNum);

                    Data p1 = new Data(name, address, phoneNum);
                    items.add(p1);
                    p1.print();
                }
            }

            if(!modify){
                JOptionPane.showMessageDialog(null, "Record Not found");
            }
    	} else {
    		JOptionPane.showMessageDialog(null, "....Sorry there isn´t any record....");
    	}
    }
}