package scala.beifengwang

/**
 * Created by Administrator on 2016/8/1.
 * ��ʱ���ǿ����ڴ�����Ķ���ʱ��ָ���ö������ĳ��trait����������ֻ�������������trait�ķ��������������������û��
 */
object Trait_5 {

  def main(args: Array[String]) {

    val a = new P6("Guo")
    a.sayHello
    val b = new P6("Yuan") with MyLogger
    b.sayHello
  }

}
trait Logged {
  def log(msg:String) {}
}
trait MyLogger extends Logged {
  override def log(msg:String): Unit = {
    println("log: " + msg)
  }
}
class P6(val name:String) extends Logged {
  def sayHello: Unit = {
    println("Hi,i'm" + name)
    log("sayHello is invoked!")
  }
}