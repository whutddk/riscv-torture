package torture

import scala.collection.mutable.ArrayBuffer
import Rand._

// TODO: Make this class better-featured
class Mem(newtag: String, newsize: Int)
{
  val tag = newtag
  val size = newsize

  override def toString = 
 {
    var s = tag + ":\n"
    for (i <- 0 to size/8/2)
      s += "\t.dword 0x%016x, 0x%016x\n" format (rand_dword, rand_dword)
    s += "\n"
    s
  }
}
