package org.apache.xml.security.utils;

import org.w3c.dom.*;
import org.apache.xml.security.exceptions.*;
import org.apache.xml.security.utils.*;

/**
 *
 *
 *
 *
 * @author $Author$
 *
 */

public class EncryptionElementProxy extends ElementProxy {

  public EncryptionElementProxy(Document doc, String localname) {
     super(doc, localname, EncryptionConstants.EncryptionSpecNS);
  }


  public EncryptionElementProxy(Element element, String BaseURI, String localname) throws XMLSecurityException {
     super(element, BaseURI, localname);
  }


   public  final String getBaseNamespace() {
      return EncryptionConstants.EncryptionSpecNS;
   }
}