
package org.opentele.server.provider.integration.cpr.stamdatalookup.generated;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.6.2
 * 2013-07-03T08:18:11.750+02:00
 * Generated source version: 2.6.2
 */

@WebFault(name = "FaultCode", targetNamespace = "http://www.medcom.dk/dgws/2006/04/dgws-1.0.xsd")
public class DGWSFault extends Exception {
    
    private java.lang.String faultCode;

    public DGWSFault() {
        super();
    }
    
    public DGWSFault(String message) {
        super(message);
    }
    
    public DGWSFault(String message, Throwable cause) {
        super(message, cause);
    }

    public DGWSFault(String message, java.lang.String faultCode) {
        super(message);
        this.faultCode = faultCode;
    }

    public DGWSFault(String message, java.lang.String faultCode, Throwable cause) {
        super(message, cause);
        this.faultCode = faultCode;
    }

    public java.lang.String getFaultInfo() {
        return this.faultCode;
    }
}
