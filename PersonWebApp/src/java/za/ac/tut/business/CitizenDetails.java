/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import ac.za.tut.model.Citizen;
import javax.ejb.Stateless;

/**
 *
 * @author Manny
 */
@Stateless
public class CitizenDetails implements CitizenDetailsLocal {

    @Override
    public Citizen getCitizenDetails(String idno) {
        Citizen cDetails = new Citizen();
        
        if(idno.length() == 13)
        {
            int genderVal = Integer.parseInt(idno.substring(6, 10));
            
            if (genderVal > 4999) {
                cDetails.setGender("Male");
            } else
            {
                cDetails.setGender("Female");
            }
            
            cDetails.setIdNumber(idno);
            cDetails.setDob("1991/09/12");
            cDetails.setAge(24);
            cDetails.setStatus("Active");
        }
        else {
            
        }
        
        return cDetails;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
