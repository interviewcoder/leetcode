## something learnt in the road.

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
  
  