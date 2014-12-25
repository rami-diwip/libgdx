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

public class btOptimizedBvh extends btQuantizedBvh {
	private long swigCPtr;
	
	protected btOptimizedBvh(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btOptimizedBvh_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btOptimizedBvh, normally you should not need this constructor it's intended for low-level usage. */
	public btOptimizedBvh(long cPtr, boolean cMemoryOwn) {
		this("btOptimizedBvh", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btOptimizedBvh_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btOptimizedBvh obj) {
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
				CollisionJNI.delete_btOptimizedBvh(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btOptimizedBvh() {
    this(CollisionJNI.new_btOptimizedBvh(), true);
  }

  public void build(btStridingMeshInterface triangles, boolean useQuantizedAabbCompression, Vector3 bvhAabbMin, Vector3 bvhAabbMax) {
    CollisionJNI.btOptimizedBvh_build(swigCPtr, this, btStridingMeshInterface.getCPtr(triangles), triangles, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax);
  }

  public void refit(btStridingMeshInterface triangles, Vector3 aabbMin, Vector3 aabbMax) {
    CollisionJNI.btOptimizedBvh_refit(swigCPtr, this, btStridingMeshInterface.getCPtr(triangles), triangles, aabbMin, aabbMax);
  }

  public void refitPartial(btStridingMeshInterface triangles, Vector3 aabbMin, Vector3 aabbMax) {
    CollisionJNI.btOptimizedBvh_refitPartial(swigCPtr, this, btStridingMeshInterface.getCPtr(triangles), triangles, aabbMin, aabbMax);
  }

  public void updateBvhNodes(btStridingMeshInterface meshInterface, int firstNode, int endNode, int index) {
    CollisionJNI.btOptimizedBvh_updateBvhNodes(swigCPtr, this, btStridingMeshInterface.getCPtr(meshInterface), meshInterface, firstNode, endNode, index);
  }

  public boolean serializeInPlace(long o_alignedDataBuffer, long i_dataBufferSize, boolean i_swapEndian) {
    return CollisionJNI.btOptimizedBvh_serializeInPlace(swigCPtr, this, o_alignedDataBuffer, i_dataBufferSize, i_swapEndian);
  }

  public static btOptimizedBvh deSerializeInPlace(long i_alignedDataBuffer, long i_dataBufferSize, boolean i_swapEndian) {
    long cPtr = CollisionJNI.btOptimizedBvh_deSerializeInPlace(i_alignedDataBuffer, i_dataBufferSize, i_swapEndian);
    return (cPtr == 0) ? null : new btOptimizedBvh(cPtr, false);
  }

}
