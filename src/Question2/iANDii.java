/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Question2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author Brandon Lotriet(211202320)
 * This class is for the answers of question 2.i AND question 2.ii HENCE the name iANDii
 */
public class iANDii {
    private List myList = new ArrayList();
    private Set<Student> mySet = new HashSet<>();
    
    /*
     * Set up list, and add duplicates    
     */
    private void i()
    {
        myList.add(new Student("Brandon", "Lotriet", "211202320", "0713968529"));
        myList.add(new Student("John", "Kastoor", "217899881", "071385129"));
        myList.add(new Student("Clive", "Evertse", "882621896", "0713898469"));
        myList.add(new Student("Charmaine", "Salie", "789654123", "0713121562"));
        myList.add(new Student("Fatima", "Solomon", "333333333", "0713860531"));
        myList.add(new Student("Lester", "Stoffels", "777777777", "0786220229"));
        myList.add(new Student("Jonathan", "Genot", "555555555", "0725631229"));
        myList.add(new Student("Stu", "Padassol", "305896574", "0716532529"));
        myList.add(new Student("Ivana B", "Withew", "309654574", "0812456987"));
        myList.add(new Student("Fin", "Lee", "305896374", "0798456429"));
        
        
        myList.add(new Student("Brandon", "Lotriet", "211202320", "0713968529"));
        myList.add(new Student("John", "Kastoor", "217899881", "071385129"));
        myList.add(new Student("Clive", "Evertse", "882621896", "0713898469"));
        myList.add(new Student("Charmaine", "Salie", "789654123", "0713121562"));
        myList.add(new Student("Fatima", "Solomon", "333333333", "0713860531"));
        myList.add(new Student("Lester", "Stoffels", "777777777", "0786220229"));
        myList.add(new Student("Jonathan", "Genot", "555555555", "0725631229"));
        myList.add(new Student("Stu", "Padassol", "305896574", "0716532529"));
        myList.add(new Student("Ivana B", "Withew", "309654574", "0812456987"));
        myList.add(new Student("Fin", "Lee", "305896374", "0798456429"));
    }
    
    /*
     * Add to set   
     */
    public void ii()
    {
        for(int i = 0; i< myList.size();i++)
        {
            Student temp = (Student)myList.get(i);
            mySet.add(temp);
        }
    }
}
