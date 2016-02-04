/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
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

public class GIM_BVH_TREE_NODE extends BulletBase {
	private long swigCPtr;
	
	protected GIM_BVH_TREE_NODE(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new GIM_BVH_TREE_NODE, normally you should not need this constructor it's intended for low-level usage. */ 
	public GIM_BVH_TREE_NODE(long cPtr, boolean cMemoryOwn) {
		this("GIM_BVH_TREE_NODE", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(GIM_BVH_TREE_NODE obj) {
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
				CollisionJNI.delete_GIM_BVH_TREE_NODE(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setBound(btAABB value) {
    CollisionJNI.GIM_BVH_TREE_NODE_bound_set(swigCPtr, this, btAABB.getCPtr(value), value);
  }

  public btAABB getBound() {
    long cPtr = CollisionJNI.GIM_BVH_TREE_NODE_bound_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btAABB(cPtr, false);
  }

  public GIM_BVH_TREE_NODE() {
    this(CollisionJNI.new_GIM_BVH_TREE_NODE(), true);
  }

  public boolean isLeafNode() {
    return CollisionJNI.GIM_BVH_TREE_NODE_isLeafNode(swigCPtr, this);
  }

  public int getEscapeIndex() {
    return CollisionJNI.GIM_BVH_TREE_NODE_getEscapeIndex(swigCPtr, this);
  }

  public void setEscapeIndex(int index) {
    CollisionJNI.GIM_BVH_TREE_NODE_setEscapeIndex(swigCPtr, this, index);
  }

  public int getDataIndex() {
    return CollisionJNI.GIM_BVH_TREE_NODE_getDataIndex(swigCPtr, this);
  }

  public void setDataIndex(int index) {
    CollisionJNI.GIM_BVH_TREE_NODE_setDataIndex(swigCPtr, this, index);
  }

}
