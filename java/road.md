## something learnt in the road.

01. [Eclipse] cmd + I: indent selected areas
02. [Eclipse] cmd + 1: get suggestion 
03. [Eclipse] cmd + .: go to next error
04. [Eclipse] cmd + 1: quick fix
05. [Eclipse] cmd + ,: open preference
06. [Eclipse] cmd + E: editor cycle
07. [Eclipse] ctrl + H: open search dialogue
08. [Eclipse] cmd + shift + T: search for class
              cmd + shift + R
09. [Eclipse] cmd + w: close current editor tab              
10. [Eclipse] cmd + F11 run last junit test
11. [Eclipse] F3: go to definition
12. [Eclipse] cmd + shift + F indent
---------------------------------------------------
- [vim]  H  go to heading line of current screen
- [vim]  M  go to middle line of current screen
- [vim]  L  go to last line of current screen
- [vim]  ctrl + b  go backwards by one screen
- [vim]  ctrl + f  go forwards by one screen
- [vim]  ctrl + u  go upwards by half screen
- [vim]  ctrl + d  go downwards by half screen
- [vim]  W  go to next position delimiter is blank space

* One way to loop over a String
  ```java
  String word = "abc";
  for(char ch : word.toCharArray()) {
    //TODO: do something with ch
  }
  ```
  
* ! There is no easy way to reverse sort primitive array
  ```java
  //!!! wrong
  int[] nums = new int[10];
  Arrays.sort(nums, Collections.reverseOrder());
  // right
  String[] strs = new String[10];
  Arrays.sort(strs, Collections.reverseOrder());
  ```
  
* ! No easy way to convert primitive array to list  
  ```java
  //!!! wrong
  int[] nums = {1, 2, 3, 4};
  List<Integer> list = new ArrayList<>(Arrays.asList(nums));
  ```
  
* watch out when converting 2D coordinates to 1D cooridinates for nearby position
  ```java
  int row = 5;
  int col = 0;
  int index = row * cols + col;
  
  int r = (row * cols + (col - 1)) / cols;  // 4
  int c = (row * cols + (col - 1)) % cols;  // cols - 1
  // however, in 2D matrix, (row, col - 1) = (5, -1) which is outside of boundary
  ```

* str.split(reg) with escape
  ```java
  String[] strs = string.split("\\."); // use \\ as escape sigh to escape . 
  ```
* loop each digit of a number from back to beginning

  ```java
  while (x != 0) {
    int lastDigit = x % 10;
    x = x / 10;
  }
  ```
* static import, use static method in non-static method way
  ```java
  import static org.junit.Assert.*;
  ```
  
  