# bezier

A set of classes that parse a SVG path and allows interpolation along this path.

## Example Usage

BezierPath path = new BezierPath();
path.parsePathString("M 68.571429,923.79075 C 480,860.93361 511.42857,615.21933 511.42857,615.21933")

path.eval(0.0f); // Point at the beginning of the path

path.eval(0.5f); // Point half of the way along the path

path.eval(1.0f); // Point at the end of the path

Too see what the entire path looks like check out DrawBezierPath.java. 
