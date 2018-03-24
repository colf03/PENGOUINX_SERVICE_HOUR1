package com.ship.authorization;
import 
public class ActionDto {
    private String recipient;

    public ActionDto() {
    }

    public ActionDto(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }
    
    public boolean autorisation(String Message){
    	
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    
  /*Verifie si le message est autoriser a etre envoyé
   *
   *- As any crew member, I can create a personal message to anyone with my current rank + 1 and lower
   * - As any crew member, I can reply to a personal message if I have the authorization to do so
   * 
   * 
   * */
    public boolean AutorisationEnvoie{
     	boolean verif=false;
    	if (this.sender=="crewman"){
    		switch(this.recipient){
    			case 1: "ensign";
    				verif=true;
    				break;
    			case 2: "crewman";
    				verif=true;
    				break;
    			default: "Invalid recipient";
    				verif=false;
    				break;
    		}
    		
    	}else if (this.sender=="ensign"){
    		switch(this.recipient){
    			case 1:  "lieutenant"
    				verif=true;
    				break;
				case 2: "ensign";
					verif=true;
					break;
				case 3: "crewman";
					verif=true;
					break;
				default: "Invalid recipient";
					verif=false;
					break;
    		}
    		
    	}else if (this.sender=="lieutenant"){
    		switch(this.recipient){
				case 1:  "admiral"
					verif=false;
					break;
				case 2: "vice_admiral";
					verif=false;
					break;
				case 3: "captain";
					verif=false;
					break;
				default: "Valid recipient";
					verif=true;
					break;
    		}
		}else if (this.sender=="comander"){
			switch(this.recipient){
				case 1:  "admiral"
					verif=false;
					break;
				case 2: "vice_admiral";
					verif=false;
					break;
				default: "Valid recipient";
					verif=true;
					break;
			}
		}else if(this.sender=="comander"){
			switch(this.recipient){
			case 1:  "admiral"
				verif=false;
				break;
			default: "Valid recipient";
				verif=true;
				break;
			}
		}else{
			verif=true;
		}
    	
    	return verif;
    	
    }
}

