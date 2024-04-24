# CSC360 GeometricObject Octagon
 
In a file named Octagon.java write an Octagon class that extends GeometricObject and implements the 
Comparable and Cloneable interfaces. Assume that all eight sides of an octagon are of equal length. 
Write methods for computing the area and the perimeter. The perimeter is obviously 8 times the side 
length. The area can be computed using the following formula:

area = (2 + 4 / Math.sqrt(2)) * side * side

In addition to a side data field, every Octagon should have an isClone data field of type boolean.
By default the isClone value is false. However, if an Octagon was created by your clone method,
then the isClone value should be true. (I.e., the clone() method should set to true the isClone
value of the newly created Octagon.) Write a toString method in the Octagon class that returns a
string containing the side length, the perimeter, the area, and the value of isClone. Write a test
program (TestOctagon.java) that creates an Octagon object with side value 5. Clone the object.
Then display the original object and the clone. Then display the value that you get when you
compare the two objects using the compareTo method. Finally, change the side of the original
octagon to 5.2, redisplay the two octagons, and again display the value that you get by
comparing them. Your output should match the following. (Slight round-off differences are
okay, if they occur.)

oct1: Octagon with side = 5.0 perimeter = 40.0 area =
120.71067811865476 isClone = false
oct2: Octagon with side = 5.0 perimeter = 40.0 area =
120.71067811865476 isClone = true
oct1.compareTo(oct2): 0
oct1: Octagon with side = 5.2 perimeter = 41.6 area =
130.56066945313697 isClone = false
oct2: Octagon with side = 5.0 perimeter = 40.0 area =
120.71067811865476 isClone = true
oct1.compareTo(oct2): 1