
package mf.org.w3c.dom.svg;

import mf.org.w3c.dom.Document;
import mf.org.w3c.dom.events.DocumentEvent;

public interface SVGDocument extends 
               Document,
               DocumentEvent {
  public String    getTitle( );
  public String     getReferrer( );
  public String      getDomain( );
  public String      getURL( );
  public SVGSVGElement getRootElement( );
}
