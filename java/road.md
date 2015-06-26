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