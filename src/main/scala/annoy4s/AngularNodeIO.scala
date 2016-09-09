package annoy4s

object AngularNodeIO extends AngularNodeIO

/**
  * n_descendants: Int = 4
  * n_children[0]: Int = 4
  * n_children[1]: Int = 4
  * v: Array[Float] = f * 4
  */
trait AngularNodeIO extends NodeIO {

  override def nodeSizeInBytes(dim: Int): Int = 12 + dim * 4
  override def childrenCapacity(dim: Int): Int = 2 + dim
  override val offsetDescendants: Int = 0
  override val offsetChildren: Int = 4
  override val offsetValue: Int = 12

}

