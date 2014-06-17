
package mf.org.w3c.dom.svg;

import mf.org.w3c.dom.DOMException;

public interface SVGPoint {
  public float getX( );
  public void      setX( float x )
                       throws DOMException;
  public float getY( );
  public void      setY( float y )
                       throws DOMException;

  public SVGPoint matrixTransform ( SVGMatrix matrix );
}
