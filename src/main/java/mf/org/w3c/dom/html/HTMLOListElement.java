/*
 * Copyright (c) 1998 World Wide Web Consortium, (Massachusetts Institute of
 * Technology, Institut National de Recherche en Informatique et en
 * Automatique, Keio University).
 * All Rights Reserved. http://www.w3.org/Consortium/Legal/
 */

package mf.org.w3c.dom.html;

import mf.org.w3c.dom.*;

import mf.org.w3c.dom.html.HTMLElement;

/**
 * Ordered list. See the OL element definition in HTML 4.0.
 */
public interface HTMLOListElement extends HTMLElement {
  /**
   * Reduce spacing between list items. See the compact attribute definition 
   * in HTML 4.0. This attribute is deprecated in HTML 4.0.
   */
  public boolean            getCompact();
  public void               setCompact(boolean compact);
  /**
   * Starting sequence number. See the start attribute definition in HTML 4.0. 
   * This attribute is deprecated in HTML 4.0.
   */
  public int                getStart();
  public void               setStart(int start);
  /**
   * Numbering style. See the type attribute definition in HTML 4.0. This 
   * attribute is deprecated in HTML 4.0.
   */
  public String             getType();
  public void               setType(String type);
}

