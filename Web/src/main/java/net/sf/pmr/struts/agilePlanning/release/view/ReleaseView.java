/*
* Copyright 2005 Arnaud Prost
* 
* Arnaud.prost@gmail.com
* 
* This software is a computer program whose purpose is to ease the 
* management of software project.
* 
* This software is governed by the CeCILL  license under French law and
* abiding by the rules of distribution of free software.  You can  use, 
* modify and/ or redistribute the software under the terms of the CeCILL
* license as circulated by CEA, CNRS and INRIA at the following URL
* "http://www.cecill.info". 
* 
* As a counterpart to the access to the source code and  rights to copy,
* modify and redistribute granted by the license, users are provided only
* with a limited warranty  and the software's author,  the holder of the
* economic rights,  and the successive licensors  have only  limited
* liability. 
* 
* In this respect, the user's attention is drawn to the risks associated
* with loading,  using,  modifying and/or developing or reproducing the
* software by the user in light of its specific status of free software,
* that may mean  that it is complicated to manipulate,  and  that  also
* therefore means  that it is reserved for developers  and  experienced
* professionals having in-depth computer knowledge. Users are therefore
* encouraged to load and test the software's suitability as regards their
* requirements in conditions enabling the security of their systems and/or 
* data to be ensured and,  more generally, to use and operate it in the 
* same conditions as regards security. 
* 
* The fact that you are presently reading this means that you have had
* knowledge of the CeCILL license and that you accept its terms.
*/

package net.sf.pmr.struts.agilePlanning.release.view;

import java.util.Date;

import net.sf.pmr.struts.utils.DateFormatUtils;

public class ReleaseView {

	/**
	 * persistance id.
	 */
	private int persistanceId;
	
    /**
     * number.
     */
    private String number;

    /**
     * date.
     */
    private Date date;
    
    /**
     * warning.
     */
    private boolean warning;
    
    
	/**
	 * @return Returns the persistanceId.
	 */
	public int getPersistanceId() {
		return persistanceId;
	}

	/**
	 * @param persistanceId The persistanceId to set.
	 */
	public void setPersistanceId(int persistanceId) {
		this.persistanceId = persistanceId;
	}

	/**
	 * @return Returns the date.
	 */
	public Date getDate() {
		return  date;
	}
	
	/**
	 * @return Returns the date.
	 */
	public String getDateInString() {
		return  DateFormatUtils.DateToString(date);
	}


	/**
	 * @param date The date to set.
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return Returns the number.
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number The number to set.
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return Returns the warning.
	 */
	public boolean isWarning() {
		return warning;
	}

	/**
	 * @param warning The warning to set.
	 */
	public void setWarning(boolean warning) {
		this.warning = warning;
	}

}
