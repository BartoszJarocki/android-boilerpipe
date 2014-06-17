
package mf.org.w3c.dom.svg;

import mf.org.w3c.dom.DOMException;
public interface SVGAnimatedInteger {
  public int getBaseVal( );
  public void           setBaseVal( int baseVal )
                       throws DOMException;
  public int getAnimVal( );
}
