
package mf.org.w3c.dom.svg;

import mf.org.w3c.dom.DOMException;

public interface SVGColorProfileRule extends 
               SVGCSSRule,
               SVGRenderingIntent {
  public String      getSrc( );
  public void           setSrc( String src )
                       throws DOMException;
  public String      getName( );
  public void           setName( String name )
                       throws DOMException;
  public short getRenderingIntent( );
  public void           setRenderingIntent( short renderingIntent )
                       throws DOMException;
}
