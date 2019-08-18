/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import ac.za.tut.model.Citizen;
import javax.ejb.Local;

/**
 *
 * @author Manny
 */
@Local
public interface CitizenDetailsLocal {
    public Citizen getCitizenDetails(String idno);
}
