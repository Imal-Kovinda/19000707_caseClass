package act_4

object Answer {
  case class Point(a:Int,b:Int){
    def x:Int = a;
    def y:Int = b;
    
    def +(plus:Point)=(this.x+plus.x,this.y+plus.y);
    def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy);
    def distance(dis:Point)=(this.x-dis.x,this.y-dis.y);
    
  }
  def main(agrs:Array[String]){
    val m = Point(2,8);
    val n = Point(3,6);
    
    println(m+n);
    
    val d = m.move(2,3);
    println("After Moved : " + d);
    
    val dis = m.distance(n);
    println("Distance of m and n: " + dis);
    
    val invert = (i:Point) => i match{
      case Point(x,y)=> "After switch: " + "(" + y + "," + x + ")";
      case _=>println(i);
    }
    val i = Point(6,4);
    println("Before switch: "+i);
    println(invert(i));
    
  }
}