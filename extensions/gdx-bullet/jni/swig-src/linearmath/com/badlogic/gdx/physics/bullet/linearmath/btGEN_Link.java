/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.linearmath;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btGEN_Link extends BulletBase {
	private long swigCPtr;
	
	protected btGEN_Link(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGEN_Link, normally you should not need this constructor it's intended for low-level usage. */ 
	public btGEN_Link(long cPtr, boolean cMemoryOwn) {
		this("btGEN_Link", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btGEN_Link obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				LinearMathJNI.delete_btGEN_Link(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btGEN_Link() {
    this(LinearMathJNI.new_btGEN_Link__SWIG_0(), true);
  }

  public btGEN_Link(btGEN_Link next, btGEN_Link prev) {
    this(LinearMathJNI.new_btGEN_Link__SWIG_1(btGEN_Link.getCPtr(next), next, btGEN_Link.getCPtr(prev), prev), true);
  }

  public btGEN_Link getNext() {
    long cPtr = LinearMathJNI.btGEN_Link_getNext(swigCPtr, this);
    return (cPtr == 0) ? null : new btGEN_Link(cPtr, false);
  }

  public btGEN_Link getPrev() {
    long cPtr = LinearMathJNI.btGEN_Link_getPrev(swigCPtr, this);
    return (cPtr == 0) ? null : new btGEN_Link(cPtr, false);
  }

  public boolean isHead() {
    return LinearMathJNI.btGEN_Link_isHead(swigCPtr, this);
  }

  public boolean isTail() {
    return LinearMathJNI.btGEN_Link_isTail(swigCPtr, this);
  }

  public void insertBefore(btGEN_Link link) {
    LinearMathJNI.btGEN_Link_insertBefore(swigCPtr, this, btGEN_Link.getCPtr(link), link);
  }

  public void insertAfter(btGEN_Link link) {
    LinearMathJNI.btGEN_Link_insertAfter(swigCPtr, this, btGEN_Link.getCPtr(link), link);
  }

  public void remove() {
    LinearMathJNI.btGEN_Link_remove(swigCPtr, this);
  }

}
