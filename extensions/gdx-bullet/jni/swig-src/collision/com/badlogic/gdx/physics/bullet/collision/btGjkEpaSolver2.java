/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
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

public class btGjkEpaSolver2 extends BulletBase {
	private long swigCPtr;
	
	protected btGjkEpaSolver2(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btGjkEpaSolver2, normally you should not need this constructor it's intended for low-level usage. */ 
	public btGjkEpaSolver2(long cPtr, boolean cMemoryOwn) {
		this("btGjkEpaSolver2", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btGjkEpaSolver2 obj) {
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
				CollisionJNI.delete_btGjkEpaSolver2(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public static int StackSizeRequirement() {
    return CollisionJNI.btGjkEpaSolver2_StackSizeRequirement();
  }

  public static boolean Distance(btConvexShape shape0, Matrix4 wtrs0, btConvexShape shape1, Matrix4 wtrs1, Vector3 guess, SWIGTYPE_p_btGjkEpaSolver2__sResults results) {
    return CollisionJNI.btGjkEpaSolver2_Distance(btConvexShape.getCPtr(shape0), shape0, wtrs0, btConvexShape.getCPtr(shape1), shape1, wtrs1, guess, SWIGTYPE_p_btGjkEpaSolver2__sResults.getCPtr(results));
  }

  public static boolean Penetration(btConvexShape shape0, Matrix4 wtrs0, btConvexShape shape1, Matrix4 wtrs1, Vector3 guess, SWIGTYPE_p_btGjkEpaSolver2__sResults results, boolean usemargins) {
    return CollisionJNI.btGjkEpaSolver2_Penetration__SWIG_0(btConvexShape.getCPtr(shape0), shape0, wtrs0, btConvexShape.getCPtr(shape1), shape1, wtrs1, guess, SWIGTYPE_p_btGjkEpaSolver2__sResults.getCPtr(results), usemargins);
  }

  public static boolean Penetration(btConvexShape shape0, Matrix4 wtrs0, btConvexShape shape1, Matrix4 wtrs1, Vector3 guess, SWIGTYPE_p_btGjkEpaSolver2__sResults results) {
    return CollisionJNI.btGjkEpaSolver2_Penetration__SWIG_1(btConvexShape.getCPtr(shape0), shape0, wtrs0, btConvexShape.getCPtr(shape1), shape1, wtrs1, guess, SWIGTYPE_p_btGjkEpaSolver2__sResults.getCPtr(results));
  }

  public static float SignedDistance(Vector3 position, float margin, btConvexShape shape, Matrix4 wtrs, SWIGTYPE_p_btGjkEpaSolver2__sResults results) {
    return CollisionJNI.btGjkEpaSolver2_SignedDistance__SWIG_0(position, margin, btConvexShape.getCPtr(shape), shape, wtrs, SWIGTYPE_p_btGjkEpaSolver2__sResults.getCPtr(results));
  }

  public static boolean SignedDistance(btConvexShape shape0, Matrix4 wtrs0, btConvexShape shape1, Matrix4 wtrs1, Vector3 guess, SWIGTYPE_p_btGjkEpaSolver2__sResults results) {
    return CollisionJNI.btGjkEpaSolver2_SignedDistance__SWIG_1(btConvexShape.getCPtr(shape0), shape0, wtrs0, btConvexShape.getCPtr(shape1), shape1, wtrs1, guess, SWIGTYPE_p_btGjkEpaSolver2__sResults.getCPtr(results));
  }

  public btGjkEpaSolver2() {
    this(CollisionJNI.new_btGjkEpaSolver2(), true);
  }

}
