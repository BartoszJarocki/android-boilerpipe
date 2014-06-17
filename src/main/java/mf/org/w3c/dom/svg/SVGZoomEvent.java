
package mf.org.w3c.dom.svg;

import mf.org.w3c.dom.events.UIEvent;

public interface SVGZoomEvent extends 
               UIEvent {
  public SVGRect getZoomRectScreen( );
  public float getPreviousScale( );
  public SVGPoint getPreviousTranslate( );
  public float getNewScale( );
  public SVGPoint getNewTranslate( );
}
