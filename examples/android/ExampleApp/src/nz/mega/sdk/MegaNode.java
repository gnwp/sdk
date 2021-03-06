/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nz.mega.sdk;

public class MegaNode {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MegaNode(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MegaNode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  protected synchronized void delete() {   
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        megaJNI.delete_MegaNode(swigCPtr);
      }
      swigCPtr = 0;
    }
}

   MegaNode copy() {
    long cPtr = megaJNI.MegaNode_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new MegaNode(cPtr, true);
  }

  public int getType() {
    return megaJNI.MegaNode_getType(swigCPtr, this);
  }

  public String getName() {
    return megaJNI.MegaNode_getName(swigCPtr, this);
  }

  public String getBase64Handle() {
    return megaJNI.MegaNode_getBase64Handle(swigCPtr, this);
  }

  public long getSize() {
    return megaJNI.MegaNode_getSize(swigCPtr, this);
  }

  public long getCreationTime() {
    return megaJNI.MegaNode_getCreationTime(swigCPtr, this);
  }

  public long getModificationTime() {
    return megaJNI.MegaNode_getModificationTime(swigCPtr, this);
  }

  public long getHandle() {
    return megaJNI.MegaNode_getHandle(swigCPtr, this);
  }

  public String getBase64Key() {
    return megaJNI.MegaNode_getBase64Key(swigCPtr, this);
  }

  public int getTag() {
    return megaJNI.MegaNode_getTag(swigCPtr, this);
  }

  public boolean isFile() {
    return megaJNI.MegaNode_isFile(swigCPtr, this);
  }

  public boolean isFolder() {
    return megaJNI.MegaNode_isFolder(swigCPtr, this);
  }

  public boolean isRemoved() {
    return megaJNI.MegaNode_isRemoved(swigCPtr, this);
  }

  public boolean hasThumbnail() {
    return megaJNI.MegaNode_hasThumbnail(swigCPtr, this);
  }

  public boolean hasPreview() {
    return megaJNI.MegaNode_hasPreview(swigCPtr, this);
  }

  public boolean isPublic() {
    return megaJNI.MegaNode_isPublic(swigCPtr, this);
  }

  public final static int TYPE_UNKNOWN = -1;
  public final static int TYPE_FILE = 0;
  public final static int TYPE_FOLDER = TYPE_FILE + 1;
  public final static int TYPE_ROOT = TYPE_FOLDER + 1;
  public final static int TYPE_INCOMING = TYPE_ROOT + 1;
  public final static int TYPE_RUBBISH = TYPE_INCOMING + 1;

}
