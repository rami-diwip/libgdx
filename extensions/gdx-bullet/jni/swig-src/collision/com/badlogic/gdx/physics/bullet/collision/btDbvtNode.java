/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btDbvtNode extends BulletBase {
	private long swigCPtr;
	
	protected btDbvtNode(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btDbvtNode, normally you should not need this constructor it's intended for low-level usage. */ 
	public btDbvtNode(long cPtr, boolean cMemoryOwn) {
		this("btDbvtNode", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btDbvtNode obj) {
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
				CollisionJNI.delete_btDbvtNode(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setVolume(btDbvtAabbMm value) {
    CollisionJNI.btDbvtNode_volume_set(swigCPtr, this, btDbvtAabbMm.getCPtr(value), value);
  }

  public btDbvtAabbMm getVolume() {
    long cPtr = CollisionJNI.btDbvtNode_volume_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btDbvtAabbMm(cPtr, false);
  }

  public void setParent(btDbvtNode value) {
    CollisionJNI.btDbvtNode_parent_set(swigCPtr, this, btDbvtNode.getCPtr(value), value);
  }

  public btDbvtNode getParent() {
    long cPtr = CollisionJNI.btDbvtNode_parent_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btDbvtNode(cPtr, false);
  }

  public boolean isleaf() {
    return CollisionJNI.btDbvtNode_isleaf(swigCPtr, this);
  }

  public boolean isinternal() {
    return CollisionJNI.btDbvtNode_isinternal(swigCPtr, this);
  }

  public void setChilds(SWIGTYPE_p_p_btDbvtNode value) {
    CollisionJNI.btDbvtNode_childs_set(swigCPtr, this, SWIGTYPE_p_p_btDbvtNode.getCPtr(value));
  }

  public SWIGTYPE_p_p_btDbvtNode getChilds() {
    long cPtr = CollisionJNI.btDbvtNode_childs_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_btDbvtNode(cPtr, false);
  }

  public void setData(long value) {
    CollisionJNI.btDbvtNode_data_set(swigCPtr, this, value);
  }

  public long getData() {
    return CollisionJNI.btDbvtNode_data_get(swigCPtr, this);
  }

  public void setDataAsInt(int value) {
    CollisionJNI.btDbvtNode_dataAsInt_set(swigCPtr, this, value);
  }

  public int getDataAsInt() {
    return CollisionJNI.btDbvtNode_dataAsInt_get(swigCPtr, this);
  }

  public btDbvtNode() {
    this(CollisionJNI.new_btDbvtNode(), true);
  }

}
