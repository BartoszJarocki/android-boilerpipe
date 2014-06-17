
package mf.org.w3c.dom.svg;

import mf.org.w3c.dom.DOMException;
public interface SVGAnimatedBoolean {
  public boolean getBaseVal( );
  public void           setBaseVal( boolean baseVal )
                       throws DOMException;
  public boolean getAnimVal( );
}
