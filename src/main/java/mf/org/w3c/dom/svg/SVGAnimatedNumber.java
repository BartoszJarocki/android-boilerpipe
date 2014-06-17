
package mf.org.w3c.dom.svg;

import mf.org.w3c.dom.DOMException;
public interface SVGAnimatedNumber {
  public float getBaseVal( );
  public void           setBaseVal( float baseVal )
                       throws DOMException;
  public float getAnimVal( );
}
