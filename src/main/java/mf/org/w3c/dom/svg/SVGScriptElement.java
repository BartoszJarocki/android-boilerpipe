
package mf.org.w3c.dom.svg;

import mf.org.w3c.dom.DOMException;

public interface SVGScriptElement extends 
               SVGElement,
               SVGURIReference,
               SVGExternalResourcesRequired {
  public String getType( );
  public void      setType( String type )
                       throws DOMException;
}
