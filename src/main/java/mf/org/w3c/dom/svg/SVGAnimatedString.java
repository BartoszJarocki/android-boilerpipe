
package mf.org.w3c.dom.svg;

import mf.org.w3c.dom.DOMException;
public interface SVGAnimatedString {
  public String getBaseVal( );
  public void           setBaseVal( String baseVal )
                       throws DOMException;
  public String getAnimVal( );
}
