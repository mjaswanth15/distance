
public class Distance {
int x;
int y;
public Distance() {
	}
public Distance(int x, int y) {
	this.x = x;
	this.y = y;
}
public void setX(int x) {
	this.x = x;
}
public void setY(int y) {
	this.y = y;
}
public int getX() {
	return this.x;
}
public int getY() {
	return this.y;
}
public double distance1(int x1, int y1, int x2, int y2) {
return Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1) *(y2-y1)));	
}
}
